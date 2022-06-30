package com.negocio.citse.controller;

import com.negocio.citse.entity.Programa;
import com.negocio.citse.entity.Taller;
import com.negocio.citse.service.TallerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("ms/taller")
public class TallerController implements Runnable{

    @Autowired
    private TallerService service;

    @GetMapping
    public ResponseEntity<List<Taller>> findAll(@RequestParam(name = "nombre",required = false)String nombre,
                                                @RequestParam(name = "programa",required = false)Integer programa){
        List<Taller> tallers = new ArrayList<>();
        if(nombre==null && programa==null){
            tallers = service.findAll();
            if(tallers.isEmpty())
                return ResponseEntity.noContent().build();
        }else if (nombre!=null){
            tallers=service.findByNombre(nombre);
            if(tallers.isEmpty())
                return ResponseEntity.noContent().build();
        }else {
            tallers=service.findByPrograma(Programa.builder().id(programa).build());
            if(tallers.isEmpty())
                return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(tallers);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Taller> findById(@PathVariable Integer id){
        Taller taller= service.findById(id);
        if(taller!=null){
            return ResponseEntity.ok(taller);
        }else
            return ResponseEntity.notFound().build();
    }
    private Integer idT;
    @PutMapping("/{id}")
    public ResponseEntity<Taller> update(@RequestBody Taller taller,@PathVariable Integer id){
        // datos
        Taller t = service.findById(id);
        t.setNombre(taller.getNombre());
        t.setObjetivo(taller.getObjetivo());
        t.setDescripcion(taller.getDescripcion());
        t.setInicio(taller.getInicio());
        t.setFin(taller.getFin());
        service.save(t);
        idT=t.getId();
        return ResponseEntity.ok(taller);
    }

    @Override
    public void run() {
        Taller t =  service.findById(idT);
        String inicio = t.getInicio();
        String fin = t.getFin();
        Boolean status = true;
        LocalDateTime date_of_today = LocalDateTime.now();
        //  System.out.println("formato actual: " + date_of_today);
        DateTimeFormatter format_date_of_today = DateTimeFormatter.ofPattern("dd-MM-yyyy");//formateando fecha
        String fechaSystem = date_of_today.format(format_date_of_today);

        //
        LocalDate sytem = LocalDate.parse(fechaSystem);
        LocalDate feFintaller = LocalDate.parse(fin);
        LocalDate feInicioTaller = LocalDate.parse(inicio);
        System.out.println(fechaSystem);
        while (status){
            if(feFintaller.isBefore(LocalDate.now()) || feInicioTaller.isAfter(LocalDate.now())){
                status = false;
                t.setEstado(false);
            }else if(feInicioTaller.isBefore(LocalDate.now()) && feFintaller.isAfter(LocalDate.now())){
                t.setEstado(true);
            }
        }
        //end while
    }
}
