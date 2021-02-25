// Como crear una ventana
// Heredar la clase JFrame
package Ventana;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.*;

public class Ventana extends JFrame{
    
    public Ventana(){
        setSize(500, 500); // Se establece el tamano de la ventana
        setTitle("Ejemplo Ventana"); // Establece el titulo superior de la ventana
        //setLocation(100, 200);// Establece la locacion donde aparacera la ventana
        //setBounds(100, 200, 500, 500); // Estable el tamano y establece la locacion a la vez
        setLocationRelativeTo(null); // Con el argumento null establece la locacion en el centro de la pantalla
        
        //setResizable(false); // Evita que el usuario pueda cambiar el tamaño de la ventana
        setMinimumSize(new Dimension(300, 300));
        // this.getContentPane().setBackground(Color.BLUE); // Establecer el color de la ventana     
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Finaliza el programa al cerrar la ventana
    }
    
    // Creamos un metodo para crear un Panel - esto para tener ordenado
    private void iniciarComponentes(){
        JPanel panel = new JPanel();
        //panel.setBackground(Color.DARK_GRAY); // Se establece el color del panel
        panel.setLayout(null);
        this.getContentPane().add(panel); // Se agrega el panel a la ventana
        
        JLabel etiqueta = new JLabel();
        etiqueta.setText("Hola");
        etiqueta.setBounds(50, 20, 100, 20);
        panel.add(etiqueta);
    }
}
