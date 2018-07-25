package com.cg.dao;

import java.util.List;

import com.cg.dto.ScheduledSessions;

public interface ITrainingDAO {

	public void addSessions(ScheduledSessions t);
	public List<ScheduledSessions> viewSessions();
}
