package edu.spcollege.titanbank.domain;

public class UserNotFoundException extends Exception 
{

    public UserNotFoundException() 
    {
        super("User not found.");
    }
    
}
