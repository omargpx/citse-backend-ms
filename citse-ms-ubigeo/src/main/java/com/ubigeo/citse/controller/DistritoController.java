package com.ubigeo.citse.controller;

import com.ubigeo.citse.entity.Distrito;
import com.ubigeo.citse.service.DistritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("ms/distrito")
public class DistritoController {

    @Autowired
    private DistritoService service;

    @GetMapping("/")
    public List<Distrito> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Distrito findById(@PathVariable Integer id){
        return service.findById(id);
    }
}
