package com.example.demo.Model;


import javax.persistence.Entity;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.Date;
@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;
    private String localidad;
    private Date fechaCreacion;

    @OneToMany(mappedBy = "team")
    private Set<Jugador> jugadores = new HashSet<>();
    @Column

    //String description; identificador, nombre, localidad y fecha de creación.


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String localidad(){
        return localidad;

    }

    public void setLocalidad(String localidad){
        this.localidad=localidad;

    }
    public Date getFechaCreacion(){
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion){

        this.fechaCreacion=fechaCreacion;
    }

    public Set<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(Set<Jugador> jugadores) {
        this.jugadores = jugadores;
    }


    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", localidad='" + localidad + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                              '}';
    }
}
