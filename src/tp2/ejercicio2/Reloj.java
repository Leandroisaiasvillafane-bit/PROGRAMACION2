/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.ejercicio2;

public class Reloj {
    
    private int hora = 0;
    private int minuto = 0;
    private int segundo = 0;
    
    public Reloj(){
        this.hora=0;
        this.minuto=0;
        this.segundo=0;
    }
    
    public void establecerHora(int h, int m, int s){
        
        if(h>=0 && h<24){
            if(m>=0 && m<60){
                if(s>=0 && s<60){
                    hora=h;
                    minuto=m;
                    segundo=s;       
                }
            }
        }
        
        else{
            
           System.out.println("ingrese otra hora");
      
        }
    }
    
    public void mostrarHora(){
            
      System.out.println("La hora es: " + hora + ":" + minuto + ":" + segundo);
        
    }
    
    public void avanzarSegundo(){
        
        segundo++;
        
        if(segundo==60){
            
            if(minuto==60){
                
                if(hora==24){
                    
                    hora=0;
                }
            }
        } 
    }  
}

            
            
            
            
    

