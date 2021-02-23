
package ClasesYObjetos;

/**
 *
 * @author rodri
 */
public class Persona {
    // Atributos
    
    String nombre;
    int edad;
    String dni;

    public Persona(String dni) {
        this.dni = dni;
    }
    
    // La sobrecarga de constructores es cuando existe mas de un constructor de la misma clase
    // Métodos

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void correr(){
        System.out.println("Soy " + nombre + " tengo " + edad + " años  y estoy corriendo");
    }
    
    // Se diferencian por la cantidad de paramatros y por el tipo de parametro
    public void correr(int km){
        System.out.println("He corrido tantos " + km + " kilometos");
    }

}
