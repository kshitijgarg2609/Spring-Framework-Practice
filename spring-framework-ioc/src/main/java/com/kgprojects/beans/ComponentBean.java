package com.kgprojects.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("obj")
public class ComponentBean
{
	@Value("check")
	private String str;
	public ComponentBean()
	{
		super();
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	@Override
	public String toString() {
		return "ComponentBean [str=" + str + "]";
	}
}
