public class Conejo extends Animal {
    
    public Conejo(){

    }

    public Conejo(String nombre, String raza, String tipoAlimento, int edad){
        super(nombre, raza, tipoAlimento, edad);
    }

    public void mostrarConejo(){
        System.out.println("El nombre del conejo es: " + getNombre() + "\n"
        + "La raza es: " + getRaza() + "\n"
        + "Se alimenta de: " + getTipoAlimento() + "\n"
        + "Su edad es: " + getEdad() + "\n");
    }
}
