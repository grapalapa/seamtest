package com.test.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class TestEjb1
 */
@Stateless
public class TestEjb1 implements TestEjb1Local {

	@PersistenceContext
	private EntityManager em;
	
    /**
     * Default constructor. 
     */
    public TestEjb1() {
    }

    public String getName() {
    	String s1 = "Lola";
    	Object o = em.find(User1.class, 1);
    	if(o instanceof User1) {
    		User1 user = (User1) o;
    		s1 += user.getName();
    	}
    	
    	return s1;
    }
    
    public String getAddress() {
    	Address1 address = em.find(Address1.class, 1);

    	return address.getStreet();
    }
    
}
