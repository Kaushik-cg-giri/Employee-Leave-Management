package com.practise.employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = HttpMessageNotReadableException.class)
	public ResponseEntity<ErrorResponse> leaveRequestExceptionHandler(HttpMessageNotReadableException ex){
		ErrorResponse response =new ErrorResponse(false,"Not applied for Lave");
		return new ResponseEntity<ErrorResponse>(response,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<ErrorResponse> attendenceNotFoundException(AttendenceNotFound ex){
		ErrorResponse response = new ErrorResponse(false,ex.getMessage());
		return new ResponseEntity<ErrorResponse>(response,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> exceptonHandler(Exception ex){
		ErrorResponse response = new ErrorResponse(false,"Something went wrong");
		
		return new ResponseEntity<ErrorResponse>(response,HttpStatus.NOT_FOUND);
	
	}
}