package com.ubigeo.citse.service;

import com.ubigeo.citse.entity.Provincia;

import java.util.List;

public interface ProvinciaService {
    public List<Provincia> findAll();

    public Provincia findById(int id);

}
