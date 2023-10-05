package com.kgprojects.beans;

public class ARef
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
		return "ARef [value=" + value + "]";
	}
}
