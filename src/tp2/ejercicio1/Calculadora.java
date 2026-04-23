/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.ejercicio1;

public class Calculadora {
    
    public Calculadora(){
            
      } 
    
    public double sumar(double a , double b){
        return a+b;
    }
    public double restar(double a , double b){
        return a-b;
    }
    public double multiplicar(double a , double b){
        return a*b;
    }
    public double dividir(double a , double b){
        
        if(b==0){
            
            System.out.println("Error la división por cero no está definida");
            return 0;
        }
        else{
           return a/b;
        }
    }
}
