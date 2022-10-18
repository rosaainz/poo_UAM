/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uam.azc;

/**
 * Clase que realiza operaciones aritmeticas con metodos polimorficos
 * @version 1.0
 * @author Equipo 10
 */
public class Calculadora {
    
    /**
     * Metodo que suma dos numeros enteros
     * @param x primer parametro 
     * @param y parametro que se adiciona al primer parametro
     * @return un entero con la suma de los dos paranmetros
     */
    public int sumar(int x, int y){
        return x+y;
    }
    
    /**
     * Metodo que suma tres numeros enteros
     * @param x primer numero entero
     * @param y parametro que se adiciona al primer parametro
     * @param z parametro que se adiciona a la suma de los dos primeros numeros
     * @return un entero con la suma de los tres paranmetros
     */
    public int sumar(int x, int y, int z){
        return x+y+z;
    }
    
    /**
     * Metodo que suma un arreglo de numeros enteros
     * @param numeros parametro de numeros enteros
     * @return la suma del arreglo de numeros enteros
     */
    public int sumar(int[] numeros){
        int suma=0;
        for(int i = 0; i< numeros.length; i++){
            suma += numeros[i];
        }
        return suma ;
    }
    
    /**
     * Metodo que suma dos cadenas de String
     * @param palabra1 primer String a concatenar
     * @param palabra2 segundo String a concatenar
     * @return palabra1 concatenada a la palabra2
     */
   public String sumar(String palabra1, String palabra2 ){
      return palabra1 +" "+ palabra2;
    }
   
   /**
    * Metodo que suma tres cadenas de String
    * @param palabra1 primer String a concatenar
    * @param palabra2 segundo String a concatenar
    * @param palabra3 tercer String a concatenar
    * @return palabra1, palabra2 y plabra3 concatenada
    */
   public String sumar(String palabra1, String palabra2, String palabra3 ){
      return palabra1 +" "+ palabra2 +" "+ palabra3;
    }
   
   /**
    * Metodo que suma dos numeros de tipo double
    * @param x primer parametro 
    * @param y segundo parametro que se adiciona al primer parametro
    * @return la suma de dos numeros doubles
    */
   public double sumar(double x, double y){
        return x+y;
    }
   
   /**
    * Metodo que suma tres numeros de tipo double
    * @param x primer parametro 
    * @param y segundo parametro que se adiciona al primer parametro
    * @param z segundo parametro que se adiciona al segundo parametro
    * @return la suma de tres numeros dobles
    */
   public double sumar(double x, double y, double z){
        return x+y+z;
    }
   
   
   /**
    * Metodo que suma los valores de un arreglo de tipo double
    * @param numeros un arreglo de numero double
    * @return la suma del arreglo
    */
    public double sumar(double[] numeros){
        double suma=0;
        for(int i = 0; i< numeros.length; i++){
            suma += numeros[i];
        }
        return suma ;
    }
   
    /**
     * Metodo que suma dos numeros de tipo float
     * @param x primer parametro
     * @param y parametro que se adiciona al primer parametro
     * @return la suma de los numeros flotantes
     */
    public float sumar(float x, float y){
        return x+y;
    }
    
    
    /**
     * Metodo que suma tres numeros de tipo float
     * @param x primer parametro 
     * @param y paramatro a adicionar con el primer parametro
     * @param z paramatro a adicionar con el segundo parametro
     * @return la suma de los tres parametros
     */
    public float sumar(float x, float y, float z){
        return x+y+z;
    }
    
    /**
     * Metodo que suma un arreglo de numeros flotantes
     * @param numeros arreglo de numeros flotantes
     * @return suma del arreglo de numeros flotantes
     */
    public float sumar(float[] numeros){
        float suma=0;
        for(int i = 0; i< numeros.length; i++){
            suma += numeros[i];
        }
        return suma ;
    }
    
    
    /**
     * Metodo que resta dos numeros enteros
     * @param x primer parametro
     * @param y segundo parametro a restar 
     * @return resta de los dos parametros
     */
    public int restar(int x, int y){
        return x-y;
    }
    
    /**
     * Metodo que resta dos numeros dobles
     * @param x primer parametro
     * @param y segundo parametro a restar
     * @return resta de los dos parametros 
     */
    public double restar(double x, double y){
        return x-y;
    }
    
    /**
     * Metodo que resta tres numeros flotantes
     * @param x primer parametro 
     * @param y segundo parametro a restar del primer parametro
     * @param z tercer paramero a restar
     * @return resta de los tres parametros
     */
    public float restar(float x, float y, float z){
        return x-y-z;
    }
    
    /**
     * Metodo que multiplica dos enteros
     * @param x primer entero
     * @param y 2do entero a multiplicar
     * @return multiplicacion de los dos enteros
     */
    public int multiplicar(int x, int y){
        return x*y;
    }
    
    /**
     * Metodo que multiplica dos numeros dobles
     * @param x primer doble
     * @param y segundo numero a multiplicar
     * @return multiplicacion de los dos numeros dobles
     */
    public double multiplicar(double x, double y){
        return x*y;
    }
    
    /**
     * Metodo que multiplica tres numeros flotantes
     * @param x 1er flotante
     * @param y 2do flotante
     * @param z 3er flotante 
     * @return multiplicacion de los tres numeros flotantes
     */
    public float multiplicar(float x, float y, float z){
        return x*y*z;
    }
    
    /**
     * Metodo que divide dos numeros dobles
     * @param x 1er numero
     * @param y 2do numero
     * @return division de dos numeros doubles
     */
    public double dividir(double x, double y){
        if(y==0){
            return 0;
        }else{
            return x/y;
        }
    }
    
    /**
     * Metodo que divide dos numeros enteros
     * @param x 1er parametro
     * @param y 2do parametro
     * @return division de dos numeros enteros
     */
    public int dividir(int x, int y){
        if(y==0){
            return 0;
        }else{
            return x/y;
        }
    }
    
    /**
     * Metodo que divide dos numeros flotantes
     * @param x 1er parametro
     * @param y 2do parametro
     * @return division de dos numeros flotantes
     */
    public float dividir(float x, float y){
        if(y==0){
            return 0;
        }else{
            return (float)x/y;
        }
    }
   
    /**
     * Metodo que obtiene el factorial de un numero entero
     * @param n numero entero a calcular el factorial
     * @return factorial de un numero entero
     */
    public int factorial(int n){
         int f=1;
         for(int i=1; i<=n; i++){
             f = f * i;
         }
         return f;
    }
    
    /**
     * Metodo que regresa el numero potenciado 
     * @param base numero base
     * @param exponente potencia
     * @return numero elevado a la potencia
     */
    public long potencia(int base, int exponente){
        long resultado = 1;
        for(int i = 1; i <= exponente; i++){
             resultado = resultado * base;
        }
        return resultado;
    }
    
    /**
     * Metodo que calcula la sucesion de fibonacci de manera recursiva
     * @param n numero entero a calcular su serie fibonacci
     * @return n-enesimo numero de la sucesion fibonacci
     */
    public long fibonacci(int n){
        if(n==1){
            return 1;
        }else if(n==0){
            return 0;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
        }
       
}
