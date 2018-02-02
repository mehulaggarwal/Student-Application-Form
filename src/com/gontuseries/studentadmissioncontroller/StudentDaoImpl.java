package com.gontuseries.studentadmissioncontroller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {
	@Autowired
	SessionFactory sessionFactory;

	protected Session currentSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void create(Student student1) {
		currentSession().save(student1);

	}

	@Override
	public void update(Student student1) {
		currentSession().update(student1);

	}

	@Override
	public Student edit(String studentRollNo) {
		return find(studentRollNo);
	}

	@Override
	public void delete(String studentRollNo) {
		currentSession().delete(studentRollNo);

	}

	@Override
	public Student find(String studentRollNo) {
		return (Student)currentSession().get(Student.class,studentRollNo);
	}

	@Override
	public List<Student> getAll() {
		return currentSession().createCriteria(Student.class).list();
	}

}
