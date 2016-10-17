package com.aartek.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.model.UserLogin;

@Repository
public class LoginRepository {

	@Autowired
	HibernateTemplate hibernateTemplate;

	public List<Object> loginDBCheck(UserLogin login) {

		//List<Object> l=hibernateTemplate.find("from UserLogin where emailId="+login.getEmailId()+"and password="+login.getPassword()+"");
		List<Object> l=hibernateTemplate.find("from UserLogin al where al.emailId=? and al.password=?",login.getEmailId(),login.getPassword());

		return l;

	}	
	

	public boolean loginDBsave(UserLogin login) {

		String email = login.getEmailId();
		String password = login.getPassword();

		System.out.println(email+"  repo  "+login);
		//hibernateTemplate.persist(login);

		hibernateTemplate.save("login");
		System.out.println("save");

		return false;

	}

}
