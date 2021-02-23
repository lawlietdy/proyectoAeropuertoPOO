
package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String []args){
        Persona persona1 = new Persona("Angel", 19);
        persona1.correr();
        
        Persona persona2 = new Persona("12903121");
        persona2.correr(10);
    }
}
