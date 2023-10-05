package com.kgprojects.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kgprojects.beans.Student;

public class SetterInjection {

	public static void main(String[] args)
	{
		System.out.println("HELLO WORLD");
		ApplicationContext con = new ClassPathXmlApplicationContext("setterinjection.xml");
		Student obj1 = (Student)con.getBean("student1");
		Student obj2 = (Student)con.getBean("student2");
		Student obj3 = (Student)con.getBean("student3");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}
}
