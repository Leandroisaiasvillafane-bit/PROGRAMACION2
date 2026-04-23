/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.ejercicio4;

public class Principal {
    
    public static void main(String[] args) {
        
        Libro unLibro1 = new Libro("Hobbit", "J.R.R. Tolkien", "978-0345339683",true);
        
        unLibro1.mostrarInformacion();

        unLibro1.prestar();
        
        unLibro1.mostrarInformacion();

        unLibro1.devolver();
        
        unLibro1.mostrarInformacion();
    }
}
        
    
    
    

