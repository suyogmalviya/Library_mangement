package com.aartek.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.model.Createnewstaff;
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

}
