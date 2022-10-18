/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Empleado;
import modelo.Medicamento;
import modelo.Paciente;

/**
 * Clase llamada OperacionBD que se es la encargada de realizar la conexion, desconexion y otros metodos relacionados a la Base de Datos de MySQL.
 * @author Arturo Alvarez Olvera, Garcia Sains Rosa Isabela, Meneses Leon Efren.
 * @version 27/09/2022
 */
public class OperacionBD {

  private static final String USUARIO = "root";
    private static final String PSWD = "root";
    private static final String BD = "hospital";
    private static final String URL = "jdbc:mysql://localhost:3306/";
    private Connection conexion;

     /**
     * Metodo constructor por defecto sin parametros inicializados. 
     */
    public OperacionBD() {
    }

    /**
     * Metodo encargado de conectarse con la base de datos de MySQL por medio del Driver y mostrando el mensaje que expresa si se realizo 
     * la conexion o hubo algun error
     * @see <a href = "https://docs.oracle.com/javase/8/docs/api/java/sql/DriverManager.html">Class DriverManager</a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/Connection.html">Interface Conecction</a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/SQLException.html">SQL Exception</a>
     */

    public void conectar(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion= DriverManager.getConnection(URL+BD,USUARIO, PSWD);
       
                if(conexion!=null)
                    System.out.println("Conectado");
 
        } catch (ClassNotFoundException ex) {
            System.out.println("Error 1 " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Error 2 "+ ex.getMessage());
        }
        
    }
    
    /**
     * Metodo encargado de desconectar con la base de datos, es decr, cierra la conexion, este metodo es vacio, por lo tanto no regresa nada
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/SQLException.html">SQL Exception</a>
     */
    public void desconectar(){
        
        try {
            conexion.close();
            System.out.println("Desconectado");
        } catch (SQLException ex) {
           System.out.println("Error 1 "+ ex.getMessage());
        }
        
    }

    /**
     * Metodo de tipo arreglo dinamico (ArrayList) el cual se encarga de consultar a los empleados en la base de datos.
     * @return Un arreglo con el empleado y todos su atributos inicializados.
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/Statement.html">Inteface Statement</a>
     * @see <a href = "https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html">Class ArrayList</a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/ResultSet.html">Interface ResultSet</a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/SQLException.html">SQL Exception</a>
     */
    public ArrayList<Empleado> consultarEmpleados() {
        ArrayList<Empleado> empleados = new ArrayList<>();
        Statement st;
        try {
            st = conexion.createStatement();
            String query = "SELECT * FROM empleados order by salario desc";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Empleado em = new Empleado();
                em.setNumEmpleado(rs.getInt("numEmpleado"));
                em.setNombre(rs.getString("nombre"));
                em.setEdad(rs.getInt("edad"));
                em.setSexo(rs.getString("sexo"));
                em.setSalario(rs.getDouble("salario"));
                
                
                empleados.add(em);
            }
        } catch (SQLException ex) {
            System.out.println("Error " + ex.getMessage());
        }

