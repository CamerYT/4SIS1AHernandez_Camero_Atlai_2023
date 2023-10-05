import java.util.*;
public class cadena {

    //funciones de caddena nos sirven para poder manipular cadenas de texto

    Scanner entrada = new Scanner(System.in);

    //metodos de cadenas length() = ver su tamaño
    public void cadenas(){
        String sl = "Comi unos ricos taquitos que eran 5 tacos y un consome";
        System.out.println("El tamaño de la cadena es: " + sl.length() );
        
        System.out.println("La cadena inicia V o F con la palabra Hola?: " + sl.startsWith("Hola"));

        System.out.println("La cadena finaliza V o F con la palabra consome?" + sl.startsWith("consome"));
        
        //asinar apartir de una variable

        System.out.println("Ingrese una palabra: ");
        String s2 = entrada.nextLine();

        //subcadenas

        System.out.println("Parte de una subcadena de sl es: " + sl.indexOf("cos"));

        //expresiones regulares CURP, RFC, MATRICULA, CORREO

        System.out.println("Primera parte de sl" + sl.substring(12));
        System.out.println("Segunda parte de sl " + sl.substring(14, 20));

        //convertir variable que se cadena

        int valor = 24;
        //transformar  int a String
        String s3 = String.valueOf(valor);
        System.out.println("Asi es como se convierte un valor de: "+  valor + " en cadena " + s3);

        //al reves
        String s4 = "20";
        int numero = Integer.parseInt(s4);
        System.out.println("Asi se convierte una cadena : " + s4 + " en un valor : " + numero);

        int suma = valor + numero;
        System.out.println(suma);

        //con dobles
        String s5 = "344.55";
        Double numero2 = Double.parseDouble(s5);
        System.out.println(numero2);

        numero2 = valor + numero2;
        System.out.println(numero2);

        //CONVERTIR  otra forma un numero entero en una cadena
        Integer z = 5;
        System.out.println("El valor de: " + z.toString() + "ahora otra forma " 
        + Integer.toString(12) + "Ahora es una cadena");//transformamos directo el valor
        //Integer.toString(12) el valor que quiero que transforme
        


    }

}
