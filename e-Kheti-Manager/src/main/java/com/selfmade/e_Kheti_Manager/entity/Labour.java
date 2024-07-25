package com.selfmade.e_Kheti_Manager.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Labour {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int labourId;
	private String labourName;
	@Column(unique = true)
	private long lobourPhoneno;
	private String labourAddress;
	private int noOfDays;
	private double charges;
	
	

}
