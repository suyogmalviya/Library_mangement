package com.aartek.controller;

import java.util.Iterator;
import java.util.List;
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
import com.aartek.model.UserLogin;
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
	public String savenewstaff(@ModelAttribute("Createnewstaff") Createnewstaff createnewstaff, BindingResult result,
			ModelMap model) {

		System.out.println("inside create new staff controller");

		boolean cktnewstaaff = createnewstaffService.saveNewstaffService(createnewstaff);

		if (cktnewstaaff == false) {
			return "createnewstaff";
		} else {
			return "WelcomeAdmin";
		}
	}

	@RequestMapping(value = "/showstaffdetail", method = { RequestMethod.GET, RequestMethod.POST })
	public String Showstaffdetail(@ModelAttribute("Createnewstaff") Createnewstaff showstaff, ModelMap model) {

		System.out.println("inside Show Staff detail method  ");
		boolean staffstatus = createnewstaffService.CheckStaffDetail(showstaff);

		/*************
		 * too See list is iterating for service or not
		 ************/
		/*
		 * System.out.println(createnewstaffService.listofstaff(showstaff));
		 * 
		 * List<Object> l3 = createnewstaffService.listofstaff(showstaff);
		 * 
		 * System.out.println("list inside controller " + l3);
		 * 
		 * Iterator it1 = l3.iterator(); while (it1.hasNext()) { Object o =
		 * (Object) it1.next(); Createnewstaff cp2 = (Createnewstaff) o;
		 * System.out.println("Staff email id " + cp2.getEmailid());
		 * 
		 * }
		 */
		/**************
		 * data is received form service layer
		 ************************************/
		if (staffstatus == false) {
			return "Test";
		} else {

			List<Object> l3 = createnewstaffService.listofstaff(showstaff);
			model.addAttribute("staff_detail", l3);
			return "Showstaffdetail";

		}
	}

}
