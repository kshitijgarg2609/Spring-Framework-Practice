package com.kgprojects.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class LifeCycleBeanAnnotation
{
	@PostConstruct
	public void init()
	{
		System.out.println("PostConstruct Init Called");
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("PreDestroy Destroy Called");
	}
}
