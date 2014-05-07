package edu.spcollege.titanbank.domain;

import java.util.ArrayList;

public interface IAccountRepository 
{
    BankAccount findByAccountNumber(int accountNumber);
    ArrayList<BankAccount> findByCustomerID(int customerID);
}
