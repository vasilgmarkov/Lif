package com.example.demo.Repository;

import com.example.demo.Model.Jugador;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

import java.util.Date;

/**
 * Created by nilpanescoll on 05/10/15.
 */
public interface JugadorRepository extends PagingAndSortingRepository<Jugador, Long> {
    public List<Jugador> findByNombreContaining(String nombre);
    public List<Jugador> findByCanastasGreaterThanEqual(Integer canastas);
    public List<Jugador> findByAsistenciasBetween(Integer max, Integer min);
    public List<Jugador> findByPosicionLike(String posicion);
    public List<Jugador> findByFechaNacimientoLessThan(Date fechaNacimiento);
    public List<Jugador> findByCanastasGreaterThanEqualAndFechaNacimientoLessThan(Integer canastas, Date fechaNacimiento);
}