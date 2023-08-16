package com.example.avaliacao.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class Exception extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ResouceNotFoundException.class)
    public ResponseEntity<ExceptionMessage> badRequest(ResouceNotFoundException exception){
        ExceptionMessage message = new ExceptionMessage(exception.getString());
        return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
    }
}
