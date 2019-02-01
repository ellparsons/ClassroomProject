package com.parsons.elliott.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.parsons.elliott.persistence.util.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class ClassroomDBRepository implements Repository{
	
	@PersistenceContext(unitName = "primary")
	private EntityManager em;
	
	@Inject
	private JSONUtil util;
	
//	public String getAllTrainers () {
//		Query GetAll = em.createQuery("SELECT a FROM Account a");
//		return util.getJSONForObject(GetAll.getResultList());
//	}
//	
//	public String getAllTrainees(Long id) {
//		Account account = em.find(Account.class, id);
//		return util.getJSONForObject(account);
//	}
//	
//	@Transactional(REQUIRED)
//	public String createTrainer(String account) {
//		Account newAccount = util.getObjectForJSON(account, Account.class);
//		em.persist(newAccount);
//		return (util.getJSONForObject(newAccount));  
//	}
//	
//	@Transactional(REQUIRED)       
//	public String createTrainee(Long id, String account) {
//		em.remove(findAnAccount(id));
//		em.persist(createAccount(account));
//		return (util.getJSONForObject(account));
//	}
//	
//	@Transactional(REQUIRED)
//	public String deleteAccount(Long id) {
//		if (findAnAccount(id) != null) {
//			em.remove(findAnAccount(id));
//			return("Account with the id: "+id+" has been deleted");
//		}
//		return("No account exists");
	}
}
