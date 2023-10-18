package palindromoHomework;

import java.util.Scanner;

public class vericarSiEsPalindromo{

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra o frase :3 ");
        String darInput = entrada.nextLine();

        if(esPalindromo(darInput)){
            System.out.println(darInput + " es un palíndromo");
        }else{
            System.out.println(darInput + " no es un palindromo");
        }

        //quedate ahí :v
        entrada.close();

    }


    //para que me retorne un boolean una desicion(false)
    private static boolean esPalindromo(String palabra) {
        //Lo que va ser es: eliminar los espacios en blanco y convierte todo a minsculas para hacerlo mas robusto
        
        palabra = palabra.replaceAll("\\s", "").toLowerCase();

        int alto = 0;
        int ancho = palabra.length()-1;
        
        while(alto < ancho){
            if(palabra.charAt(alto) != palabra.charAt(ancho)) {
                return false; //si no 
            }
            alto++;
            ancho--;
        }
        return true;
    }
}