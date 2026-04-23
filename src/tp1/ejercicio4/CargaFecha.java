
package tp1.ejercicio4;

import java.util.Scanner;

public class CargaFecha {
    
    public static void main(String[] args) {
        
        System.out.println("Ingrese el dia");
        Scanner diaScan = new Scanner(System.in);
        int dia = diaScan.nextInt();
        
        System.out.println("Ingrese el mes");
        Scanner mesScan = new Scanner(System.in);
        int mes = mesScan.nextInt();
        
        System.out.println("Ingrese el año");
        Scanner añoScan = new Scanner(System.in);
        int año = añoScan.nextInt();
        
        int cuatrimestre = 0;
        
        if(mes<=0){
                
          mes=13;
  
        }
        
        if(mes<=3){
            cuatrimestre = 1;
        }      
        else{
            if(mes<=6){
            cuatrimestre = 2;
            }
            else{
                
                if(mes<=8){
                 cuatrimestre = 3;
                }
                else{
                    if(mes<=12){
                     cuatrimestre = 4;
                    }
                    else{
                     cuatrimestre = 5;  
                    }
                
                }
            }
            
        }
                
        switch(cuatrimestre){ 
           case 1:
               System.out.println("dia:"+ dia + " " + "mes:" + mes + " " + "año:" + año);
               System.out.println("Corresponde al primer cuatrimestre del año "+año);
               break;
               
           case 2:
               System.out.println("dia:"+ dia + " " + "mes:" + mes + " " + "año:" + año);
               System.out.println("Corresponde al segundo cuatrimestre del año "+año);              
               break;
               
           case 3:
               System.out.println("dia:"+ dia + " " + "mes:" + mes + " " + "año:" + año);
               System.out.println("Corresponde al tercer cuatrimestre del año "+año);
               break;
               
           case 4:
               System.out.println("dia:"+ dia + " " + "mes:" + mes + " " + "año:" + año);
               System.out.println("Corresponde al cuarto cuatrimestre del año "+año);
               break;
               
           default:
                System.out.println("Error al ingresar las fechas");
             
        }
    }          
}
                
        
        
    
    
    
    

