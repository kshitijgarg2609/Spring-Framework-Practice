package com.kgprojects.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigJavaFile
{
	@Bean(name = {"objA"})
	public A getA()
	{
		return new A(123);
	}
	
	@Bean(name = {"objB"})
	public B getB()
	{
		return new B(getA());
	}
}
