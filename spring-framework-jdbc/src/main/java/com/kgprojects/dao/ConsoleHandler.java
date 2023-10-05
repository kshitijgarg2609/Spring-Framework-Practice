package com.kgprojects.dao;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.kgprojects.table.SpringJdbcSampleTable;

@Component("ch")
public class ConsoleHandler
{
	@Autowired
	private Scanner sc;
	@Autowired
	private QueryHandler qh;
	
	public Scanner getSc() {
		return sc;
	}
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	public QueryHandler getQh() {
		return qh;
	}
	public void setQh(QueryHandler qh) {
		this.qh = qh;
	}
	
	public void printLine()
	{
		System.out.println("____________________________________________________________________________");
	}
	
	public String request(String msg)
	{
		System.out.println(msg);
		return sc.next();
	}
	
	public String requestId()
	{
		return request("ENTER ID");
	}
	
	public String requestStr()
	{
		return request("Enter Str");
	}
	
	public String requestValue()
	{
		return request("Enter Value");
	}
	
	public void insert()
	{
		printLine();
		try
		{
			System.out.println("RESULT :- "+qh.insertTable(new SpringJdbcSampleTable(Integer.parseInt(requestId()), requestStr(), requestValue())));
		}
		catch(Exception e)
		{
			e.printStackTrace(System.out);
		}
		printLine();
	}
	
	public void updateStr()
	{
		printLine();
		try
		{
			System.out.println("RESULT :- "+qh.updateTableStr(Integer.parseInt(requestId()), request("Enter new Str")));
		}
		catch(Exception e)
		{
			e.printStackTrace(System.out);
		}
		printLine();
	}
	
	public void updateValue()
	{
		printLine();
		try
		{
			System.out.println("RESULT :- "+qh.updateTableValue(Integer.parseInt(requestId()), request("Enter new Value")));
		}
		catch(Exception e)
		{
			e.printStackTrace(System.out);
		}
		printLine();
	}
	
	public void deleteRow()
	{
		printLine();
		try
		{
			System.out.println("RESULT :- "+qh.deleteTableRow(Integer.parseInt(requestId())));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		printLine();
	}
	
	public void printRow()
	{
		printLine();
		try
		{
			System.out.println(qh.fetchRowById(Integer.parseInt(requestId())));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		printLine();
	}
	
	public void printRows()
	{
		printLine();
		try
		{
			for(SpringJdbcSampleTable row : qh.fetchRows())
			{
				System.out.println(row);
			}
		}
		catch(Exception e)
		{
			
		}
		printLine();
	}
}
