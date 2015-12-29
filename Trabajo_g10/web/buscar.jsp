<%-- 
    Document   : Buscar
    Created on : 30-11-2015, 18:47:34
    Author     : guest-Wy0EaE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Búsqueda</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/menu.jspf" %>
        <h1>Búsqueda de datos</h1>
        <h2>Ingrese los datos solicitados:</h2>
        <form action="/buscar.html" method="post">
            Correo:
            <input type="text" 
                   name="email"
                   placeholder="Ej. correo@servidor.net"
                   required
                   autofocus
                   />
            <input type="submit" value="INGRESAR" />
            <c:out value="${mensaje}"/>
        </form>
    </body>
</html>
