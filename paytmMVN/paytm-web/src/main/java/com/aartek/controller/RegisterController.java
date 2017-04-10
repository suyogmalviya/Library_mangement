package com.aartek.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.UserRegister;
import com.aartek.service.RegisterService;
import com.aartek.validator.RegisterValidator;

@Controller
public class RegisterController {
	
	@Autowired
	private RegisterService registerService;
	
	@Autowired
	private RegisterValidator registerValid;
	
	
	
	@RequestMapping(value = "/Registration_New", method = RequestMethod.GET)
	  public String Registration_New() {
	    return "Registration_New";
	  }
	
	
	
	@RequestMapping(value="/myregister",method=RequestMethod.GET)
	public String showRegister(Map<String, Object> map){
		
		map.put("UserRegister", new UserRegister());
		System.out.println("show register");
		
		return "register";		
		
	}
	
	
	@RequestMapping(value="/registerUser" ,method=RequestMethod.POST)
	public String saveRegister(@ModelAttribute("UserRegister") UserRegister userRegister,BindingResult result,ModelMap model){
		
		System.out.println("inside controller");
		
		
		registerValid.validate(userRegister, result);
		
		if(result.hasErrors()){
			
			return "register";
		}
		
		else{		
		
		boolean ckReg= registerService.saveRegisterService(userRegister);
		
		if (ckReg== false) {
			return "redirect:/myregister.do";
		} 
		else {
			return "redirect:/mylogin.do";
		}
			
	}}
	
	

}
