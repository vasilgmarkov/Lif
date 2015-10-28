package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jhipster on 28/10/15.
 */

@Entity
public class Temporada {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    protected Date fechaTemporada;

    @ManyToMany
    private Set<Liga> Liga = new HashSet<>();


    public Temporada() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaTemporada() {
        return fechaTemporada;
    }

    public void setFechaTemporada(Date fechaTemporada) {
        this.fechaTemporada = fechaTemporada;
    }

    public Set<com.example.demo.Model.Liga> getLiga() {
        return Liga;
    }

    public void setLiga(Set<com.example.demo.Model.Liga> liga) {
        Liga = liga;
    }

    @Override
    public String toString() {
        return "Temporada{" +
                "id=" + id +
                ", fechaTemporada=" + fechaTemporada +
                ", Liga=" + Liga +
                '}';
    }
}
