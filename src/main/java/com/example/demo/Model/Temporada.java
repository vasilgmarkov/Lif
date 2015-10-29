package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import java.util.Calendar;
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

    @ManyToOne
    private Liga liga;

    @ManyToMany
    private  Set<Team> team  = new HashSet<>();


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

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    public Set<Team> getTeam() {
        return team;
    }

    public void setTeam(Set<Team> team) {
        this.team = team;
    }

    @Override
    public String toString() {

        return "Temporada{" +
                "id=" + id +
                ", fechaTemporada=" + fechaTemporada +

                '}';
    }
}
