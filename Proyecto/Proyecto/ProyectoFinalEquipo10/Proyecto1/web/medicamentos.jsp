<%-- 
    Document   : medicamentos
    Created on : 15/09/2022, 06:29:15 PM
    Author     : Arturo
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Medicamento"%>
<%@page import="datos.OperacionBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/hojaEstiloMedicamentos.css" rel="stylesheet" type="text/css"/>
        <title>Medicamentos</title>
    </head>
    <body>
                      <h1 align="center">Medicamentos</h1>
        <%
            OperacionBD op= new OperacionBD();
            op.conectar();
            ArrayList<Medicamento> medicamentos = op.consultarMedicamentos();
        %>
    <table align="center" border =1 width="500">
        <tr>
            <th>Clave</th>  <th>Nombre comercial</th>  <th>Sustancia activa</th>   <th>Presentacion</th>   <th>Via de administracion</th>
        </tr>
        
        <% for (Medicamento med: medicamentos){
            out.println("<tr><td>"+med.getClave()+ "</td>");
            out.println("<td>"+med.getNombreComercial()+ "</td>");
            out.println("<td>"+med.getSustanciaActiva()+ "</td>");
            out.println("<td>"+med.getPresentacion()+ "</td>");
            out.println("<td>"+med.getViaAdministracion()+ "</td>");
        }
               
        %>
    </table>
    
        </form>
        <fieldset>
        <legend>Agregar Medicamentos</legend>
        <form action="agregarmedicamento.jsp" method="post">
            Clave: <input type="text" name="clave" size="15"><br><br>
            Nombre comercial   : <input type="text" name="nomComercial" size="15"><br><br>
            Sustancia activa     : <input type="text" name="susActiva" size="15"><br><br>
            Presentacion     : 
            <select name="presentacion">
                <option>Frasco</option>
                <option>Caja</option>
                <option>Ampolleta</option>
                <option>Tubo</option>
            </select>
            Via de administracion     :
             <select name="viaAdmin">
                <option>Oral</option>
                <option>Nasal</option>
                <option>Cutanea</option>
                <option>Sublingual</option>
                <option>Inyectable</option>
                <option>Otica</option>
                <option>Ocular</option>
            </select>
            <br><br>
            <br><input type="submit" value="Agregar">     
        </form>
    </fieldset>
    <fieldset>
    <legend>Eliminar Medicamento</legend>
    <form action="eliminarmedicamento.jsp" method="post">
        <select name="clave">
            <%
             for (Medicamento med: medicamentos){
                 out.println("<option value="+med.getClave()+">"+ med.getClave() );
              }
            
            %>
        </select>
        <br><input type="submit" value="eliminar">
    </form>
    </fieldset>
    </body>
</html>
