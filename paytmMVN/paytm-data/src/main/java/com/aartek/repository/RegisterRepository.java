package com.aartek.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.model.UserRegister;


@Repository
public class RegisterRepository {
	
	@Autowired													
	private HibernateTemplate hibernateTemplate;
	
	public UserRegister saveRegisterRepo(UserRegister userReg){
		System.out.println("repo inside");
		if(userReg!=null){
		 hibernateTemplate.save(userReg);
		 System.out.println("data save");
		 return userReg;
		}
		else{
			return null;			
		}
		
		
		
	}

}
