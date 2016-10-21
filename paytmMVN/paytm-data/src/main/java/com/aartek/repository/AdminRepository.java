package com.aartek.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.model.AdminLogin;
import com.aartek.model.UserLogin;

@Repository
public class AdminRepository {

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	
	
	public List<Object> AdminloginDBCheck(AdminLogin adminLogin) {

		//List<Object> l=hibernateTemplate.find("from UserLogin where emailId="+login.getEmailId()+"and password="+login.getPassword()+"");
		List<Object> l=hibernateTemplate.find("from AdminLogin al where al.Adminname=? and al.Adminpass=?", adminLogin.getAdminname(), adminLogin.getAdminpass());

		return l;

	}	
	
	
	
}
