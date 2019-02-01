package com.parsons.elliott.business;

public interface BusinessTraineeRepository {
	String getAllTrainee();
	String createTrainee(String account);
	String deleteTrainee(Long id);
	String updateTrainee(Long id, String account);
	String findATrainee(Long id);
}
