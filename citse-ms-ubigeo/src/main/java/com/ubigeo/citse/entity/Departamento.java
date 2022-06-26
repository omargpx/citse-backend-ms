package com.ubigeo.citse.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "TMA_DEPARTAMENTOS")
@Data
public class Departamento implements Serializable {

    @Id
    @Column(name = "ID_DEPARTAMENTO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NO_DEPARTAMENTO")
    private String noDepartamento;

    @OneToMany(mappedBy = "departamento")
    private List<Provincia> provincias;

}
