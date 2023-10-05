package com.kgprojects.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kgprojects.beans.LifeCycleBean;
import com.kgprojects.beans.LifeCycleBeanAnnotation;
import com.kgprojects.beans.LifeCycleBeanInterface;

public class LifeCycleCall
{

	public static void main(String[] args)
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
		context.registerShutdownHook();
		LifeCycleBean obj1 = (LifeCycleBean)context.getBean("obj1");
		System.out.println(obj1);
		LifeCycleBeanInterface obj2 = (LifeCycleBeanInterface)context.getBean("obj2");
		LifeCycleBeanAnnotation ob3 = (LifeCycleBeanAnnotation)context.getBean("obj3");
	}

}
