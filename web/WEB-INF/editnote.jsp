<%-- 
    Document   : editnote
    Created on : Jun 9, 2022, 9:17:05 AM
    Author     : johnp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <!-- This is an HTML comment. It is not rendered by the browser, but it is visible in the source code. -->
        <%-- THis is a JSP comment. It is not rendered by the browser, nor is it visible in the source code. --%>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        <form method="POST" action="note">
            <label>Title:</label>
            <input type="text" name="Title" value="this is the title">
            <br>
            <label>Contents:</label>
            <input type="text" name="Context" value="Contents go here">
            <br><br>
            <input type="submit" value="Save">
        </form>
        <c:if test="${error == true}">
        <p>Please enter both a first and last name.</p>
        </c:if>
    </body>
</html>
