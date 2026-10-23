package com.example.bookmyshowlld.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class SeatsAlreadyBookedExp extends RuntimeException {
    public SeatsAlreadyBookedExp()
    {
        super("Seats Already Booked");
    }

}
