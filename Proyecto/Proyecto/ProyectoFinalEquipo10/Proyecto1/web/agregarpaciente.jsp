<%-- 
    Document   : agregarpaciente
    Created on : 16/09/2022, 02:08:35 AM
    Author     : Arturo
--%>

<%@page import="modelo.Paciente"%>
<%@page import="datos.OperacionBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar pacientes</title>
    </head>
    <body>
                <%
            OperacionBD op= new OperacionBD();
            op.conectar();
            
            String NSS=request.getParameter("NSS");
            String nomP=request.getParameter("nombre");
            String diagnostico=request.getParameter("diagnostico");
            Paciente pac= new Paciente(NSS,nomP,diagnostico);
            
            op.agregarPaciente(pac);
            
            response.sendRedirect("pacientes.jsp");
            
            op.desconectar();
        
        
        %>
    </body>
</html>
