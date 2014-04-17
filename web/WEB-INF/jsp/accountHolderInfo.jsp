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
        
        <%
            // Get the customer.
            AuthenticationService service = new AuthenticationService(new UserSystem());;
            String userName = request.getParameter("userName");
            String password = request.getParameter("passWord");;
            Customer customer = service.logIn(userName, password);
            String firstName = customer.getFirstName();
            String lastName = customer.getLastName();
            
            //Call to controller to get a list called accountList holding each bank account assoiciated with this customer goes here.
        %>
    
        <header>
            <h1>Titan Bank</h1>
        </header>

        <section>
            <p>Account Information for <% out.println(firstName + " " + lastName); %></p>
            <%
                //foreach(BankAccount a in accountList)
                //{
            %>
                <jsp:include page="accountInfo.jsp"/>>
            <%
                //}
            %>
        </section>

        <footer>
            <h4>Insert footer</h4>
        </footer>  
    </body>
</html>
