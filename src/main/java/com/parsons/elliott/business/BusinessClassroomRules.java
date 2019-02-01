package com.parsons.elliott.business;

import javax.inject.Inject;

import com.parsons.elliott.persistence.domain.Classroom;
import com.parsons.elliott.persistence.util.JSONUtil;

public class BusinessClassroomRules {

	@Inject
	private BusinessClassroomRepository accRepo;
	
	@Inject
	private JSONUtil util;
	
	public String getAllClassrooms() {
	
		return accRepo.getAllClassroom();		
	}

	public String getAnClassroom(Long id) {
		
		return accRepo.findAClassroom(id);
	}
	
	public String createClassroom(String classroom) {
		
		Classroom anClassroom;
		anClassroom = util.getObjectForJSON(classroom, Classroom.class);
		if(anClassroom.getClassroomId()==9) {
			return ("This classroom is blocked");
		}
		else {
			accRepo.createClassroom(classroom);
			return("Classroom created");
		}
	}

	public String deleteClassroom(Long id) {
		
		return accRepo.deleteClassroom(id);
	}

	public String updateClassroom(Long id, String classroom) {

		return accRepo.updateClassroom(id, classroom);
	}
}
