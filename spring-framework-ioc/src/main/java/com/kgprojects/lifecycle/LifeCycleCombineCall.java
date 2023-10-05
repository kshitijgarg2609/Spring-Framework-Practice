package com.kgprojects.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kgprojects.beans.LifeCycleBeanCombine;

public class LifeCycleCombineCall
{

	public static void main(String[] args)
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
		context.registerShutdownHook();
		LifeCycleBeanCombine obj = (LifeCycleBeanCombine)context.getBean("obj4");
	}

}
