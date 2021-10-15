package com.simran.job.jobserve.domain;


import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "db_sequence")
public class DbSequence {
	
	 
	@Id
    private String  id;
    private int seq;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public DbSequence() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DbSequence(String id, int seq) {
		super();
		this.id = id;
		this.seq = seq;
	}
	@Override
	public String toString() {
		return "DbSequence [id=" + id + ", seq=" + seq + "]";
	}
    
    
}