package com.entidad.citse.dao;

import com.entidad.citse.entity.Entidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntidadDao extends JpaRepository<Entidad,Integer> {
}
