package com.aartek.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.UserRecharge;
import com.aartek.service.RechargeService;

@Controller
public class RechargeController {
	
	@Autowired
	private RechargeService recharges;
	
	@RequestMapping(value="/myrecharge", method=RequestMethod.GET)
	public String showrecharge(Map<String, Object> map){
		System.out.println("rech controller");
		map.put("UserRecharge", new UserRecharge());
		
		
		return "recharge";		
	}
	
	@RequestMapping(value="/saveRecharge" ,method=RequestMethod.POST)
	public String saveReharge(@ModelAttribute("UserRecharge") UserRecharge userRecharge, ModelMap model) {
	
		
	List<UserRecharge> getList=recharges.getRechargeDetail(userRecharge);
	//model.addAttribute("rechargeList", getList);	

	
	
	
	System.out.println("getlist "+getList);
		
	if(getList.size()==0){
		//model.addAttribute("noData", "No Data Found..!");
		System.out.println("true case");
		return "recharge";
	}
	else{
		System.out.println("false case");
		model.addAttribute("list", getList);
		return "recharge";
	}
		

	}


}
