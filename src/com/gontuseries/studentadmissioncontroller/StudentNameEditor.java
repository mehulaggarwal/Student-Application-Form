package com.gontuseries.studentadmissioncontroller;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport{
	
    @Override
	public void setAsText(String studentName)throws IllegalArgumentException
	{
    	if(studentName.isEmpty())
    		setValue(studentName);
    	else if(studentName.contains("Mr.")||studentName.contains("Ms."))
		{
			setValue(studentName);
		}
		else
		{
			studentName="Mr."+studentName;
			setValue(studentName);
		}
	}

}
