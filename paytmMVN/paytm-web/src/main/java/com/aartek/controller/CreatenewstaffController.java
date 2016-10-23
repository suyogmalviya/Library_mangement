package com.aartek.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.AdminLogin;
import com.aartek.service.CreatenewstaffService;

@Controller
public class CreatenewstaffController {

	private CreatenewstaffService createnewstaffService;
	
	@RequestMapping(value="/createnewstaff",method={RequestMethod.GET,RequestMethod.POST })
	public String createnewstaff(){
		
		System.out.println("inside  to display create ew staff page ");
		
		
		return "createnewstaff";
		
	}
	
	
/*	@RequestMapping(value = "/Adminlogin", method = { RequestMethod.GET, RequestMethod.POST })
	public String AdminLoginDisplay(Map<String, Object> map) {
		System.out.println("inside admin login display");
		map.put("AdminLogin", new AdminLogin());
		
		 * public String showLogin(Map<String, Object> map) {
		 * map.put("UserLogin", new UserLogin());
		 
		return "AdminLogin";

	}*/
	
	
	
}
