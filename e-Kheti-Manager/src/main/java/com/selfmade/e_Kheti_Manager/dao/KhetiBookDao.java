package com.selfmade.e_Kheti_Manager.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.selfmade.e_Kheti_Manager.entity.Farmer;
import com.selfmade.e_Kheti_Manager.repository.CropActivityRepository;
import com.selfmade.e_Kheti_Manager.repository.CropRepository;
import com.selfmade.e_Kheti_Manager.repository.FarmerRepository;
import com.selfmade.e_Kheti_Manager.repository.FertilizerRepository;
import com.selfmade.e_Kheti_Manager.repository.LabourRepository;
import com.selfmade.e_Kheti_Manager.repository.LandRepository;
import com.selfmade.e_Kheti_Manager.repository.PesticideRepository;

@Repository
public class KhetiBookDao {
	
	@Autowired
	private FarmerRepository farmerRepository;
	@Autowired
	private LandRepository landRepository;
	@Autowired
	private CropActivityRepository cropActivityRepository;
	@Autowired
	private CropRepository cropRepository;
	@Autowired
	private LabourRepository labourRepository;
	@Autowired
	private FertilizerRepository fertilizerRepository;
	@Autowired
	private PesticideRepository pesticideRepository;
	
	public Farmer saveFarmer(Farmer farmer) {
		return farmerRepository.save(farmer);
	}
	
	public Farmer getFarmer(long phoneNo) {
		return farmerRepository.findByFarmerPhoneNo(phoneNo);
	}

}
