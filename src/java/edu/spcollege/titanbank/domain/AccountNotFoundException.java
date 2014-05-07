package edu.spcollege.titanbank.domain;

public class AccountNotFoundException extends Exception
{
    public AccountNotFoundException() 
    {
        super("Account not found.");
    }
}
