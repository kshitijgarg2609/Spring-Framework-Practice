package com.kgprojects.table;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "springormsampletable")
public class SpringOrmSampleTable
{
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "str")
	private String str;
	
	@Column(name = "value")
	private String value;

	public SpringOrmSampleTable() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SpringOrmSampleTable(int id, String str, String value) {
		super();
		this.id = id;
		this.str = str;
		this.value = value;
	}

	public int getId() {
		return id;
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

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "SpringOrmSampleTable [id=" + id + ", str=" + str + ", value=" + value + "]";
	}

}
