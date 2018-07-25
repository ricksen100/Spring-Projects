package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.ITrainingDAO;
import com.cg.dto.ScheduledSessions;

@Service("trainingservice")
@Transactional
public class TrainingServiceImpl implements ITrainingService{

	@Autowired
	ITrainingDAO itrainingdao;
	@Override
	public void addSessions(ScheduledSessions t) {
		// TODO Auto-generated method stub
		itrainingdao.addSessions(t);
	}

	@Override
	public List<ScheduledSessions> viewSessions() {
		// TODO Auto-generated method stub
		return itrainingdao.viewSessions();
	}

}
