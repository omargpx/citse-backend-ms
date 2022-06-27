package com.negocio.citse.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "TMA_PROGRAMAS")
@Entity
public class Programa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PROGRAMA")
    private Integer id;

    @Column(name = "NO_PROGRAMA")
    private String noPrograma;

    @Column(name = "OBJ_PROGRAMA")
    private String objPrograma;

    @Column(name = "DE_PROGRAMA")
    private String dePrograma;

    @Column(name = "FE_INICIO")
    private String feInicio;

    @Column(name = "FE_FIN")
    private String feFin;

    @Column(name = "ES_PROGRAMA",columnDefinition = "BIT")
    private Boolean esPrograma;

    @ManyToOne
    @JoinColumn(name = "ID_PROYECTO")
    private Proyecto proyecto;
}
