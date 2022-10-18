/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoratest;

import mx.uam.azc.Calculadora;

/**
 *
 * @author Alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double arr [] = {1.0,2.5,3.0,4.5,5.5};
        int arr2[] = {1,2,3,4,5,5};
        
        Calculadora cal = new Calculadora();
        System.out.println(cal.fibonacci(14));
    }
    
}
