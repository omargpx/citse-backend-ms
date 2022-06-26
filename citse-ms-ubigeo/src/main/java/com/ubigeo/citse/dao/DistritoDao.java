package com.ubigeo.citse.dao;

import com.ubigeo.citse.entity.Distrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistritoDao extends JpaRepository<Distrito,Integer> {
}
