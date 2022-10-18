<%-- 
    Document   : agregarmedicamento
    Created on : 15/09/2022, 10:09:02 PM
    Author     : Arturo
--%>

<%@page import="modelo.Medicamento"%>
<%@page import="datos.OperacionBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar medicamento</title>
    </head>
    <body>
                <%
            OperacionBD op= new OperacionBD();
            op.conectar();
            
            String clave=request.getParameter("clave");
            String nomC=request.getParameter("nomComercial");
            String susA=request.getParameter("susActiva");
            String presentacion=request.getParameter("presentacion");
            String viaA=request.getParameter("viaAdmin");
            Medicamento med= new Medicamento(clave,nomC,susA,presentacion,viaA);
            
            op.agregarMedicamento(med);
            
            response.sendRedirect("medicamentos.jsp");
            
            op.desconectar();
        
        
        %>
    </body>
</html>
