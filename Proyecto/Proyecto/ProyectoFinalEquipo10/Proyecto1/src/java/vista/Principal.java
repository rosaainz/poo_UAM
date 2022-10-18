/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import datos.Hospital;
import datos.OperacionBD;
import java.util.ArrayList;
import modelo.Empleado;
import modelo.Medicamento;
import modelo.Paciente;


/**
 * Clase Principal o Main encargada de las instancias y llamada a metodos utilizados
 * @author Alvarez Olvera Arturo, Garcia Sainz Rosa Isela, Meneses Leon Efren
 * @version 08/09/2022
 */
public class Principal {

    /**
     * @param args the command line arguments
     * @see <a href = "https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html">Class ArrayList</a>
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        OperacionBD op = new OperacionBD();
        
        op.conectar();

       // Paciente pac = new Paciente("1234567", "Raul Perez", "Amigdalitis");
        //op.agregarPaciente(pac);
       //op.eliminarEmpleado("278237");
        ArrayList<Empleado> emp= op.consultarEmpleados();
        //
        
        for (Empleado empleado : emp) {
            System.out.println(empleado);
            
        }
           
        op.desconectar();
        
    }
    
}
