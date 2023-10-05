package com.kgprojects.beans;

public class ConstructBean
{
	private String str;
	private int x;
	private int y;
	public ConstructBean(String str, int x, int y) {
		super();
		this.str = str;
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "ConstructBean [str=" + str + ", x=" + x + ", y=" + y + "]";
	}
}
