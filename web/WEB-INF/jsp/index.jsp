<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <%
        ServletContext sc = this.getServletContext();
        String stylePath = sc.getRealPath("/WEB-INF/jsp/styles.css");
        String accountPath = sc.getRealPath("/WEB-INF/jsp/accountHolderInfo.jsp");
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Titan Bank</title>
        <!--Style sheet does not work, Chrome says "Can not load local resource"-->
        <link rel="stylesheet" type="text/css" href="<%=accountPath%>styles.css" />
    </head>

    <body>
        <%@page contentType="text/html" pageEncoding="UTF-8" import="javax.servlet.*" errorPage="errorPage.jsp"%>
        
        <header>
            <h1>Welcome to Titan Bank</h1>
        </header>

        <section>
            <!--This form action does not work, Chrome says "Can not load local resource"-->
            <form action="<%=accountPath%>" method="post">
                <p>Login</p>
                <p><label>User Name: <input type="text" name="username" size="50" /></label></p>
                <p><label>Password: <input type="text" name="password" size="50" /></label></p>
                <p><input type="submit" value="Enter"</p>
            </form>
        </section>

        <footer>
            <h4>Insert footer</h4>
        </footer>  
    </body>
</html>
