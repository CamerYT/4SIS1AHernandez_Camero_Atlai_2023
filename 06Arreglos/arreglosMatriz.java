import java.util.Scanner;

public class arreglosMatriz {
    
    public static void main (String [] args){

        /*int arreglo[] = new int[10];

        //definir el tamaño del arreglo a 10
        int valor;
        Scanner entrada = new Scanner(System.in);

        //correr el arreglo (generalmente con bucles se corre)
        //conocemos el numero de elemento el tamaño

        for(int i = 0; i < arreglo.length; i++){
            System.out.println("Ingrese el valor de la posicion del arreglo: ");
            arreglo[i] = entrada.nextInt();

        }

        for(int j = 0; j < arreglo.length; j++){
            System.out.println("El valor almacenada es: : " + arreglo[j] + " valor ");
            
        }*/

        //arreglo bidimencional
        Scanner entrada = new Scanner(System.in);
        int matrz[][] = new int[3][3];

        //ingresar los valores de la matriz
        for(int i = 0; i < matrz.length; i++){
            System.out.println(i);
            for(int j = 0; j <matrz.length; j++){
                //columnas
                System.out.println(j);
                System.out.println("Ingrese el valor de la fila: " + i + "ingrese el valor de columna : " + j);
                matrz[i][j] = entrada.nextInt();
            }
        }

        float sumarFilas = 0;
        for(int i = 0; i < matrz.length; i++){
            for(int j = 0; j < matrz.length; j++){
                sumarFilas += matrz[i][j];
                //imprimir en formato = ver y que no puedo manipular
                System.out.println(String.format("%d", matrz[i][j]));
            }
            //tipos de format: 
            /*
             * %d entero
             * %s int
             * string %c es char
             * %f es float
            */
            System.out.println(String.format("\n La suma de las filas %f, El promedio de la fila %2.f", sumarFilas, sumarFilas/matrz.length));
        }



    }
}