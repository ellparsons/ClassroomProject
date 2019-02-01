package com.parsons.elliott.business;

import javax.inject.Inject;

import com.parsons.elliott.persistence.repository.TraineeRepository;

public class BusinessTraineeRules {
	
	@Inject
	private TraineeRepository classRepo;
	
	public String getAllTrainee() {
		return classRepo.getAllTrainee();
	}
	
	public String getATrainee(Long id) {
		return classRepo.findATrainee(id);
	}
	
	public String createATrainee(String trainee) {
		return classRepo.createTrainee(trainee);
	}
	
	public String deleteTrainee(Long id) {
		return classRepo.deleteTrainee(id);
	}

	public String updateTrainee(Long id, String account) {
		return classRepo.updateTrainee(id, account);
	}
	
}
