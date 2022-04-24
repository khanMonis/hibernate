package com.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tute.Certificate;
import com.tute.Student;

public class StateDemo {

	public static void main(String[] args) {
		// Practical for hibernate object States
		// Transient
		// Persistent
		// Detached
		// Removed
		System.out.println("Example");
		
		SessionFactory sessionFactory=new Configuration().configure
				("com/tute/hibernate.cfg.xml").buildSessionFactory();

		//creating student object:
		Student student=new Student(); 
		student.setStudentId(1414);
		student.setStudentName("Peter");
		student.setStudentAddress("ABC");
		student.setCerti(new Certificate("java Hibernate course","2 months"));
		//student : Transient
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(student);
		
		//Student:Persistent-Session,database
	//	student.setStudentName("John");
		tx.commit();
		session.close();
		
		//student:  Detached;
	//	student.setStudentName("Sachin");
		sessionFactory.close();
	}

}
