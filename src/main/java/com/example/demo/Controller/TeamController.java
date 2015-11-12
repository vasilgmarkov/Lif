package com.example.demo.Controller;

import com.example.demo.Exception.JugadorException;
import com.example.demo.Exception.TeamException;
import com.example.demo.Model.Jugador;
import com.example.demo.Model.Team;
import com.example.demo.Repository.JugadorRepository;
import com.example.demo.Repository.TeamRepository;
import org.hibernate.sql.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * Created by jhipster on 12/11/15.
 */



@RestController
@RequestMapping("/teams")
public class TeamController {





    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private JugadorRepository jugadorRepository;

    @RequestMapping(method = POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Team save(@RequestBody Team team){
        return teamRepository.save(team);

    }

    @RequestMapping(method = GET)
    public List<Team> findAll(){
        List<Team> teams = new ArrayList<Team>();
        Iterator<Team> iterator = teamRepository.findAll().iterator();

        while(iterator.hasNext()){
            teams.add(iterator.next());
        }

        return teams;
    }

    @RequestMapping(value = "/{id}",method = GET)
    public Team getById(@PathVariable Long id){
        Team teams = teamRepository.findOne(id);

        if(teams == null)
            throw  new JugadorException(id);

        return teams;



    }

    @RequestMapping(value = "/{id}", method = DELETE)
    public void deleteById(@PathVariable Long id){
        Team teams = teamRepository.findOne(id);

        if(teams == null){throw new TeamException(id);}

       teamRepository.delete(id);


    }

    @RequestMapping(value = "/{id}", method = PUT)
    public Team updateById(@PathVariable Long id, @RequestBody Team teams){
        Team t1 = teamRepository.findOne(id);

        if(t1 == null){throw new TeamException(id);}

        return teamRepository.save(teams);

    }




}
