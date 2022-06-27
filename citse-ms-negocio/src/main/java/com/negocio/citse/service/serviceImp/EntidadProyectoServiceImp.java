package com.negocio.citse.service.serviceImp;

import com.negocio.citse.dao.EntidadProyectoDao;
import com.negocio.citse.entity.EntidadProyecto;
import com.negocio.citse.entity.Proyecto;
import com.negocio.citse.service.EntidadProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntidadProyectoServiceImp implements EntidadProyectoService {

    @Autowired
    private EntidadProyectoDao repo;

    @Override
    public List<EntidadProyecto> findAll() {
        return repo.findAll();
    }

    @Override
    public EntidadProyecto findById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public EntidadProyecto save(EntidadProyecto entidadProyecto) {
        return repo.save(entidadProyecto);
    }

    @Override
    public EntidadProyecto deleteById(Integer id) {
        EntidadProyecto ep = findById(id);
        ep.setEsEntidadProyecto(false);
        repo.save(ep);
        return ep;
    }

    @Override
    public List<EntidadProyecto> findByProyecto_e(Proyecto proyecto) {
        return repo.findByProyecto(proyecto);
    }

    @Override
    public List<EntidadProyecto> findByEntidad(Integer id) {
        return repo.findByEntidad(id);
    }
}
