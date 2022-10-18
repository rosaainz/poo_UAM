/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.util.ArrayList;

/**
 * Esta clase ayuda a instancias tarjetas de debito
 * @author Rosa Sainz
 */
public class Debito extends Tarjeta {
    
    private int numCuentaAsociado;
   

    public Debito(int numCuentaAsociado, String nombreCliente, String fechaExpiracion, int numeroTarjeta, double saldo, String codigoSeguridad) {
        super(nombreCliente, fechaExpiracion, numeroTarjeta, saldo, codigoSeguridad);
        this.numCuentaAsociado = numCuentaAsociado;
    }
    

    public int getNumCuentaAsociado() {
        return numCuentaAsociado;
    }

    public void setNumCuentaAsociado(int numCuentaAsociado) {
        this.numCuentaAsociado = numCuentaAsociado;
    }

    public double saldoTotal(ArrayList<Tarjeta> tarjetas){
        for(ArrayList<Tarjeta> tarjetas: Tarjeta){
            
        }
    }
    @Override
    public String toString() {
        return "Debito{" + "numCuentaAsociado=" + numCuentaAsociado + '}';
    }
    
    
    
}
