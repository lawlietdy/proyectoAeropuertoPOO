
package Ejemplo;

/**
 *
 * @author rodri
 */
public class Vehiculo {
    protected String matricula;
    protected String marca;
    protected String modelo;
    
    public Vehiculo(String matricula, String marca, String modelo){
        this.marca = marca;
        this.matricula = matricula;
        this.modelo = modelo;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public String mostrarDatos(){
        return "\nMarca: " + marca + "\nMatricula: " + matricula + "\nModelo: " + modelo;
    }
}
