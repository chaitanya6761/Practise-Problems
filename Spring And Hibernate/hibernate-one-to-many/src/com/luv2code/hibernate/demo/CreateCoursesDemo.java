package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class CreateCoursesDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			session.beginTransaction();
			
			Instructor instructor = session.get(Instructor.class, 1);
			System.out.println(instructor);
			
			System.out.println(instructor.getCourses());
			
			session.getTransaction().commit();

		} catch (Exception e) {

		} finally {
			session.close();
			factory.close();
		}

	}

}
