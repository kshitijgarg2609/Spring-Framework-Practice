package com.kgprojects.beans;

public class CRef {
	private ARef obj;
	
	public CRef() {
		super();
	}
	
	public CRef(ARef obj) {
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
		return "CRef [obj=" + obj + "]";
	}
}
