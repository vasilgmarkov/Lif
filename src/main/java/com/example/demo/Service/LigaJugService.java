package com.example.demo.Service;

import com.example.demo.Model.Jugador;
import com.example.demo.Repository.JugadorRepository;
import com.example.demo.Repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class LigaJugService {

  @Autowired
  private JugadorRepository jugadorRepository;

  @Autowired
  private TeamRepository teamRepository;

  public void crearJugador(){





    Jugador jugador1 = new Jugador();
    jugador1.setNombre("Aleksandar Vezenkov");
    Calendar cal=Calendar.getInstance();
    cal.set(1995, Calendar.AUGUST, 8);
    Date fechaNa=cal.getTime();
    jugador1.setFechaNacimiento(fechaNa);
    jugador1.setPosicion("Ala-Pívot");
    jugador1.setCanastas(260);
    jugador1.setAsistencias(30);
    jugador1.setRebotes(59);
    jugadorRepository.save(jugador1);



    Jugador jugador2 = new Jugador();
    jugador2.setNombre("Juan Carlos Navarro");
    Calendar cal2=Calendar.getInstance();
    cal2.set(1980, Calendar.JUNE, 13);
    Date fechaNa1=cal2.getTime();
    jugador2.setFechaNacimiento(fechaNa1);
    jugador2.setPosicion("Escolta");
    jugador2.setCanastas(411);
    jugador2.setAsistencias(253);
    jugador2.setRebotes(173);
    jugadorRepository.save(jugador2);

    Jugador jugador3 = new Jugador();
    jugador3.setNombre("Ante Tomic");
    Calendar cal3=Calendar.getInstance();
    cal3.set(1987, Calendar.FEBRUARY, 17);
    Date fechaNa2=cal3.getTime();
    jugador3.setFechaNacimiento(fechaNa2);
    jugador3.setPosicion("Pivot");
    jugador3.setCanastas(239);
    jugador3.setAsistencias(98);
    jugador3.setRebotes(200);
    jugadorRepository.save(jugador3);

    Jugador jugador4 = new Jugador();
    jugador4.setNombre("Carlos Arroyo");
    Calendar cal4=Calendar.getInstance();
    cal4.set(1979, Calendar.JULY, 30);
    Date fechaNa3=cal4.getTime();
    jugador4.setFechaNacimiento(fechaNa3);
    jugador4.setPosicion("Base");
    jugador4.setCanastas(432);
    jugador4.setAsistencias(321);
    jugador4.setRebotes(126);
    jugadorRepository.save(jugador4);

    Jugador jugador5 = new Jugador();
    jugador5.setNombre("Michael Jeffrey Jordan");
    Calendar cal5=Calendar.getInstance();
    cal5.set(1963, Calendar.FEBRUARY, 17);
    Date fechaNa4=cal5.getTime();
    jugador5.setFechaNacimiento(fechaNa4);
    jugador5.setPosicion("Escolta");
    jugador5.setCanastas(623);
    jugador5.setAsistencias(248);
    jugador5.setRebotes(483);
    jugadorRepository.save(jugador5);




   System.out.println(jugadorRepository.findByNombreContaining("Aleksandar"));
    System.out.println(jugadorRepository.findByCanastasGreaterThanEqual(511));
    List<Jugador> jugadores = jugadorRepository.findByAsistenciasBetween(0, 300);
    System.out.println();
    System.out.println();
    System.out.println();
    for (Jugador currentJugador : jugadores){
      System.out.println("Equipo"+currentJugador.getTeam()+"Nombre: " + currentJugador.getNombre() + "Asistencias: " + currentJugador.getAsistencias());
    }

    System.out.println();
    System.out.println();
    System.out.println();
  System.out.println(jugadorRepository.findByAsistenciasBetween(220, 300));
    System.out.println(jugadorRepository.findByPosicionLike("Base"));

    Calendar calBus=Calendar.getInstance();
    calBus.set(1995, Calendar.AUGUST, 8);
    Date calBus1=calBus.getTime();
    System.out.println(jugadorRepository.findByFechaNacimientoLessThan(calBus1));
    System.out.println(jugadorRepository.findByCanastasGreaterThanEqualAndFechaNacimientoLessThan(256, calBus1));


  }
}