package com.parsons.elliott.business;

import javax.inject.Inject;

import com.parsons.elliott.persistence.repository.ClassroomRepository;

public class BusinessClassroomRules {

	@Inject
	private ClassroomRepository classRepo;
	
	public String getAllClassroom() {
		return classRepo.getAllClassroom();
	}
	
	public String getAClassroom(Long id) {
		return classRepo.findAClassroom(id);
	}
	
	public String createAClassroom(String classroom) {
		return classRepo.createClassroom(classroom);
	}
	
	public String deleteClassroom(Long id) {
		return classRepo.deleteClassroom(id);
	}

	public String updateClassroom(Long id, String account) {
		return classRepo.updateClassroom(id, account);
	}

}
