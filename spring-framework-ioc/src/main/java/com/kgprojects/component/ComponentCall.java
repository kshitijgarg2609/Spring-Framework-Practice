package com.kgprojects.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kgprojects.beans.DRef;

public class ComponentCall
{

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("component.xml");
		DRef d = context.getBean("DRef",DRef.class);
		System.out.println(d);
	}

}
