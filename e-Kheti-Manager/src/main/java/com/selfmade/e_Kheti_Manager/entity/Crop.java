package com.selfmade.e_Kheti_Manager.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Crop {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id  
	private int cropId;
	private String cropName;
	private String season;
	private double contentsInkg;
	private String cropType;
	private double totalExpenses;
	@OneToMany(cascade = CascadeType.ALL)
	private List<CropActivity> cropActivities;

}
