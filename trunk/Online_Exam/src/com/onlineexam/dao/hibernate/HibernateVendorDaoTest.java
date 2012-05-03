package com.onlineexam.dao.hibernate;

import static org.junit.Assert.*;
import junit.runner.ClassPathTestCollector;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onlineexam.dao.VendorDao;
import com.onlineexam.model.Vendor;

public class HibernateVendorDaoTest {
	VendorDao vendorDao = null;
	@Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-hibernate.xml");
		vendorDao = (VendorDao)context.getBean("vendorDao");
	}

	@Test
	public void testIsVendorAuthenticated() {
		try{
		}catch (Exception e) {
			// TODO: handle exception
			fail("exception  "+e);
		}
	}

	@Test
	public void testIsVendorNameValid() {
		try{
		}catch (Exception e) {
			// TODO: handle exception
			fail("exception  "+e);
		}
	
	}

	@Test
	public void testGetTests() {
		try{
		}catch (Exception e) {
			// TODO: handle exception
			fail("exception  "+e);
		}
	
	}

	@Test
	public void testGenericDaoHibernateImpl() {
		try{
		}catch (Exception e) {
			// TODO: handle exceptionj
			fail("exception  "+e);
		}
	}

	@Test
	public void testGenericDaoHibernateImplClassOfT() {
		try{
		}catch (Exception e) {
			// TODO: handle exception
			fail("exception  "+e);
		}
	}

	@Test
	public void testCreate() {
		try{
			Vendor vendor = new Vendor();
			vendor.setVendorName("test");
			vendor.setVendorPassword("test");
			vendorDao.create(vendor);
		}catch (Exception e) {
			// TODO: handle exception
			fail("exception  "+e);
		}
	}
	@Test
	public void testRead() {
		try{
		}catch (Exception e) {
			// TODO: handle exception
			fail("exception  "+e);
		}
	}

	@Test
	public void testUpdate() {
		try{
		}catch (Exception e) {
			// TODO: handle exception
			fail("exception  "+e);
		}
	}

	@Test
	public void testDelete() {
		try{
		}catch (Exception e) {
			// TODO: handle exception
			fail("exception  "+e);
		}
	}

}
