package com.kgprojects.dao;

import java.util.List;

import com.kgprojects.table.SpringOrmSampleTable;

public interface QueryHandler
{
	public void insertTable(SpringOrmSampleTable row);
	public void updateTableStr(int id, String str);
	public void updateTableValue(int id, String value);
	public void deleteTableRow(int id);
	public SpringOrmSampleTable fetchRowById(int id);
	public List<SpringOrmSampleTable> fetchRows();
}
