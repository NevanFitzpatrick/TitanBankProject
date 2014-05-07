package edu.spcollege.titanbank.domain;

import java.util.Date;

public class Check
{
    // Fields
    private int accountNum;
    private int checkNum;
    private String checkID;
    private double checkAmount;
    private String to;
    private Date date;
    private Boolean processed;

    // Constructor
    public Check(int accountNum, int checkNum, double checkAmount, String to, Date date) 
    {
        String account = String.valueOf(accountNum);
        String check = String.valueOf(checkNum);
        String checkID = account + check;

        this.accountNum = accountNum;
        this.checkNum = checkNum;
        this.checkID = checkID;
        this.checkAmount = checkAmount;
        this.to = to;
        this.date = date;
        this.processed = false;
    }
    
    // Getters
    public int getAccountNum() 
    {
        return accountNum;
    }

    public int getCheckNum() 
    {
        return checkNum;
    }
    
    public String getCheckID()
    {
        return checkID;
    }

    public double getCheckAmount() 
    {
        return checkAmount;
    }

    public String getTo() 
    {
        return to;
    }

    public Date getDate() 
    {
        return date;
    }

    public Boolean isProcessed() 
    {
        return processed;
    }
    
    // Setter
    public void setProcessed(Boolean processed) 
    {
        this.processed = processed;
    }
    
}
