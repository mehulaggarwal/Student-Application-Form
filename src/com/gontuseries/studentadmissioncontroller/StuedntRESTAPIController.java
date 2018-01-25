package com.gontuseries.studentadmissioncontroller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StuedntRESTAPIController {
	
	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public ArrayList<Student> getStudentList() {
		Student studen1 = new Student();
		studen1.setStudentName("Mehul");
		
		Student studen2 = new Student();
		studen2.setStudentName("Amit");
		
		Student studen3 = new Student();
		studen3.setStudentName("Atin");
		
		ArrayList<Student> studentsList = new ArrayList<>();
		
		studentsList.add(studen1);
		studentsList.add(studen2);
		studentsList.add(studen3);

		return studentsList;

	}
	/******************Retrieving a Student Record**********************/
	@RequestMapping(value="/students/{name}",method = RequestMethod.GET)
	public Student getStudent(@PathVariable("name")String studentName)
	{
		/*fetch the student record usind "studentName" from db*/
		Student student=new Student();
		student.setStudentName(studentName);
		student.setStudentHobby("WWE");
		return student;	
	}
}
