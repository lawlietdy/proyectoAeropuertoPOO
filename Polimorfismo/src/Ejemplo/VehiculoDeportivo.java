
package Ejemplo;

/**
 *
 * @author rodri
 */
public class VehiculoDeportivo extends Vehiculo{
    private int cilindrada;
    public VehiculoDeportivo(int cilindrada, String matricula, String marca, String modelo){
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }
    
    public int getCilindrada(){
        return cilindrada;
    }
    
    @Override
    public String mostrarDatos(){
        return "\nMarca: " + marca + "\nMatricula: " + matricula + "\nModelo: " + modelo +
                "\nCilindrada: " + cilindrada;       
    }
}
