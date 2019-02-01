package com.parsons.elliott.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Classroom {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long classroomId;
	
	private String trainer;
	
	public Classroom() {
		
	}

	public Classroom(Long classroomId, String trainer) {
		this.classroomId=classroomId;
		this.trainer=trainer;
	}

	public Long getClassroomId() {
		return classroomId;
	}

	public void setClassroomId(Long classroomId) {
		this.classroomId = classroomId;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	
}
