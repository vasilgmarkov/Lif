package com.example.demo.Repository;

import com.example.demo.Model.Liga;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by jhipster on 28/10/15.
 */
public interface LigaRepository extends PagingAndSortingRepository<Liga, Long> {
    public Liga findByNombreLiga(String nombre);




}
