package com.aartek.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.aartek.model.UserRegister;

@Component
public class RegisterValidator implements Validator {
	
	public boolean supports(Class<?> clazz){
		
		return UserRegister.class.isAssignableFrom(clazz);
		
	}
	
	
	
	public void validate(Object target, Errors errors){
		
		UserRegister register= (UserRegister) target;
		
		ValidationUtils.rejectIfEmpty(errors, "emailId", "error.emailId.empty");
		ValidationUtils.rejectIfEmpty(errors, "fullName","error.fullName.empty");
		ValidationUtils.rejectIfEmpty(errors, "mobileNumber", "error.mobileNumber.empty");
		ValidationUtils.rejectIfEmpty(errors, "password", "error.password.empty");
		

	}
	

}
