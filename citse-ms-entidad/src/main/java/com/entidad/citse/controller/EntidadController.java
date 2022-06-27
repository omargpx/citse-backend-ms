package com.entidad.citse.controller;

import com.entidad.citse.entity.Entidad;
import com.entidad.citse.entity.service.EntidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("ms/entidad")
public class EntidadController {

    @Autowired
    private EntidadService service;

    @GetMapping
    public List<Entidad> findAll(){
        return service.findAll();
    }
    @GetMapping("/{id}")
    public Entidad findById(@PathVariable Integer id){
        return service.findById(id);
    }
}
