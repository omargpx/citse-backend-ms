package com.entidad.citse.service;

import com.entidad.citse.entity.PersonaEntidad;

import java.util.List;

public interface PersonaEntidadService {
    public List<PersonaEntidad> findAll();
    public PersonaEntidad findById(Integer id);
}
