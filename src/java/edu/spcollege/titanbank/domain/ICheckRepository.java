package edu.spcollege.titanbank.domain;

import java.util.ArrayList;

public interface ICheckRepository 
{
    Check findByCheckID(String checkID);
    ArrayList<Check> findByAccountNumber(int accountNumber);
}
