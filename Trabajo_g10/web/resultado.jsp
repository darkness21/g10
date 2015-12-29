<%-- 
    Document   : resultado
    Created on : 30-11-2015, 20:17:40
    Author     : guest-Wy0EaE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado Alcoholemia</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/menu.jspf" %>
        <h1>Análisis de estado:</h1>
        <form action="/resultado.html" method="post">
        Grado de alcohol: ${alcoholemia}
        <br>
        Estado: ${estado}
        </form>
    </body>
</html>
