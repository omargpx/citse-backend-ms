package com.entidad.citse.controller;

import com.entidad.citse.entity.PersonaEntidad;
import com.entidad.citse.service.PersonaEntidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ms/personaentidad")
public class PersonaEntidadController {

    @Autowired
    private PersonaEntidadService service;

    @GetMapping
    public List<PersonaEntidad> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public PersonaEntidad findById(@PathVariable Integer id){
        return service.findById(id);
    }
}
