public class Caballo extends Animal{
    
    public Caballo(){

    }

    public Caballo(String nombre, String raza, String tipoAlimento, int edad){
        super(nombre, raza, tipoAlimento, edad);
    }


    //caballo
    public void mostrarCaballo(){
        System.out.println("El nombre del caballo es: " + getNombre() + "\n"
        + "La raza es: " + getRaza() + "\n"
        + "Se alimenta de: " + getTipoAlimento() + "\n"
        + "Su edad es: " + getEdad() + "\n");
    }



}
