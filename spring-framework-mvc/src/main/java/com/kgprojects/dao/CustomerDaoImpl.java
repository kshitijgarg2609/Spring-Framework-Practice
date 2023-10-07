package com.kgprojects.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kgprojects.entity.Customer;

import jakarta.persistence.criteria.CriteriaQuery;

@Repository
public class CustomerDaoImpl implements CustomerDao
{
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession()
	{
		return (sessionFactory.isOpen())?sessionFactory.getCurrentSession():sessionFactory.openSession();
	}
	
	@Override
	public void create(Customer customer)
	{
		Session sess = this.getSession();
		sess.persist(customer);
	}

	@Override
	public Customer fetchRow(int id)
	{
		Session sess = this.getSession();
		return sess.get(Customer.class, id);
	}

	@Override
	public List<Customer> fetchRows()
	{
		Session sess = this.getSession();
		CriteriaQuery<Customer> cq = sess.getCriteriaBuilder().createQuery(Customer.class);
	    CriteriaQuery<Customer> all = cq.select(cq.from(Customer.class));
	    return sess.createQuery(all).getResultList();
	}
	
	@Override
	public void update(Customer customer)
	{
		Session sess = this.getSession();
		sess.merge(customer);
	}
	
	@Override
	public void delete(int id)
	{
		Session sess = this.getSession();
		Customer customer = sess.get(Customer.class, id);
		sess.remove(customer);
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
