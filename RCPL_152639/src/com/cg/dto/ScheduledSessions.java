package com.cg.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table
public class ScheduledSessions {

	
	@Id
	@Column(name="Id")
	@NotNull(message="id is required")
	private int t_id;
	@Column(name="SessionName")
	@NotNull(message="session name is required")
	@Size(max=10,min=2)
	private String t_name;
	@Column(name="Duration")
	@NotNull(message="duration is required")
	private int t_duration;
	@Column(name="Faculty")
	@NotNull(message="faculty name is required")
	private String t_faculty;
	@Column(name="Mode")
	@NotNull(message="mode is required")
	private String t_mode;
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public int getT_duration() {
		return t_duration;
	}
	public void setT_duration(int t_duration) {
		this.t_duration = t_duration;
	}
	public String getT_faculty() {
		return t_faculty;
	}
	public void setT_faculty(String t_faculty) {
		this.t_faculty = t_faculty;
	}
	public String getT_mode() {
		return t_mode;
	}
	public void setT_mode(String t_mode) {
		this.t_mode = t_mode;
	}
	public ScheduledSessions(int t_id, String t_name, int t_duration, String t_faculty, String t_mode) {
		super();
		this.t_id = t_id;
		this.t_name = t_name;
		this.t_duration = t_duration;
		this.t_faculty = t_faculty;
		this.t_mode = t_mode;
	}
	
	public ScheduledSessions()
	{
	}
	@Override
	public String toString() {
		return "TrainingDTO [t_id=" + t_id + ", t_name=" + t_name + ", t_duration=" + t_duration + ", t_faculty="
				+ t_faculty + ", t_mode=" + t_mode + "]";
	}
	
	}

