package com.gontuseries.studentadmissioncontroller;

import java.util.List;

public interface StudentDao {

	public void create(Student student1);
	public void update(Student student1);
	public Student edit(String studentRollNo);
	public void delete(String studentRollNo);
	public Student find(String studentRollNo);
	public List<Student> getAll();
	
	
}
