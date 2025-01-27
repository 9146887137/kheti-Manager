package com.selfmade.e_Kheti_Manager.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Farmer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int farmerId;
	private String farmerName;
	@Column(unique = true)
	private long farmerPhoneNo;
	@Column(unique = true)
	private long farmerAdharNo;
	private int farmerAge;
	private String farmerAddress;
	private String password;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Land> lands;
	

}
