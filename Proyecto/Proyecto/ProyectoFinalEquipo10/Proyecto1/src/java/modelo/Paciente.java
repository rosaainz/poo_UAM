/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * Clase llamada Paciente, la cual tiene como atributos el Numero de Seguro Social, nombre del paciente y diagnostico del paciente.
 * @author Meneses Leon Efren 
 * @version 27/09/2022.
 */
public class Paciente {
    private String nss;
    private String nombrePaciente;
    private String diagnostico;

    /**
     * Metodo constructor por defecto, es decir, sin parametros inicializados.
     */
    public Paciente() {
    }

    /**
     * Metodo constructor parametrizado, el cual inicializa los atributos de la clase Paciente.
     * @param nss : Inicializa el numero de seguro social de tipo String.
     * @param nombrePaciente : Inicializa el nombre del paciente de tipo String.
     * @param diagnostico : Inicializa el diagnostico del paciente de tipo Sring.
     */
    public Paciente(String nss, String nombrePaciente, String diagnostico) {
        this.nss = nss;
        this.nombrePaciente = nombrePaciente;
        this.diagnostico = diagnostico;
    }

    /**
     * Metodo de acceso getter del atributo nss (Numero de Seguro Social de la clase Paciente).
     * @return El numero de seguro social del paciente.
     */
    public String getNss() {
        return nss;
    }

    /**
     * Metodo de acceso setter del atributo nss (Numero de Seguro Social) de la clase Paciente.
     * @param nss : Establece el valor de nss.
     */
    public void setNss(String nss) {
        this.nss = nss;
    }

    /**
     * Metodo de acceso getter del atributo nombrePaciente.
     * @return El nombre del paciente.
     */
    public String getNombrepaciente() {
        return nombrePaciente;
    }

    /**
     * Metodo de acceso setter del atributo nombrePaciente.
     * @param nombrePaciente : Establece el nombre del paciente.
     */
    public void setNombre(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    /**
     * Metodo de acceso getter del atributo diagnostico.
     * @return El diagnostico del paciente.
     */
    public String getDiagnostico() {
        return diagnostico;
    }

    /**
     * Metodo de acceso setter del atributo diagnostico.
     * @param diagnostico : Establece el diagnostico del paciente.
     */
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    /**
     * Sobreescribe el metodo toString de la clase Object.
     * @return El paciente y sus atributos de la clase.
     * @see <a href= "https://docs.oracle.com/javase/10/docs/api/java/lang/Object.html">Clase Object</a>
     */
    @Override
    public String toString() {
        return "Paciente:\n" + "\nNSS: " + nss + "\nNombre: " + nombrePaciente + "\nDiagnostico: " + diagnostico;
    }
}