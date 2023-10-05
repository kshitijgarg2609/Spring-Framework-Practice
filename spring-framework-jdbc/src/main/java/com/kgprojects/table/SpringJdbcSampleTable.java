package com.kgprojects.table;

public class SpringJdbcSampleTable
{
	private int id;
	private String str;
	private String val;
	public SpringJdbcSampleTable(int id, String str, String val) {
		super();
		this.id = id;
		this.str = str;
		this.val = val;
	}
	public SpringJdbcSampleTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "SpringJdbcSampleTable [id=" + id + ", str=" + str + ", val=" + val + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public String getVal() {
		return val;
	}
	public void setVal(String val) {
		this.val = val;
	}
}
