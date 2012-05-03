package com.onlineexam.dao;

import com.onlineexam.model.Vendor;


public interface VendorDao extends GenericDao<Vendor, Long>{
	
	public boolean isVendorAuthenticated(Vendor vendor);
	public boolean isVendorNameValid(String vendorName);
	
	
}
