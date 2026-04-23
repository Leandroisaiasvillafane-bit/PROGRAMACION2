/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1.ejercicio6;

import java.util.Scanner;

public class TriángulosClasificación {
    
    public static void main(String[] args) {
        
       int cantTriEscalenos = 0;
       int cantTriIsoceles = 0;
       int cantTriEquilateros = 0;
    
        System.out.println("Ingrese cantidad de triangúlos a analizar");
        Scanner numTriScan = new Scanner(System.in);
        int numTri = numTriScan.nextInt();
                  
        for(int i=0; i<numTri; i++){
            
            System.out.println("Ingrese el primer lado");
            Scanner lado1Scan = new Scanner(System.in);
            float lado1 = lado1Scan.nextFloat();
        
            System.out.println("Ingrese el segundo lado");
            Scanner lado2Scan = new Scanner(System.in);
            float lado2 = lado2Scan.nextInt();
        
            System.out.println("Ingrese el tercer lado");
            Scanner lado3Scan = new Scanner(System.in);
            float lado3 = lado3Scan.nextInt();
        
            if(lado1==lado2||lado1==lado3||lado2==lado3){
            
                if(lado1!=lado3||lado1!=lado2||lado2!=lado1){
                    System.out.println("Tu triángulo es Isoceles");
                    cantTriIsoceles = cantTriIsoceles + 1;
                }         
            }
            else{
            
                 System.out.println("Tu triángulo es Escaleno");
                  cantTriEscalenos = cantTriEscalenos + 1;
          
            }  
           
             if(lado1==lado2 && lado2==lado3){
            
                 System.out.println("Tu triángulo es Equilatero");
                 cantTriEquilateros = cantTriEquilateros + 1;
                 
            }           
        }              
          
        
      System.out.println("Cantidad de triángulos Isoceles: " + cantTriIsoceles);
      System.out.println("Cantidad de triángulos Escalenos: " + cantTriEscalenos);
      System.out.println("Cantidad de triángulos Equilateros: " + cantTriEquilateros);
          
     if(cantTriIsoceles<cantTriEquilateros){ 
         
         if(cantTriEscalenos<cantTriIsoceles){
             
             System.out.println("La menor cantidad de triangulos son Escalenos:" + cantTriEscalenos);
             
            }
           else{
             
             System.out.println("La menor cantidad de triangulos son Isoceles:" + cantTriIsoceles);
             
            }               
       }
       else{
         
          if(cantTriEscalenos<cantTriEquilateros){
            
             System.out.println("La menor cantidad de triangulos son Escalenos:" + cantTriEscalenos);
                              
            }
            else{
            
              System.out.println("La menor cantidad de triangulos son Equilateros:" + cantTriEquilateros);
            
           }        
       }                
    }
}                           
               

    

