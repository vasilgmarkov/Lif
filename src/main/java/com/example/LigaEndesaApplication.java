package com.example;

import com.example.demo.Service.LigaJugService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LigaEndesaApplication {
    private static LigaJugService jugadorService;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(LigaEndesaApplication.class, args);
        jugadorService = context.getBean(LigaJugService.class);
        jugadorService.crearJugador();
    }





}
