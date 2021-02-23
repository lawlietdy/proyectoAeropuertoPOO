package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Main {
    
    public static int indiceMasBarato(Vehiculo coches[]){
        float precio;
        int indice = 0;
        // Se obtiene el precio del primer indice
        precio = coches[0].getPrecio();
        for(int i = 1; i < coches.length; i++) {
            if(coches[i].getPrecio() < precio){
                precio = coches[i].getPrecio();
                indice = i;
            } 
        }
        
        return indice;
    }
    
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int cantidadVehiculos;
        int indiceBarato;
        System.out.print("Ingrese la cantidad de vehiculos: ");
        cantidadVehiculos = sc.nextInt();
        // Se declara un arreglo para guardar los objetos
        Vehiculo coches[] = new Vehiculo[cantidadVehiculos];
        
        for(int i = 0; i < coches.length; i++) {
            sc.nextLine();
            System.out.println("\nIngrese los datos del vehiculo " + (i + 1));
            System.out.print("Ingrese la marca: ");
            marca = sc.nextLine();
            System.out.print("Ingrese el modelo: ");
            modelo = sc.nextLine();
            System.out.print("Ingrese el costo: ");
            precio = sc.nextFloat();
            
            coches[i] = new Vehiculo(marca, modelo, precio);
        }
        
        indiceBarato = indiceMasBarato(coches);
        System.out.println("\nVehiculo más barato");
        System.out.print(coches[indiceBarato].mostrarDatos());
    }
}
