package com.selfmade.e_Kheti_Manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.selfmade.e_Kheti_Manager.dao.KhetiBookDao;
import com.selfmade.e_Kheti_Manager.entity.Farmer;
import com.selfmade.e_Kheti_Manager.util.ResponseStructure;

@Service
public class KhetiBookService {
	
	@Autowired
	private KhetiBookDao khetiBookDao;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public ResponseEntity<ResponseStructure<Farmer>> saveFarmer( Farmer farmer) {
		farmer.setPassword(passwordEncoder.encode(farmer.getPassword()));
		Farmer dbFarmer=khetiBookDao.saveFarmer(farmer);
			ResponseStructure<Farmer> structure=new ResponseStructure<Farmer>();
			structure.setMessage("farmer signup successfully..!");
			structure.setStatus(HttpStatus.OK.value());
			structure.setData(dbFarmer);
		return new ResponseEntity<ResponseStructure<Farmer>>(structure,HttpStatus.OK);
	}
	

}
