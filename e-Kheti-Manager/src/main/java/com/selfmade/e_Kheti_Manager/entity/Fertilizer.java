package com.selfmade.e_Kheti_Manager.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Fertilizer {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int fertilizerId;
	@Column(unique = true)
	private String fertilizerName;
	private String fertilizerBrand;
	private String speciality;
	private double ratePerBag;
	private int noOfBags;
	private double totalCharges;

}
