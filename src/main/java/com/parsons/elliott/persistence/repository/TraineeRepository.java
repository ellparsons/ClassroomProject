package com.parsons.elliott.persistence.repository;

public interface TraineeRepository {
	String getAllTrainee();
	String createTrainee(String account);
	String deleteTrainee(Long id);
	String updateTrainee(Long id, String account);
	String findATrainee(Long id);
}
