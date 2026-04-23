/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.ejercicio4;

public class Libro {
        
    //Atributos
    private String titulo ="SinTítulo";
    private String autor ="Desconocido";
    private String isbm ="XXXXXXXXXXXXX";
    private boolean disponible = true;   
    
    //Constructor
    public Libro(String titulo, String autor, String isbm,boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbm = isbm;
        this.disponible = true; 
    }
        
     //Método para marcar el libro como prestado, si está disponible.
     public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro fue prestado.");
        } 
        else {
            System.out.println("El libro ya está prestado.");
        }
    }
            
     //Marca el libro como disponible.
      public void devolver() {
        disponible = true;
        System.out.println("El libro fue devuelto.");
    }

     // Método para mostrar el título, el autor, el ISBN y el estado del libro.
       public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbm);
        System.out.println("Estado: " + (disponible ? "Disponible" : "Prestado"));
       }
} 


    