<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
        <title>ALCOHOLEMIA</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/menu.jspf" %>
        
        <h1>Cálculo de Alcoholemia</h1>
        <h2>Ingrese los datos solicitados:</h2>
            <form action="/crear.html" method="post">
            Correo:
                <input type="text" 
                       name="email"
                       placeholder="Ej. correo@servidor.net"
                       required
                       autofocus
                />
    <br>
    <br>
            Mililitros de bebida:
                <input type="text" 
                       name="mililt"
                       placeholder="100"
                       required
                       autofocus
                />ml.
    <br>
    <br>
            Grados alcohólicos:
                <input type="text" 
                       name="grado"
                       placeholder="4.4"
                       required
                       autofocus
                />%.
    <br>
    <br>
            Peso:             
                <input type="text" 
                       name="peso"
                       placeholder="75"
                       required
                       autofocus
                />kg.
    <br>
    <br>
            Sexo:
    <br>
                <input type="radio" 
                       name="sexo" 
                       value="male" checked>Hombre
    <br>
                <input type="radio" 
                       name="sexo" 
                       value="female">Mujer
                <br>
                <br>
                <input type="submit" value="INGRESAR" />
                <c:out value="${mensaje}"/>
            </form>
    </body>
</html>