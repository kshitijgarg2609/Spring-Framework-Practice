package com.kgprojects.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExpressionLanguage
{
	@Value("#{55+66}")
	private int x;
	@Value("#{expressionLanguage.x+13}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(expressionLanguage.y)}")
	private double z;
	
	@Value("#{T(java.lang.Math).PI}")
	private double pi;
	
	@Value("#{new java.lang.String('KG')}")
	private String str;

	public ExpressionLanguage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExpressionLanguage(int x, int y, double z, double pi, String str) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		this.pi = pi;
		this.str = str;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "ExpressionLanguage [x=" + x + ", y=" + y + ", z=" + z + ", pi=" + pi + ", str=" + str + "]";
	}
}
