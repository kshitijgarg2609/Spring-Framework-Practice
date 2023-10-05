package com.kgprojects.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class AutowiredOnVariable {
	@Autowired
	private ARef obj;
	
	public AutowiredOnVariable() {
		super();
	}
	
	public AutowiredOnVariable(ARef obj) {
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
		return "AutowiredOnVariable [obj=" + obj + "]";
	}
}
