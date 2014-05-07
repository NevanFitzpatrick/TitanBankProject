package edu.spcollege.titanbank.domain;

public enum AccountType 
{
    // Enum to represent different account types.
    Checkings("Checkings"), Savings("Savings"), Combo("Combo"), HighInterestSavings("High Interest Savings");
    
    private AccountType(final String text) 
    {
        this.text = text;
    }

    private final String text;


    @Override
    public String toString() 
    {
        return text;
    }

}
