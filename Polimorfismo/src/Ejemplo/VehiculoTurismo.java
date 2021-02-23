
package Ejemplo;

/**
 *
 * @author rodri
 */
public class VehiculoTurismo extends Vehiculo{
    private int cantidadPuertas;

    public VehiculoTurismo(int cantidadPuertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
    
    public int getCantidadPuertas(){
        return cantidadPuertas;
    }
    
    @Override
    public String mostrarDatos(){
        return "\nMarca: " + marca + "\nMatricula: " + matricula + "\nModelo: " + modelo +
                "\nPuertas: " + cantidadPuertas;       
    }
}
