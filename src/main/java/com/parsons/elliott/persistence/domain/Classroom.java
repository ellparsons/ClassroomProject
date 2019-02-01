package com.parsons.elliott.persistence.domain;

import java.util.Collection;
import java.util.LinkedHashSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "classroom")
public class Classroom {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long classroomId;
		
	private String trainerName;
	
	@OneToMany (mappedBy = "classroomId", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	Collection<Trainee> trainees = new LinkedHashSet<Trainee>();

	
	public Classroom() {
			
	}
	
	public Classroom( String trainerName) {
		this.trainerName=trainerName;
	}
	

	public Long getClassroomId() {
		return classroomId;
	}



	public void setClassroomId(Long classroomId) {
		this.classroomId = classroomId;
	}



	public String getTrainerName() {
		return trainerName;
	}



	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}



	public Collection<Trainee> getTrainees() {
		return trainees;
	}



	public void setTrainees(Collection<Trainee> trainees) {
		this.trainees = trainees;
	}

	
}
