package com.aartek.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.model.UserRecharge;

@Repository
public class RechargeRepository {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public List<UserRecharge> SaveGetRecharge(UserRecharge userRecharge){
		
		if(userRecharge!=null){
			
			hibernateTemplate.saveOrUpdate(userRecharge);
			System.out.println("data save");
			List<UserRecharge> rechargeList= hibernateTemplate.find("from UserRecharge");
			System.out.println("data insert");
			return rechargeList;
		}
		
		else{
		return null;
		}
	}

}
