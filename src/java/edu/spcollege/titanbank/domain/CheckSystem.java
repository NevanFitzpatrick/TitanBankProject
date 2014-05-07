/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.spcollege.titanbank.domain;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Nevan
 */
public class CheckSystem implements ICheckRepository
{
    // Fake database table using an array list to hold a list of checks.
    private ArrayList<Check> checks;

    public CheckSystem() 
    {
        checks = new ArrayList<Check>();
        fillAccountDataBase();
    }
    
    public void fillAccountDataBase()
    {
            checks.add(new Check(123456, 126, 750.00, "Rent", new Date(1979-29-10)));
            checks.add(new Check(123456, 127, 750.00, "Rent", new Date(1979-29-10)));
            checks.add(new Check(123456, 128, 750.00, "Rent", new Date(1979-29-10)));
            checks.add(new Check(123456, 129, 750.00, "Rent", new Date(1979-29-10)));
            checks.add(new Check(123456, 130, 750.00, "Rent", new Date(1979-29-10)));
            checks.add(new Check(987654, 278, 750.00, "Morgage", new Date(1979-29-10)));
            checks.add(new Check(987654, 279, 750.00, "Rent", new Date(1979-29-10)));
            checks.add(new Check(987654, 280, 750.00, "Rent", new Date(1979-29-10)));
            checks.add(new Check(987654, 281, 750.00, "Rent", new Date(1979-29-10)));
            checks.add(new Check(987654, 282, 750.00, "Rent", new Date(1979-29-10)));
            checks.add(new Check(987654, 283, 750.00, "Rent", new Date(1979-29-10)));
    }

    @Override
    public Check findByCheckID(String checkID) 
    {
        Check check = null;
        
        for(Check c : checks)
        {
            if(c.getCheckID() == checkID)
            {
                check = c;
            }
        }
        
        return check;
    }
    
    @Override
    public ArrayList<Check> findByAccountNumber(int accountNumber)
    {
        ArrayList<Check> results = new ArrayList<>();
        
        for(Check c : checks)
        {
            if(c.getAccountNum() == accountNumber)
            {
                results.add(c);
            }
        }
        
        return results;
    }
}
