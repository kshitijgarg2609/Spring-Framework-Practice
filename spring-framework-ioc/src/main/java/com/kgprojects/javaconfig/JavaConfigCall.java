package com.kgprojects.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigCall
{

	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigJavaFile.class);
		B objB = context.getBean("objB",B.class);
		System.out.println(objB);
	}

}
