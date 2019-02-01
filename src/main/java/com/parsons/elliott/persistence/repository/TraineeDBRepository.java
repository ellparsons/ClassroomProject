package com.parsons.elliott.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.parsons.elliott.persistence.domain.Trainee;
import com.parsons.elliott.persistence.util.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class TraineeDBRepository implements TraineeRepository {

	@PersistenceContext(unitName = "primary")
	private EntityManager em;
	
	@Inject	
	private JSONUtil util;
	
	public String getAllTrainee () {
		Query GetAll = em.createQuery("SELECT a FROM Trainee a");
		return util.getJSONForObject(GetAll.getResultList());
	}
	
	public String findATrainee(Long id) {
		Trainee trainee = em.find(Trainee.class, id);
		return util.getJSONForObject(trainee);
	}
	
	@Transactional(REQUIRED)
	public String createTrainee(String trainee) {
		Trainee newTrainee = util.getObjectForJSON(trainee, Trainee.class);
		em.persist(newTrainee);
		return (util.getJSONForObject(newTrainee));  
	}
	
	@Transactional(REQUIRED)       
	public String updateTrainee(Long id, String trainee) {
		em.remove(findATrainee(id));
		em.persist(createTrainee(trainee));
		return (util.getJSONForObject(trainee));
	}
	
	@Transactional(REQUIRED)
	public String deleteTrainee(Long id) {
		if (findATrainee(id) != null) {
			em.remove(findATrainee(id));
			return("Account with the id: "+id+" has been deleted");
		}
		return("No trainee exists");
	}

}
