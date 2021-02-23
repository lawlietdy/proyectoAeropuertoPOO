
package Ejemplo;

/**
 *
 * @author rodri
 */
public class VehiculoFurgoneta extends Vehiculo{
    private int carga;
    
    public VehiculoFurgoneta(int carga, String matricula, String marca, String modelo){
        super(matricula, marca, modelo);
        this.carga = carga;
    }
    
    public int getCarga(){
        return carga;
    }
    
    @Override
    public String mostrarDatos(){
        return "\nMarca: " + marca + "\nMatricula: " + matricula + "\nModelo: " + modelo +
                "\nCarga: " + carga; 
    }
}
