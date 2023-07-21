package com.sud.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sud.spring.model.Student;
import com.sud.spring.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentServiceIFC {

	@Autowired
	private StudentRepository studentRepo;
	
	@Override
	@Transactional
	public String saveStudent(Student student) {
		
		if(student.getName() !=null)		
			return studentRepo.saveStudent(student);
		else{
			return "Name must be there";
		}
	}

	@Override
	@Transactional
	public List<Student> getStudentList() {
		return studentRepo.getAllStudent();
	}

	@Override
	@Transactional
	public Student getStudent(int id) {
		return studentRepo.getstudent(id);
	}

	@Override
	@Transactional
	public void deleteStudent(String id) {
		studentRepo.deleteStudent(id);
	}

}
