
package Ejemplo;

/**
 *
 * @author rodri
 */
public class Persona extends Animal {
    
    
    @Override   // Esta palabra significa que estamos sobreescribiendo el metodo de la superclase
    public void comer(){
        System.out.println("Estoy comiendo sentado en la mesa y con cubiertos");
    }
}
