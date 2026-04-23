/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.ejercicio1;

public class Principal {
    
    public static void main(String[] args){  
        
        Calculadora miCal = new Calculadora();
        
        double suma= miCal.sumar(5,3);
        System.out.println("Suma: "+ suma); 
        
        double resta= miCal.restar(5,3);
        System.out.println("Resta: "+ resta);
        
        double multiplicación= miCal.multiplicar(5,3);
        System.out.println("Multiplicación: "+ multiplicación);
        
        double división= miCal.dividir(5,3);
        System.out.println("División: "+ división);
        
    }   
}
