package com.cg.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.dto.ScheduledSessions;

@Repository("trainingdao")
public class TrainingDAOImpl implements ITrainingDAO {

	@Autowired
	@PersistenceContext
	EntityManager entityManager;
	@Override
	public void addSessions(ScheduledSessions t) {
		// TODO Auto-generated method stub
		entityManager.persist(t);
	}

	@Override
	public List<ScheduledSessions> viewSessions() {
		// TODO Auto-generated method stub
		List<ScheduledSessions> list=new ArrayList<ScheduledSessions>();
		Query q=entityManager.createQuery("from ScheduledSessions");
		list=q.getResultList();
		return list;
	}

}
