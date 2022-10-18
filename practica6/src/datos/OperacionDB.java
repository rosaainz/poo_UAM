package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Cuenta;

/**
 *  Clase que permite conectarse, desconectarse y recuperar informacion de una base de datos
 * @author Equipo 10
 * @version 1
 */
public class OperacionDB {
    private static final String USUARIO = "root";
    private static final String PSWD = "root";
    private static final String BD = "escuela";
    private static final String URL = "jdbc:mysql://localhost:3306/";
    private Connection conexion;
    
    /**
     * Metodo que permite conectarse a una base de datos
     * @return boolean, true si logro conectarse, false si no se conecto
     */
    public boolean conectar(){
        boolean estado = false;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL+ BD, USUARIO, PSWD);
            
            if(conexion != null){
                estado = true;
                System.out.println("conectado");
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Error1: "+ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Error2: "+ex.getMessage());
        }
        
        return estado;
    }
    
    /**
     * Metodo que permite desconectarse a una base de datos
     */
     public void desconectar(){
        try{
            conexion.close();
            System.out.println("Desconectado");
            
        }catch(SQLException ex){
            System.out.println("Error1:"+ex.getMessage());
        }
    }
     
     /**
      * Metodo que permite consultar los datos de una base de datos
      * @return lista
      * @throws SQLException 
      */
     public ArrayList<Cuenta> consultarCuenta() throws SQLException{
        String query = "select * from alumnos";
        ArrayList<Cuenta> cuentas = new ArrayList<>();
        
        Statement st = conexion.createStatement();
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next()){
            Cuenta cu = new Cuenta();
            cu.setNumCuenta(rs.getString("numCuenta"));
            cu.setNombreCuentahabiente(rs.getString("nombreCuentahabiente"));
            cu.setSaldo(rs.getDouble("saldo"));
            cu.setSucursalApertura(rs.getString("sucursalApertura"));
            cuentas.add(cu);
        }
        return cuentas;
    }
     
     /**
      * Metodo que permite eliminar una cuenta
      */
     public boolean eliminarCuenta(String numCuenta){
        boolean estado = false;
        Statement consultaSQL;
        String q="DELETE FROM cuentas WHERE numCuenta="+"'"+numCuenta+"'";
        //DELETE FROM cuentas WHERE numCuenta='1020'
        try {
            consultaSQL=conexion.createStatement();
            consultaSQL.execute(q);
            estado=true;
          
        } catch (SQLException ex) {
            System.out.println("Error:"+ex.getMessage());
        }
        return estado;
    }
     
     /**
      * Metodo que actualiza la sucursal de una cuenta
      * @params numCuenta, sucursalActualizada
      */
     public boolean actualizarSucursal(String numCuenta, String sucursalAct){
        boolean estado=false;
        Statement consultaSQL;
        String q="UPDATE cuentas SET sucursalApertura="+"'"+sucursalAct+"'"+"WHERE numCuenta="+"'"+numCuenta+"'";
        
        try {
            consultaSQL=conexion.createStatement();
            int r=consultaSQL.executeUpdate(q);
            if(r!=0)
                estado=true;
        } catch (SQLException ex) {
            System.out.println("Error"+ex.getMessage());
        }
        return estado;
    }
}
