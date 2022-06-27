package com.entidad.citse.entity.service.ServiceImp;

import com.entidad.citse.dao.EntidadDao;
import com.entidad.citse.entity.Entidad;
import com.entidad.citse.entity.service.EntidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntidadServiceImp implements EntidadService {

    @Autowired
    private EntidadDao repo;

    @Override
    public List<Entidad> findAll() {
        return repo.findAll();
    }

    @Override
    public Entidad findById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Integer id) {
        repo.deleteById(id);
    }
}
