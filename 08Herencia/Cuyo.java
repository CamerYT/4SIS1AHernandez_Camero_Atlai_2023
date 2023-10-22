public class Cuyo extends Animal{
    
    public Cuyo(){

    }

    public Cuyo(String nombre, String raza, String tipoAlimento, int edad){
        super(nombre, raza, tipoAlimento, edad);
    }

    public void mostrarTuron(){
        System.out.println("El nombre del Turon es: " + getNombre() + "\n"
        + "La raza es: " + getRaza() + "\n"
        + "Se alimenta de: " + getTipoAlimento() + "\n"
        + "Su edad es: " + getEdad() + "\n");
    }



}
