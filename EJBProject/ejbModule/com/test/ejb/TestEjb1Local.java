package com.test.ejb;
import javax.ejb.Local;

@Local
public interface TestEjb1Local {

    public String getName();
    public String getAddress();

}
