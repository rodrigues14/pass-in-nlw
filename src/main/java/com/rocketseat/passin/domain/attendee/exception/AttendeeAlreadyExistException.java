package com.rocketseat.passin.domain.attendee.exception;

public class AttendeeAlreadyExistException extends RuntimeException{
    public AttendeeAlreadyExistException(String messege) {
        super(messege);
    }
}
