package com.ducdmd152.springbootrest.rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class GlobalRestExceptionHandler {
	// catch all
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handleGenericException(Exception exc) {
		CustomerErrorResponse error = new CustomerErrorResponse();

		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage(exc.getMessage());
		error.setTimeStamp(System.currentTimeMillis());

		// reuturn ResponseEntity
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
}
