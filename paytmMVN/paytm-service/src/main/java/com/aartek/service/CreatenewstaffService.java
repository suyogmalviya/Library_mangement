package com.aartek.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aartek.model.Createnewstaff;
import com.aartek.model.UserLogin;
import com.aartek.repository.CreateNewStaffRepo;

@Service
public class CreatenewstaffService {

	@Autowired
	private CreateNewStaffRepo createNewStaffRepo;

	public boolean saveNewstaffService(Createnewstaff createnewstaff2) {

		Createnewstaff createnewstaff3 = createNewStaffRepo.SaveNewStaff(createnewstaff2);
		System.out.println("create new staff service");
		if (createnewstaff3 != null) {
			return true;
		} else {
			return false;
		}
	}

	public boolean CheckStaffDetail(Createnewstaff staffdetail) {

		System.out.println("inside checkstaff detail method");
		System.out.println(staffdetail.getStaffname());

		List<Object> staffdetailstatus = createNewStaffRepo.Showstaffdetail(staffdetail);

		System.out.println("total no of record" + staffdetailstatus.size());

		Iterator it = staffdetailstatus.iterator();

		while (it.hasNext()) {

			Object o = (Object) it.next();
			Createnewstaff cp = (Createnewstaff) o;
			System.out.println("staff name" + cp.getStaffname());
		}

		System.out.println(staffdetailstatus);
		if (staffdetailstatus.size() == 0) {
			return false;
		}

		System.out.println("Service list have data ");
		return true;

	}

	public List<Object> listofstaff(Createnewstaff showlist) {

		List<Object> l2 = createNewStaffRepo.Showstaffdetail(showlist);

		return l2;
	}

	/*
	 * public List<Person> listPersons() { Session session =
	 * this.sessionFactory.getCurrentSession(); List<Person> personsList =
	 * session.createQuery("from Person").list(); for(Person p : personsList){
	 * logger.info("Person List::"+p); } return personsList; }
	 */

	@Transactional
	public void deletestaffservice(Integer id) {

		System.out.println("inside delete service method");
		
		this.createNewStaffRepo.deletestaffbyID(id);
		
	}

}
