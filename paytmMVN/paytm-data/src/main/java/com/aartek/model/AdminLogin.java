package com.aartek.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class AdminLogin {

	@Id
	@Column
	private String Adminname;
	@Column
	private String Adminpass;
	public String getAdminname() {
		return Adminname;
	}
	public void setAdminname(String adminname) {
		Adminname = adminname;
	}
	public String getAdminpass() {
		return Adminpass;
	}
	public void setAdminpass(String adminpass) {
		Adminpass = adminpass;
	}
	
}