        return empleados;
    }

    /**
     * Metodo booleano encargado de agregar un empleado a la base de datos.
     * @param empleado : Establece el objeto de tipo empleado.
     * @return un estado de tipo booleano que informa que se realizo con exito la agregacion del empleado.
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/Statement.html">Inteface Statement</a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/SQLException.html">SQL Exception</a>
     */
    public boolean agregarEmpleado(Empleado empleado) {
        boolean estado = false;
        Statement consultaSQL;
        String q = "INSERT INTO empleados VALUES(" + empleado.getNumEmpleado() + ",'"
                 + empleado.getNombre() + "'," +  empleado.getEdad() + ",'" + empleado.getSexo() + "'," + empleado.getSalario() +");";
        /*
            INSERT INTO empleados
            VALUES (1,'Juan Cabrea Ortiz', 25, 'Masculino', 15.315);
         */
        try {
            consultaSQL = conexion.createStatement();
            consultaSQL.execute(q);
            estado = true;
        } catch (SQLException ex) {
            System.out.println("Error " + ex.getMessage());
        }

        return estado;
    }

    /**
     * Metodo booleano encargado de eliminar a un empleado de la base de datos.
     * @param numEmpleado : Establece el numero de empleado.
     * @return estado que es de tipo booleano, el cual informa si se realizo con exito la eliminacion del empleado.
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/Statement.html">Inteface Statement</a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/SQLException.html">SQL Exception</a>
     */
    public boolean eliminarEmpleado(String numEmpleado) {
        boolean estado = false;
        Statement consultaSQL;
        String q = "DELETE FROM empleados where numEmpleado= " + numEmpleado;
        try {
            consultaSQL = conexion.createStatement();
            consultaSQL.execute(q);
            estado = true;
        } catch (SQLException ex) {
            System.out.println("Error " + ex.getMessage());
        }

        return estado;
    }

    
    /**
     * Metodo encargado de agregar un objeto medicamento a la base de datos.
     * @param medicamento : Establece el objeto de tipo medicamento.
     * @return estado de tipo booleano que informa que se realizo con exito la agregacion del paciente.
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/Statement.html">Inteface Statement</a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/SQLException.html">SQL Exception</a>
     */

    public boolean agregarMedicamento(Medicamento medicamento ){
        
        boolean estado=false;
        
        Statement consultaSQL;
        String query="insert into medicamentos values(" +"'"+ medicamento.getClave() +"'," +"'"+ medicamento.getNombreComercial() 
                      +"',"+"'"+ medicamento.getSustanciaActiva() +"',"+ "'"+ medicamento.getPresentacion() +"',"
                      + "'"+ medicamento.getViaAdministracion() +"'" +");";
        
        try {
            consultaSQL= conexion.createStatement();
            
            consultaSQL.execute(query);
            estado=true;
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
        
        
        return estado; 
    }
    
    /**
     * Metodo de tipo arreglo dinamico (ArrayList) el cual se encarga de consultar los medicamentos.
     * @return Un arreglo con el medicamento y todos su atributos inicializados.
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/Statement.html">Inteface Statement</a>
     * @see <a href = "https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html">Class ArrayList</a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/ResultSet.html">Interface ResultSet</a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/SQLException.html">SQL Exception</a>
     */
    public ArrayList<Medicamento> consultarMedicamentos(){
        
        ArrayList<Medicamento> medicamentos = new ArrayList<>();
        String query="SELECT * FROM medicamentos";      
        Statement st;
        
        try {
            st = conexion.createStatement();

        ResultSet rs;
        
            rs = st.executeQuery(query);

            while(rs.next()){
                Medicamento med = new Medicamento();
                med.setClave(rs.getString("clave"));
                med.setNombreComercial(rs.getString("nombreComercial"));
                med.setSustanciaActiva(rs.getString("sustanciaActiva"));
                med.setPresentacion(rs.getString("presentacion"));
                med.setViaAdministracion(rs.getString("viaAdministracion"));
                
                medicamentos.add(med);
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage() );
        }
        return medicamentos;
        
    }
     /**
     * Metodo de tipo booleano encargado de eliminar un paciente de la base de datos, mediante el atributo clave de tipo String.
     * @param clave : Establece la clave del producto.
     * @return estado que es de tipo booleano, el cual informa si se realizo con exito la eliminacion del medicamento.
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/Statement.html">Inteface Statement</a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/SQLException.html">SQL Exception</a>
     */
     public boolean eliminarMedicamentos(String clave){
         
         boolean estado=false;
         
         Statement consultaSQL;
         String q="delete from medicamentos where clave= '"+clave+"'";
         
         
        try {
            consultaSQL=conexion.createStatement();
            
            consultaSQL.execute(q);
            
            estado=true;
            
        } catch (SQLException ex) {
            System.out.println("Error: "+ ex.getMessage());
        }
         
         return estado;
     }

    /**
     * Metodo encargado de agregar un objeto paciente a la base de datos.
     * @param paciente : Establece el objeto de tipo paciente.
     * @return estado de tipo booleano que informa que se realizo con exito la agregacion del paciente.
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/Statement.html">Inteface Statement</a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/SQLException.html">SQL Exception</a>
     */
   public boolean agregarPaciente(Paciente paciente){
        boolean estado = false;
        
        Statement consultaSQL;
        
        String  q = "insert into pacientes values(" + "'" + paciente.getNss() + "'," + "'" + paciente.getNombrepaciente() + "'," +
                                                "'" + paciente.getDiagnostico() + "');"; 
        
        try {
            
            consultaSQL = conexion.createStatement();
            consultaSQL.executeQuery(q);
            estado = true;
            
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return estado;
    }
   
     /**
     * Metodo de tipo arreglo dinamico (ArrayList) el cual se encarga de consultar a los paciente.
     * @return Un arreglo con el paciente y todos su atributos inicializados.
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/Statement.html">Inteface Statement</a>
     * @see <a href = "https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html">Class ArrayList</a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/ResultSet.html">Interface ResultSet</a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/SQLException.html">SQL Exception</a>
     */
    public ArrayList<Paciente> consultarPacientes(){
        
        ArrayList<Paciente> pacientes = new ArrayList<>();
        String q = "select * from pacientes";      
        Statement st;
        
        try {
            st = conexion.createStatement();
            ResultSet rs;
            rs = st.executeQuery(q);

            while(rs.next()){
                
                Paciente pa = new Paciente();
                pa.setNss(rs.getString("NSS"));
                pa.setNombre(rs.getString("nombrePaciente"));
                pa.setDiagnostico(rs.getString("diagnostico"));
                
                pacientes.add(pa);
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage() );
        }
        return pacientes;
        
    }
    
     /**
     * Metodo de tipo booleano encargado de eliminar un paciente de la base de datos, mediante el atributo de nss de tipo String.
     * @param nss : Establece el numero de seguro social (nss).
     * @return estado que es de tipo booleano, el cual informa si se realizo con exito la eliminacion del paciente.
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/Statement.html">Inteface Statement</a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/SQLException.html">SQL Exception</a>
     */
    public boolean eliminarPaciente(String nss){
        boolean estado = false;
        
        Statement consultaSQL;
        String q = "delete from pacientes where nss = " + "'" + nss + "'";
        
        try {
            
            consultaSQL = conexion.createStatement();
            consultaSQL.execute(q);
            estado = true;
            
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return estado;
    }
}

