package com.kgprojects.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kgprojects.beans.BeanScope;
import com.kgprojects.beans.BeanScopeXml;
import com.kgprojects.beans.ComponentBean;

public class ScopeCall
{

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beanscope.xml");
		BeanScope bsco1 = context.getBean("beanScope",BeanScope.class);
		BeanScope bsco2 = context.getBean("beanScope",BeanScope.class);
		System.out.println("class = BeanScope, scope=prototype");
		System.out.println("bsco1="+bsco1.hashCode());
		System.out.println("bsco2="+bsco2.hashCode());
		System.out.println("____________________________________________________________");
		BeanScopeXml bsx1 = context.getBean("objscope",BeanScopeXml.class);
		BeanScopeXml bsx2 = context.getBean("objscope",BeanScopeXml.class);
		System.out.println("class = BeanScopeXml, scope=prototype");
		System.out.println("bsx1="+bsx1.hashCode());
		System.out.println("bsx2="+bsx2.hashCode());
		System.out.println("____________________________________________________________");
		ComponentBean cb1 = context.getBean("obj",ComponentBean.class);
		ComponentBean cb2 = context.getBean("obj",ComponentBean.class);
		System.out.println("class = ComponentBean, scope=singleton");
		System.out.println("cb1="+cb1.hashCode());
		System.out.println("cb2="+cb2.hashCode());
	}

}
