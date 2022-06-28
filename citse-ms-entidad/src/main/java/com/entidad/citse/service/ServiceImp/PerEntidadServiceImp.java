package com.entidad.citse.service.ServiceImp;

import com.entidad.citse.dao.PersonaEntidadDao;
import com.entidad.citse.entity.PersonaEntidad;
import com.entidad.citse.service.PersonaEntidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerEntidadServiceImp implements PersonaEntidadService {

    @Autowired
    private PersonaEntidadDao repo;

    @Override
    public List<PersonaEntidad> findAll() {
        return repo.findAll();
    }

    @Override
    public PersonaEntidad findById(Integer id) {
        return repo.findById(id).orElse(null);
    }
}
