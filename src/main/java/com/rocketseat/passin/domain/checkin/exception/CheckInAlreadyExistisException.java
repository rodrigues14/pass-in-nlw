package com.rocketseat.passin.domain.checkin.exception;

public class CheckInAlreadyExistisException extends RuntimeException{
    public CheckInAlreadyExistisException(String message) {
        super(message);
    }
}
