package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer stuno;
	private String stuname;
	private String stumail;
	private String stusex;
	@JsonProperty("birthday")
	private String stubir;
	
	public Integer getStuno() {
		return stuno;
	}
	public void setStuno(Integer stuno) {
		this.stuno = stuno;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public String getStumail() {
		return stumail;
	}
	public void setStumail(String stumail) {
		this.stumail = stumail;
	}
	public String getStusex() {
		return stusex;
	}
	public void setStusex(String stusex) {
		this.stusex = stusex;
	}
	public String getStubir() {
		return stubir;
	}
	public void setStubir(String stubir) {
		this.stubir = stubir;
	}
	public byte[] getStupic() {
		return stupic;
	}
	public void setStupic(byte[] stupic) {
		this.stupic = stupic;
	}
	private byte[] stupic;
}
