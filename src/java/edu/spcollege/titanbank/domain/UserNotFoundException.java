/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.spcollege.titanbank.domain;

/**
 *
 * @author Nevan
 */
public class UserNotFoundException extends Exception 
{

    public UserNotFoundException() 
    {
        super("User not found.");
    }
    
}
