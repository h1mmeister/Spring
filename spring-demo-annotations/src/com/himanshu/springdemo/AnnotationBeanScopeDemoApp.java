package com.himanshu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("myTennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("myTennisCoach", Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		System.out.println(result);

		context.close();

	}

}
