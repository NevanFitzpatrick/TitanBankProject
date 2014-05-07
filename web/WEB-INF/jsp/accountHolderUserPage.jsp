<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Titan Bank</title>
        
    </head>

    <body>
        <%@page contentType="text/html" pageEncoding="UTF-8" import="edu.spcollege.titanbank.domain.*, javax.servlet.http.HttpSession, java.util.ArrayList, edu.spcollege.titanbank.domain.*" errorPage="errorPage.jsp"%>
        
        <header>
            <h1>Titan Bank</h1>
        </header>

        <section>
            <p>Account Holder User Page</p>
            <%
                String customerID = String.valueOf(session.getAttribute("customerID"));
                String firstName = (String)session.getAttribute("firstName");
                String lastName = (String)session.getAttribute("lastName");
            %>
            <p>Account Information for <% out.println(firstName + " " + lastName); %></p>
            <p>Customer ID: <% out.println(customerID); %></p>
            <p>
                <jsp:include page="accountInfo.jsp" />
            </p>
        </section>

        <footer>
            <h4>Insert footer</h4>
        </footer>  
    </body>
</html>
