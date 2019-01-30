package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;

public class CreateCourseAndReviewsDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class)
				.addAnnotatedClass(Review.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			session.beginTransaction();

			Course tempCourse = new Course("Machine Learning");

			tempCourse.addReview(new Review("Nice Course"));
			tempCourse.addReview(new Review("Good Course"));
			tempCourse.addReview(new Review("Great Course"));

			session.save(tempCourse);

			session.getTransaction().commit();

		} catch (Exception e) {

		} finally {
			session.close();
			factory.close();
		}

	}

}
