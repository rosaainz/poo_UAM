/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


/**
 * Clase llamada empleado que tiene como atributos el numero de empleado, el nombre del empleado, la edad, sexo y el salario.
 * @author Garcia Sains Rosa Isabela
 * @version 27/09/2022
 */
public class Empleado {

    private int numEmpleado;
    private String nombre;
    private int edad;
    private String sexo;
    private double salario;

    /**
     * Metodo constructor por defecto sin parametros.
     */
    public Empleado() {
    }

    /**
     * Metodo constructor parametrizado e inicializado.
     * @param numEmpleado : Inicializa el numero del empleado de tipo String.
     * @param nombre : Inicializa el nombre del empleado de tipo String.
     * @param edad : Inicializa la edad del empleado de tipo int.
     * @param sexo : Inicializa el sexo del empleado de tipo String.
     * @param salario : Inicializa el salario del empleado de tipo double.
     */
    public Empleado(int numEmpleado, String nombre, int edad, String sexo, double salario) {
        this.numEmpleado = numEmpleado;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.salario = salario;
    }

    /**
     * Metodo de acceso getter del atributo numero de empleado.
     * @return El numero del empleado.
     */
    public int getNumEmpleado() {
        return numEmpleado;
    }

    /**
     * Metodo de acceso setter del atributo numero de empleado.
     * @param numEmpleado : Establece el numero de empleado de la clase Empleado.
     */
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    /**
     * Metodo de acceso getter del atributo nombre.
     * @return El nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo de acceso setter del atributo nombre.
     * @param nombre : Establece el nombre de empleado de la clae Empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo de acceso getter del atributo edad.
     * @return Un enter con la edad del empleado.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Metodo de acceso setter del atributo edad.
     * @param edad : Establece un entero para la edad del empleado.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Metodo de acceso getter del atributo sexo.
     * @return una cadena de caracteres la cual contiene el sexo del empleado.
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Metodo de acceso setter del atributo sexo.
     * @param sexo : Establece el sexo del empleado.
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * Metodo de acceso getter del atributo salario.
     * @return Un double con el salario del empleado.
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Metodo de acceso setter del atributo salario.
     * @param salario : Establece el salario del empleado.
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Sobreescribe el metodo toString de la clase Object
     * @return El empleado y sus atributos de la clase en una cadena de caracteres.
     * @see <a href= "https://docs.oracle.com/javase/10/docs/api/java/lang/Object.html">Clase Object</a>
     */
    @Override
    public String toString() {
        return "Empleado\n" + "numEmpleado: " + numEmpleado + ", nombre: " + nombre + ", edad: " + edad + ", sexo: " + sexo + ", salario: " + salario;
    }  
}
