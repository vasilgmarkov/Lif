package com.example.demo.Service;

import com.example.demo.Model.Temporada;
import com.example.demo.Repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by jhipster on 28/10/15.
 */

@Service
@Transactional
public class TemporadaServices {
    @Autowired
    private TemporadaRepository temporadaRepository;

    public void crearTemporada(){



        Temporada temporada1 = new Temporada();
        Calendar cal=Calendar.getInstance();
       cal.set(1995, Calendar.JANUARY, 1);
        Date fecha1 = cal.getTime();
        temporada1.setFechaTemporada(fecha1);
        temporadaRepository.save(temporada1);


        Temporada temporada2 = new Temporada();
        Calendar cal2=Calendar.getInstance();
        cal2.set(1996, Calendar.JANUARY, 1);
        Date fecha2 = cal2.getTime();
        temporada1.setFechaTemporada(fecha2);
        temporadaRepository.save(temporada2);


    }
}
