/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase llamada cliente, la que solicita el servicio de una clase exterior como lo es la clase Server, para finalmente obtener respuesta.
 * @author Alvarez Olvera Arturo, Garcia Sainz Rosa Isabela, Meneses Leon Efren
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        
        /**
         * Creacion de instancias, con su llenado de parametros
         */
    Empresa p = new Empresa("Luis Castro","apellido_alumno2", "123", 2018, 3);
    //Individuo in= new Individuo("apellido_alumno1","123", 2013,3);
    //in.postearMensaje("elecciones");
    //in.postearMensaje("junio");        
        
    
    /**
     * Creacion de los objetos
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/io/ObjectInputStream.html">Clase ObjectInputStream </a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/io/ObjectOutputStream.html">Clase ObjectOutputStream </a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/net/Socket.html">Clase Socket </a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/lang/String.html">Clase String </a>
     */
        ObjectOutputStream os = null;
        ObjectInputStream en;
        Socket cliente;
        String r = " ";
        
        /**
         * Instacia los objetos como cliente, socket, output, input a ser utilizados, escritos y de lectura
         * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/io/FileNotFoundException.html">Clase FileNotFoundException </a>
         * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/io/IOException.html">Clase IOException </a>
         * @see <a href = "https://docs.oracle.com/javase/8/docs/api/java/util/logging/class-use/Level.html">Clase Logging Level </a>
         * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/util/logging/Logger.html">Clase Logger </a>
         */
        try {
            cliente=new Socket("localhost",12345);
            os = new ObjectOutputStream(cliente.getOutputStream());
            en= new ObjectInputStream(cliente.getInputStream());
            os.writeObject(p);
            System.out.println("Objeto serializado...");
            r = (String) en.readObject();
            System.out.println("La respuesta es... \n" + r);
            
            /**
             * Cierra el proceso de serealizacion en cada uno de los objetos instanciados
             */
            en.close();
            cliente.close();
            os.close();
            
            /**
             * Catchs para mostrar los errores que puedan mostrar al momento de ejecucion y/o obtencion de datos
             * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/io/FileNotFoundException.html">Clase FileNotFoundException </a>
             */
        } catch (FileNotFoundException e1) {
            System.out.println("Error " + e1.getMessage());
        } catch (IOException e2) {
            System.out.println("Error " + e2.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
    
}
