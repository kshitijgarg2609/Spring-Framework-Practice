package com.kgprojects.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleBeanInterface implements InitializingBean, DisposableBean {

	public void destroy() throws Exception {
		System.out.println("DisposableBean.destroy()");

	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean.afterPropertiesSet()");

	}

}
