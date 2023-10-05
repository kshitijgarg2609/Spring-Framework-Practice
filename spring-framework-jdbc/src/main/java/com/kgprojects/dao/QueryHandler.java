package com.kgprojects.dao;

import java.util.List;

import jakarta.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.kgprojects.rowmapper.RowMapResolver;
import com.kgprojects.table.SpringJdbcSampleTable;

@Component("qh")
public class QueryHandler
{
	@Autowired
	private JdbcTemplate tmp;
	
	@Autowired
	RowMapResolver rm;
	
	public QueryHandler() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public QueryHandler(JdbcTemplate tmp, RowMapResolver rm) {
		super();
		this.tmp = tmp;
		this.rm = rm;
	}



	@PostConstruct
	public void createTable()
	{
		try
		{
			String query = "CREATE TABLE IF NOT EXISTS springjdbcsampletable(id INT NOT NULL PRIMARY KEY,str VARCHAR(50) NOT NULL,value VARCHAR(50))";
			tmp.execute(query);
			System.out.println("TABLE CREATED !!!");
			System.out.println("Query :- "+query);
		}
		catch(Exception e)
		{
			e.printStackTrace(System.out);
		}
	}

	public int insertTable(SpringJdbcSampleTable row)
	{
		String query = "INSERT INTO springjdbcsampletable(id,str,value) values(?,?,?)";
		return tmp.update(query,row.getId(),row.getStr(),row.getVal());
	}

	public int updateTableStr(int id, String str)
	{
		String query = "UPDATE springjdbcsampletable SET str=? WHERE id=?";
		return tmp.update(query,str,id);
	}

	public int updateTableValue(int id, String value)
	{
		String query = "UPDATE springjdbcsampletable SET value=? WHERE id=?";
		return tmp.update(query,value,id);
	}

	public int deleteTableRow(int id)
	{
		String query = "DELETE FROM springjdbcsampletable WHERE id=?";
		return tmp.update(query,id);
	}

	public SpringJdbcSampleTable fetchRowById(int id)
	{
		String query = "SELECT * FROM springjdbcsampletable WHERE id=?";
		return tmp.queryForObject(query, rm, id);
	}

	public List<SpringJdbcSampleTable> fetchRows()
	{
		String query = "SELECT * FROM springjdbcsampletable";
		return tmp.query(query,rm);
	}

	public JdbcTemplate getTmp() {
		return tmp;
	}

	public void setTmp(JdbcTemplate tmp) {
		this.tmp = tmp;
	}


	public RowMapResolver getRm() {
		return rm;
	}


	public void setRm(RowMapResolver rm) {
		this.rm = rm;
	}
	
}
