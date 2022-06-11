package com.aakash.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class aakash {

	@Id
	private String aname;
	private String apass;
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getApass() {
		return apass;
	}
	public void setApass(String apass) {
		this.apass = apass;
	}
	@Override
	public String toString() {
		return "aakash [aname=" + aname + ", apass=" + apass + "]";
	}
	
}
