package com.sud.spring.services;

import java.util.List;

import com.sud.spring.model.Student;

public interface StudentServiceIFC {

	public String saveStudent(Student student);
	
	public List<Student> getStudentList();

	public Student getStudent(int id);

	public void deleteStudent(String id);
}
