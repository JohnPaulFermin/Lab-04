<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <h2>Title: ${topic.newtitle}</h2>
        <br>
        <h2>Contents:<br>
            ${topic.newcontext}</h2>
        <p>${topic}</p>
    </body>
</html>