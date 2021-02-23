/**
 * Ejercicio 1. Construir un programa que calcule el área y el perimetro de un cuadrilatero
 * dada la longitud de sus dos lados. Los valores de la longitud deberán introducirse por 
 * línea de ordenes. Si es un cuadrado, sólo se proporcionará la longitud de uno de los dos lados
 * al constructor.
*/
package Ejercicio1;
/**
 * @author Teodoro del Angel Rodriguez Aguirre
 */
public class Cuadrilatero {
    // Atributos
    private float lado1;
    private float lado2;
    // Métodos
    
    // Metodo constructor 1 Se va a utilizar si son diferentes los lados (Cuadrilatero)
    public Cuadrilatero(float lado1, float lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    // Metodo constructor 2 Cuadrado
    public Cuadrilatero(float lado1){
        this.lado1 = this.lado2 = lado1;
    }
    
    // Obtener perimetro
    public float getPerimetro(){
        float perimetro;
        perimetro = 2 * (lado1 + lado2);
        return perimetro;
    }
    
    // Obtener Area
    public float getArea(){
        float area;
        area = lado1 * lado2;
        return area;
    }

}
