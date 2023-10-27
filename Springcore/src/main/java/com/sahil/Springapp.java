package com.sahil;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Springapp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("sahil.xml");
		Vehicles Vehicles = context.getBean("sahilvehicles", Vehicles.class);
		System.out.println(Vehicles.getmileage());
	}

}
