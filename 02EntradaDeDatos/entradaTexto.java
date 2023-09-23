//Se debe de tener una clase
import java.io.*;
public class entradaTexto  {
    public static void main (String [] args) throws IOException{

        //debe de tener un metodo principañ
        //Tiene que tener una estructura basica

        //declaracion 
        //String nombre; 
        char nombre2;

        //asignar que operacion o comportamiento le voy a otorgar a la variable
        System.out.println("Por favor ingrese su nombre: ");

        //nombre = System.console().readLine();
        nombre2 = (char)System.in.read();
        /*
            //System es la clase del sistema
            //console() = obtener datos
            //readLine() = lectura de datos introducidos
            //read(devuelve un int)    
        */

        System.out.println("Hola " + nombre2 + " Bienvenido a canva :3 ");


    }
}
