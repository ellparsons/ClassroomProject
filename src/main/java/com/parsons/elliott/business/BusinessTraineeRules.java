package com.parsons.elliott.business;

import javax.inject.Inject;

import com.parsons.elliott.persistence.domain.Trainee;
import com.parsons.elliott.persistence.util.JSONUtil;

public class BusinessTraineeRules {
	
	@Inject
	private BusinessTraineeRepository accRepo;
	
	@Inject
	private JSONUtil util;
	
	public String getAllTrainees() {
	
		return accRepo.getAllTrainee();		
	}

	public String getAnTrainee(Long id) {
		
		return accRepo.findATrainee(id);
	}
	
	public String createTrainee(String trainee) {
		
		Trainee anTrainee;
		anTrainee = util.getObjectForJSON(trainee, Trainee.class);
		if(anTrainee.getTraineeId()==9) {
			return ("This trainee is blocked");
		}
		else {
			accRepo.createTrainee(trainee);
			return("Trainee created");
		}
	}

	public String deleteTrainee(Long id) {
		
		return accRepo.deleteTrainee(id);
	}

	public String updateTrainee(Long id, String trainee) {

		return accRepo.updateTrainee(id, trainee);
	}
	
}
