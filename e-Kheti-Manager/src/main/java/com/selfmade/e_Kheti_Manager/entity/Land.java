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
public class Land {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	private int surveyNo;
	private String villageArea;
	private double areaOfLand;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Crop> crops;

}
