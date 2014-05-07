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

public class ViewChecksServlet extends HttpServlet 
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
        CheckManagementService service;
        HttpSession session = request.getSession(false);
        PrintWriter out = response.getWriter();
        
        // Check for and display each check associated with this account.
        response.setContentType("text/html;charset=UTF-8");
        
        int accountNumber = 0;
        String buttonName = null;
        
        try
        {
            service = new CheckManagementService(new CheckSystem());
            
            // Setup and run a search for which button sent the request.
            boolean foundButton = false;
            
            for(int i = 1; i < 10 && foundButton == false; i++)
            {
                buttonName = "button" + String.valueOf(i);

                if((String)request.getAttribute(buttonName) == buttonName)
                {
                    accountNumber = (int)session.getAttribute(buttonName);
                    foundButton = true;
                }
            }
            
            if (foundButton == true)
            {
                //ArrayList<Check> checks = new ArrayList<>(service.getChecksByAccountNumber(accountNumber));
                out.println("<!DOCTYPE html>");
                out.println("<html lang=\"en\">");
                out.println("<head>");
                out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
                out.println("<title>Titan Bank LoginServlet</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Titan Bank</h1>");
                out.println("<p>Check Log</p>");
                out.println("<p>Account Number: " + accountNumber + "</p>");
                out.println("<p>" + buttonName + "</p>");
                out.println("</body>");
                out.println("</html>");
            }
            else
            {
                out.println("<!DOCTYPE html>");
                out.println("<html lang=\"en\">");
                out.println("<head>");
                out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
                out.println("<title>Titan Bank LoginServlet</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Titan Bank</h1>");
                out.println("<p>Check Log</p>");
                out.println("<p>Did not find button</p>");
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
            throws ServletException, IOException {
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
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
