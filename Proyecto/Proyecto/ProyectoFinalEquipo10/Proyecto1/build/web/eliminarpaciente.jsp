<%-- 
    Document   : eliminarpaciente
    Created on : 16/09/2022, 02:08:51 AM
    Author     : Arturo
--%>

<%@page import="datos.OperacionBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar pacientes</title>
    </head>
    <body>
        <%
            OperacionBD op= new OperacionBD();
            op.conectar();
            String NSS= request.getParameter("NSS");
            System.out.println(NSS);
            op.eliminarPaciente(NSS);
            response.sendRedirect("pacientes.jsp");
        
        %>
    </body>
</html>
