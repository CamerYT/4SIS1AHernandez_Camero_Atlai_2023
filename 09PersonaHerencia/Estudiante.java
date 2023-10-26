
public class Estudiante extends Persona{
    
    private int numBoleta;
    private String chillon;

    public Estudiante(){

    }

    public Estudiante(int numBoleta, String chiillon, String nombre, int edad, char genero){
        super(nombre, edad, genero);
        this.numBoleta = numBoleta;
        this.chillon = chiillon;
    }

    //2da sobrecarga
    public Estudiante(int numBoleta, String nombre, int edad, char genero){
        super(nombre, edad, genero);
        this.numBoleta = numBoleta;
    }

    public int getNumBoleta(){
        return numBoleta;
    }
    public void setNumBoleta(int numBoleta){
        this.numBoleta = numBoleta;
    }

    public char getChillon(){
        return chillon;
    }
    public void setChillon(char chiillon){
        this.chillon = chillon;
    }





}
