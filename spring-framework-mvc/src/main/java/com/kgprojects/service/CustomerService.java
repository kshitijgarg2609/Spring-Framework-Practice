package com.kgprojects.service;

import java.util.List;

import com.kgprojects.entity.Customer;

public interface CustomerService 
{
	public void create(Customer customer);
	
	public Customer fetchRow(int id);
	
	public List<Customer> fetchRows();
	
	public void update(Customer customer);
	
	public void delete(int id);
}
