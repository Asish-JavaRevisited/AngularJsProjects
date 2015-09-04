package com.talentica.Spring.AutoScan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	@Autowired
	CustomerDAO customerDAO;
 
	@Override
	public String toString() {
		return "CustomerService [customerDAO = " + customerDAO + "]";
	}

}
