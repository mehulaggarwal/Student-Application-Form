package com.gontuseries.studentadmissioncontroller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby,String>{
  
      String listofValidHobbies;
	@Override
	public void initialize(IsValidHobby isvalidhobby) {
		this.listofValidHobbies=isvalidhobby.listofValidHobbies();
		
	}
	@Override
	public boolean isValid(String studentHobby, ConstraintValidatorContext ctx) {
		if(studentHobby==null)
			return false;
		if(studentHobby.matches(listofValidHobbies))
		return true;
		else
			return false;
	}
}
