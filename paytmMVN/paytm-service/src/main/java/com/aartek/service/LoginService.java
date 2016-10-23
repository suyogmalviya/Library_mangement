package com.aartek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.model.UserLogin;
import com.aartek.repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	private LoginRepository loginRepository;
	
	
	public boolean checkLogin(UserLogin login){
				
		System.out.println("inside service");
		System.out.println("email "+login.getEmailId()+" - "+login.getPassword());
		
		List<Object> ckStatus=loginRepository.loginDBCheck(login);
		//boolean b=loginRepository.loginDBsave(login);
		if(ckStatus.size()==0)
		{
			return false;
		}
		System.out.println("service list save");
		
		return true;	
	
	}
}
