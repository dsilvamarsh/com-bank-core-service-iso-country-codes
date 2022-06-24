package com.bank.core.service.exception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class APIExceptionHandler{

	
	
	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<ErrorMessage> handleNoSuchElementException(NoSuchElementException e){
		
		return ResponseEntity
		.internalServerError()
		.body(ErrorMessage.builder())
		.status(HttpStatus.INTERNAL_SERVER_ERROR)
		.build();
		
	}
	
}
