import java.util.Scanner;

public class cadenaInvertidad {
    
    Scanner entrada = new Scanner(System.in);
    String cadena;
    public void cadenaInvertidadPalabras(){

        System.out.println("Ingrese la oracion que deseas invertir: ");
        cadena = entrada.nextLine();

        //invertir cadena que de el usuario

        String invertida = "";

        //sera con un cliclo for
        //donde se hara la cadena invertida
        //el for decrementa
        //el cursor esta en la ultima decirle en -1 para que el cursor se pone en la "a"
        for (int i = cadena.length()-1; i >= 0; i--){
            char car = cadena.charAt(i);
            
            //concatener
            invertida += car; 
        }

        System.out.println("Cadena invertida es: " + invertida);


    }
}
