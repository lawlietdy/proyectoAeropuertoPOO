
package ejemplo;

/**
 *
 * @author rodri
 */
public class Main {
    public static void main(String []args){
        Planta planta = new Planta();
        AnimalCarnivoro perro = new AnimalCarnivoro();
        planta.alimentarse();
        perro.alimentarse();
    }
}
