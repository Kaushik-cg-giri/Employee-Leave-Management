package com.practise.employee.leave.management.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = HttpMessageNotReadableException.class)
	public ResponseEntity<ErrorResponse> leaveRequestExceptionHandler(HttpMessageNotReadableException ex){
		ErrorResponse response =new ErrorResponse(false,"Not appled for Lave");
		return new ResponseEntity<ErrorResponse>(response,HttpStatus.NOT_FOUND);
	}
}