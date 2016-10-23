package com.aartek.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Createnewstaff {

	@Id
	@Column
	private int employee_id;
	@Column
	private  String staffname;
	@Column
	private String emailid;
	@Column
	private  String mobno;
	@Column
	private String department;
	@Column
	private String designation;
	@Column
	private  String address;
	@Column
	private String staffpass;
	@Column
	private String restaffpass;
	
	public String getRestaffpass() {
		return restaffpass;
	}
	public void setRestaffpass(String restaffpass) {
		this.restaffpass = restaffpass;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getStaffname() {
		return staffname;
	}
	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStaffpass() {
		return staffpass;
	}
	public void setStaffpass(String staffpass) {
		this.staffpass = staffpass;
	}
	
}
