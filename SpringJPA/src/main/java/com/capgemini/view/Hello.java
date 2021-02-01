package com.capgemini.view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.beans.Employee;
import com.capgemini.config.ApplicationConfig;

public class Hello {
	public static void main(String[] args) {
		 
		// loading the definitions from the given XML file
		/*
		 * ApplicationContext context = new ClassPathXmlApplicationContext(
		 * "applicationContext.xml");
		 */
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
       appContext.scan("com.capgemini.beans.Employee");
       // appContext.refresh();
        
		
		  EntityManagerFactory factory =
		  Persistence.createEntityManagerFactory("JPA-PU"); EntityManager em =
		  factory.createEntityManager(); em.getTransaction().begin();
		   //begin the operations.
		
 
		Employee emp= (Employee) appContext.getBean(Employee.class);
		  emp.setId(101);
		  emp.setName("priya");
		  emp.getId();
		  emp.getName();
		  em.persist(emp); 
		  em.getTransaction().commit();
		 
		 
		  
		 
		
	}
}
