package com.parsons.elliott.persistence.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "classroom")
public class Classroom implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long classroomId;
		
	private String trainerName;
		
	@OneToMany(mappedBy="classroom")
	Set<Classroom> classroom;
	
	public Classroom() {
			
	}
	
	public Classroom(Long classroomId, String trainerName) {
		this.classroomId=classroomId;
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
