package com.hissou;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hissou.sports.Coach;
import com.hissou.sports.SwimCoach;

public class MyDemoApp {

	public static void main(String[] args) {
		// Read Spring java configuration file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		// Retrieve the bean
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		System.out.println(theCoach.getTraining());
		System.out.println(theCoach.getFortune());
		System.out.println(theCoach.getEmail());
		context.close();
	}

}
