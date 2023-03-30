package com.example.demo.exception;

public class InvalidRequestException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private String message;
	
	public InvalidRequestException(String message) {
		this.setMessage(message);
		System.out.println("Exception occured : "+message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
