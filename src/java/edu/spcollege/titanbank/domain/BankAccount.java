
package edu.spcollege.titanbank.domain;

/**
 *
 * @author Nevan
 */
public class BankAccount
{    
    // Fields
    private int accountNumber;
    private Customer customer;
    private double balance;
    private AccountType accountType;

    // Constructor
    public BankAccount(int accountNumber, Customer customer, double intialFunds, AccountType accountType) 
    {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = intialFunds;
        this.accountType = accountType;
    }
    
    // Getters
    public int getAccountNumber()
    {
        return accountNumber;
    }
    
    public AccountType getAccountType() 
    {
        return accountType;
    }

    public Customer getCustomer() 
    {
        return customer;
    }

    public double getBalance() 
    {
        return balance;
    }
    
    public boolean hasSufficientFunds(double amount)
    {
        return this.balance >= amount;
    }

    public void withdrawl(Double amount) throws InsufficientFundsException
    {
        if(this.hasSufficientFunds(amount))
        {
            this.balance -= amount;
        }
        else
        {
            throw new InsufficientFundsException();
        }
    }
    
    public void deposit(Double amount)
    {
        this.balance += amount;
    }
}
