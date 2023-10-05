package com.kgprojects.beans;

public class BRef
{
	private int value;
	private ARef obj;

	public ARef getObj() {
		return obj;
	}

	public void setObj(ARef obj) {
		this.obj = obj;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "BRef [value=" + value + ", obj=" + obj + "]";
	}
}
