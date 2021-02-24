
package Proyecto;

public class Aeropuerto {
    private String nombre;
    private String ciudad;
    private String pais;
    private Compania listaCompanias[] = new Compania[10];
    private int numeroCompania;
    
    public Aeropuerto(String nombre, String ciudad, String pais){
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.numeroCompania = 0;
    }
    
    public Aeropuerto(String nombre, String ciudad, String pais, Compania compania[]){
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        listaCompanias = compania;
        this.numeroCompania = compania.length;
    }
    
    public void insertarCompania(Compania compania){
        listaCompanias[numeroCompania] = compania;
        numeroCompania ++;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    public Compania[] getListaCompanias() {
        return listaCompanias;
    }

    public int getNumeroCompania() {
        return numeroCompania;
    }
    
    public Compania getCompania(int identificador){
        return listaCompanias[identificador];
    }
    
    public Compania getCompania(String nombre){
        boolean busqueda = false;
        int i = 0;
        Compania compania = null;
        
        while(!busqueda && i < listaCompanias.length){
            if(nombre.equals(listaCompanias[i].getNombre())){
                busqueda = true;
                compania = listaCompanias[i];
            }
            i++;
        }
        
        return compania;
    }
}
