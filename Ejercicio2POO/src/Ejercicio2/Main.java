package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Main {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Tablero tb1;
        int x, y;
        int opcion, incremento = 0;
        
        System.out.print("Ingrese la posición inicial de X: ");
        x = sc.nextInt();
        System.out.print("Ingrese la posición inicial de Y: ");
        y = sc.nextInt();
        
        tb1 = new Tablero(x, y);
        
        do{
            System.out.println("\n      MENÚ      ");
            System.out.println("1. Moverse Arriba");
            System.out.println("2. Moverse Abajo");
            System.out.println("3. Moverde a la Derecha");
            System.out.println("4. Moverse a la Izquierda");
            System.out.println("5. Salir");
            System.out.print("Digite la opcion: ");
            opcion = sc.nextInt();
            if(opcion != 5){
                System.out.print("Digite la cantidad de espacios a moverse: ");
                incremento = sc.nextInt();
            }
            
            switch(opcion){
                case 1:
                    tb1.moverArriba(incremento);
                    break;
                case 2:
                    tb1.moverAbajo(incremento);
                    break;
                case 3:
                    tb1.moverDerecha(incremento);
                    break;
                case 4:
                    tb1.moverIzquierda(incremento);
                    break;
                default: 
                    System.out.println("Selecciono una opcion invalida");
                    break;
            }
            
            System.out.println("\nPosicion actual (X, Y): (" + tb1.getX() + ", " + tb1.getY() + ")");
        }while(opcion != 5);
    }
}
