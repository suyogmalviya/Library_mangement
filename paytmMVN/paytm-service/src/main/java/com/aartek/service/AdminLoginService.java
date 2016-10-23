package com.aartek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.model.AdminLogin;
import com.aartek.model.UserLogin;
import com.aartek.repository.AdminRepository;

@Service
public class AdminLoginService {

	@Autowired
	private AdminRepository adminRepository;

	public boolean checkAdminLogin(AdminLogin adminLogin) {
		System.out.println("inside service Check admin login");
		System.out.println("Admin name" + adminLogin.getAdminname() + " " + adminLogin.getAdminpass());

		List<Object> adloginstatus = adminRepository.AdminloginDBCheck(adminLogin);
		if (adloginstatus.size() == 0) {
			return false;
		} else {
			System.out.println(" list is not empty");

			return true;
		}

	}
}