package com.kgprojects.beans;

public class LifeCycleBean
{
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "LifeCycleBean [value=" + value + "]";
	}
	public void init()
	{
		System.out.println("Init Called");
	}
	public void destroy()
	{
		System.out.println("Destroy Called");
	}
}
