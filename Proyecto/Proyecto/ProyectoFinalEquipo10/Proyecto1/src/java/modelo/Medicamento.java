/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * Clase llamada Medicamento, la cual tiene como atributos clave del producto, nombre comercial del medicamento,
 * sustancia activa del medicamento, presentacion del medicamento y via de administracion del medicamento.
 * @author Alvarez Olvera Arturo 
 * @version 27/09/2022.
 */
public class Medicamento {

    private String clave;
    private String nombreComercial;
    private String sustanciaActiva;
    private String presentacion;
    private String viaAdministracion;

     /**
     * Metodo constructor por defecto, sin parametros inicializados.
     */
    public Medicamento() {
    }

    /**
     * Metodo constructor parametrizado, el cual inicializa los atributos de la clase Paciente.
     * @param clave : Inicializa el numero de clave de tipo String.
     * @param nombreComercial: Inicializa el nombre comercial del medicamento de tipo String.
     * @param sustanciaActiva : Inicializa la sustancia activa de tipo String.
     * @param presentacion : Inicializa la presentacion del medicamento de tipo Sring.
     * @param viaAdministracion: Inicializa la variable via de administracion de tipo String
     */
    public Medicamento(String clave, String nombreComercial, String sustanciaActiva, String presentacion, String viaAdministracion) {
        this.clave = clave;
        this.nombreComercial = nombreComercial;
        this.sustanciaActiva = sustanciaActiva;
        this.presentacion = presentacion;
        this.viaAdministracion = viaAdministracion;
    }
    /**
     * Metodo de acceso getter del atributo clave ().
     * @return La clave del medicamento.
     */
    public String getClave() {
        return clave;
    }
    /**
     * Metodo de acceso setter del atributo clave (clave del producto) de la clase Medicamento.
     * @param clave : Establece el valor de clave.
     */
    public void setClave(String clave) {
        this.clave = clave;
    }
    /**
     * Metodo de acceso getter del atributo nombre comercial ().
     * @return Nombre comercial del medicamento.
     */
    public String getNombreComercial() {
        return nombreComercial;
    }
    /**
     * Metodo de acceso setter del atributo nombreComercial (nombre comercial del producto) de la clase Medicamento.
     * @param nombreComercial : Establece el valor del nombre comercial.
     */
    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }
    /**
     * Metodo de acceso getter del atributo sustanciaActiva ().
     * @return Nombre comercial del medicamento.
     */
    public String getSustanciaActiva() {
        return sustanciaActiva;
    }
    /**
     * Metodo de acceso setter del atributo sustanciaActiva (sustancia activa) de la clase Medicamento.
     * @param sustanciaActiva : Establece el valor de la sustancia activa.
     */
    public void setSustanciaActiva(String sustanciaActiva) {
        this.sustanciaActiva = sustanciaActiva;
    }
    /**
     * Metodo de acceso getter del atributo presentacion ().
     * @return Tipo de presentacion del medicamento.
     */
    public String getPresentacion() {
        return presentacion;
    }
    /**
     * Metodo de acceso setter del atributo presentacion (presentacion del producto) de la clase Medicamento.
     * @param presentacion : Establece la presentacion del producto.
     */
    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }
    /**
     * Metodo de acceso getter del atributo viaAdministracion ().
     * @return Via de administracion del medicamento.
     */
    public String getViaAdministracion() {
        return viaAdministracion;
    }
    /**
     * Metodo de acceso setter del atributo viaAdministracion (via de administracion del producto) de la clase Medicamento.
     * @param viaAdministracion : Establece la via de administracion del medicamento.
     */
    public void setViaAdministracion(String viaAdministracion) {
        this.viaAdministracion = viaAdministracion;
    }
    /**
     * Sobreescribe el metodo toString de la clase Object.
     * @return El medicamento y sus atributos de la clase.
     * @see <a href= "https://docs.oracle.com/javase/10/docs/api/java/lang/Object.html">Clase Object</a>
     */
    @Override
    public String toString() {
        return "Medicamento\n" + "clave: " + clave + ", nombreComercial: " + nombreComercial + ", sustanciaActiva: " + sustanciaActiva
                 + ", presentacion: " + presentacion + ", viaAdministracion: " + viaAdministracion;
    }


    
}
