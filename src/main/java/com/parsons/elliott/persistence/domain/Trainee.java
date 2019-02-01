package com.parsons.elliott.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="trainee")
public class Trainee{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long traineeId;
	
	private String trainee;
	
	@ManyToOne
	@JoinColumn(name="trainee")
	private Trainee Classroom_trainee;
		
	public Trainee() {
		
	}
	
	public Trainee(Long traineeId, String trainee) {
		this.traineeId=traineeId;
		this.trainee=trainee;
	}

	public Long getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(Long traineeId) {
		this.traineeId = traineeId;
	}

	public String getTrainee() {
		return trainee;
	}

	public void setTrainee(String trainee) {
		this.trainee = trainee;
	}
}
