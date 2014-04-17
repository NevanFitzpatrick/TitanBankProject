<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Titan Bank</title>
        <link rel="stylesheet" type="text/css" href="styles.css" />
    </head>

    <body>
        <%@page contentType="text/html" pageEncoding="UTF-8" import="edu.spcollege.titanbank.domain.*" errorPage="errorPage.jsp"%>
        <% String type = request.getParameter("accountType");%>
        
        <section>
            <p>Account Info</p>
            <p>Account Number: <%request.getParameter("accountnumber");%></p>
            <p>Account Type: <%request.getParameter("accountType");%></p>
            <p>Balance: </p>
            <%
                if(type == "Checking")
                {
            %>
                    <!-- Button, if clicked takes user to the checking info page with with this account info.-->
                    <input type="button" value="Check Log"/>
            <%
                }
            %>
        </section>

        <footer>
            <h4>Insert footer</h4>
        </footer>  
    </body>
</html>
