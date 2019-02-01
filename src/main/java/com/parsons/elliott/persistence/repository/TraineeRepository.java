package com.parsons.elliott.persistence.repository;

public interface TraineeRepository {
	String getAllClassroom();
	String createClassroom(String account);
	String deleteClassroom(Long id);
	String updateClassroom(Long id, String account);
	String findAnClassroom(Long id);
}
