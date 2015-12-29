<%-- 
    Document   : Listar
    Created on : 30-11-2015, 18:38:00
    Author     : guest-Wy0EaE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LISTA DE ALCOHOLEMIA </title>       
    </head>
    <body>
        <%@include file="WEB-INF/jspf/menu.jspf" %>
        <form action="/listar.html" method="post">
            Listado:
            Mail:
            <table border="1">
                <tr>
                    <th>ID</th>
                    <th>Mililitros(ml)</th>
                    <th>Grado de alcohol</th>
                    <th>Peso</th>
                    <th>Sexo</th>
                    <th>Alcoholemia</th>
                    <th>Estado</th>
                    <th>fechaCreacion</th>
                </tr>
                <c:forEach var="Alcoholismo" items="${listaNivelAlcoholico}">
                 <tr>
                    <td>${Alcoholismo.id_registrado}</td>
                    <td>${Alcoholismo.mililitros}</td>
                    <td>${Alcoholismo.graduacion}</td>
                    <td>${Alcoholismo.peso}</td>
                    <td>${Alcoholismo.sexo}</td>
                    <td>${Alcoholismo.alcoholemia}</td>
                    <td>${Alcoholismo.estado}</td>
                    <td>
                        <c:choose>
                            <c:when test="${empty Alcoholismo.id_registro}">
                                <!-- Ej URL: comprar.html?numero=5 -->
                            </c:when>
                            <c:otherwise>
                                <fmt:formatDate value="${Alcoholismo.fechaCreacion}"
                                                pattern="dd/MM/yyyy HH:mm:ss" /> 
                                
                            </c:otherwise>
                        </c:choose>
                    </td>
                    <td>
                        <c:url var="urlEliminar" value="/Eliminar.html">
                                    <c:param name="ID" value="${Alcoholismo.id_registro}" />
                                </c:url>
                                <a href="${urlEliminar}">Eliminar</a>
                    </td>
                 </tr>            
                </c:forEach>

            </table>    
        </form>
    </body>
</html>
