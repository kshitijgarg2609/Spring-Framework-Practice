package com.kgprojects.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kgprojects.beans.CRef;

public class AutowireCall {

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/autowire.xml");
		CRef obj1 = (CRef) context.getBean("obj1",CRef.class);
		System.out.println("Autowire byName "+obj1);
		CRef obj2 = (CRef) context.getBean("obj2",CRef.class);
		System.out.println("Autowire byType "+obj2);
		CRef obj3 = (CRef) context.getBean("obj3",CRef.class);
		System.out.println("Autowire constructor "+obj3);
	}

}
