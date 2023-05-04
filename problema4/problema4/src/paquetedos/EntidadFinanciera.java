/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;
import paquetedos.EntidadFinanciera;
/**
 *
 * @author Italo
 */
public class EntidadFinanciera {
    
    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comisionBanco;
    
public EntidadFinanciera() {
        nombreCliente = "Luis Morales";
        nombreBanco = "Banco de Loja";
        valorCheque = 5200.40;
        

    }   
public EntidadFinanciera(String nom, String banc,double valorChe) {

        nombreCliente = nom;
        nombreBanco = banc;
        valorCheque = valorChe;
        
    }   
public void establecerNombreCliente(String c) {
        nombreCliente = c;
    }

    public void establecerNombreBanco(String c) {
        nombreBanco = c;
    }

    public void establecerValorCheque(double s) {
        valorCheque = s;
    }
    
    public void calcularComisionBanco() {
        comisionBanco = valorCheque * 0.00003;
    }
    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public String obtenerNombreBanco() {
        return nombreBanco;
    }

    public double obtenerValorCheque() {
        return valorCheque;
    }

    public double obtenerComisionBanco() {
        return comisionBanco;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("El cheque emitido a favor de:\n"
                + "Nombre : %s\n"
                + "Nombre del Banco : %s\n"
                + "Por el valor de: %.2f\n"
                + "Con una comisión del banco: %.2f\n",
                obtenerNombreCliente(),
                obtenerNombreBanco(),
                obtenerValorCheque(),
                obtenerComisionBanco());
        return cadena;
    }
}
