package EjerciciosArrayTarea;

import java.util.Scanner;

public class PromedioPosicionesPares {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        int sumaDePares = 0;
        int cantidadDePares = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
            
            if(i % 2 == 0){
                sumaDePares += numeros[i];
                cantidadDePares++;
            }
        }
        
        entrada.close();//un cierre 

        if(cantidadDePares > 0){
            double promPares = (double) sumaDePares / cantidadDePares;
            System.out.println("El promedio de los numeros en las posiciones es: "  + promPares);
        } else {
            System.out.println("No se agrego numeros positivos");
        }


    }
}