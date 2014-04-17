
package edu.spcollege.titanbank.domain;

import java.util.ArrayList;

/**
 *
 * @author Nevan
 */

public class User 
{   
    // Fields
    private final String userName;
    private final String userPassword;
    private final Customer customer;
    private final Employee employee;

    // Constuctors
    public User(String userName, String userPassword, Customer customer) 
    {
        this.userName = userName;
        this.userPassword = userPassword;
        this.customer = customer;
        this.employee = null;
    }
    
    public User(String userName, String userPassword, Employee employee) 
    {
        this.userName = userName;
        this.userPassword = userPassword;
        this.customer = null;
        this.employee = employee;
    }

    //Getters to retrieve user info.
    public String getUserName() 
    {
        return this.userName;
    }
    
    public Customer getCustomer()
    {
        return this.customer;
    }
    
    public Employee getEmployee()
    {
        return this.employee;
    }
    
    // Tests for a valid password.
    public boolean isValidPassword(String password)
    {   
        return this.userPassword.equals(password);
    }
}
