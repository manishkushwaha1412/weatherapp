package com.sapient.weather.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RecordNotFoundController {

    @ExceptionHandler(value = RecordNotFoundException.class)
    public ResponseEntity<Object> exception(RecordNotFoundException exception) {
        if (exception.getMessage() != null) {
            return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
        } else if (exception.getExceptionVO() != null) {
            return new ResponseEntity<>(exception.getExceptionVO(), HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>("Internal Error", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
