package com.rocketseat.passin.config;

import com.rocketseat.passin.domain.attendee.exception.AttendeeAlreadyExistException;
import com.rocketseat.passin.domain.attendee.exception.AttendeeNotFoundException;
import com.rocketseat.passin.domain.checkin.exception.CheckInAlreadyExistisException;
import com.rocketseat.passin.domain.event.exception.EventFullException;
import com.rocketseat.passin.domain.event.exception.EventNotFoundException;
import com.rocketseat.passin.dto.general.ErrorResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionEntityHandler {

    @ExceptionHandler(EventNotFoundException.class)
    public ResponseEntity handleEventNotFound(EventNotFoundException exception) {
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(EventFullException.class)
    public ResponseEntity<ErrorResponseDTO> handleEventFullException(EventFullException exception) {
        return ResponseEntity.badRequest().body(new ErrorResponseDTO(exception.getMessage()));
    }

    @ExceptionHandler(AttendeeNotFoundException.class)
    public ResponseEntity handleAttendeeNotFound(AttendeeNotFoundException exception) {
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(AttendeeAlreadyExistException.class)
    public ResponseEntity handleAttendeeAlreadyExistis(AttendeeAlreadyExistException exception) {
        return ResponseEntity.status(HttpStatus.CONFLICT).build();
    }

    @ExceptionHandler(CheckInAlreadyExistisException.class)
    public ResponseEntity handleCheckInAlreadyExistis(CheckInAlreadyExistisException exception) {
        return ResponseEntity.status(HttpStatus.CONFLICT).build();
    }
}
