<%-- 
    Document   : eliminarempleado
    Created on : 15/09/2022, 09:16:55 PM
    Author     : Arturo
--%>

<%@page import="datos.OperacionBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar empleado</title>
    </head>
    <body>
        <%
            OperacionBD op= new OperacionBD();
            op.conectar();
            
            String numE= request.getParameter("numEmpleado");
            op.eliminarEmpleado(numE);
            response.sendRedirect("empleados.jsp");
        
        %>
    </body>
</html>
