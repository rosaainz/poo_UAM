/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

import java.io.Serializable;

/**
 * Esta clase llamada Cuenta es la clase abstracta y con herencia. Hereda sus atributos a las clasee de Individio y Empresa
 * tambien el metodo abstracto de calcular Rating
 * @author Alvarez Olvera Arturo, Garcia Sainz Rosa Isabela, Meneses Leon Efren
 * @version 1.10  15/08/2022
 * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/io/Serializable.html">Clase Interface Serializable </a>
 */
public abstract class Cuenta implements Serializable{
    
    private String nomUsuario;
    private String contraseña;
    private int anioReg;
    private int seguidores;

    /**
     * Constructor por defecto sin parametros
     */
    public Cuenta() {
    }

    /**
     * Constructor por parametros
     * @param nomUsuario : Nombre del Usuario
     * @param contraseña: Contraseña del Usuario
     * @param anioReg: Año de registro
     * @param seguidores: Seguidores.
     */
    public Cuenta(String nomUsuario, String contraseña, int anioReg, int seguidores) {
        this.nomUsuario = nomUsuario;
        this.contraseña = contraseña;
        this.anioReg = anioReg;
        this.seguidores = seguidores;
    }

    /**
     * Metodo de acceso(getter) del atributo nomUsuario de la clase Cuenta
     * @return Nombre del usuario
     */
    public String getNomUsuario() {
        return nomUsuario;
    }

    /**
     * Metodo de acceso(setter) del atributo nomUsuario de la clase Cuenta
     * @param nomUsuario : Establece el nombre de usuario.
     */
    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    /**
     * Metodo de acceso(getter) del atributo contraseña de la clase Cuenta
     * @return Contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Metodo de acceso(setter) del atributo contraseña de la clase Cuenta
     * @param contraseña : Establece la contraseña del usuario
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * Metodo de acceso(getter) del atributo Año de Registro de la clase Cuenta
     * @return Año del registro
     */
    public int getAnioReg() {
        return anioReg;
    }

    /**
     * Metodo de acceso(setter) del atributo año de registro de la clase Cuenta
     * @param anioReg : Establece el año de registro
     */
    public void setAnioReg(int anioReg) {
        this.anioReg = anioReg;
    }

    /**
     * Metodo de acceso(getter) del atributo seguidores de la clase Cuenta
     * @return El numero de seguidores
     */
    public int getSeguidores() {
        return seguidores;
    }

    /**
     * Metodo de acceso(setter) del atributo seguidores de la clase Cuenta
     * @param seguidores : Establece el numero de seguidores
     */
    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }
    
    /**
     * Metodo abstracto calcularRating de la clase Cuenta, que servira para las otras clases y obtener el Rating
     * @return Sin retorno, solo es la base del metodo.
     */
    public abstract double calcularRating();
    
    
}
