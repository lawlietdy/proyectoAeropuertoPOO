
package Proyecto;

/**
 *
 * @author rodri
 */
public class Compania {
    private String nombre;
    private Vuelo listaVuelos[] = new Vuelo[10];
    private int numeroVuelo = 0;
    
    public Compania(String nombre){
        this.nombre = nombre;
    }
    
    public Compania(String nombre, Vuelo vuelo[]){
        this.nombre = nombre;
        listaVuelos = vuelo;
        numeroVuelo = vuelo.length;
    }
    
    public void insertarVuelo(Vuelo vuelo){
        listaVuelos[numeroVuelo] = vuelo;
        numeroVuelo++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }
    
    public Vuelo getVuelo(int i){
        return listaVuelos[i];
    }
    
    public Vuelo getVuelo(String identificador){
        boolean busqueda = false;
        int i = 0;
        Vuelo vuelo = null;
        
        while(!busqueda && i<listaVuelos.length){
            if(identificador.equals(listaVuelos[i].getIdentificador())){
                busqueda = true;
                vuelo = listaVuelos[i];
            }
            i++;
        }
        
        return vuelo;
    }
}
