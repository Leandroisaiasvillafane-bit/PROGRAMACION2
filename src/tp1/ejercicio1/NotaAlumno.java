package tp1.ejercicio1;

import java.util.Scanner;

public class NotaAlumno { 
    
    public static void main(String[] args) {
     
        Scanner notaScan = new Scanner(System.in);
        
        System.out.println("Ingrese la nota de la materia");
        
        float nota = notaScan.nextFloat();
        
      
        if(nota<4){
            
         System.out.println("Materia desaprobada");
         
        }
        else{
            
            if(nota==10){
                
             System.out.println("Alumno sobresaliente 10");
             
            }
            else{
                
             System.out.println("Materia aprobada");
            
            }
               
        }
    }
    
} 