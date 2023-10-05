package com.kgprojects.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kgprojects.beans.AutowiredQualifier;

public class QualifierCall
{

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("qualifier.xml");
		AutowiredQualifier aq = context.getBean("aq",AutowiredQualifier.class);
		System.out.println(aq);
	}

}
