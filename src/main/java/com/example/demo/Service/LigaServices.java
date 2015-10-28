package com.example.demo.Service;

import com.example.demo.Model.Liga;
import com.example.demo.Repository.LigaRepository;
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

    public void crearLiga(){

        Liga liga1 = new Liga();
        liga1.setNombreLiga("MobStar");
        ligaRepository.save(liga1);



    }


}
