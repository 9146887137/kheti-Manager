package com.selfmade.e_Kheti_Manager.entity;

import java.util.Date;
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
public class CropActivity {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int activityId;
	private String activityName;
	private Date date;
	private int noOfLabours;
	private double labourRate;
	private double totalLabourCharges;
	private double totalActivityExpenses;
	private boolean paidStatus;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Labour> labours;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Fertilizer> fertilizers;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Pesticide> pesticides;
	
}
