package com.caveofprogramming.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	private static final String ADDRESS = "address";
	private static final String PERSON = "person";
	private static final String BEANS_XML = "com/caveofprogramming/spring/test/beans/beans.xml";

	public static void main(String[] args) {
		
		
		// Bean factory is a lower level version of application context and lacks functionality
		// Application Context is a bean container
		ApplicationContext context = new ClassPathXmlApplicationContext(BEANS_XML);
		
		Person person1 = (Person)context.getBean(PERSON);
		Person person2 = (Person)context.getBean(PERSON);
		
		person1.setTaxId(666);
		
		System.out.println(person2);
		
		//not needed, automatically happens when program exits, just makes warning go away
		((ClassPathXmlApplicationContext)context).close();
	}

}
