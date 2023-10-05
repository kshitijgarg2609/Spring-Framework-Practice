package com.kgprojects.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kgprojects.beans.AutowiredOnConstructor;
import com.kgprojects.beans.AutowiredOnMethod;
import com.kgprojects.beans.AutowiredOnVariable;

public class AnnotationAutowiring
{

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("autowired.xml");
		AutowiredOnVariable aov = context.getBean("aov",AutowiredOnVariable.class);
		AutowiredOnMethod aom = context.getBean(AutowiredOnMethod.class);
		AutowiredOnConstructor aoc = context.getBean(AutowiredOnConstructor.class);
		System.out.println(aov+"\n"+aom+"\n"+aoc);
	}

}
