package com.aartek.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.UserLogin;
import com.aartek.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/mylogin", method = RequestMethod.GET)
	public String showLogin(Map<String, Object> map) {

		map.put("UserLogin", new UserLogin()); // using for instantiate
												// userLogin pojo for set value
												// and get value
		return "login";

	}

	/*
	 * @RequestMapping(value = "/saveUser", method = RequestMethod.POST) public
	 * String saveUser(@ModelAttribute("UserLogin") UserLogin userlogin) {
	 * System.out.println("inside controller"); System.out.println("E-mail " +
	 * userlogin.getEmailId()); System.out.println("E-mail " +
	 * userlogin.getPassword());
	 * 
	 * boolean loginStatus = loginService.checkLogin(userlogin); // boolean
	 * loginStatus=loginService.checkLogin(userlogin);
	 * System.out.println(loginStatus); Map<String, String> map=new
	 * HashMap<String, String>(); if (loginStatus == false) {
	 * 
	 * map.put("message", "invalide E-mail and Password"); //map object not bind for response object. for this problem we use modelmap object
	 * System.out.println(map); return "redirect:/mylogin.do"; } else { return
	 * "welcome"; } }
	 */

	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("UserLogin") UserLogin userlogin, ModelMap model) {
		model.addAttribute("invalid", "Invalid User E-mail and Password");// for validator
		boolean loginStatus = loginService.checkLogin(userlogin);
		if (loginStatus == false) {

			return "login";
		} else {
			return "welcome";
		}

	}

}
