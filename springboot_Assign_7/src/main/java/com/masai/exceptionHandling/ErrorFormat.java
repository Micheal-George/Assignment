package com.masai.exceptionHandling;

import java.time.LocalDateTime;

public class ErrorFormat {
	
	private LocalDateTime timestamp;
	private String message;
	private String details;
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public ErrorFormat(LocalDateTime timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}
	public ErrorFormat() {
		super();
	}
	@Override
	public String toString() {
		return "ErrorFormat [timestamp=" + timestamp + ", message=" + message + ", details=" + details + "]";
	}
	
	

}
