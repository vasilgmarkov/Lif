package com.example.demo.Controller;

import com.example.demo.Exception.JugadorException;
import com.example.demo.Model.Jugador;
import com.example.demo.Repository.JugadorRepository;
import com.example.demo.Repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;
/**
 * Created by VasilMarkov on 4/11/15.
 */

@RestController
@RequestMapping("/jugadores")
public class JugadorController {

@Autowired
    private JugadorRepository jugadorRepository;

    @Autowired
    private TeamRepository teamRepository;

    @RequestMapping(method = POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Jugador save(@RequestBody Jugador jugador){
        return jugadorRepository.save(jugador);

    }

    @RequestMapping(method = GET)
    public List<Jugador> findAll(){
        List<Jugador> jugadores = new ArrayList<Jugador>();
        Iterator<Jugador> iterator = jugadorRepository.findAll().iterator();

        while(iterator.hasNext()){
            jugadores.add(iterator.next());
        }

        return jugadores;
    }

    @RequestMapping(value = "/{id}",method = GET)
    public Jugador getById(@PathVariable Long id){
        Jugador jugador = jugadorRepository.findOne(id);

        if(jugador == null)
            throw  new JugadorException(id);

            return jugador;



    }

    @RequestMapping(value = "/{id}", method = DELETE)
    public void deleteById(@PathVariable Long id){
        Jugador jugador = jugadorRepository.findOne(id);

        if(jugador == null){throw new JugadorException(id);}

        jugadorRepository.delete(id);


    }

    @RequestMapping(value = "/{id}", method = PUT)
    public Jugador updateById(@PathVariable Long id, @RequestBody Jugador jugador){
        Jugador j1 = jugadorRepository.findOne(id);

        if(j1 == null){throw new JugadorException(id);}

        return jugadorRepository.save(jugador);

    }



}
