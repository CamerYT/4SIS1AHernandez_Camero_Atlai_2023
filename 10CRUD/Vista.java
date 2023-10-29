import java.util.*;

import javax.swing.JOptionPane;

public class Vista {
    //vamos a crear nuestro menu todos los elemento que debe tener el usurio

    public void menu(){
        Scanner entrada = new Scanner(System.in);

        //vamos a crear una instancia de persona y controlador 
        AccionesPersona control = new AccionesPersona();

        System.out.println("Bienvenido al programa de registro de dormidos UTC :3");
        System.out.println("Eliga una opcion: ");
        System.out.println("1.- Mostrar a todos los dormitos");
        System.out.println("2.- Registar un nuevo dormidito");
        System.out.println("3.- Editar a un dormidito");
        System.out.println("4.- Despertar al dormidito");
        System.out.println("5.- Salir");

        int opcion = entrada.nextInt();

        switch(opcion){
            case 1:
                //mostrar todo el registro de personas
                System.out.println("mimidos");
                //es una instancia de la lista de personas
                ArrayList<Persona> listaPersonas = control.mostrarPersonas();

                //al tener la lista de personas hace falta recorrer los
                //registros de dicha lista

                for(Persona objeto: listaPersonas){
                    System.out.println("El id es: " + objeto.getId() + "\n"
                                        + "El nombre es: " + objeto.getNombre() + "\n"
                                        + "La edad es: " + objeto.getEdad() + "\n");
                }
                menu(); //vuelvo a llamar el menu
                break;
            case 2:
                //registrar los datos de la persona
                System.out.println("Ingresa el id del dormidito: ");
                int idPersona = entrada.nextInt();
                System.out.println("Ingrese el nombre del dormidito: ");
                String nombrePersona = entrada.nextLine();
                System.out.println("Ingrese la edad del dormidito: ");
                int edadPersona = Integer.parseInt(entrada.nextLine());

                //debo de realizar una instancia de la persona
                Persona personaDormida = new Persona(idPersona, nombrePersona, edadPersona);

                control.agregarPersona(personaDormida); //tener un objeto como entrada
                menu();
                break;
            case 3:
                //debo de buscar a la persona que quiero editar por medio del id
                System.out.println("Ingrese el id del dormidito para buscar: ");
                idPersona = Integer.parseInt(entrada.nextLine());

                //mando a llamar el metodo de busqueda
                Persona personaBuscar = control.buscarPersona(idPersona);//busca apartir del id
                
                // la informacion
                System.out.println("La informacion del dormidito es: " + "\n"
                + "ID: " + personaBuscar.getId() + "\n"
                + "Nombre: " + personaBuscar.getNombre() + "\n" 
                + "Edad: " + personaBuscar.getEdad() + "\n");
                //cambio los datos que desee
                System.out.println("Ingrese el nuevo nombre: ");
                String nuevoNombre = entrada.nextLine();
                System.out.println("Ingrese la nueva edad: ");
                int nuevaEdad = Integer.parseInt(entrada.nextLine());
                
                //al tener los nuevo datos debo enviarlos
                personaBuscar.setNombre(nuevoNombre);
                personaBuscar.setEdad(nuevaEdad);

                //ahora si actualizo el registro
                control.actualizarPersona(personaBuscar);
                break;
            case 4:
                System.out.println("Ingrese el id del dormido a despertar");
                idPersona = Integer.parseInt(entrada.nextLine());

                //creo la persona
                Persona personaEliminar = control.buscarPersona(idPersona);

                //lo elimino ya que lo busca
                control.eliminarPersona(personaEliminar);
                System.out.println("El dormido ya desperto");
                break;
            default:
                System.out.println("Opcion de valida");
                break;
        }

    }


}
