// Como crear una ventana
// Heredar la clase JFrame
package Ventana;

import javax.swing.JFrame;

public class Ventana extends JFrame{
    
    public Ventana(){
        setSize(500, 500); // Se establece el tamano de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Finaliza el programa al cerrar la ventana
        setTitle("Ejemplo Ventana"); // Establece el titulo superior de la ventana
    }
}
