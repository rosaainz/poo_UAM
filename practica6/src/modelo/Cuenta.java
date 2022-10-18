/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Alumno
 */
public class Cuenta {
    private String numCuenta;
    private String nombreCuentahabiente;
    private double saldo;
    private String sucursalApertura;
    
    public Cuenta(){
    }

    public Cuenta(String numCuenta, String nombreCuentahabiente, double saldo, String sucursalApertura) {
        this.numCuenta = numCuenta;
        this.nombreCuentahabiente = nombreCuentahabiente;
        this.saldo = saldo;
        this.sucursalApertura = sucursalApertura;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getNombreCuentahabiente() {
        return nombreCuentahabiente;
    }

    public void setNombreCuentahabiente(String nombreCuentahabiente) {
        this.nombreCuentahabiente = nombreCuentahabiente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getSucursalApertura() {
        return sucursalApertura;
    }

    public void setSucursalApertura(String sucursalApertura) {
        this.sucursalApertura = sucursalApertura;
    }

    @Override
    public String toString() {
        return "Cuenta" + "numCuenta:" + numCuenta + ", nombreCuentahabiente:" + nombreCuentahabiente + ", saldo:" + saldo + ", sucursalApertura:" + sucursalApertura;
    }
    
    
}
