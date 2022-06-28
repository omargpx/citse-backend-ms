package com.entidad.citse.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "TMV_PERSONAS_ENTIDAD")
public class PersonaEntidad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PERSONA_ENTIDAD")
    private Integer id;

    @Column(name = "ID_PERSONA")
    private Integer Persona;

    @ManyToOne
    @JoinColumn(name = "ID_ENTIDAD")
    private Entidad entidad;
}
