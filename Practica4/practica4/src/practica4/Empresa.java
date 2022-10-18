/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

import java.io.Serializable;
import java.time.LocalDate;
/**
 * Esta clase llamada Empresa hereda de la clase padre Cuenta, tanto sus atributos como el metodo abstracto calcularRating
 * @author Alvarez Olvera Arturo, Garcia Sainz Rosa Isabela, Meneses Leon Efren
 * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/io/Serializable.html">Clase Serializable </a>
 */
public class Empresa extends Cuenta implements Serializable{
    
    private String duenio;

    /**
     * Metodo constructor por defecto sin parametros
     */
    public Empresa() {
    }

    /**
     * Metodo constructor parametrizado junto con loa atributos heredados de la clase padre Cuenta
     * @param duenio : Dueño de la empresa
     * @param nomUsuario : Nombre de usuario
     * @param contraseña : Contraseña
     * @param anioReg : Año de registro
     * @param seguidores : numero de seguidores
     */
    public Empresa(String duenio, String nomUsuario, String contraseña, int anioReg, int seguidores) {
        super(nomUsuario, contraseña, anioReg, seguidores);
        this.duenio = duenio;
    }

    /**
     * Metodo de acceso(getter) del atributo duenio de la clase Empresa
     * @return El nombre dueño de la empresa
     */
    public String getDuenio() {
        return duenio;
    }

    /**
     * Metodo de acceso(setter) del atributo duenio de la clase Empresa
     * @param duenio : Establece el nombre del dueño de la empresa
     */
    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }
    
    /**
     * Metodo abstracto hereado de la clase Cuenta, el cual se encarga de calcular el rating, calcula los años de antiguedad de la empresa y los divide entre 
     * el numero de seguidores
     * @return el rating division de los años de la empresa entre el numero de seguidores
     * @see <a href = "https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html">Class LocalDate </a>
     */
    @Override
    public double calcularRating() {
        double anti;
        LocalDate hoy = LocalDate.now();
        double h= (double) hoy.getYear();
        double ar=(double) super.getAnioReg();
        anti = h-ar;
        
        double seg = (double) super.getSeguidores();
        
        double r=anti/seg;
        
        if(seg==0){
            r=0;
        }
        
        return r;
    }
    

}
