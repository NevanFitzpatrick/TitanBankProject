<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Titan Bank</title>
        
    </head>

    <body>
        <%@page contentType="text/html" pageEncoding="UTF-8" import="edu.spcollege.titanbank.domain.*" errorPage="errorPage.jsp"%>
        
        <section>
            <p>Account Info</p>
            <p>
                <jsp:include page="/ViewAccountServlet" flush="true" />
            </p>
        </section>
    </body>
</html>
