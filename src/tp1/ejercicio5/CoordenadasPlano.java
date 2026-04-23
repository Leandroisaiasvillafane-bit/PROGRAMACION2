/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1.ejercicio5;

import java.util.Scanner;

public class CoordenadasPlano {
    
    public static void main(String[] args) {
        
        System.out.println("Ingrese la coordena en X");
        Scanner coorXScan = new Scanner(System.in);
        float coorX = coorXScan.nextFloat();
        
        System.out.println("Ingrese la coordena en Y");
        Scanner coorYScan = new Scanner(System.in);
        float coorY = coorYScan.nextFloat();
        
        if(coorX>0){
            
           if(coorY>0){
                System.out.println("Segundo cuadrante");
           }
           if(coorY<0){
                System.out.println("Cuarto cuadrante");
           }
           if(coorY==0){
                System.out.println("Punto en el eje X");
           }
                      
        }
        if(coorX<0){
            
            if(coorY<0){
                System.out.println("Tercer cuadrante");
            }
            if(coorY>0){
                System.out.println("Primer cuadrante");
            }
            if(coorY==0){
                System.out.println("Punto en el eje X");
           }
            
        }        
        
        if(coorX==0){
            
            if(coorY==0){
                
              System.out.println("Centro de coordenadas");
            }
            if(coorY<0){
                
              System.out.println("Punto en el eje Y");
            }
            if(coorY>0){
                
              System.out.println("Punto en el eje Y");
            }
   
        }                      
    }                    
}
           
        
        
        
           

    
    
    
    
    

