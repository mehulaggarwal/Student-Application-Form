package com.gontuseries.studentadmissioncontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("studentService")
@Transactional(rollbackFor=Exception.class)
public class StudentSeviceImpl implements StudentService{

	@Autowired
	StudentDao studentDao;
	
	@Override
	public void create(Student student1) {
		studentDao.create(student1);
	}

	@Override
	public void update(Student student1) {
		studentDao.update(student1);
		
	}

	@Override
	public Student edit(String studentRollNo) {
		return studentDao.edit(studentRollNo);
		
	}

	@Override
	public void delete(String studentRollNo) {
		studentDao.delete(studentRollNo);
		
	}

	@Override
	public Student find(String studentRollNo) {
		return studentDao.find(studentRollNo);
	}

	@Override
	public List<Student> getAll() {
		return studentDao.getAll();
	}

	

}
