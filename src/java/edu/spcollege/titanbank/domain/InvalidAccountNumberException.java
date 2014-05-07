package edu.spcollege.titanbank.domain;

public class InvalidAccountNumberException extends Exception
{
    public InvalidAccountNumberException() 
    {
        super("Invalid Account Number");
    }
}
