
package tp3.ejercicio1;

public class Furgoneta extends Vehiculo{
    
    private double capCarga ;

    public Furgoneta(double capCarga, String marca, String modelo, double tasaBase) {
        super(marca, modelo, tasaBase);
        this.capCarga = capCarga;
    }

    @Override
    public void mostrarDatos(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Capacidad de carga: " + capCarga + "kg");
        System.out.println("Tarifa base: " + tasaBase + "%");
        System.out.println("");
        
    }

   

    

   

    
    
    
}
