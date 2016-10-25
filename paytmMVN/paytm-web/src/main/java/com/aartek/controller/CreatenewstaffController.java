package com.aartek.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.AdminLogin;
import com.aartek.model.Createnewstaff;
import com.aartek.service.CreatenewstaffService;

@Controller
public class CreatenewstaffController {

	@Autowired
	private CreatenewstaffService createnewstaffService;

	@RequestMapping(value = "/createnewstaff", method = { RequestMethod.GET, RequestMethod.POST })
	public String createnewstaff(Map<String, Object> map) {

		System.out.println("inside  to display create ew staff page ");
		map.put("Createnewstaff", new Createnewstaff());

		return "createnewstaff";

	}

	@RequestMapping(value = "/saveNewStaff", method = { RequestMethod.GET, RequestMethod.POST })
	public String savenewstaff(@ModelAttribute("Createnewstaff") Createnewstaff createnewstaff,BindingResult result,ModelMap model) {

		System.out.println("inside create new staff controller");

		boolean cktnewstaaff = createnewstaffService.saveNewstaffService(createnewstaff);

		if (cktnewstaaff == false) {
			return "createnewstaff";
		} else {
			return "welcome";
		}
	}

	{

	}

}
