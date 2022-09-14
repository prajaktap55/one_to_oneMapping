package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// creating Question 
		Question q1 = new Question();
		q1.setQues_Id(100);
		q1.setQuestion("What is java?");
		
		Question q2 = new Question();
		q2.setQues_Id(101);
		q2.setQuestion("What is collection?");
		
		
		// creating Answer obj
		Answer ans = new Answer();
		ans.setAns_Id(111);
		ans.setAnswer("java is programming language");
		ans.setQues(q1);
		q1.setAns(ans);//pass obj.(ans) of Answer class
		
		Answer ans1 = new Answer();
		ans1.setAns_Id(222);
		ans1.setAnswer("Collection is framework to perform oprn on obj");
		ans1.setQues(q2);
		q2.setAns(ans1);
		
		Session session = factory.openSession();
		org.hibernate.Transaction tx= session.beginTransaction();
		
		session.save(q1);
		session.save(q2);
		session.save(ans);
		session.save(ans1);
		
		tx.commit();
		
		//fetching...
		Question newQ=(Question)session.get(Question.class, 100);
		System.out.println(newQ.getQuestion());
		System.out.println(newQ.getAns().getAnswer());
		session.close();
		factory.close();

	}

}
