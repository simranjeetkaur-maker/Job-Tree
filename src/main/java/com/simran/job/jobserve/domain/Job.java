package com.simran.job.jobserve.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "job")
public class Job {
	
	@Transient
	public static final  String SEQUENCE_NAME="user_sequence";

	@Id
	private int id;
	private String jobname;
	private String location;
	private Long phone;
	private String email;
	private String description;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getJobname() {
		return jobname;
	}
	public void setJobname(String jobname) {
		this.jobname = jobname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public static String getSequenceName() {
		return SEQUENCE_NAME;
	}
	public Job(int id, String jobname, String location, Long phone, String email, String description) {
		super();
		this.id = id;
		this.jobname = jobname;
		this.location = location;
		this.phone = phone;
		this.email = email;
		this.description = description;
	}
	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	
}
