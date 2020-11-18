<%-- 
    Document   : index
    Created on : Nov 13, 2020, 10:49:29 AM
    Author     : NGUYEN THI MINH ANH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login Page</h1>
        <form action="Controller" method="post">
            Username: <input type="text" name="txtusername" value=""/><br>
            Password: <input type="text" name="txtpassword" value=""/><br>
           <input type="submit" value="Login" name="btAction"/>
           <input type="reset" value="Reset"/>
        </form>
    </body>
</html>
