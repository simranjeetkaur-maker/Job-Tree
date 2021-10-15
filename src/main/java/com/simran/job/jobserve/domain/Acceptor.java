package com.simran.job.jobserve.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Acceptor {
	
	@Transient
	public static final  String SEQUENCE_NAME="user_sequence";

	@Id
	private int id;
	private String accepted;
	private String name;
	private Long phone;
	private String email;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccepted() {
		return accepted;
	}
	public void setAccepted(String accepted) {
		this.accepted = accepted;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public static String getSequenceName() {
		return SEQUENCE_NAME;
	}
	public Acceptor(int id, String accepted, String name, Long phone, String email, String address) {
		super();
		this.id = id;
		this.accepted = accepted;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}
	public Acceptor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
