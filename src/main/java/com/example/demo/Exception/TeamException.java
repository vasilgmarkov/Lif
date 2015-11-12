package com.example.demo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by jhipster on 12/11/15.
 */


@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class TeamException extends RuntimeException{

    public TeamException(Long id){
        super("No Exsiste Team con ID"+id);
    }


}
