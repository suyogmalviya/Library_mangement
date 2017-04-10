package com.aartek.controller;

import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.aartek.model.AdminLogin;
import com.aartek.model.Createnewstaff;
import com.aartek.model.UserLogin;
import com.aartek.service.CreatenewstaffService;

@Controller
public class CreatenewstaffController {

	@Autowired
	private CreatenewstaffService createnewstaffService;

	// ************************************************************************************
	@RequestMapping(value = "/createnewstaff", method = { RequestMethod.GET, RequestMethod.POST })
	public String createnewstaff(Map<String, Object> map) {

		System.out.println("inside  to display create ew staff page ");
		map.put("Createnewstaff", new Createnewstaff());

		return "createnewstaff";

	}

	// ****************************************************************************
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

	// ********************************************************************
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

	// **********************************************************************
	/*
	 * @RequestMapping(value="/deletestaff",method = { RequestMethod.GET,
	 * RequestMethod.POST },headers = "Accept=application/json") public String
	 * deleteStaff(@PathVariable("employee_id") String employee_id){
	 * 
	 * System.out.println("delete process accepted form jsp page ");
	 * this.createnewstaffService.deletestaffservice(employee_id);
	 * 
	 * return "Showstaffdetail" ; }
	 */

	// @RequestMapping(value = "/deletestaff/${l3.employee_id}", method =
	// RequestMethod.GET, headers = "Accept=application/json")

	/*
	 * @RequestMapping(value = "/deletestaff", method = RequestMethod.GET)
	 * public ModelAndView deleteUser(HttpServletRequest request) {
	 * System.out.println("delete method execute");
	 * System.out.println(request.getParameter("employee_id")); int userId =
	 * Integer.parseInt(request.getParameter("id")); //userDao.delete(userId);
	 * return new ModelAndView("redirect:/"); }
	 */

	@RequestMapping(value = "/deletestaff")
	public String deleteManager(ModelMap model, @RequestParam(required = false) Integer employee_id,
			@ModelAttribute Createnewstaff createnewstaff) {
		System.out.println("inside new delete method");
		System.out.println(employee_id);
		// managerService.deleteManager(id);
		createnewstaffService.deletestaffservice(employee_id);
		return "redirect:/showstaffdetail.do";
	}

	/*
	 * @RequestMapping("edit") public ModelAndView editUser(@RequestParam int
	 * id,@ModelAttribute Employee employee) { Employee employeeObject =
	 * dataService.getRowById(id); return new
	 * ModelAndView("edit","employeeObject",employeeObject); }
	 */
//****************************** edit************************
	@RequestMapping("editstaff.do")
	public ModelAndView editstaffcon(@RequestParam int employee_id, @ModelAttribute Createnewstaff createnewstaff) {
		System.out.println("inside edit controller method");
		Createnewstaff editobject = createnewstaffService.getRowById1(employee_id);
		System.out.println("2"+editobject.getEmployee_id());
		return new ModelAndView("editstaff", "editobject", editobject);

	}
	
	///************** update **********************
	
/*	@RequestMapping("update")
	public ModelAndView updateUser(@ModelAttribute Employee employee) {
		dataService.updateRow(employee);
		return new ModelAndView("redirect:list");
	}*/
	
	
	@RequestMapping("update.do")
public ModelAndView updatestaff(@ModelAttribute Createnewstaff createnewstaff){
	
	createnewstaffService.updatestaffser(createnewstaff);
	return new ModelAndView("redirect:/showstaffdetail.do");
}
	
	
}
