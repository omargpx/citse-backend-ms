package com.negocio.citse.dao;

import com.negocio.citse.entity.Programa;
import com.negocio.citse.entity.Taller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TallerDao extends JpaRepository<Taller,Integer> {

    @Query("SELECT t FROM Taller t WHERE (nombre like %:query% or no_taller like %:query%)")
    public List<Taller> findByNombre(String query);
    public List<Taller> findByPrograma(Programa programa);
}
