package com.kgprojects.javaconfig;

import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.kgprojects.rowmapper.RowMapResolver;
import com.kgprojects.table.SpringJdbcSampleTable;

@Configuration
@ComponentScan(basePackages = {"com.kgprojects.dao","com.kgprojects.rowmapper"})
public class JdbcConfig
{
	@Bean
	JdbcTemplate getJdbcTemplate()
	{
		JdbcTemplate tmp = new JdbcTemplate();
		tmp.setDataSource(getDataSource());
		return tmp;
	}
	
	@Bean
	DataSource getDataSource()
	{
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dmds.setUrl("jdbc:mysql://localhost:3306/mysql");
		dmds.setUsername("root");
		dmds.setPassword("");
		return dmds;
	}
	
	@Bean("sc")
	Scanner getScanner()
	{
		return new Scanner(System.in);
	}
	
	@Bean("rm")
	RowMapper<SpringJdbcSampleTable> getMapper()
	{
		return new RowMapResolver();
	}
}