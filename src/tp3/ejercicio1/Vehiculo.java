
package tp3.ejercicio1;

public abstract class Vehiculo {
    
    protected String marca ;
    protected String modelo;
    protected double tasaBase;

    protected Vehiculo(String marca, String modelo, double tasaBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.tasaBase = tasaBase;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getTasaBase() {
        return tasaBase;
    }

    public void setTasaBase(double tasaBase) {
        this.tasaBase = tasaBase;
    }

    public abstract void mostrarDatos();
    
    
    
    
}
