package com.example.demo.Service;


import com.example.demo.Model.Jugador;
import com.example.demo.Model.Team;
import com.example.demo.Model.Temporada;
import com.example.demo.Repository.JugadorRepository;
import com.example.demo.Repository.TeamRepository;
import com.example.demo.Repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class TeamServices {

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    JugadorRepository jugadorRepository;

    @Autowired
    TemporadaRepository temporadaRepository;




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
        cal1.set(1880, Calendar.MARCH, 10);
        Date fechaCre1=cal1.getTime();
        team2.setFechaCreacion(fechaCre1);
        teamRepository.save(team2);
        /*Jugador jugador = jugadorRepository.findByNombre("Aleksandar Vezenkov");
        jugador.setTeam(team1);
        jugadorRepository.save(jugador);

        Jugador jugador1 = jugadorRepository.findByNombre("Michael Jeffrey Jordan");
        jugador1.setTeam(team2);
        jugadorRepository.save(jugador1);*/

        List <Team> teams = new ArrayList<>();
        teams.add(team1);
        teams.add(team2);

        System.out.println(jugadorRepository.findTitleById(1L));
        for (int i=0;i<2;i++){
            List<Jugador> jugadores = jugadorRepository.findByIdBetween((2L*i)+1,(2L*i)+2);



            for(Jugador jugadorActual : jugadores) {
                jugadorActual.setTeam(teams.get(i));
            }
        }

        System.out.println("aqui saldra vasio ");
        System.out.println(team1.getJugadores());



    }

    public void pruebaOk(){
        System.out.println("aqui saldra Ok ");
        System.out.println("aqui saldra Ok ");
        List <Jugador> jugadores = jugadorRepository.findByNombreTeam("Madrid");

        System.out.println("aqui saldra Ok ");
        System.out.println("aqui saldra Ok ");
        System.out.println(teamRepository.findByNombre("Barcelona").getJugadores()+"TUK");
        System.out.println(teamRepository.findByNombre("Madrid").getJugadores()+"TUK");
        System.out.println("aqui saldra Ok ");


    }

    public void equipoTemporada(){
        Temporada temporada1 = temporadaRepository.findById(1L);
        Temporada temporada2 = temporadaRepository.findById(2L);
        Team team1 = teamRepository.findByNombre("Barcelona");
        Team team2 = teamRepository.findByNombre("Madrid");

        team1.getTemporadas().add(temporada1);
        team1.getTemporadas().add(temporada2);
        teamRepository.save(team1);
        team2.getTemporadas().add(temporada2);
        teamRepository.save(team2);

        System.out.println(team1.getTemporadas() + "aqui saldra Ok vincular team a temporada");

        System.out.println(team2.getTemporadas()+"aqui saldra Ok vincular team a temporada");


    }





}
