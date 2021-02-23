
package Herencia;

/**
 *
 * @author rodri
 */
public class Estudiante extends Persona{
    // Estudiante hereda de la clase persona
    private int codigoEstudiante;
    private float notaFinal;
    
    // Constructor de la clase Estudiante
    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal){
        super(nombre, apellido, edad); // Se dice que ya estan inicializados en la super clase
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: " + getNombre()); // El atributo protected permite que sea accesible por subclases
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Codigo de estudiante: " + codigoEstudiante);
        System.out.println("notaFinal: " + notaFinal);
    }
}
