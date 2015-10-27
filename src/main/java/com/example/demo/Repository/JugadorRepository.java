package com.example.demo.Repository;

import com.example.demo.Model.Jugador;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;


public interface JugadorRepository extends PagingAndSortingRepository<Jugador, Long> {
    public List<Jugador> findByNombreContaining(String nombre);
    public Jugador findByNombre(String nombre);
    public List<Jugador> findByCanastasGreaterThanEqual(Integer canastas);
    public List<Jugador> findByAsistenciasBetween(Integer max, Integer min);
    public List<Jugador> findByIdBetween(Long min, Long max);
    public List<Jugador> findByPosicionLike(String posicion);
    public List<Jugador> findByFechaNacimientoLessThan(Date fechaNacimiento);
    public List<Jugador> findByCanastasGreaterThanEqualAndFechaNacimientoLessThan(Integer canastas, Date fechaNacimiento);

   @Query("SELECT j.nombre FROM Jugador j where j.id = :id  ")
    String findTitleById(@Param("id") Long id);

}