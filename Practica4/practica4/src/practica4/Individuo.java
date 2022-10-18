/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Clase llamada Individuo la cual hereda los atributos y el metodo abstracto calcularRating de la super clase Cuenta
 * @author Alvarez Olvera Arturo, Garcia Sainz Rosa Isabela, Meneses Leon Efren
 * @see <a href = "https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/class-use/ArrayList.html">Clase ArrayList </a>
 * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/io/Serializable.html">Clase Serializable </a>
 */
public class Individuo extends Cuenta implements Serializable{
    
    private ArrayList<String> mensajes;

    /**
     * Metodo constructor por defecto si parametros
     */
    public Individuo() {
    }

    /**
     * Metodo constructor por parametros propios y heredados de la super clase Cuenta
     * @param nomUsuario : Nombre del usuario
     * @param contraseña : Contraseña
     * @param anioReg : Año de registro
     * @param seguidores : Seguidores 
     */
    public Individuo(String nomUsuario, String contraseña, int anioReg, int seguidores) {
        super(nomUsuario, contraseña, anioReg, seguidores);
        this.mensajes= new ArrayList<>();
    }

    /**
     * Metodo de acceso(getter) del atributo mensajes de la clase Individuo
     * @return : Mensajes de los seguidores
     */
    public ArrayList<String> getMensajes() {
        return mensajes;
    }

    /**
     * Metodo de acceso(setter) del atributo mensajes de la clase Individuo
     * @param mensajes : Establece los mensajes al ArrayList
     */
    public void setMensajes(ArrayList<String> mensajes) {
        this.mensajes = mensajes;
    }
    
    /**
     * Metodo que sirve para anexar mensajes a la lista de Arrays.
     * @param mensaje : Agrega mensajes al ArrayList
     */
    public void postearMensaje(String mensaje){
        mensajes.add(mensaje);
    }

    /**
     * Metodo abstracto que calcula el Rating mediante la division de el numero total de mensajes entre los seguidores.
     * @return El rating dado en decimal.
     * @see <a href = "https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html">Clase ArrayList </a>
     */
    @Override
    public double calcularRating() {
        
        double tamArreglo= (double)mensajes.size();
        double seg=(double)super.getSeguidores();
        
        return tamArreglo/seg;
    }
    
    
}
