package com.example.avaliacao.exception;

public class ResouceNotFoundException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String string;

	public ResouceNotFoundException(String string) {
		this.string = string;
	}

	public String getString() {
		return string;
	}
}

