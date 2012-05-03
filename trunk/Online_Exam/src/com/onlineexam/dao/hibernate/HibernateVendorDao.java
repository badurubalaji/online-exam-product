package com.onlineexam.dao.hibernate;

import java.util.Set;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.onlineexam.dao.VendorDao;
import com.onlineexam.model.Vendor;
import com.onlineexam.model.VendorStudentTest;

public class HibernateVendorDao extends GenericDaoHibernateImpl<Vendor, Long> implements
		VendorDao {
	Logger logger = Logger.getLogger(HibernateVendorDao.class);
	@Resource
	private SessionFactory sessionFactory;
//it has all the methods in built so dont need to implement those
	@Override
	public boolean isVendorAuthenticated(Vendor vendor) {
		// TODO Auto-generated method stub
		Session session = null;
		boolean isVendorAuthenticated=false;
		try{
			session = sessionFactory.openSession();
			//session.beginTransaction(); not required the transaction here ok.
			Vendor vendorNew = (Vendor)session.get(Vendor.class, vendor.getVendorId());
			
			if(vendorNew.isVendorActivate())
				isVendorAuthenticated = true;
			else
				isVendorAuthenticated = false;
		}catch (Exception e) {
			// TODO: handle exception
			logger.error("error occurred in isVendorAuthenticated with vendor"+vendor.getVendorId());
			isVendorAuthenticated = false;
		}finally{
			if(session!=null && session.isOpen())
				session.close();
		}
		return isVendorAuthenticated;
		
	}

	@Override
	public boolean isVendorNameValid(String vendorName) {
		// TODO Auto-generated method stub
		Session session = null;
		boolean isVendorNameValid = false;
		try{
		session = sessionFactory.openSession();
		session.beginTransaction();
		Vendor vendor=new Vendor();
		if(vendor.getVendorName().equals(vendorName)){
			isVendorNameValid=true;
		} else {
			isVendorNameValid=false;
		}
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("error occured in isVendorNameValid with vendor" );
			isVendorNameValid=false;
		}finally {
			if(session!=null && session.isOpen())
				session.close();
		}
		return isVendorNameValid;
	}
	public Set<VendorStudentTest> getTests(Vendor vendor) {
		Session session = null;
		Set<VendorStudentTest> availableTests;
		try{
			session = sessionFactory.openSession();
			//session.beginTransaction(); not required the transaction here ok.
			Vendor vendorTests = (Vendor)session.get(Vendor.class, vendor.getVendorId());
			
			availableTests=vendorTests.getTests();
		}catch (Exception e) {
			// TODO: handle exception
			logger.error("error occurred in getTests with vendor"+vendor.getVendorId());
			availableTests=null;
		}finally{
			if(session!=null && session.isOpen())
				session.close();
		};
		return availableTests;
	}

}
