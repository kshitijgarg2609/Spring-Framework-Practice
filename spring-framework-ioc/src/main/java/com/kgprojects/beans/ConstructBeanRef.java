package com.kgprojects.beans;

import java.util.List;

public class ConstructBeanRef
{
	private List<String> list;
	private ConstructBean obj;
	public ConstructBeanRef(List<String> list, ConstructBean obj) {
		super();
		this.list = list;
		this.obj = obj;
	}
	@Override
	public String toString() {
		return "ContructBean2 [list=" + list + ", obj=" + obj + "]";
	}
}
