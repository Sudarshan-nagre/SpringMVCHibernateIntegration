package com.sud.spring.repository;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.sud.spring.model.Student;

@Repository
@EnableTransactionManagement
public class StudentRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public String saveStudent(Student student) {
    	 Session session = sessionFactory.getCurrentSession();
    	 session.saveOrUpdate(student);
    	 return "success";
    }
    
    public List<Student> getAllStudent(){
    	Session session = sessionFactory.getCurrentSession();
    	String query = "FROM Student";
    	
    	Query q =session.createQuery(query);
    	List<Student> list = q.getResultList();
    	return list;
    }

	public Student getstudent(int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Student.class, id);
	}

	public void deleteStudent(String id) {
		Session session = sessionFactory.getCurrentSession();
		
		Student st = new Student();
		st.setId(Integer.parseInt(id));
		
		session.delete(st);
	}
}
