package com.mapping.ScriptMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;





@SpringBootApplication
public class ScriptMappingApplication {

	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory= cfg.buildSessionFactory();
	
		
		BookAuthor b= new BookAuthor();
	b.setBookAuthor_Name("hari");
	BookCourse c=new BookCourse();
	c.setBookCourse_Name("java");
	Book book= new Book();
	book.setBookName("LetsLearnJava");
	book.setBookPrize(12);
		SpringApplication.run(ScriptMappingApplication.class, args);
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(c);
		session.save(b);
		session.save(book);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
	}

}
