package com.entidad.citse.entity.service;

import com.entidad.citse.entity.Entidad;

import java.util.List;

public interface EntidadService {
    public List<Entidad> findAll();
    public Entidad findById(Integer id);
    public void deleteById(Integer id);
}
