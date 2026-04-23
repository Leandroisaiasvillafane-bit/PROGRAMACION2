/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1.ejercicio3;

import java.util.Scanner;

public class DigitosNumero {
    
    public static void main(String[] args) {
        
        System.out.println("Ingrese el numero del 1 al 99");
        Scanner numeroScan = new Scanner(System.in);
        int numero = numeroScan.nextInt();
        
        if(numero<=99){
              
         if(numero>=1){
            
             if(numero>=10){
            
                 System.out.println("El numero tiene 2 digitos");
            
                } 
             else{
              
                 System.out.println("El numero tiene un digito"); 
            
                }   
            }
            else{
                
              System.out.println("Error ingrese un numero entero del 1 al 99");
                 
            }
        }
        else{
            
          System.out.println("Error ingrese un numero entero del 1 al 99");
            
        }
    }
}


