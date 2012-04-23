package com.onlineexam.dao.hibernate;

import java.io.Serializable;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.onlineexam.dao.GenericDao;

public class GenericDaoHibernateImpl<T, PK extends Serializable> implements
		GenericDao<T, PK> {

	private Class<T> type;
	@Resource
	private SessionFactory sessionFactory;
	private Session getSession() {
		if(sessionFactory.getCurrentSession() == null)
			return  sessionFactory.openSession();
		else
			return sessionFactory.getCurrentSession();
	}

	public GenericDaoHibernateImpl(Class<T> type) {
		this.type = type;
	}

	public PK create(T o) {
		return (PK) getSession().save(o);
	}

	public T read(PK id) {
		return (T) getSession().get(type, id);
	}

	public void update(T o) {
		getSession().update(o);
	}

	public void delete(T o) {
		getSession().delete(o);
	}
}
