package com.kgprojects.javaconfig;

public class B {
	private A obj;
	
	public B() {
		super();
	}
	
	public B(A obj) {
		super();
		this.obj = obj;
	}

	public A getObj() {
		return obj;
	}

	public void setObj(A obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "B [obj=" + obj + "]";
	}
}
