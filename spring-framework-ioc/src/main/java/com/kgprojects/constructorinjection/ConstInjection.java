package com.kgprojects.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kgprojects.beans.ConstructBean;
import com.kgprojects.beans.ConstructBeanRef;
import com.kgprojects.beans.ConstructorOverride;

public class ConstInjection
{

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("constructorinjection.xml");
		ConstructBean simple = (ConstructBean)context.getBean("simple");
		ConstructBeanRef ref1 = (ConstructBeanRef)context.getBean("ref1");
		System.out.println(simple);
		System.out.println(ref1);
		ConstructorOverride o1 = (ConstructorOverride)context.getBean("o1");
		ConstructorOverride o2 = (ConstructorOverride)context.getBean("o2");
		ConstructorOverride o3 = (ConstructorOverride)context.getBean("o3");
		ConstructorOverride o4 = (ConstructorOverride)context.getBean("o4");
		ConstructorOverride o5 = (ConstructorOverride)context.getBean("o5");
	}

}
