package com.agacorporation.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No such reservation")
public class RoomReservationNotFoundException extends RuntimeException{

    public RoomReservationNotFoundException(){
        super(String.format("Бронирование не существует"));
    }

    public RoomReservationNotFoundException(Long id){
        super(String.format("Бронирование id%d не существует", id));
    }
}
