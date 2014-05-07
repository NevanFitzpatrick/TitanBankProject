package edu.spcollege.titanbank.domain;

class InsufficientFundsException extends Exception 
{
    public InsufficientFundsException() 
    {
        super("Insufficient funds.");
    }
    
}
