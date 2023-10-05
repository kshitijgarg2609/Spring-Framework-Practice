package com.kgprojects.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class AutowiredOnMethod {
	private ARef obj;

	public AutowiredOnMethod() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AutowiredOnMethod(ARef obj) {
		super();
		this.obj = obj;
	}

	public ARef getObj() {
		return obj;
	}
	
	@Autowired
	public void setObj(ARef obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "AutowiredOnMethod [obj=" + obj + "]";
	}
}
