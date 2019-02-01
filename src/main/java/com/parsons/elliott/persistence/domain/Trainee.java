package com.parsons.elliott.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="trainee")
public class Trainee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long traineeId;
	
	private String traineeName;		
	
	private Long classroomId;
	
	public Trainee() {
		
	}
	
	public Trainee(Long classroomId, String traineeName) {
		this.classroomId=classroomId;
		this.traineeName=traineeName;
	}

	public Long getClassroomId() {
		return classroomId;
	}

	public void setClassroomId(Long classroomId) {
		this.classroomId = classroomId;
	}

	public Long getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(Long traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTrainee(String traineeName) {
		this.traineeName = traineeName;
	}
}
