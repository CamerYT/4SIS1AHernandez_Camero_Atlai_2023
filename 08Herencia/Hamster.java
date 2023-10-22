

public class Hamster extends Animal{
    
    public Hamster(){

    }

    public Hamster(String nombre, String raza, String tipoAlimento, int edad){
        super(nombre, raza, tipoAlimento, edad);
    }

    //hamster
    public void mostrarHamster(){
        System.out.println("El nombre del hamster es: " + getNombre() + "\n"
        + "La raza es: " + getRaza() + "\n"
        + "Se alimenta de: " + getTipoAlimento() + "\n"
        + "Su edad es: " + getEdad() + "\n");
    }

}
