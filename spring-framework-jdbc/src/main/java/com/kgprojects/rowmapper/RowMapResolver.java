package com.kgprojects.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.kgprojects.table.SpringJdbcSampleTable;

@Component
public class RowMapResolver implements RowMapper<SpringJdbcSampleTable> {

	public SpringJdbcSampleTable mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		return new SpringJdbcSampleTable(rs.getInt(1),rs.getString(2),rs.getString(3));
	}

}
