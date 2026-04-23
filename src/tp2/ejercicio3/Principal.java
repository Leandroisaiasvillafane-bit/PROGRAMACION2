/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.ejercicio3;

public class Principal {
    
    public static void main(String[] args){
    
    CuentaBancaria miCuenta = new CuentaBancaria("Leandro",12345,1000);
    
    miCuenta.mostrarCuenta();
    miCuenta.depositar(500);
    miCuenta.consultarSaldo();
    miCuenta.retirar(5000);
    miCuenta.consultarSaldo();
    
    }
}
