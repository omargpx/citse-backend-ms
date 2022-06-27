package com.ubigeo.citse.service;

import com.ubigeo.citse.entity.Distrito;
import com.ubigeo.citse.entity.Provincia;

import java.util.List;

public interface DistritoService {
    public List<Distrito> findAll();
    public Distrito findById(int id);
    //--
    public List<Distrito> findByNoDistrito(String noDistrito);
    public List<Distrito> findByProvincia(Provincia provincia);
}
