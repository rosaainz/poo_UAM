<%-- 
    Document   : agregarempleado
    Created on : 15/09/2022, 09:17:09 PM
    Author     : Arturo
--%>

<%@page import="modelo.Empleado"%>
<%@page import="datos.OperacionBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar empleado</title>
    </head>
    <body>
        <%
            OperacionBD op= new OperacionBD();
            op.conectar();
            
            int numE=Integer.parseInt(request.getParameter("numEmpleado"));
            String nomE=request.getParameter("nombre");
            int edad=Integer.parseInt(request.getParameter("edad"));
            String sexo=request.getParameter("sexo");
            double salario= Double.parseDouble(request.getParameter("salario"));
            Empleado em= new Empleado(numE,nomE,edad,sexo,salario);
            
            op.agregarEmpleado(em);
            
            response.sendRedirect("empleados.jsp");
            
            op.desconectar();
        
        
        %>
    </body>
</html>
