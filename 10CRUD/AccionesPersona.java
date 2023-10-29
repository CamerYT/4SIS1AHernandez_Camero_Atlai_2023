//package son patrones de diseño donde pueden ser paquetes
//compartan de diferentes formas que va acompañado de los patrones de diseño

import java.util.ArrayList;

public class AccionesPersona {
    
    /*
     * ACCIONES persona es una clase de tipo contralador 
     * se encargar de las acciones u oéraciones que debe de tener el objeto que 
     * sea creado
     * con las operaciones basicas
     * consultar        consult
     * registrar        register
     * actualizar       update
     * eliminar         delete
     * CRUD = apenas es un registro que sera una base de datos
     * 
     * CUANDO pensamos en las acciones de las persona, es necesario
     * guardar todas las acciones de las personas de forma dinamica 
     * constantemente va estar generando nuevos registros.
     * Necesitamos un objeto especial llamado
     * 
     * ArrayList = arreglo dinamico de objetos, a comparacion de otros arrglos
     * un arrglo solo puede contener un tipo de dato por ejemplo
     * int edad[] char letras[] double precio[2] (guarda para dos) = estos son arreglos
     * o solo guarda enteros o double pero no mas solo un tipo de dato
     * 
     * 
     * ArrayList al ser dinamico puede cambiar su tamaño, se puede adaptar a diferentes tipos
     * de datos porque guardan objetos
     */
    
    //declaramos objeto de persona tipo arraylist
    //tipo vector = lista udimencional de una solo dimencion, que no podemos imaginar
    //una sola dimension la estoy guardando linal
    public ArrayList<Persona> listaPersonas = new ArrayList<Persona>(); //=objeto 
    //crear dinamico de tipo persona reserva memoria para un string para un int
    //este seguira guardando memoria es dinamico

    //crear un metodo de registro

    public void agregarPersona(Persona persona){
        //al definirlo como objeto no importa cuantos datos ahiga 
        //listapersona para agragarlo
        listaPersonas.add(p);
    }

    //buscar una persona por su id entrada y salida
    public Persona buscarPersona(int id){
        //necesito una persona si la encontre y otra para buscarla
        Persona encontrada = new Persona();
    
        //necesito el arrayList donde esta registradas
        //recorrerlo como?
        for(Persona p: listaPersonas){
            if(id == p.getId()){
                encontrada = p;
            }else{
                System.out.println("No existe el registro de esa persona");
            }
        }
        return encontrada;

    }

    //actualizar los datos de una persona
    public void actualizarPersona(Persona actualizada){
        //como se hace el proceso de actualizar
        //1.- buscar la persona que quiere actualizar
        //2.- Debo de cambiar los datos (borrar el anterior dato)
        //3.- actualizar los datos de la nueva persona

        Persona actualizar = buscarPersona(actualizada.getId()); 

        //cambio de datos
        listaPersonas.remove(actualizar); 
        
        //actualizo
        listaPersonas.add(actualizar);
    }

    //eliminar el registro de una persona
    public void eliminarPersona(Persona eliminada){
        listaPersonas.remove(eliminada);
    }

    //estoy buscando a todos
    public ArrayList<Persona> mostrarPersonas(){
        return listaPersonas;
    }











}
