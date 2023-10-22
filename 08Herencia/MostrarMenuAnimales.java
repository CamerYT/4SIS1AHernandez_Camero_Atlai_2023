import java.util.Scanner;

public class MostrarMenuAnimales extends Animal{
    
    private int numVidas;
    void menu(){
        char letra;
        do{
            Scanner entrada = new Scanner(System.in);
            System.out.println("Seleccione: ");
            System.out.println("1.-Gato \n 2.- Perro, \n 3.- Hamster \n 4.- Conejo \n 5.- Cuyo \n 6.- Urones \n 7.- Poner un animal");
            
           
            int op;
            op = entrada.nextInt();
            String comentar;

            switch(op){
                case 1:
                    setNombre("Grafield");
                    setRaza("Babilo");
                    setTipoAlimento("Guiskas");
                    setNumVidas(4);
                    setEdad(7);
                    mostrarMichi();
                break;
                case 2:
                    setNombre("Dogo");
                    setRaza("chichuhua");
                    setTipoAlimento("Croquetas");
                    setEdad(12);
                    mostrarPerro();
                break;
                case 3:
                    setNombre("Popusa");
                    setRaza("Peruana ");
                    setTipoAlimento("Hojas de laurel");
                    setEdad(9);
                    mostrarHamster();
                break;
                case 4:
                    setNombre("Orejon");
                    setRaza("Blanca suiza");
                    setTipoAlimento("zanahorias");
                    setEdad(1);
                    mostrarConejo();
                break;
                case 5:
                    setNombre("Josue");
                    setRaza("Americana");
                    setTipoAlimento("Melon");
                    setEdad(5);
                    mostrarCuyo();
                break;
                case 6:
                    setNombre("Cornelio");
                    setRaza("M.putorius");
                    setTipoAlimento("peces");
                    setEdad(2);
                    mostrarTuron();
                break;
                case 7:
                    setNombre("Sprit");
                    setRaza("Anda luz");
                    setTipoAlimento("Pasto");
                    setEdad(8);
                    mostrarCaballo();
                break;
                default:
                    System.out.println("Lo siento solo disponible siete opciones");
                break;
            }
            System.out.println("Te gustaria repetir el programa?, escrbie s para si ");
            letra = entrada.next().charAt(0);
        }while(letra == 'S' || letra == 's');
    }
    
    //get and set
    //gato
    public void mostrarMichi(){
        System.out.println("El nombre del gatuno es: " + getNombre() + "\n"
        + "La raza del gatuno es: " + getRaza() + "\n"
        + "Se alimenta de: " + getTipoAlimento() + "\n"
        + "El gatuno su edad es: " + getEdad() + "\n"
        + "La vida del gatuno es: " + getNumVidas() + "\n");
    }

    public int getNumVidas(){
        return numVidas;
    }
    public void setNumVidas(int numVidas){
        this.numVidas = numVidas;
    }


    //perro
    public void mostrarPerro(){
        System.out.println("El nombre del perro es: " + getNombre() + "\n"
        + "La raza es: " + getRaza() + "\n"
        + "Se alimenta de: " + getTipoAlimento() + "\n"
        + "Su edad es: " + getEdad() + "\n");
    }

    //hamster
    public void mostrarHamster(){
        System.out.println("El nombre del hamster es: " + getNombre() + "\n"
        + "La raza es: " + getRaza() + "\n"
        + "Se alimenta de: " + getTipoAlimento() + "\n"
        + "Su edad es: " + getEdad() + "\n");
    }
   
    //conejo
    public void mostrarConejo(){
        System.out.println("El nombre del conejo es: " + getNombre() + "\n"
        + "La raza es: " + getRaza() + "\n"
        + "Se alimenta de: " + getTipoAlimento() + "\n"
        + "Su edad es: " + getEdad() + "\n");
    }

    //cuyo
    public void mostrarCuyo(){
        System.out.println("El nombre del cuyos es: " + getNombre() + "\n"
        + "La raza es: " + getRaza() + "\n"
        + "Se alimenta de: " + getTipoAlimento() + "\n"
        + "Su edad es: " + getEdad() + "\n");
    }

    //turon
    public void mostrarTuron(){
        System.out.println("El nombre del Turon es: " + getNombre() + "\n"
        + "La raza es: " + getRaza() + "\n"
        + "Se alimenta de: " + getTipoAlimento() + "\n"
        + "Su edad es: " + getEdad() + "\n");
    }

    //caballo
    public void mostrarCaballo(){
        System.out.println("El nombre del caballo es: " + getNombre() + "\n"
        + "La raza es: " + getRaza() + "\n"
        + "Se alimenta de: " + getTipoAlimento() + "\n"
        + "Su edad es: " + getEdad() + "\n");
    }



    
    

    
}
