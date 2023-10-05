package com.kgprojects.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kgprojects.beans.BRef;

public class Ref
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("reference.xml");
		BRef obj1 = (BRef)context.getBean("objB1");
		BRef obj2 = (BRef)context.getBean("objB2");
		BRef obj3 = (BRef)context.getBean("objB3");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}
}
