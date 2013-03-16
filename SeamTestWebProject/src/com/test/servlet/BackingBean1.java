package com.test.servlet;

import javax.ejb.EJB;

import com.test.ejb.TestEjb1Local;


public class BackingBean1 {

	@EJB
	TestEjb1Local testEjb1;
	
	public String getAddress() {
		return testEjb1.getAddress();
	}
}
