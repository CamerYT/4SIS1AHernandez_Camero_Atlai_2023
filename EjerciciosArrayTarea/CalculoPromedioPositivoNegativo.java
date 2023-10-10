package EjerciciosArrayTarea;

import java.util.Scanner;

public class CalculoPromedioPositivoNegativo {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        //mis  variables
        int[] numeros = new int[10];
        int sumaPositivos = 0;
        int cantidadPositivos = 0;
        int sumaNegativos = 0;
        int cantidadNegativos = 0;

        for (int i = 0; i < 10; i++){
            System.out.println("Ingrese el numero " + (i + 1)  + ": ");
            numeros[i] = entrada.nextInt();

            if(numeros[i] > 0){
                sumaPositivos += numeros[i];
                cantidadPositivos++;
            } else if(numeros[i] < 0){
                sumaNegativos += numeros[i];
                cantidadNegativos++;
            }

        }

        entrada.close(); //cerrar

        if(cantidadPositivos > 0){
            double promedioPositivos = (double) sumaPositivos / cantidadPositivos;
            System.out.println("El Promedio de valores positivos es: " + promedioPositivos);
        } else {
            System.out.println("No se ingresaron numeros positivos");
        }

        if(cantidadNegativos > 0){
            double promedioNegativos = (double) sumaNegativos / cantidadNegativos;
            System.out.println("El promedio de valores negativos: " + promedioNegativos);
        } else {
            System.out.println("No se ingresaron numeros negativos");
        }




    }



}
