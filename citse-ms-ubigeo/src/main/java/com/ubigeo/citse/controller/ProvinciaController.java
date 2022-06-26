package com.ubigeo.citse.controller;

import com.ubigeo.citse.entity.Provincia;
import com.ubigeo.citse.service.ProvinciaService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import java.util.List;

@RestController
@RequestMapping("ms/provincia")
@Api(value = "Gestion de provincia", description = "Microservicio de provincia")
public class ProvinciaController {

    @Autowired
    private ProvinciaService service;

    @GetMapping("/")
    public List<Provincia> findAll(){
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Provincia findById(@PathVariable Integer id, HttpRequestHandlerServlet request){
        return service.findById(id);
    }
}
