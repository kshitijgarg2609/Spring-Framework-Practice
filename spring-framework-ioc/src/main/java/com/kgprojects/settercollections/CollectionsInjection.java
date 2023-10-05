package com.kgprojects.settercollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kgprojects.beans.InjectCollections;

public class CollectionsInjection
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("settercollections.xml");
		InjectCollections obj1 = (InjectCollections)context.getBean("collections1");
		System.out.println(obj1);
	}
}
