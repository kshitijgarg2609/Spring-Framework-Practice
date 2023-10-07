package com.kgprojects.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kgprojects.dao.CustomerDao;
import com.kgprojects.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService
{
	@Autowired
	private CustomerDao customerDao;

	@Override
	@Transactional
	public void create(Customer customer)
	{
		customerDao.create(customer);
	}

	@Override
	@Transactional
	public Customer fetchRow(int id)
	{
		return customerDao.fetchRow(id);
	}

	@Override
	@Transactional
	public List<Customer> fetchRows()
	{
		return customerDao.fetchRows();
	}
	
	@Override
	@Transactional
	public void update(Customer customer)
	{
		customerDao.update(customer);
	}
	
	@Override
	@Transactional
	public void delete(int id)
	{
		customerDao.delete(id);
	}

	public CustomerDao getCustomerDao()
	{
		return customerDao;
	}

	public void setCustomerDao(CustomerDao customerDao)
	{
		this.customerDao = customerDao;
	}

}
