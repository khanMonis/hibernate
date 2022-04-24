package com.tute;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
public static void main(String[] args) {
	//get,load
	SessionFactory sessionFactory = new Configuration().configure("com/tute/hibernate.cfg.xml")
			.buildSessionFactory();
	
    Session session=sessionFactory.openSession();
    System.out.println("Student");
    //get-student:1
      Student student=(Student)session.load(Student.class,8);
      System.out.println(student.getStudentId()+" "+student.getStudentName()+
		   " "+student.getStudentAddress());
   Address ad=(Address)session.get(Address.class,2);
   System.out.println(ad.getCity()+" "+ad.getStreet());
    session.close();
	sessionFactory.close();
}
}
