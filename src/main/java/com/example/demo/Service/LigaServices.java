package com.example.demo.Service;

import com.example.demo.Model.Liga;

import com.example.demo.Model.Temporada;
import com.example.demo.Repository.LigaRepository;
import com.example.demo.Repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jhipster on 28/10/15.
 */


@Service
@Transactional
public class LigaServices {

    @Autowired
    private LigaRepository ligaRepository;
    @Autowired
    private TemporadaRepository temporadaRepository;
    public void crearLiga(){

        Liga liga1 = new Liga();
        liga1.setNombreLiga("MobStar1");
        ligaRepository.save(liga1);

        Temporada temporada1 = temporadaRepository.findById(1l); // problem
        Temporada temporada2 = temporadaRepository.findById(2l); // problem
        temporada1.setLiga(liga1);
        temporadaRepository.save(temporada1);
        temporada2.setLiga(liga1);
        temporadaRepository.save(temporada2);


    }


    public void verTemporada(){
        Liga ligaActual = ligaRepository.findByNombreLiga("MobStar1");

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Temporada"+ligaActual.getTemporadas()+"Nombre Liga : "+ligaActual.getNombreLiga()+"  Vale");
        System.out.println(" ");
        System.out.println(" ");

    }

}
