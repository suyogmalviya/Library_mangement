package com.aartek.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class UserRecharge {
	
	@Id
	private long mobileNumber;
	@Column
	private int ammout;
	@Column
	private String serviceProvider;
	
	
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public int getAmmout() {
		return ammout;
	}
	public void setAmmout(int ammout) {
		this.ammout = ammout;
	}
	public String getServiceProvider() {
		return serviceProvider;
	}
	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}
	
	
	
	

}
