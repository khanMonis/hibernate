package com.map;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class MapDemo {
	

	public static void main(String[] args)  {

		SessionFactory sessionFactory = new Configuration().configure("com/tute/hibernate.cfg.xml")
				.buildSessionFactory();

		// creating Question
		Question q1 = new Question();
		q1.setQuestionId(121);
		q1.setQuestion("what is java?");

		// creating Answer
	//	Answer answer = new Answer();
	//	answer.setAnswerId(342);
	//	answer.setAnswer("java is a programming language");
	//	answer.setQuestion(q1);

	//	Answer answer1 = new Answer();
	//	answer1.setAnswerId(343);
	//	answer1.setAnswer("with the help of java we can create Softwares ");
	//  answer1.setQuestion(q1);
		
	//	Answer answer2 = new Answer();
	//	answer2.setAnswerId(344);
	//	answer2.setAnswer("java has different types of frameworks ");
	//	answer2.setQuestion(q1);
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		ArrayList<Answer>list = new ArrayList<Answer>();	
		
	//	list.add(answer);
	//	list.add(answer1);
	//	list.add(answer2);
	//	q1.setAnswers(list);
		
			// session
		
		//save
	//	session.save(q1);
	//	session.save(answer);
    //  session.save(answer1);
     //   session.save(answer2);
		Question q=(Question)session.get(Question.class,121);
		
		System.out.println(q.getQuestionId());
		System.out.println(q.getQuestion());
		// Lazy
	//	System.out.println(q.getAnswers().size());
		
		//fetching
	//	Question newQ=(Question)session.get(Question.class, 22);
	//	System.out.println(newQ.getQuestion());
		tx.commit();
		sessionFactory.close();
		
		
	}
}
