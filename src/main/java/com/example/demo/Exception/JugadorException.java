package com.example.demo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by jhipster on 5/11/15.
 */

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class JugadorException extends RuntimeException{

public JugadorException(Long id){
    super("No Exsiste Jugador con ID"+id);
}


}
