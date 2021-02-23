
package Ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author rodri
 */
public class Main {
    public static void main(String []args){
        Cuadrilatero c1;
        
        float lado1, lado2;
        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado uno"));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado dos"));
        
        if(lado1 == lado2)
            c1 = new Cuadrilatero(lado1); // Es un cuadrado
        else
            c1 = new Cuadrilatero(lado1, lado2); // No lo es
        
        System.out.println("El perimetro es: " + c1.getPerimetro());
        System.out.println("El Area es: " + c1.getArea());
    }
}
