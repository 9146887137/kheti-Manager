package com.selfmade.e_Kheti_Manager.exception;

public class FarmerNotFoundException extends RuntimeException{
	
	private String msg;

	public FarmerNotFoundException() {
		// TODO Auto-generated constructor stub
	}

	public FarmerNotFoundException(String msg) {
		super(msg);
		this.msg = msg;
	}
	
	
}
