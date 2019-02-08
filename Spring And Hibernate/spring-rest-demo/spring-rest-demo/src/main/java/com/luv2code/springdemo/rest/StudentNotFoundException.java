package com.luv2code.springdemo.rest;

public class StudentNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public StudentNotFoundException(String message, Throwable cause) {
		super(message, cause);

	}

	public StudentNotFoundException(String message) {
		super(message);

	}

	public StudentNotFoundException(Throwable cause) {
		super(cause);
	}

}
