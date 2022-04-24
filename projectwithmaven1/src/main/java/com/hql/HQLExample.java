package com.hql;


import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tute.Student;

public class HQLExample {
public static void main(String[] args) {
	
	SessionFactory sessionFactory = new Configuration().configure("com/tute/hibernate.cfg.xml")
			.buildSessionFactory();
   
	Session session=sessionFactory.openSession();
	//HQL:
	//Syntax:
    //
	
	String query="from Student where name='Talha Khan'";
	
	Query q=session.createQuery(query);
	//Single - (unique)
    //multiple-list
	ArrayList<Student>list= (ArrayList<Student>) q.list();
	for (Student student:list) {
		System.out.println(student.getStudentName()+":"+student.getStudentAddress()+":"+student.getStudentId());
	}
	
	session.close();
	sessionFactory.close();
}
}
