package com.example;

import com.example.demo.Model.Temporada;
import com.example.demo.Service.LigaJugService;
import com.example.demo.Service.LigaServices;
import com.example.demo.Service.TeamServices;
import com.example.demo.Service.TemporadaServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LigaEndesaApplication {
    private static LigaJugService jugadorService;
    private static TeamServices teamServices;
    private static TemporadaServices temporadaServices;
    private static LigaServices ligaServices;
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(LigaEndesaApplication.class, args);
       jugadorService = context.getBean(LigaJugService.class);
        jugadorService.crearJugador();
        jugadorService.jugadorTeam();
        temporadaServices = context.getBean(TemporadaServices.class);
        temporadaServices.crearTemporada();
        ligaServices = context.getBean(LigaServices.class);
        ligaServices.crearLiga();
        ligaServices.verTemporada();
        teamServices = context.getBean(TeamServices.class);
        teamServices.crearTeam();
        teamServices.pruebaOk();

    }





}
