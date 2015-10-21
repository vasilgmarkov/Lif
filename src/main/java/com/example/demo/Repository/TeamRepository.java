package com.example.demo.Repository;


import com.example.demo.Model.Team;
import org.springframework.data.repository.PagingAndSortingRepository;


/**
 * Created by jhipster on 15/10/15.
 */
public interface TeamRepository extends PagingAndSortingRepository <Team, Long> {
  public Team findByNombre(String nombre);



}
