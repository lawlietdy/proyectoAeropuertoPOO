
package Proyecto;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Main {
    static Scanner sc = new Scanner(System.in);
    final static int numeroAeropuertos = 4;
    static Aeropuerto aeropuertos[] = new Aeropuerto[numeroAeropuertos];
    
    public static void main(String []args){
        // Insertar datos de los aeropuertos
        insertarDatosAeropuerto(aeropuertos);
        menu();
    }
    
    public static void insertarDatosAeropuerto(Aeropuerto aero[]){
        aero[0] = new AeropuertoPublico(24000000.32f, "Felipe Angeles", "CDMX", "Mexico");        
        aero[0].insertarCompania(new Compania("Viva Aerobus"));
        aero[0].insertarCompania(new Compania("AeroMexico"));        
        aero[0].getCompania("Viva Aerobus").insertarVuelo(new Vuelo("1254", "Veracruz", "Monterrey", 2500, 120));
        aero[0].getCompania("Viva Aerobus").insertarVuelo(new Vuelo("1257", "Veracruz", "Cancun", 1800, 110));        
        aero[0].getCompania("AeroMexico").insertarVuelo(new Vuelo("1C21", "Ciudad de Mexico", "Chicago", 12400, 240));        
        aero[0].getCompania("AeroMexico").getVuelo("1C21").insertarPasajero(new Pasajero("Angel Rodriguez", "AD2131", "Mexicana"));
        aero[0].getCompania("AeroMexico").getVuelo("1C21").insertarPasajero(new Pasajero("Bryan Rodriguez", "A231J1", "Mexicana"));        
        aero[0].getCompania("Viva Aerobus").getVuelo("1257").insertarPasajero(new Pasajero("Andres Manuel Lopez", "J78SD", "Mexicana"));
        
        aero[1] = new AeropuertoPublico(89000321.3f, "Jara", "Veracruz", "Mexico");        
        aero[1].insertarCompania(new Compania("Viva Aerobus"));
        aero[1].insertarCompania(new Compania("Aeromar"));
        aero[1].getCompania("Viva Aerobus").insertarVuelo(new Vuelo("H621", "Veracruz", "Chicago", 4500, 230));
        aero[1].getCompania("Aeromar").insertarVuelo(new Vuelo("HJ23", "Veracruz", "Xalapa", 800, 25));        
        aero[1].getCompania("Aeromar").getVuelo("HJ23").insertarPasajero(new Pasajero("Francisco Jara", "H2311231", "Mexicana"));

        aero[2] = new AeropuertoPrivado("El lencero", "Xalapa", "Mexico");
        aero[2].insertarCompania(new Compania("Aeromar"));
        String empresas[] = {"Repson", "Soluciones siptotrea"};
        ((AeropuertoPrivado)aero[2]).insertarEmpresas(empresas);
        aero[2].getCompania("Aeromar").insertarVuelo(new Vuelo("JY21", "Xalapa", "Minatitlan", 1500, 30));
        aero[2].getCompania("Aeromar").getVuelo("JY21").insertarPasajero(new Pasajero("Angel Rodriguez", "12KKDAS", "Mexicana"));
        
        aero[3] = new AeropuertoPublico(12389921.3f, "Teodoro Aguirre", "Misantla", "Mexico");        
        aero[3].insertarCompania(new Compania("Viva Aerobus"));
        aero[3].insertarCompania(new Compania("Aeromar"));        
        aero[3].getCompania("Viva Aerobus").insertarVuelo(new Vuelo("H621", "Misantla", "Ciudad de Mexico", 4500, 230));
        aero[3].getCompania("Aeromar").insertarVuelo(new Vuelo("HJ22", "Veracruz", "Xalapa", 1200, 25));        
        aero[3].getCompania("Aeromar").getVuelo("HJ22").insertarPasajero(new Pasajero("Francisco Jara", "H2311231", "Mexicana"));
        
    }
    
    public static void menu(){
        int opcion;
        String nombreAeropuerto;
        Aeropuerto aeropuerto;
        String nombreCompania;
        Compania compania;
        String ciudadOrigen, ciudadDestino;
        
        do{
            System.out.println("\n\tMENU:");
            System.out.println("1. Consultar Aeropuertos (Publicos o Privados)");
            System.out.println("2. Ver empresas (Privado) o subvencion(Publico)");
            System.out.println("3. Lista de compañias de un Aeropuerto");
            System.out.println("4. Lista de vuelos por compañia");
            System.out.println("5. Listar posibles vuelos de Origen a Destino");
            System.out.println("6. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println(""); // Ver aeropuertos
                    verAeropuertos(aeropuertos);
                    break;
                case 2:
                    System.out.println("");
                    verEmpresas(aeropuertos);// Ver las empresas
                    break;
                case 3:
                    sc.nextLine();
                    System.out.print("Nombre del aeropuerto a consultar: ");
                    nombreAeropuerto = sc.nextLine();
                    aeropuerto = consultaAeropuerto(aeropuertos, nombreAeropuerto);
                    if(aeropuerto == null)
                        System.out.println("El aeropuerto no existe");
                    else{
                        mostrarCompanias(aeropuerto);
                    }
                    // Lista companias de un aeropuerto
                    break;
                case 4:
                    sc.nextLine();
                    System.out.print("\nDigite el nombre del aeropuerto: ");
                    nombreAeropuerto = sc.nextLine();
                    aeropuerto = consultaAeropuerto(aeropuertos, nombreAeropuerto);
                    if(aeropuerto == null )
                        System.out.println("El aeropuerto no existe");
                    else {
                        System.out.print("Digite el nombre de la compañia: ");
                        nombreCompania = sc.nextLine();
                        compania = aeropuerto.getCompania(nombreCompania);
                        mostrarVuelos(compania);
                    }
                    // Lista de vuelos por compania
                    break;
                case 5:
                    sc.nextLine();
                    System.out.print("\nDigite la ciudad de Origen: ");
                    ciudadOrigen = sc.nextLine();
                    System.out.print("Digite la ciudad de Destino: ");
                    ciudadDestino = sc.nextLine();
                    mostrarVuelo(ciudadOrigen, ciudadDestino, aeropuertos);
                    // Posibles vuelos
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }while(opcion != 6);
    }
    
    public static void verAeropuertos(Aeropuerto aeropuertos[]){
        for(int i = 0; i < aeropuertos.length; i++) {
           if(aeropuertos[i] instanceof AeropuertoPrivado){ // Instanceof pregunta si pertenece a la clase aeropuertoPrivado
               System.out.println("\nAeropuerto Privado");
               System.out.println("Nombre: " + aeropuertos[i].getNombre());
               System.out.println("Ciudad: " + aeropuertos[i].getCiudad());
               System.out.println("Pais: " + aeropuertos[i].getPais());
           } else{
               System.out.println("\nAeropuerto Publico");
               System.out.println("Nombre: " + aeropuertos[i].getNombre());
               System.out.println("Ciudad: " + aeropuertos[i].getCiudad());
               System.out.println("Pais: " + aeropuertos[i].getPais());
           }
            System.out.println("");
        }
    }
    
    public static void verEmpresas(Aeropuerto aeropuertos[]){
        String empresas[];
        for(int i = 0; i < aeropuertos.length; i++) {
           if(aeropuertos[i] instanceof AeropuertoPrivado){
               System.out.println("\nAeropuerto Privado: " + aeropuertos[i].getNombre());
               empresas = ((AeropuertoPrivado) aeropuertos[i]).getListaEmpresas();
               System.out.println("Empresas: ");
               for(int j = 0; j < empresas.length; j++)
                    System.out.println(empresas[j]);
           } else {
               System.out.println("\nAeropuerto Publico: " + aeropuertos[i].getNombre());
               System.out.println("Subvencion: " + ((AeropuertoPublico) aeropuertos[i]).getSubvencion());
           } 
        }
    }
    
    public static Aeropuerto consultaAeropuerto(Aeropuerto aeropuertos[], String nombre){
        boolean busqueda = false;
        int i = 0;
        Aeropuerto aeropuerto = null;
        
        while(!busqueda && i < aeropuertos.length){
            if(nombre.equals(aeropuertos[i].getNombre())){
                busqueda = true;
                aeropuerto = aeropuertos[i];
            }
            i++;
        }
        
        return aeropuerto;
    }
    
    public static void mostrarCompanias(Aeropuerto aeropuerto){
        System.out.println("\nCompañias del aeropuerto: " + aeropuerto.getNombre());
        for (int i = 0; i < aeropuerto.getNumeroCompania(); i++) {
            System.out.println(aeropuerto.getCompania(i).getNombre());
        }
    }
    
    public static void mostrarVuelos(Compania compania){
        Vuelo vuelo;
        System.out.println("Los vuelos de la compañia " + compania.getNombre());
        for (int i = 0; i < compania.getNumeroVuelo(); i++) {
            vuelo = compania.getVuelo(i);
            System.out.println("\nIdentificador: " + vuelo.getIdentificador());
            System.out.println("Ciudad Origen: " + vuelo.getCiudadOrigen());
            System.out.println("Ciudad Destino: " + vuelo.getCiudadDestino());
            System.out.println("Precio: $" + vuelo.getPrecio());
        }
    }
    
    public static void mostrarVuelo(String ciudadOrigen, String ciudadDestino, Aeropuerto aropuertos[]){
        Vuelo vuelos[];
        vuelos = buscarVuelo(ciudadOrigen, ciudadDestino, aeropuertos);
        
        if(vuelos.length == 0)
            System.out.println("No existen vuelos");
        else{
            System.out.println("\nVuelos encontrados: ");
            for (int i = 0; i < vuelos.length; i++) {
                System.out.println("\nIdentificador: " + vuelos[i].getIdentificador());
                System.out.println("Ciudad Origen: " + vuelos[i].getCiudadOrigen());
                System.out.println("Ciudad Destino: " + vuelos[i].getCiudadDestino());
                System.out.println("Precio: " + vuelos[i].getPrecio());
            }
        }
    }
    
    public static Vuelo[] buscarVuelo(String ciudadOrigen, String ciudadDestino, Aeropuerto aropuertos[]){
        Vuelo vuelo;
        int contador = 0;
        Vuelo listaVuelos[];
        for (int i = 0; i < aropuertos.length; i++) { // Se recorren los aeropuertos
            for (int j = 0; j < aropuertos[i].getNumeroCompania(); j++) { // Se recorrren las companias
                for (int k = 0; k < aropuertos[i].getCompania(j).getNumeroVuelo(); k++) { // Se recorren los vuelos
                    vuelo = aeropuertos[i].getCompania(j).getVuelo(k);
                    if(ciudadOrigen.equals(vuelo.getCiudadOrigen()) && ciudadDestino.equals(vuelo.getCiudadDestino()))
                        contador++;
                }
            }
        }
        listaVuelos = new Vuelo[contador];
        int q = 0;
        
        for (int i = 0; i < aeropuertos.length; i++) {
            for (int j = 0; j < aeropuertos[i].getNumeroCompania(); j++) {
                for (int k = 0; k < aeropuertos[i].getCompania(j).getNumeroVuelo(); k++) {
                    vuelo = aeropuertos[i].getCompania(j).getVuelo(k);
                    if(ciudadOrigen.equals(vuelo.getCiudadOrigen()) && ciudadDestino.equals(vuelo.getCiudadDestino())){
                        listaVuelos[q] = vuelo;
                        q++;
                    }
                    
                }
                
            }
        }
        return listaVuelos;
    }
}
