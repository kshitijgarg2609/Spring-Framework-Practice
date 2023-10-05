package com.kgprojects.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class AutowiredOnConstructor {
	private ARef obj;

	public AutowiredOnConstructor() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public AutowiredOnConstructor(ARef obj) {
		super();
		this.obj = obj;
	}

	public ARef getObj() {
		return obj;
	}

	public void setObj(ARef obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "AutowiredOnConstructor [obj=" + obj + "]";
	}

}
