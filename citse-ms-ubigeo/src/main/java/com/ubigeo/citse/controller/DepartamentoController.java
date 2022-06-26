package com.ubigeo.citse.controller;

import com.ubigeo.citse.entity.Departamento;
import com.ubigeo.citse.service.DepartamentoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import java.util.List;

@RestController
@RequestMapping("ms/departamento")
@Api(value = "Gestion de departamentos", description = "Microservicio de departamentos")
public class DepartamentoController {

    @Autowired
    private DepartamentoService service;

    @GetMapping("/")
    public List<Departamento> findAll(){
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Departamento findById(@PathVariable Integer id,HttpRequestHandlerServlet request){
        return service.findById(id);
    }
}
