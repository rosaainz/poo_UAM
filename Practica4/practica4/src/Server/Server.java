/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import practica4.Empresa;
import practica4.Individuo;


/**
 * Clase llamada Server se encarga de estar siempre disponible como una base de datos, de obtener los datos proporcionado por la clase Cliente
 * posteriormente devolder los datos necesarios de lo que solicito el Cliente
 * @author Alvarez Olvera Arturo, Garcia Sainz Rosa Isabela, Meneses Leon Efren
 */
public class Server {

   public static void main(String[] args) {
       /**
        * Creacion de objetos, output, input, serversocket, socke, strings y de las clases Empresa e Individuo.
        * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/io/ObjectInputStream.html">Clase ObjectInputStream </a>
        * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/io/ObjectOutputStream.html">Clase ObjectOutputStream </a>
        * @see <a href = "https://docs.oracle.com/javase/8/docs/api/java/net/ServerSocket.html">Clase ServerSocket </a>
        * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/net/Socket.html">Clase Socket </a>
        * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/lang/String.html">Clase String </a>
        */
        ObjectInputStream oi;
        ObjectInputStream oi1;
        ObjectOutputStream ou;
        ObjectOutputStream ou1;
        ServerSocket server;
        Socket a1;
        Empresa em;
        String r="";
        String s="";
        Individuo ind;     

        /**
         * Instancias creadas para ser ocupadas en el proceso de adquisicion de datos proporcionados por el cliente y la misma devolucion de ellos
         * @see <a href = "https://docs.oracle.com/javase/8/docs/api/java/net/ServerSocket.html">Clase ServerSocket </a>
         * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/io/ObjectInputStream.html">Clase ObjectInputStream </a>
         * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/io/ObjectOutputStream.html">Clase ObjectOutputStream </a>
         */
        try {
            server = new ServerSocket(12345);
            while(true){
            System.out.println("Servidor en espera... ");
            a1=server.accept();
            System.out.println("Aceptado");
            oi = new ObjectInputStream(a1.getInputStream());
            ou = new ObjectOutputStream(a1.getOutputStream());
            oi1 = new ObjectInputStream(a1.getInputStream());
            ou1 = new ObjectOutputStream(a1.getOutputStream());
            
            em=(Empresa) oi.readObject();
            ind=(Individuo) oi1.readObject();
            
            
            s="El rating de la persona es: "+ ind.calcularRating();
            r="El rating de la empresa es: "+ em.calcularRating();
            
            /**
             * Escribe los objetos de salida y entrada
             * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/io/ObjectInputStream.html">Clase ObjectInputStream </a>
             * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/io/ObjectOutputStream.html">Clase ObjectOutputStream </a>
             */
            ou.writeObject(r);
            ou1.writeObject(s);

            /**
             * Cierra los procesos de input, output
             * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/io/ObjectInputStream.html">Clase ObjectInputStream </a>
             * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/io/ObjectOutputStream.html">Clase ObjectOutputStream </a>
             */
            ou.close();
            oi.close();
            a1.close();
            oi1.close();
            ou1.close();
        }
            /**
             * Catchs para mostrar los errores que puedan mostrar al momento de ejecucion y/o obtencion de datos
             * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/io/FileNotFoundException.html">Clase FileNotFoundException </a>
             */
        } catch (FileNotFoundException e1) {
            System.out.println("Error: "+e1.getMessage());
        } catch (IOException e2) {
            System.out.println("Error: "+e2.getMessage());
        } catch (ClassNotFoundException e3) {
            System.out.println("Error: "+e3.getMessage());
        }
    }

 



    
}
