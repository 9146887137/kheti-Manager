package com.selfmade.e_Kheti_Manager.exception;

public class InvalidPasswordException extends RuntimeException{

	String msg;
	
	public InvalidPasswordException() {
		// TODO Auto-generated constructor stub
	}

	public InvalidPasswordException(String msg) {
		super(msg);
		this.msg = msg;
	}
}
