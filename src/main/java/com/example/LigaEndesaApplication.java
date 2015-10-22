package com.example;

import com.example.demo.Service.LigaJugService;
import com.example.demo.Service.TeamServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LigaEndesaApplication {
    private static LigaJugService jugadorService;
    private static TeamServices teamServices;
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(LigaEndesaApplication.class, args);
       jugadorService = context.getBean(LigaJugService.class);
        jugadorService.crearJugador();

        teamServices = context.getBean(TeamServices.class);
        teamServices.crearTeam();
        teamServices.pruebaOk();
    }





}
