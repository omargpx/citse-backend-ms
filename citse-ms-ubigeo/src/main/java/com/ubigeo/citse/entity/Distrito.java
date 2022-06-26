package com.ubigeo.citse.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "TMA_DISTRITOS")
@Entity
public class Distrito implements Serializable {

    @Id
    @Column(name = "ID_DISTRITO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NO_DISTRITO")
    private String noDistrito;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "ID_PROVINCIA")
    private Provincia provincia;
}
