// Como crear una ventana
// Heredar la clase JFrame
package Ventana;

import javax.swing.JFrame;

public class Ventana extends JFrame{
    
    public Ventana(){
        setSize(500, 500); // Se establece el tamano de la ventana
        setTitle("Ejemplo Ventana"); // Establece el titulo superior de la ventana
        //setLocation(100, 200);// Establece la locacion donde aparacera la ventana
        //setBounds(100, 200, 500, 500); // Estable el tamano y establece la locacion a la vez
        setLocationRelativeTo(null); // Con el argumento null establece la locacion en el centro de la pantalla
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Finaliza el programa al cerrar la ventana

    }
}
