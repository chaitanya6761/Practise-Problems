package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;


public class CreateDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.buildSessionFactory();
		
		
		Session session = factory.getCurrentSession();
		
		try {
			
			Instructor instructor =  
					new Instructor("chaitanya", "kumar", "mck943@gmail.com");
			
			InstructorDetail instructorDetail = 
					new InstructorDetail("dummy.com", "ML");
			
			instructor.setInstructorDetail(instructorDetail);
			
			session.beginTransaction();
			
			session.save(instructor);
			
			session.getTransaction().commit();
			
		}catch(Exception e){
			
		}finally{
			factory.close();
		}
	
		
	}

}
