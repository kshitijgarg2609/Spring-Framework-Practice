package com.kgprojects.beans;

public class ConstructorOverride
{
	public ConstructorOverride(int a,int b)
	{
		System.out.println("int a="+a+",int b="+b);
	}
	public ConstructorOverride(String a,int b)
	{
		System.out.println("String a="+a+",int b="+b);
	}
	public ConstructorOverride(int a,String b)
	{
		System.out.println("int a="+a+",String b="+b);
	}
	public ConstructorOverride(String a,String b)
	{
		System.out.println("String a="+a+",String b="+b);
	}
}
