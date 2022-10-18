<%-- 
    Document   : pacientes
    Created on : 15/09/2022, 06:29:26 PM
    Author     : Arturo
--%>

<%@page import="modelo.Paciente"%>
<%@page import="java.util.ArrayList"%>
<%@page import="datos.OperacionBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/hojaEstiloPac.css" rel="stylesheet" type="text/css"/>
        <title>Pacientes hospital</title>
    </head>
    <body>
          <h1 align="center">Pacientes</h1>
        <%
            OperacionBD op= new OperacionBD();
            op.conectar();
            ArrayList<Paciente> pacientes = op.consultarPacientes();
        %>
    <table align="center" border =1 width="500">
        <tr>
            <th>NSS</th>  <th>Nombre paciente</th>  <th>Dianostico</th> 
        </tr>
        
        <% for (Paciente pac: pacientes){
            out.println("<tr><td>"+pac.getNss()+ "</td>");
            out.println("<td>"+pac.getNombrepaciente()+ "</td>");
            out.println("<td>"+pac.getDiagnostico()+ "</td>");
        }
               
        %>
    </table>
    
        </form>
        
        <h1>Agregar Pacientes</h1>
        <form action="agregarpaciente.jsp" method="post">
            NSS: <input type="text" name="NSS" size="15"><br><br>
            Nombre paciente   : <input type="text" name="nombre" size="15"><br><br>
            Diagnostico     : <input type="text" name="diagnostico" size="15"><br><br>
            <br><input type="submit" value="Agregar">
        </form>
    
    <h1>Eliminar paciente</h1>
    <form action="eliminarpaciente.jsp" method="post">
        <select name="NSS">
            <%
             for (Paciente pac: pacientes){
                 out.println("<option value="+pac.getNss()+">"+ pac.getNss());
              }
            
            %>
        </select>
        <br><input type="submit" value="eliminar">
    </body>
</html>
