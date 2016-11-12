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

	public void deletestaffbyID(Integer employee_id) {
		System.out.println("inside repo delete method");
		System.out.println(employee_id);

		hibernateTemplate.bulkUpdate("DELETE Createnewstaff where employee_id=?", employee_id);

	}



/*HibernateTemplate.delete takes the object you want to delete as an argument (you pass a query).

Either change hibernateTemplate.delete("from User1 where USER_ID=:" +id1); to: hibernateTemplate.delete(hibernateTemplate.get(User1.class, id1));, or change it to:

hibernateTemplate.bulkUpdate("DELETE User1 where id=?", id1);

*/	
}
