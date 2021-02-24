
package Proyecto;

public class Vuelo {
    private String identificador;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double precio;
    private int numeroMaximoPasajeros;
    private int numeroActualPasajeros;
    private Pasajero listaPasajeros[];
    
    public Vuelo(String identificador, String ciudadOrigen, String ciudadDestino, double precio, int numeroMaximoPasajeros){
        this.identificador = identificador;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = precio;
        this.numeroMaximoPasajeros = numeroMaximoPasajeros;
        this.numeroActualPasajeros = 0;
        this.listaPasajeros = new Pasajero[numeroMaximoPasajeros];
    }
    
    public void insertarPasajero(Pasajero persona){
        listaPasajeros[numeroActualPasajeros] = persona;
        numeroActualPasajeros ++;
    }
    
    public String getIdentificador(){
        return identificador;
    }
    
    public String getCiudadOrigen(){
        return ciudadOrigen;
    }
    
    public String getCiudadDestino(){
        return ciudadDestino;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public int getNumeroActualPasajeros(){
        return numeroActualPasajeros;
    }
    
    public int getNumeroMaximoPasajeros(){
        return numeroMaximoPasajeros;
    }
    
    public Pasajero getPasajero(int posicion){
        return listaPasajeros[posicion];
    }
    
    public Pasajero getPasajero(String pasaporte){
        boolean busqueda = false;
        int i = 0;
        Pasajero pasajero = null;
        while(!busqueda && i < listaPasajeros.length){
            if(pasaporte.equals(listaPasajeros[i].getPasaporte())){
                busqueda = true;
                pasajero = listaPasajeros[i];
            }
            i++;
        }
        
        return pasajero;
    }
    
    
}
