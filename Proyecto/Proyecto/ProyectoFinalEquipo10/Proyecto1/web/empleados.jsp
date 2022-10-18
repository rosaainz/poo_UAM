<%-- 
    Document   : empleados
    Created on : 15/09/2022, 06:28:48 PM
    Author     : Arturo
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Empleado"%>
<%@page import="datos.OperacionBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/hojaEstiloEmp.css" rel="stylesheet" type="text/css"/>
        <title>Empleados del hospital</title>
    </head>
    <body>
               <h1 align="center">Empleados</h1>
        <%
            OperacionBD op= new OperacionBD();
            op.conectar();
            ArrayList<Empleado> empleados = op.consultarEmpleados();
        %>
    <table align="center" border =1 width="500">
        <tr>
            <th> Numero empleado</th>  <th>Nombre</th>  <th>Edad</th>   <th>Sexo</th>   <th>Salario</th>
        </tr>
        
        <% for (Empleado em: empleados){
            out.println("<tr><td>"+em.getNumEmpleado()+ "</td>");
            out.println("<td>"+em.getNombre()+ "</td>");
            out.println("<td>"+em.getEdad()+ "</td>");
            out.println("<td>"+em.getSexo()+ "</td>");
            out.println("<td>"+em.getSalario()+ "</td>");
        }
               
        %>
    </table>
    
        </form>
        
        <h1>Agregar Empleado</h1>
        <form action="agregarempleado.jsp" method="post">
            Numero empleado: <input type="text" name="numEmpleado" size="15"><br><br>
            Nombre   : <input type="text" name="nombre" size="15"><br><br>
            Edad     : <input type="text" name="edad" size="15"><br><br>
            Sexo     : <input type="text" name="sexo" size="15"><br><br>
            Salario     : <input type="text" name="salario" size="15"><br><br>
            <br><input type="submit" value="Agregar">
        </form>
    
    <h1>Eliminar Empleado</h1>
    <form action="eliminarempleado.jsp" method="post">
        <select name="numEmpleado">
            <%
             for (Empleado em: empleados){
                 out.println("<option value="+em.getNumEmpleado()+">"+ em.getNumEmpleado() );
              }
            
            %>
        </select>
        <br><input type="submit" value="eliminar">

    
    </body>
</html>
