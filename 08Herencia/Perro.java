

public class Perro extends Animal{

    public Perro(){

    }

    public Perro(String nombre, String raza, String tipoAlimento, int edad){
        super(nombre, raza, tipoAlimento, edad);
    }

    public String mostrarPerro(){
        System.out.println("El nombre del perro es: " + getNombre() + "\n"
        + "La raza es: " + getRaza() + "\n"
        + "Se alimenta de: " + getTipoAlimento() + "\n"
        + "Su edad es: " + getEdad() + "\n");
        return null;
    }


}
