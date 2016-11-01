package com.aartek.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.model.Createnewstaff;
import com.aartek.model.UserLogin;
import com.aartek.model.UserRegister;

@Repository
public class CreateNewStaffRepo {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public Createnewstaff SaveNewStaff(Createnewstaff createnewstaff1) {

		System.out.println(" inside create new staff repo");
		if (createnewstaff1 != null) {
			hibernateTemplate.save(createnewstaff1);
			System.out.println("data save inside data base new staff table");
			return createnewstaff1;
		} else {
			return null;
		}

	}

	public List<Object> Showstaffdetail(Createnewstaff Showstaff) {

		List<Object> l1 = hibernateTemplate.find("from Createnewstaff");
		return l1;

	}
}
