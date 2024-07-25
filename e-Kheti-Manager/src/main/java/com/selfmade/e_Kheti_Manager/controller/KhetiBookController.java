package com.selfmade.e_Kheti_Manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.selfmade.e_Kheti_Manager.entity.Farmer;
import com.selfmade.e_Kheti_Manager.service.KhetiBookService;
import com.selfmade.e_Kheti_Manager.util.ResponseStructure;

@RestController
@enableW
public class KhetiBookController {
	
	@Autowired
	private KhetiBookService khetiBookService;
	
	@PostMapping("/farmer/signup")
	public ResponseEntity<ResponseStructure<Farmer>> signupFarmer(@RequestBody Farmer farmer) {
		return khetiBookService.saveFarmer(farmer);
	}

}
