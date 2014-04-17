
package edu.spcollege.titanbank.domain;

/**
 *
 * @author Nevan
 */
public class Employee
{   
    // Field
    private String employeeID;
    private String employeeTitle;
    
    private boolean onTheClock = false;

    // Constructor
    public Employee(String id, String title, String firstName, String lastName) 
    {
        this.employeeID = id;
        this.employeeTitle = title;
    }
    
    // Getters
    public String getEmployeeID() 
    {
        return employeeID;
    }

    public String getTitle() 
    {
        return employeeTitle;
    }
    
    // Setter
    public void setTitle(String title) 
    {
        this.employeeTitle = title;
    }
    
    public void startTimeClock()
    {
        onTheClock = true;
    }
    
    public void stopTimeClock()
    {
        onTheClock = false;
    }
}
