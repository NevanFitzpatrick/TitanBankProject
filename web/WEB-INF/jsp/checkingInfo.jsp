<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Titan Bank</title>
        
    </head>

    <body>
        <%@page contentType="text/html" pageEncoding="UTF-8" import="edu.spcollege.titanbank.domain.*, java.util.ArrayList" errorPage="errorPage.jsp"%>
        
        <%
            //Call to controller to get a list called checkList holding each check assoiciated with this checking account goes here.
            ArrayList<Check> checkList = new ArrayList<>();
        %>
        
        <header>
            <h1>Titan Bank</h1>
        </header>

        <section>
            <p>Checking Info</p>
            <p>Account Number: <%request.getParameter("accountnumber");%></p>
            <%
                for(Check c : checkList)
                {
                    out.println("Check Number: " + c.getCheckNum() + "Amount: " + c.getCheckAmount() + "To: " + c.getTo() + "Date: " + c.getDate());
            %>
                    <!-- Button to stop payment on this check. -->
                    <input type="button" value="Stop Payment"/>
            <%
                }
            %>
        </section>

        <footer>
            <h4>Insert footer</h4>
        </footer>  
    </body>
</html>
