/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.ejercicio3;

public class CuentaBancaria {
    
    //Variables de la clase CuentaBancaria
    private String nomTitular="Desconocido";
    private int numCuenta=00000;
    private double saldo=0000;
    
    //Constructor con parametros
    public CuentaBancaria(String nomTitular,int numCuenta,double saldo){
        this.nomTitular=nomTitular;
        this.numCuenta=numCuenta;
        this.saldo=saldo;
    }

    //Método para ver la cuenta.
    public void mostrarCuenta(){
        
        System.out.println("El titular es: " + nomTitular);
        System.out.println("El número de cuenta es: " + numCuenta );
        System.out.println("El saldo es:$ " + saldo);
    }
    
     // Método para mostrar el saldo actual.
    public void consultarSaldo(){
        
        System.out.println("El saldo es:$ " + saldo);
    }
    
    //Método para añadir una cantidad al saldo.
    public void depositar(double importeDeposito){
        
        saldo += importeDeposito;
        System.out.println("$" + importeDeposito + "depositados");
        
   }              
    //Método para retirar una cantidad del saldo (verificando que haya suficiente saldo).
    public void retirar(double importeRetiro){
        
        if(importeRetiro<=saldo){
            if(importeRetiro>=0){
                saldo -= importeRetiro;
                System.out.println("$" + importeRetiro + "retirados");
            }
        }
        else{
            System.out.println("importe de Retiro inválido");
        }
    }   
      
    
    //Getters
    public String getNomTitular() {
        return nomTitular;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    //Setters

    public void setNomTitular(String nomTitular) {
        this.nomTitular = nomTitular;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }    
    
    
}    
       
             
