package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		
		Session session = factory.getCurrentSession();
		
		try {
		
			session.beginTransaction();
				
			Student myStudent = session.get(Student.class, 2);
			
			session.getTransaction().commit();
			
			System.out.println(myStudent);
			
		}catch(Exception e){
			
		}finally{
			factory.close();
		}
	
		
	}

}
