package com.ubigeo.citse.dao;

import com.ubigeo.citse.entity.Provincia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinciaDao extends JpaRepository<Provincia,Integer> {
}
