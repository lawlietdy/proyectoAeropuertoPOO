
package ClasesYObjetos;

/**
 *
 * @author rodri
 */
public class Persona {
    // Atributos
    
    String nombre;
    int edad;
    
    // Métodos constructores no se pone tipo de valor de retorno
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrarDatos(){
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad);
    }
}
