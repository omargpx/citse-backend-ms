package com.negocio.citse.controller;

import com.negocio.citse.entity.Proyecto;
import com.negocio.citse.service.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import java.util.List;

@RestController
@RequestMapping("ms/proyecto")
public class ProyectoController {

    @Autowired
    private ProyectoService service;

    @GetMapping("/")
    public List<Proyecto> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Proyecto findById(@PathVariable Integer id, HttpRequestHandlerServlet request){
        return  service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Proyecto crear(@RequestBody Proyecto proyecto){
        return service.save(proyecto);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Proyecto update(@RequestBody Proyecto proyecto, @PathVariable Integer id){
        Proyecto p = service.findById(id);
        p.setNoProyecto(proyecto.getNoProyecto());
        p.setObjProyecto(proyecto.getObjProyecto());
        p.setDeProyecto(proyecto.getDeProyecto());
        p.setFeInicio(proyecto.getFeInicio());
        p.setFeFin(proyecto.getFeFin());
        return service.save(p);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Proyecto deleteById(@PathVariable Integer id){
        Proyecto p = service.findById(id);
        p.setEsProyecto(false);
        service.save(p);
        return p;
    }

}
