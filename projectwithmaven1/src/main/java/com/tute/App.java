package com.tute;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
//		System.out.println("Project started..");

//       Configuration cfg=new Configuration();
//       cfg.configure("hibernate.cfg.xml");
//       SessionFactory factory=cfg.buildṢSessionFactory();
//       System.out.println(factory);
//        System.out.println(factory.isClosed());	
		SessionFactory sessionFactory = new Configuration().configure("com/tute/hibernate.cfg.xml")
				.buildSessionFactory();
//		System.out.println("Hibernate is runnig");

		// creating object of Student class
	  //    Student student = new Student();
		
	    //  student.setStudentName("Abujr Khan");
	    //  student.setStudentAddress("Wajid ali compound");
		//  System.out.println("Student");
		 
		// creating object of address class
      //  Address ad=new Address();
	//	ad.setStreet("Street1");
	//	ad.setCity("DELHI");
	//	ad.setOpen(true);
	//	ad.setAddedDate( new Date());
	//	ad.setX(12763.7);
     //  System.out.println("Address");
        
        
        //reading image
       // FileInputStream fis=new FileInputStream("src/main/java/pic.png.jpg");
        //byte[] data=new byte[fis.available()];
       // fis.read(data);
      //  ad.setImage(data);
        
        
		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

      //   session.save(student);
	 //     session.save(ad);
		tx.commit();
		
		session.close();
		sessionFactory.close();
	}
}
 