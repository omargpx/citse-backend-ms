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
@Table(name = "TMA_PROGRAMAS")
@Entity
@AllArgsConstructor @NoArgsConstructor @Builder
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

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "programa")
    private List<Taller> talleres;
}
