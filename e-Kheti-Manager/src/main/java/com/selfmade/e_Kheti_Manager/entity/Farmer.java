package com.selfmade.e_Kheti_Manager.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Farmer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long farmerId;
	private String farmerName;
	@Column(unique = true)
	private long farmerPhoneNo;
	@Column(unique = true)
	private long farmerAdharNo;
	private int farmerAge;
	private String farmerAddress;
	

}
