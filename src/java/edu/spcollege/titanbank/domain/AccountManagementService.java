package edu.spcollege.titanbank.domain;

import java.util.ArrayList;

public class AccountManagementService 
{
    private final IAccountRepository accountRepository;

    public AccountManagementService(IAccountRepository accountRepository) 
    {
        this.accountRepository = accountRepository;
    }
    
    public BankAccount getAccountByNumber(int accountNumber) throws AccountNotFoundException
    {
        BankAccount account = this.accountRepository.findByAccountNumber(accountNumber);
        
        if (account == null)
        {
            throw new AccountNotFoundException();
        }
        
        return account;
    }
    
    public ArrayList<BankAccount> getAccountsByCustomerID(int customerID)
    {
        ArrayList<BankAccount> results = new ArrayList<>(this.accountRepository.findByCustomerID(customerID));

        return results;
    }
}
