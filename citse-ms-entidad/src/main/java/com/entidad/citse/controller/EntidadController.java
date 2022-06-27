package com.entidad.citse.controller;

import com.entidad.citse.entity.Entidad;
import com.entidad.citse.service.EntidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("ms/entidad")
public class EntidadController {

    @Autowired
    private EntidadService service;

    @GetMapping
    public ResponseEntity<List<Entidad> > findAll(@RequestParam(name = "alias",required = false)String alias){
        List<Entidad> e = new ArrayList<>();
        if(alias==null){
            e=service.findAll();
            if(e.isEmpty())
                return ResponseEntity.noContent().build();
        }else {
            e=service.findByAlias(alias);
            if(e.isEmpty())
                return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(e);
    }
    @GetMapping("/{id}")
    public Entidad findById(@PathVariable Integer id){
        return service.findById(id);
    }
}
