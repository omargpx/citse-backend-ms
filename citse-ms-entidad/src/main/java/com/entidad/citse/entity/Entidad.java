package com.entidad.citse.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "TMA_ENTIDADES")
public class Entidad implements Serializable {

    @Id
    @Column(name = "ID_ENTIDAD")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NO_ENTIDAD")
    private String nombre;

    @Column(name = "CO_ALIAS")
    private String alias;

    @Column(name = "FE_INSTANCIA")
    private String feInstancia;

    @ManyToOne
    @JoinColumn(name = "ID_PADRE",referencedColumnName = "ID_ENTIDAD")
    private Entidad idPadre;

    @Column(name = "ID_TIPO_ENTIDAD")
    private Integer idTipoEntidad;

}
