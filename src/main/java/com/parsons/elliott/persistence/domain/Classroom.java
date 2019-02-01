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
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long classroomId;
		
	private String trainerName;
	
	@OneToMany(mappedBy = "trainees", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
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

	public String getTrainer() {
		return trainerName;
	}

	public void setTrainer(String trainerName) {
		this.trainerName = trainerName;
	}
}
