package com.kgprojects.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleBeanCombine implements DisposableBean, InitializingBean {
	public void initxml() {
		System.out.println("XML INIT");
	}
	
	public void destroyxml() {
		System.out.println("XML DESTROY");
	}
	
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("INTERFACE INIT");

	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("INTERFACE DESTROY");

	}
	@PostConstruct
	public void initAnnotation() {
		System.out.println("ANNOTATION INIT");
	}
	@PreDestroy
	public void destroyAnnotation() {
		System.out.println("ANNOTATION DESTROY");
	}
}