package com.ubigeo.citse.dao;

import com.ubigeo.citse.entity.Distrito;
import com.ubigeo.citse.entity.Provincia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistritoDao extends JpaRepository<Distrito,Integer> {
    public List<Distrito> findByNoDistrito(String noDistrito);
    public List<Distrito> findByProvincia(Provincia provincia);
}
