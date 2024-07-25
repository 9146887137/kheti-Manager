package com.selfmade.e_Kheti_Manager.util;

import lombok.Data;

@Data
public class ResponseStructure<T>{
	
	private String message;
	private int status;
	private T data;

}
