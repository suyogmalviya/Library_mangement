package com.aartek.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.AdminLogin;
import com.aartek.model.UserLogin;
import com.aartek.service.AdminLoginService;

@Controller
public class AdminLoginController {

	@Autowired
	private AdminLoginService adminLoginService;

	
@RequestMapping(value = "/Adminlogin", method = RequestMethod.GET)
	public String ShowAdminLogin(Map<String, Object> map) {

		map.put("AdminLogin", new AdminLogin());
		return "AdminLogin";
	}
	
	/*@RequestMapping(value="/Adminlogin",method=RequestMethod.GET)
	 
	   public String AdminLoginDisplay() {
		
		System.out.println("inside admin login");
		return "AdminLogin";
	   }*/
	
	

}
