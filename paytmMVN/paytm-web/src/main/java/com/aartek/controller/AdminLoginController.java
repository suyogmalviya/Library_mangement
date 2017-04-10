package com.aartek.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.AdminLogin;
import com.aartek.service.AdminLoginService;

@Controller
public class AdminLoginController {

	@Autowired
	private AdminLoginService adminLoginService;

	/* @RequestMapping(value="/Adminlogin",method=RequestMethod.GET) */
	@RequestMapping(value = "/Adminlogin", method = { RequestMethod.GET, RequestMethod.POST })
	public String AdminLoginDisplay(Map<String, Object> map) {
		System.out.println("inside admin login display");
		map.put("AdminLogin", new AdminLogin());
	
		return "AdminLogin";

	}

	@RequestMapping(value = "/saveAdminUser", method = RequestMethod.POST)
	public String Adminsaveuser(@ModelAttribute("AdminLogin") AdminLogin adminLogin, ModelMap model) {
		model.addAttribute("invalid", "invalid user user name and password");

		boolean AdminloginStatus = adminLoginService.checkAdminLogin(adminLogin);

		if (AdminloginStatus == false) {
			return "Test";
		} else {
			return "WelcomeAdmin";
		}
	}

		
	/*
	 * @RequestMapping(value = "/saveUser", method = RequestMethod.POST) public
	 * String saveUser(@ModelAttribute("UserLogin") UserLogin userlogin,
	 * ModelMap model) { model.addAttribute("invalid",
	 * "Invalide User E-mail and Password"); boolean Adloginstatus =
	 * adminLoginService.checkAdminLogin(adminLogin);
	 * 
	 * boolean loginStatus = loginService.checkLogin(userlogin); if (loginStatus
	 * == false) {
	 * 
	 * return "login"; } else { return "welcome"; }
	 */

	@RequestMapping(value = "/india", method = RequestMethod.GET)

	public String indiaDisplay() {

		System.out.println("inside india");
		return "india";

	}

}
