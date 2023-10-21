/* para aplicar la herencia a una clase, se utiliza la palabra reservada
 * extends
 */
public class Michi extends Animal{
    //heredar todas las caracteristicas de la clase padre

    private int numVidas;
    //constructor
    public Michi(){

    }

    //sobrecarga para heredar todo de padre
    public Michi (String nombre, String raza, String tipoAlimento, int edad, int numVidas){
        super(nombre, raza, tipoAlimento, edad); //para acceder al padre
        this.numVidas = numVidas;
    }

    //the get and set
    public int getNumVidas(){
        return numVidas;
    }
    public void setNumVidas(int numVidas){
        this.numVidas = numVidas;
    }

    //mostrar
    public void mostrarMichi(){
        System.out.println("El nombre del gatuno es: " + getNombre() + "\n"
        + "La raza del gatuno es: " + getRaza() + "\n"
        + "Se alimenta de: " + getTipoAlimento() + "\n"
        + "El gatuno su edad es: " + getEdad() + "\n"
        + "La vida del gatuno es: " + numVidas + "\n");
        
   
    }






}
