package com.kgprojects.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AutowiredQualifier {
	@Autowired
	@Qualifier("obj2")
	private ARef obj;
	
	public AutowiredQualifier() {
		super();
	}
	
	public AutowiredQualifier(ARef obj) {
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
		return "AutowiredQualifier [obj=" + obj + "]";
	}
}
