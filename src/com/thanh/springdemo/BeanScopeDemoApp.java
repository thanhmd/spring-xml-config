package com.thanh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);

		boolean result = (theCoach == alphaCoach);

		if (result) {
			System.out.println("Poiting to the same object");
		} else {
			System.out.println("Not pointing to the same object");
		}

		System.out.println("Memory of theCoach" + theCoach);
		System.out.println("Memory of alphaCoach" + alphaCoach);

	}

}
