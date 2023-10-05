package com.kgprojects.beans;

public class ConstructRef
{
	private String str;
	private ConstructBean obj;
	public ConstructRef(String str, ConstructBean obj) {
		super();
		this.str = str;
		this.obj = obj;
	}
	@Override
	public String toString() {
		return "ContructBean2 [str=" + str + ", obj=" + obj + "]";
	}
}
