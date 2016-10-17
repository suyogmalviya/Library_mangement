package com.aartek.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.model.UserRegister;
import com.aartek.repository.RegisterRepository;

@Service
public class RegisterService {
	
	@Autowired
	private RegisterRepository registerRepo;
	
	public boolean saveRegisterService(UserRegister userReg){
		
	
	UserRegister usrReg=registerRepo.saveRegisterRepo(userReg);
	System.out.println("reg service");
	
		
		if(usrReg!=null){
		return true;
		}
		else{
			return false;
		}
	}

	
}
