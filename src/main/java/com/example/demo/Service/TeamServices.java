package com.example.demo.Service;


import com.example.demo.Model.Jugador;
import com.example.demo.Model.Team;
import com.example.demo.Repository.JugadorRepository;
import com.example.demo.Repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Calendar;
import java.util.Date;
@Service
@Transactional
public class TeamServices {

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    JugadorRepository jugadorRepository;




    public void crearTeam(){
        Team team1 = new Team();
        team1.setNombre("Barcelona");
        team1.setLocalidad("Barcelona");
        Calendar cal=Calendar.getInstance();
        cal.set(1850, Calendar.AUGUST, 8);
        Date fechaCre=cal.getTime();
        team1.setFechaCreacion(fechaCre);
        teamRepository.save(team1);

        Team team2 = new Team();
        team2.setNombre("Madrid");
        team2.setLocalidad("Madrid");
        Calendar cal1=Calendar.getInstance();
        cal1.set(1880, Calendar.SEPTEMBER, 10);
        Date fechaCre11=cal.getTime();
        team1.setFechaCreacion(fechaCre11);
        teamRepository.save(team2);
        Jugador jugador = jugadorRepository.findByNombre("Aleksandar Vezenkov");
        jugador.setTeam(team1);
        jugadorRepository.save(jugador);

        Jugador jugador1 = jugadorRepository.findByNombre("Michael Jeffrey Jordan");
        jugador1.setTeam(team2);
        jugadorRepository.save(jugador1);


        System.out.println(team1.getJugadores());


    }







}
