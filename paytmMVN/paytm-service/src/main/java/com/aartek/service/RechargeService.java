package com.aartek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.model.UserRecharge;
import com.aartek.repository.RechargeRepository;

@Service
public class RechargeService {

	@Autowired
	private RechargeRepository rechargeRepo;
	
	public List<UserRecharge> getRechargeDetail(UserRecharge userRecharge){
		
			System.out.println("rec service");
			
			List<UserRecharge> userlist= rechargeRepo.SaveGetRecharge(userRecharge);
			System.out.println("on service list get");
			
			if(userlist.size()==0){
				
				return null;
				
			}
		return userlist;
		
	}
	
}
