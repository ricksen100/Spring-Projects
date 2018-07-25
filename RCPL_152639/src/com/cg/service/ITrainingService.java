package com.cg.service;

import java.util.List;

import com.cg.dto.ScheduledSessions;

public interface ITrainingService {

	public void addSessions(ScheduledSessions t);
	public List<ScheduledSessions> viewSessions();
	
}
