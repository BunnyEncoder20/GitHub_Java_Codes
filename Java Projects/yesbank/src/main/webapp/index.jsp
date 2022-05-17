<%-- 
    Document   : index
    Created on : 27-Apr-2022, 4:10:22 pm
    Author     : Bunny
--%>
<%@page import="java.util.Date" %>      <%--importing the Date class--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Yes Bank</title>
    </head>
    
    <%--include the JSP elements here--%>
    <%                          
        Date todaydate = new Date();
        %>
    <%--todaydate is the variable which we'll use inside the JSP elements in the html--%>
    <body>
        <h1>Yes Bank</h1>
        <p>Address : road 303 INA, Ezhimala, Kerala - 101011</p>
        <br>
        <br>
        <h3>Date : <%= todaydate %></h3>
        <!--<p>Enter your income : </p>-->
        
        <form name="myform" action="check.jsp" method="POST">
            <table border="0">
                
                <tbody>
                    <tr>
                        <td>Enter Income : </td>
                        <td><input type="text" name="income" value="" /></td>
                    </tr>
                </tbody>
            </table>

            <br>
            <input type="reset" value="Clear Entry" name="clear" />
            <input type="submit" value="Submit" name="submit" />
        </form>
    </body>
</html>
