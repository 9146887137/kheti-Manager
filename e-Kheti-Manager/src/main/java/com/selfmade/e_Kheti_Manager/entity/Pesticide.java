package com.selfmade.e_Kheti_Manager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Pesticide {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int pesticideId;
	private String pesticideName;
	private String brandOfPesticide;
	private double price;
	

}
