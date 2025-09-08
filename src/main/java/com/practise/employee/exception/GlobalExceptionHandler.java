package com.practise.employee.exception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = HttpMessageNotReadableException.class)
	public ResponseEntity<ErrorResponse> emptyBodyRequestExceptionHandler(HttpMessageNotReadableException ex){
		ErrorResponse response =new ErrorResponse(false,"Request Body is Empty");
		return new ResponseEntity<ErrorResponse>(response,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = HttpRequestMethodNotSupportedException.class)
	public ResponseEntity<ErrorResponse> requestMethodExceptionHandler(HttpRequestMethodNotSupportedException ex){
		ErrorResponse response =new ErrorResponse(false,"Request Method not Supported");
		return new ResponseEntity<ErrorResponse>(response,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = NoSuchElementException.class)
	public ResponseEntity<ErrorResponse> emptyDatabseExceptionHandler(NoSuchElementException ex){
		ErrorResponse response =new ErrorResponse(false,"No Value present in Database");
		return new ResponseEntity<ErrorResponse>(response,HttpStatus.NOT_FOUND);
	}
		
	@ExceptionHandler(value = MoreThanOneReviewForEmployeeNotSuitable.class)
	public ResponseEntity<ErrorResponse> moreThanOneReviewException(MoreThanOneReviewForEmployeeNotSuitable ex){
		ErrorResponse response = new ErrorResponse(false,ex.getMessage());
		return new ResponseEntity<ErrorResponse>(response,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = AttendenceNotFound.class)
	public ResponseEntity<ErrorResponse> attendenceNotFoundException(AttendenceNotFound ex){
		ErrorResponse response = new ErrorResponse(false,ex.getMessage());
		return new ResponseEntity<ErrorResponse>(response,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value=NoPerfomanceReviewFound.class)
	public ResponseEntity<ErrorResponse> perfomanceReviewNotFound(NoPerfomanceReviewFound ex){
		ErrorResponse response = new ErrorResponse(false, ex.getMessage());
		return new ResponseEntity<ErrorResponse>(response, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(PerfomanceRatingNotSuitable.class)
	public ResponseEntity<ErrorResponse> reviewExceptionHandler(PerfomanceRatingNotSuitable ex){
		ErrorResponse response = new ErrorResponse(false,ex.getMessage());
		return new ResponseEntity<ErrorResponse>(response,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> exceptonHandler(Exception ex){
		ErrorResponse response = new ErrorResponse(false,"Something went wrong");
		
		return new ResponseEntity<ErrorResponse>(response,HttpStatus.NOT_FOUND);
	
	}
}