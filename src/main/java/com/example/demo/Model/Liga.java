package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Vasil Markov on 27/10/15.
 */

@Entity
public class Liga {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        protected Long id;

        protected String nombreLiga;

        @ManyToMany(mappedBy = "Liga")
        private Set<Temporada> temporada = new HashSet<>();

    public Liga() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreLiga() {
        return nombreLiga;
    }

    public void setNombreLiga(String nombreLiga) {
        this.nombreLiga = nombreLiga;
    }

    public Set<Temporada> getTemporada() {
        return temporada;
    }

    public void setTemporada(Set<Temporada> temporada) {
        this.temporada = temporada;
    }

    @Override
    public String toString() {
        return "Liga{" +
                "id=" + id +
                ", nombreLiga='" + nombreLiga + '\'' +
                ", temporada=" + temporada +
                '}';
    }
}
