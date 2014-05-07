package edu.spcollege.titanbank.domain;

import java.util.ArrayList;

public class CheckManagementService 
{
    private final ICheckRepository checkRepository;

    public CheckManagementService(ICheckRepository checkRepository) 
    {
        this.checkRepository = checkRepository;
    }
    
    public Check getCheckByCheckID(String checkID) throws AccountNotFoundException
    {
        Check account = this.checkRepository.findByCheckID(checkID);
        
        if (account == null)
        {
            throw new AccountNotFoundException();
        }
        
        return account;
    }
    
    public ArrayList<Check> getChecksByAccountNumber(int accountNumber)
    {
        ArrayList<Check> results = new ArrayList<>(this.checkRepository.findByAccountNumber(accountNumber));

        return results;
    }
}
