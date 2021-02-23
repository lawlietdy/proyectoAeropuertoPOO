
package Ejemplo;

/**
 *
 * @author rodri
 */
public class Principal {
    
    public static void main(String [] args){
        Vehiculo misVehiculos[] = new Vehiculo[4];
    
        misVehiculos[0] = new Vehiculo("GH67", "Ferrari", "A89");
        misVehiculos[1] = new VehiculoTurismo(4, "DJ21", "Mazda", "1200Z");
        misVehiculos[2] = new VehiculoDeportivo(16, "GG21", "Audi", "A8");
        misVehiculos[3] = new VehiculoFurgoneta(2000, "YT112", "Toyota", "Tacoma");
        
        for(Vehiculo vehiculos: misVehiculos){
            System.out.println(vehiculos.mostrarDatos());
    }
    }
    
    
}
