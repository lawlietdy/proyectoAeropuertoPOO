
package Proyecto;

/**
 *
 * @author rodri
 */
public class AeropuertoPrivado extends Aeropuerto{
    private String[] listaEmpresas = new String[10];
    private int numeroEmpresa; // Funciona como iterador
    
    public AeropuertoPrivado(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }
    
    public AeropuertoPrivado(String nombre, String ciudad, String pais, Compania[] compania, String empresas[]){
        super(nombre, ciudad, pais, compania);
        this.listaEmpresas = empresas;
        this.numeroEmpresa = empresas.length;
    }
    
    public void insertarEmpresas(String empresas[]){
        this.listaEmpresas = empresas;
        numeroEmpresa = empresas.length;
    }
    
    public void insertarEmpresa(String empresa){
        listaEmpresas[numeroEmpresa] = empresa;
        numeroEmpresa++;
    }
    
    public String[] getListaEmpresas(){
        return listaEmpresas;
    }
    
    public int getNumeroEmpresa(){
        return numeroEmpresa;
    }
}
