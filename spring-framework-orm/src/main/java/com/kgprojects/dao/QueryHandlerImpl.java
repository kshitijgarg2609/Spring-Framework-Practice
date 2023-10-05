package com.kgprojects.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kgprojects.table.SpringOrmSampleTable;

import jakarta.persistence.criteria.CriteriaQuery;

@Repository
public class QueryHandlerImpl implements QueryHandler
{
	@Autowired
	private SessionFactory sessionFactory;

	public QueryHandlerImpl()
	{
		super();
	}

	public QueryHandlerImpl(SessionFactory sessionFactory) 
	{
		super();
		this.sessionFactory = sessionFactory;
	}

	public SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession()
	{
		return (sessionFactory.isOpen())?sessionFactory.getCurrentSession():sessionFactory.openSession();
	}
	
	@Override
	@Transactional
	public void insertTable(SpringOrmSampleTable row)
	{
		Session sess = getSession();
		sess.persist(row);
	}
	
	@Override
	@Transactional
	public void updateTableStr(int id, String str)
	{
		Session sess = getSession();
		SpringOrmSampleTable tuple = sess.get(SpringOrmSampleTable.class,id);
		tuple.setStr(str);
		sess.merge(tuple);
	}
	
	@Override
	@Transactional
	public void updateTableValue(int id, String value)
	{
		Session sess = getSession();
		SpringOrmSampleTable tuple = sess.get(SpringOrmSampleTable.class,id);
		tuple.setValue(value);
		sess.merge(tuple);
	}
	
	@Override
	@Transactional
	public void deleteTableRow(int id)
	{
		Session sess = getSession();
		SpringOrmSampleTable tuple = sess.get(SpringOrmSampleTable.class, id);
		sess.remove(tuple);
	}
	
	@Override
	@Transactional
	public SpringOrmSampleTable fetchRowById(int id)
	{
		Session sess = getSession();
		return sess.get(SpringOrmSampleTable.class, id);
	}
	
	@Override
	@Transactional
	public List<SpringOrmSampleTable> fetchRows()
	{
		Session sess = getSession();
		CriteriaQuery<SpringOrmSampleTable> cq = sess.getCriteriaBuilder().createQuery(SpringOrmSampleTable.class);
	    CriteriaQuery<SpringOrmSampleTable> all = cq.select(cq.from(SpringOrmSampleTable.class));
	    return sess.createQuery(all).getResultList();
	}
}
