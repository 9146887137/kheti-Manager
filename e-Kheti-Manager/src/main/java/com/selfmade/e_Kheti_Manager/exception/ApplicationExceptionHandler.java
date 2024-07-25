package com.selfmade.e_Kheti_Manager.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.selfmade.e_Kheti_Manager.util.ResponseStructure;


@RestControllerAdvice
public class ApplicationExceptionHandler {

	@ExceptionHandler(InvalidPasswordException.class)
	public ResponseEntity<ResponseStructure<String>> handleInvalidPasswordException(InvalidPasswordException e) {
		ResponseStructure<String> structure=new ResponseStructure<String>();
		structure.setStatus(HttpStatus.NOT_FOUND.value());
		structure.setMessage(e.getMessage());
		structure.setData("NO Data Found");
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(FarmerNotFoundException.class)
	public ResponseEntity<ResponseStructure<String>> handleFarmerNotFoundException(FarmerNotFoundException e) {
		ResponseStructure<String> structure=new ResponseStructure<String>();
		structure.setStatus(HttpStatus.NOT_FOUND.value());
		structure.setMessage(e.getMessage());
		structure.setData("NO Data Found");
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
}
