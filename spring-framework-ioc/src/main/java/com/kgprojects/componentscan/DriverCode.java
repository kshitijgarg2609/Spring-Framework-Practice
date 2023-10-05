package com.kgprojects.componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DriverCode {

	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigScan.class);
		ObjBean obj = (ObjBean)context.getBean("objBean");
		System.out.println(obj);
	}

}
