package edu.spcollege.titanbank.domain;

import java.util.ArrayList;

public class UserSystem implements IUserRepository
{
    // Fake database table using an array list to hold a list of users.
    private ArrayList<User> users;

    public UserSystem() 
    {
        users = new ArrayList<User>();
        fillUserDataBase();
    }
    
    public void fillUserDataBase()
    {
        users.add(new User("BobS123", "bobsmoney", new Customer(123456, "Bob", "Strong")));
        users.add(new User("BettyJ789", "Bet654", new Customer(987654, "Betty", "Jet")));
    }

    @Override
    public User findByUserName(String userName) 
    {
        User user = null;
        
        for(User u : users)
        {
            if(u.getUserName().equals(userName))
            {
                user = u;
            }
        }
        
        return user;
    }
}
