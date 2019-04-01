<%-- 
    Document   : login
    Created on : Apr 1, 2019, 12:37:42 PM
    Author     : George.Pasparakis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login to the amazing Web App!</h1>
        <form name="user" action="login.htm" method="POST">
            <input type="text" name="username" value="" />
            <input type="password" name="password" value="" />
            <input type="submit" value="Login" name="login_btn" />
        </form>
    </body>
</html>
