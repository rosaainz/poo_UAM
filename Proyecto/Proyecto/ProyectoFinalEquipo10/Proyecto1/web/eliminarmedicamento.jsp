<%-- 
    Document   : eliminarmedicamento
    Created on : 15/09/2022, 10:09:18 PM
    Author     : Arturo
--%>

<%@page import="datos.OperacionBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar medicamento</title>
    </head>
    <body>
         <%
            OperacionBD op= new OperacionBD();
            op.conectar();
            String clave= request.getParameter("clave");
            System.out.println(clave);
            op.eliminarMedicamentos(clave);
            response.sendRedirect("medicamentos.jsp");
        
        %>
    </body>
</html>
