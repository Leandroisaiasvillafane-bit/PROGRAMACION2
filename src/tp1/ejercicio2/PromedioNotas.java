/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1.ejercicio2;

import java.util.Scanner;

public class PromedioNotas {

     public static void main(String[] args) {
         
     System.out.println("Ingrese la primera nota");
     Scanner nota1Scan = new Scanner(System.in);
     float nota1 = nota1Scan.nextFloat();
         
     System.out.println("Ingrese la segunda nota");
     Scanner nota2Scan = new Scanner(System.in);
     float nota2 = nota2Scan.nextFloat();
         
     System.out.println("Ingrese la tercera nota");
     Scanner nota3Scan = new Scanner(System.in);
     float nota3 = nota3Scan.nextFloat();
     
     float suma = nota1+nota2+nota3;
     float promedio = suma/3;
     
     System.out.println("tu promedio es: "+promedio);
     
     if(promedio>=8){
         
         System.out.println("Materia promocionada");
         
     }
     else{
         System.out.println("Materia no promocionada");
     }
     
    }
}
  
