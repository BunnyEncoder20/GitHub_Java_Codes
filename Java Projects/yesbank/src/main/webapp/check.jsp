<%-- 
    Document   : check
    Created on : 27-Apr-2022, 5:48:26 pm
    Author     : Bunny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Yes Bank</title>
    </head>
    <body>
        <h1>Yes Bank</h1>
        <%
           String in = request.getParameter("income");
           int income = Integer.parseInt(in);
           
           String result;
           if(income>15000)
                result="Eligible";
           else 
                result="NOT eligible";
            %>
            
            <table border="1" cellspacing="3">
                
                <tbody>
                    <tr>
                        <td style="padding:10px">Eligibility</td>
                        <td style="padding:10px"><%= result%></td>
                    </tr>
                </tbody>
            </table>


    </body>
</html>
