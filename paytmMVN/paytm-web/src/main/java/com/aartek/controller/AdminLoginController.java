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

	/*
	 * @RequestMapping(value = "/Adminlogin", method = RequestMethod.POST)
	 * public String ShowAdminLogin(Map<String, Object> map) {
	 * 
	 * map.put("AdminLogin", new AdminLogin()); return "AdminLogin"; }
	 */

	/* @RequestMapping(value="/Adminlogin",method=RequestMethod.GET) */
	@RequestMapping(value = "/Adminlogin", method = { RequestMethod.GET, RequestMethod.POST })

	public String AdminLoginDisplay() {
		System.out.println("inside admin login");
		System.out.println("Test inside");
		return "AdminLogin";
	}

	@RequestMapping(value = "/india", method = RequestMethod.GET)

	public String indiaDisplay() {

		System.out.println("inside india");
		return "india";

	}

}
