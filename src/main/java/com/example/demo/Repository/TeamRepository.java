package com.example.demo.Repository;

import com.example.demo.Model.Team;
import org.springframework.data.repository.PagingAndSortingRepository;



public interface TeamRepository extends PagingAndSortingRepository <Team, Long> {
     public Team findByNombre(String nombre);




}
