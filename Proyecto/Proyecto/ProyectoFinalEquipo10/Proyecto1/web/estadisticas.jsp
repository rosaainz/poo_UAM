<%-- 
    Document   : estadisticas
    Created on : 27/09/2022, 12:48:08 AM
    Author     : Arturo
--%>

<%@page import="modelo.Empleado"%>
<%@page import="modelo.Paciente"%>
<%@page import="datos.Hospital"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Medicamento"%>
<%@page import="datos.OperacionBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/hojaEstadisticas.css" rel="stylesheet" type="text/css"/>
        <title>Estadisticas del hospital</title>
    </head>
    <body>
        <div>
        <h1 align="center">Estadisticas</h1><br><br>  
        </div>
        
        <div>
        <h1>Pacientes con su padecimiento comienza con vocal</h1>
        
        <%
            OperacionBD op= new OperacionBD();
            op.conectar();
            ArrayList<Paciente> pacientes = op.consultarPacientes();
            ArrayList<Empleado> empleados = op.consultarEmpleados();
            ArrayList<Medicamento> medicamentos = op.consultarMedicamentos();
            Hospital h= new Hospital(empleados,medicamentos,pacientes);
            ArrayList<Paciente> pacientes1 = h.obtenerPacientesVocal();
            
            
        %>
        <table align="center" border =1 width="500">
        <tr>
            <th>NSS</th>  <th>Nombre paciente</th>  <th>Dianostico</th> 
        </tr>
        
        <% for (Paciente pac: pacientes1){
            out.println("<tr><td>"+pac.getNss()+ "</td>");
            out.println("<td>"+pac.getNombrepaciente()+ "</td>");
            out.println("<td>"+pac.getDiagnostico()+ "</td>");
        }
               
        %>
    </table >
        </div>
    <div>
        <h1>Numero de empleados masculino y femenino</h1>
        <table align="center" border =1 width="500">
        <tr>
            <th>Total empleadas femeninas</th>  <th>Total empleados masculinos</th>
        </tr>
        <%
            out.println("<tr><td align=center>"+h.obtenerEmpleadosSexo("Femenino")+"</td>");
            out.println("<td align=center>"+h.obtenerEmpleadosSexo("Masculino")+"</td></tr>");
        %>
        </table>
        
        <h1>Promedio de edades de los empleados</h1>
        
        <table align="center" border =1 width="400">
        <tr>
            <td>Promedio de edades de los empleados</td>
        <%
            out.println("<td>"+h.obtenerPromedioEdades()+" años"+"</td></tr>");
        %>
        </table>
        <h1> Empleados con mayor y menor salario</h1>     
    <table align="center" border =1 width="400">
        <tr>
            <th>Empleado con mayor salario</th> <th>Empleado con menor salario</th>
        </tr>    
        <%
             out.println("<tr><td>"+h.obtenerEmpleadoMenorOMayorSald("mayor")+"</td>");
            out.println("<td>"+h.obtenerEmpleadoMenorOMayorSald("menor")+"</td></tr>");
        %>
        </table>
    </div>
        
        <div>
            <h1>Numero de medicamentos por tipo de presentacion</h1>
            <table align="center" border =1 width="400">
        <tr>
            <th>Frasco</th> <th>Caja</th> <th>Ampolleta</th> <th>Tubo</th>
        </tr>    
        <%
             out.println("<tr><td>"+h.obtenerTipoMedicamento("Frasco")+"</td>");
            out.println("<td>"+h.obtenerTipoMedicamento("Caja")+"</td>");
            out.println("<td>"+h.obtenerTipoMedicamento("Ampolleta")+"</td>");
            out.println("<td>"+h.obtenerTipoMedicamento("Tubo")+"</td></tr>");
        %>
        </table>
        </div>    
    </body>
</html>
