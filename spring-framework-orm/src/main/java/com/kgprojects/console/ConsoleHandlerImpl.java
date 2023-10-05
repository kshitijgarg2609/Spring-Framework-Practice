package com.kgprojects.console;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kgprojects.dao.QueryHandler;
import com.kgprojects.table.SpringOrmSampleTable;

@Component
public class ConsoleHandlerImpl implements ConsoleHandler
{
	@Autowired
	private Scanner scanner;
	@Autowired
	private QueryHandler queryHandler;
	
	public Scanner getScanner() {
		return scanner;
	}
	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}
	public QueryHandler getQueryHandler() {
		return queryHandler;
	}
	public void setQueryHandler(QueryHandler queryHandler) {
		this.queryHandler = queryHandler;
	}
	
	@Override
	public void printLine()
	{
		System.out.println("____________________________________________________________________________");
	}
	
	public void printExecution()
	{
		System.out.println("EXECUTED !!!");
	}
	
	public String request(String msg)
	{
		System.out.println(msg);
		return scanner.next();
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
	
	@Override
	public void insert()
	{
		printLine();
		this.queryHandler.insertTable(new SpringOrmSampleTable(Integer.parseInt(requestId()), requestStr(), requestValue()));
		printExecution();
		printLine();
	}
	
	@Override
	public void updateStr()
	{
		printLine();
		this.queryHandler.updateTableStr(Integer.parseInt(requestId()), request("Enter new Str"));
		printExecution();
		printLine();
	}
	
	@Override
	public void updateValue()
	{
		printLine();
		this.queryHandler.updateTableValue(Integer.parseInt(requestId()), request("Enter new Value"));
		printExecution();
		printLine();
	}
	
	@Override
	public void deleteRow()
	{
		printLine();
		this.queryHandler.deleteTableRow(Integer.parseInt(requestId()));
		printExecution();
		printLine();
	}
	
	@Override
	public void printRow()
	{
		printLine();
		System.out.println(this.queryHandler.fetchRowById(Integer.parseInt(requestId())));
		printExecution();
		printLine();
	}
	
	@Override
	public void printRows()
	{
		printLine();
		for(SpringOrmSampleTable row : queryHandler.fetchRows())
		{
			System.out.println(row);
		}
		printExecution();
		printLine();
	}
}
