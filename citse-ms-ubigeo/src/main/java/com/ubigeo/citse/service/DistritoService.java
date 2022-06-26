package com.ubigeo.citse.service;

import com.ubigeo.citse.entity.Distrito;

import java.util.List;

public interface DistritoService {
    public List<Distrito> findAll();
    public Distrito findById(int id);
}
