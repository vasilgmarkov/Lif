package com.example.demo.Repository;

import com.example.demo.Model.Team;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface TeamRepository extends PagingAndSortingRepository <Team, Long> {
     public Team findByNombre(String nombre);
    // public List<Team> fidnByLocalidad(String localidad); //Consulta a






}
