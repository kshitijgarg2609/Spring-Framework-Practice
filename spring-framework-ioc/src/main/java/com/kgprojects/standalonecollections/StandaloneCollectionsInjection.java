package com.kgprojects.standalonecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kgprojects.beans.InjectCollections;

public class StandaloneCollectionsInjection
{

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("standalonecollections.xml");
		InjectCollections obj = context.getBean("obj",InjectCollections.class);
		System.out.println(obj);
		System.out.println(obj.getList().getClass().getName());
		System.out.println(obj.getSet().getClass().getName());
		System.out.println(obj.getMap().getClass().getName());
		System.out.println(obj.getProp().getClass().getName());
	}

}
