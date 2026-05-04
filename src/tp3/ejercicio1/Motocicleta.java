
package tp3.ejercicio1;

public class Motocicleta extends Vehiculo {
    
    private double cilindrada ;

    public Motocicleta(double cilindrada, String marca, String modelo, double tasaBase) {
        super(marca, modelo, tasaBase);
        this.cilindrada = cilindrada;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarDatos(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cilindrada: " + cilindrada + "cc");
        System.out.println("Tarifa base: " + tasaBase + "%");
        System.out.println("");
    }

    
    
}
