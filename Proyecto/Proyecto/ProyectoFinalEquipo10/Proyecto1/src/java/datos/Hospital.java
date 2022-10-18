/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;
import modelo.Empleado;
import modelo.Medicamento;
import modelo.Paciente;

/**
 * Clase llamada Hospital que contiene metodos que involucran obtener lista de paciente que su diagnostico inica con vocal, 
 * obtener el numero de empleados de acuerdo a su sexo, promedio de edades de los empleados, empleados con mayor y menor salario y 
 * numero de medicamentos de acuerdo a su tipo de presentacion.
 * @author Alvarez Olvera Arturo, Garcia Sainz Rosa Isela, Meneses Leon Efren
 * @version 27/09/2022
 */
public class Hospital {
    
    private ArrayList<Empleado> empleados;
    private ArrayList<Medicamento> medicamentos;
    private ArrayList<Paciente> pacientes;

     /**
     * Metodo constructor que tiene como parametro tres ArrayList
     * @see <a href = "https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html">Class ArrayList</a>
     */
    public Hospital() {
        this.empleados = new ArrayList<>();
        this.medicamentos = new ArrayList<>();
        this.pacientes = new ArrayList<>();
    }

     /**
     * Metodo constructor que contiene un ArrayList de la clase Empleado, uno de la clase Medicamento y uno de la clase Paciente.
     * @param empleados : inicializa el ArrayList dinamico de empleados
     * @param medicamentos : inicializa el ArrayList dinamico de medicamentos
     * @param pacientes : inicializa el ArrayList dinamico de pacientes
     * @see <a href = "https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html">Class ArratList</a>
     */
    public Hospital(ArrayList<Empleado> empleados, ArrayList<Medicamento> medicamentos, ArrayList<Paciente> pacientes) {
        this.empleados = empleados;
        this.medicamentos = medicamentos;
        this.pacientes = pacientes;
    }
    
    /**
     * Metodo para obtener un ArrayList los pacientes los cuales sus diagnosticos comienzancon vocal.
     * 
     * @return Un array con los pacientes que sus diagnosticos comienzan con alguna vocal
     * @see <a href = "https://docs.oracle.com/cd/E57185_01/HIRUG/ch32s08s02s05.html">charAt Verificar primera letra del String</a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/lang/Character.html#toUpperCase(char)">Poner el caracter en mayuscula en caso de que no este</a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/lang/Character.html#toString(char)">convertir el caracter en un string</a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#matches(java.lang.String)">comparar el string con alguna vocal</a>
     */
    
    public ArrayList<Paciente> obtenerPacientesVocal(){
        
         ArrayList<Paciente> pac1= new ArrayList<>();
        
        for (Paciente paciente : pacientes) {
            char in;
            in=paciente.getDiagnostico().charAt(0);
            char inM=Character.toUpperCase(in);
         if(Character.toString(inM).matches("[AEIOU]")){
             pac1.add(paciente);
         }
        }
        
        return pac1;
    }
    
    /**
     * Metodo encargado de obtener el numero de empleados de sexo femenino y masculino mediante el atributo sexo de tipo String.
     * @param sexo Establece el sexo del empleado.
     * @return un entero el cual da el numero de empleados tanto de sexo femenino como masculino.
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/lang/String.html">Clase String Funcion equalsIgnoreCaset</a>
     */
    public int obtenerEmpleadosSexo(String sexo){
        
        int emp=0;
        
        for (Empleado empleado : empleados) {
            String sex=empleado.getSexo();
            if(sex.equalsIgnoreCase(sexo)){
                emp++;
            }
            
        }
        return emp;
    }    
    
    /**
     * Metodo que obtiene el promedio de edades de los empleados.
     * @return Un double que es el promedio de las edades de los empleados.
     * @see <a href = "https://docs.oracle.com/javase/10/docs/api/javafx/css/Size.html">Class Size</a>
     */
    public double obtenerPromedioEdades(){
        
        double prom=0;
        double promE=0;
        
        for (Empleado empleado : empleados) {
            
             prom+=empleado.getEdad();
            
        }
        promE=prom/empleados.size();
        return promE;
    }
    
    /**
     * Metodo para obtener los empleados que tengan un salario mayor y uno menor.
     * @param a : Establece a de tipo string el cual sera utilizado para comparar.
     * @return Una cadena de caracteres con el empleado de mayor y menor salario.
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/lang/String.html">Clase String Funcion equalsIgnoreCaset</a>
     */
    public String obtenerEmpleadoMenorOMayorSald(String a){
        
        if(a.equalsIgnoreCase("menor")){
            return empleados.get(empleados.size()-1).getNombre();
        }else{
            return empleados.get(0).getNombre();
        }
    }
    
    /**
     * Metodo el cual regresa el numero de medicamentos de acuerdo al tipo seleccionado.
     * @param tipo: tipo de presentacion del medicamento
     * @return numero de medicamentos de acuerdo al tipo del parametro.
     * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#equalsIgnoreCase(java.lang.String)">Comparar el 
     * tipo de medicamento ignorando si son mayusculas o minusculas</a>
     */
    public int obtenerTipoMedicamento(String tipo){
        int med=0;
        
        for (Medicamento medicamento : medicamentos) {
            if(medicamento.getPresentacion().equalsIgnoreCase(tipo))
                med++;
        }
        
        return med;
    }
    
}

