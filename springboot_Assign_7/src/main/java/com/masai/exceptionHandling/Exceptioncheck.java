package com.masai.exceptionHandling;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;


@ControllerAdvice
public class Exceptioncheck {
	
	
	@ExceptionHandler(value=ProductNotFound.class)
	public ResponseEntity<ErrorFormat> myIllegalHandler(ProductNotFound bf,WebRequest req) {
	
		ErrorFormat err=new ErrorFormat(LocalDateTime.now(), bf.getMessage(), req.getDescription(false));
	ResponseEntity<ErrorFormat> re=new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
	return re;
	}
	


	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<ErrorFormat> mynotFoundHandler(NoHandlerFoundException nfe,WebRequest req) {
		ErrorFormat err=new ErrorFormat(LocalDateTime.now(), nfe.getMessage(), req.getDescription(false));
	return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorFormat> myExceptionHandler(Exception e,WebRequest req) {
		ErrorFormat err=new ErrorFormat(LocalDateTime.now(), e.getMessage(), req.getDescription(false));
	return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
	}
}
