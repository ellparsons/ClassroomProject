package com.parsons.elliott.business;

public interface BusinessClassroomRepository {
	String getAllClassroom();
	String createClassroom(String account);
	String deleteClassroom(Long id);
	String updateClassroom(Long id, String account);
	String findAClassroom(Long id);	
}
