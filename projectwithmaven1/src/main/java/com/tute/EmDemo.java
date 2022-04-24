package com.tute;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.ordering.antlr.Factory;

public class EmDemo {
public static void main(String[] args) {
	SessionFactory sessionFactory = new Configuration().configure("com/tute/hibernate.cfg.xml")
			.buildSessionFactory();
	Student student1=new Student();
	student1.setStudentId(14144);
	student1.setStudentName("Asad Khan");
	student1.setStudentAddress("Kanpur");
	
	Certificate certificate=new Certificate(); 
	certificate.setCourse("Android");
	certificate.setDuration("2 months");
	student1.setCerti(certificate);
	
	
	Student student2=new Student();
	student2.setStudentId(14134);
	student2.setStudentName("Talha Khan");
	student2.setStudentAddress("Kanpur");
	
	
	Certificate certificate1=new Certificate(); 
	certificate1.setCourse("Android");
	certificate1.setDuration("1.5 months");
	student2.setCerti(certificate);
	
	Session s=sessionFactory.openSession();
	Transaction tx=s.beginTransaction();
	//object save
	s.save(student1);
	s.save(student2);
	tx.commit();
	s.close();
	sessionFactory.close();	
}
}
