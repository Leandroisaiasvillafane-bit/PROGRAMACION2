
package tp3.ejercicio1;

import java.util.ArrayList;

public class Principal {
    
    public static void main(String[] args) {
    
      ArrayList<Vehiculo> flota = new ArrayList<>();
    
      Motocicleta moto1 = new Motocicleta(1200,"Honda","Tornado",1.5);
              
      Motocicleta moto2 = new Motocicleta(1600,"Yamaha","Racing",2.1);
      
      Motocicleta moto3 = new Motocicleta(1500,"Kawasaki","Ultimate",1.9);
      
      Motocicleta moto4 = new Motocicleta(600,"Zanella","Clasica",1.3);
      
      flota.add(moto1);
      flota.add(moto2);
      flota.add(moto3);
      flota.add(moto4);
      
      Furgoneta Furg1 = new Furgoneta(700,"Renault","Kangoo",3.1);
      
      Furgoneta Furg2 = new Furgoneta(900,"Fiat","Ducato",2.9);
      
      Furgoneta Furg3 = new Furgoneta(1300,"Ford","Transit",3.2);
      
      Furgoneta Furg4 = new Furgoneta(900,"Volkswagen","Caddy",3);
      
      flota.add(Furg1);
      flota.add(Furg2);
      flota.add(Furg3);
      flota.add(Furg4);
    
      for (int i=0; i < flota.size(); i++){
    
          flota.get(i).mostrarDatos();
        }
    }
}
