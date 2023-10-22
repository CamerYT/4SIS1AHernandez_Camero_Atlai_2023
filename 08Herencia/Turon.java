public class Turon extends Animal{
    
    public Turon(){

    }

    public Turon(String nombre, String raza, String tipoAlimento, int edad){
        super(nombre, raza, tipoAlimento, edad);
    }

    //uron
    public void mostrarTuron(){
        System.out.println("El nombre del Turon es: " + getNombre() + "\n"
        + "La raza es: " + getRaza() + "\n"
        + "Se alimenta de: " + getTipoAlimento() + "\n"
        + "Su edad es: " + getEdad() + "\n");
    }




}
