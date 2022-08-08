package com.masai.exceptionHandling;

public class ProductNotFound extends RuntimeException {
	
	public ProductNotFound() {
		
	}
	
	public ProductNotFound(String message)
	{
		super(message);
	}

}
