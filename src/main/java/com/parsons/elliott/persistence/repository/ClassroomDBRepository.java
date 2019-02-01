package com.parsons.elliott.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.parsons.elliott.persistence.domain.Classroom;
import com.parsons.elliott.persistence.util.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class ClassroomDBRepository implements ClassroomRepository{
	
	@PersistenceContext(unitName = "primary")
	private EntityManager em;
	
	@Inject
	private JSONUtil util;
	
	public String getAllClassroom () {
		Query GetAll = em.createQuery("SELECT a FROM Account a");
		return util.getJSONForObject(GetAll.getResultList());
	}
	
	public String findAClassroom(Long id) {
		Classroom classroom = em.find(Classroom.class, id);
		return util.getJSONForObject(classroom);
	}
	
	@Transactional(REQUIRED)
	public String createClassroom(String classroom) {
		Classroom newClassroom = util.getObjectForJSON(classroom, Classroom.class);
		em.persist(newClassroom);
		return (util.getJSONForObject(newClassroom));  
	}
	
	@Transactional(REQUIRED)       
	public String updateClassroom(Long id, String classroom) {
		em.remove(findAClassroom(id));
		em.persist(createClassroom(classroom));
		return (util.getJSONForObject(classroom));
	}
	
	@Transactional(REQUIRED)
	public String deleteClassroom(Long id) {
		if (findAClassroom(id) != null) {
			em.remove(findAClassroom(id));
			return("Classroom with the id: "+id+" has been deleted");
		}
		return("No classroom exists");
	}
}
