
package edu.spcollege.titanbank.domain;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Nevan
 */
public class Customer
{   
    // Fields
    private int customerID;
    private String firstName;
    private String lastName;
    
    // Constructor
    public Customer(int customerNumber, String firstName, String lastName) 
    {
        this.customerID = customerNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    // Getters
    public int getCustomerID() 
    {
        return customerID;
    }

    public String getFirstName() 
    {
        return firstName;
    }

    public String getLastName() 
    {
        return lastName;
    }
    
}
