package com.negocio.citse.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Table(name = "TMA_PROYECTOS")
@Entity
@AllArgsConstructor  @NoArgsConstructor @Builder
public class Proyecto implements Serializable {

    @Id
    @Column(name = "ID_PROYECTO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NO_PROYECTO")
    private String noProyecto;

    @Column(name = "OBJ_PROYECTO")
    private String objProyecto;

    @Column(name = "DE_PROYECTO")
    private String deProyecto;

    @Column(name = "FE_INICIO")
    private String feInicio;

    @Column(name = "FE_FIN")
    private String feFin;

    @Column(name = "ES_PROYECTO",columnDefinition = "BIT")
    private Boolean esProyecto;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "proyecto")
    private List<LugarProyecto> lugares;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "proyecto")
    private List<EntidadProyecto> entidades;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "proyecto")
    private List<Programa> programas;

}
