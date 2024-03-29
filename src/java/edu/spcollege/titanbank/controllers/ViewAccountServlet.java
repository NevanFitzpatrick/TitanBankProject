package edu.spcollege.titanbank.controllers;

import edu.spcollege.titanbank.domain.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;


public class ViewAccountServlet extends HttpServlet 
{
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        AccountManagementService service;
        HttpSession session = request.getSession(false);
        PrintWriter out = response.getWriter();
        
        // Check for and display each account held by the customer.
        response.setContentType("text/html;charset=UTF-8");
        out.println("<p>View Account Servlet</p>");
        
        try 
        {
            service = new AccountManagementService(new AccountSystem());
            int customerID = (int)session.getAttribute("customerID");
            int buttonCount = 0;
            ArrayList<BankAccount> customerAccounts = new ArrayList<>(service.getAccountsByCustomerID(customerID));
            
            if(customerAccounts.size() > 0)
            {
                for(BankAccount a : customerAccounts)
                {
                    out.println("<p>Account Number: " + String.valueOf(a.getAccountNumber() + "</p>"));
                    out.println("<p>Account Type: " + String.valueOf(a.getAccountType()) + "</p>");
                    out.println("<p>Account Balance: " + String.valueOf(a.getBalance()) + "</p>");
                    
                    if(a.getAccountType() == AccountType.Checkings)
                    {
                        buttonCount++;
                        String buttonName = "button" + String.valueOf(buttonCount);
                        
                        int accountNumber = a.getAccountNumber();
                        session.setAttribute(buttonName, accountNumber);
                        
                        // Button, if clicked takes user to the checking info page with with this account info.
                        out.println("<p>");
                        out.println("<form action=\"ViewChecksServlet\" name=\"" + buttonName + "\" method=\"post\">");
                        out.println("<input type=\"submit\" value=\"" + buttonName + "\" />");
                        out.println("</form>");
                        out.println("</p>");
                    }
                }
            }
            else
            {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet ViewAccountServlet</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<p>No bank accounts associated with this customer.</p>");
                out.println("</body>");
                out.println("</html>");
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,(String)ex.getMessage());
        }
    }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() 
    {
        return "Short description";
    }// </editor-fold>

}
