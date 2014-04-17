package edu.spcollege.titanbank.domain;

import java.util.Date;

/**
 *
 * @author Nevan
 */
public class Transfer 
{
    private BankAccount destinationAccount;
    private BankAccount sourceAccount;
    private double amount;
    private Date date;
    private TransactionStatus status;

    public Transfer(BankAccount to, BankAccount from, double amount, TransactionStatus status) 
    {
        this.destinationAccount = to;
        this.sourceAccount = from;
        this.amount = amount;
        this.status = status;
        this.date = new Date();
    }

    public Transfer(BankAccount to, BankAccount from, double amount, TransactionStatus status, Date date) 
    {
        this.destinationAccount = to;
        this.sourceAccount = from;
        this.amount = amount;
        this.status = status;
        this.date = date;
    }

    // Getters
    public BankAccount getDestinationAccount() 
    {
        return destinationAccount;
    }

    public BankAccount getSourceAccount() 
    {
        return sourceAccount;
    }

    public double getAmount() 
    {
        return amount;
    }

    public Date getDate() 
    {
        return date;
    }

    public TransactionStatus getStatus() 
    {
        return status;
    }
    
    // Mark a transfer as completed.
    public void completeTransaction() 
    {
        this.status = TransactionStatus.Completed;
    }
    
}
