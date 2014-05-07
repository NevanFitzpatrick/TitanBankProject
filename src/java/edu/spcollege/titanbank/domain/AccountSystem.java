package edu.spcollege.titanbank.domain;

import java.util.ArrayList;

public class AccountSystem implements IAccountRepository
{
    // Fake database table using an array list to hold a list of accounts.
    private ArrayList<BankAccount> accounts;

    public AccountSystem() 
    {
        accounts = new ArrayList<BankAccount>();
        fillAccountDataBase();
    }
    
    public void fillAccountDataBase()
    {
        accounts.add(new BankAccount(123456, 123456, 42.50, AccountType.Checkings));
        accounts.add(new BankAccount(234567, 123456, 0.23, AccountType.Savings));
        accounts.add(new BankAccount(345678, 987654, 1102.78, AccountType.Checkings));
        accounts.add(new BankAccount(456789, 987654, 652.47, AccountType.Checkings));
        accounts.add(new BankAccount(567890, 987654, 7896.23, AccountType.HighInterestSavings));
    }

    @Override
    public BankAccount findByAccountNumber(int accountNumber) 
    {
        BankAccount result = null;
        
        for(BankAccount a : accounts)
        {
            if(a.getAccountNumber() == accountNumber)
            {
                result = a;
            }
        }
        
        return result;
    }
    
    @Override
    public ArrayList<BankAccount> findByCustomerID(int customerID)
    {
        ArrayList<BankAccount> results = new ArrayList<>();
        
        for(BankAccount a : accounts)
        {
            if(a.getCustomerID() == customerID)
            {
                results.add(a);
            }
        }
        
        return results;
    }
}
