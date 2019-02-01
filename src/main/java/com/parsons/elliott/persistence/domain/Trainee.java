package com.parsons.elliott.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="trainee")
public class Trainee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long traineeId;
	
	private String traineeName;
	
	@ManyToOne
	@JoinColumn(name = "account")
	private Trainee trainee;
	
	public Trainee() {
		
	}

	public Trainee(Long traineeId, String traineeName) {
		this.traineeId=traineeId;
		this.traineeName=traineeName;
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

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	
	
}
