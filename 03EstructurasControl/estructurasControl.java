/*
    Menu con seleccion de las 14 opciones siguientes:
    1. Bono o descuento por edad
    2. Convertir numeros decimales a binarios
    3. Convertir temperaturas
    4. Numero de positivos y negativos
    5. Tiendita
    6. Area y perimetro
    7. Tabla
    8. Factorial
    9. Dibujo
    10. Figura hueca
    11. Patron
    12. Diamante
    13. Calculadora
    14. Salir
*/
import java.util.Scanner;
public class estructurasControl {
    
    public static void main(String [] args){

        /* 
            Para la instancia es necesario;
            1. identificar el tipo objeto
            2. nombrar el objeto
            3. crear al objeto
        */
        Scanner entrada = new Scanner(System.in);
        //declaracion
        //ocupara un espacio de memoria
        int opcion, numBinario, total, cantidadProducto, num1;
        float precio, resultado = 0, compra = 0; //iniacializacion de la variable
        String nombreProducto;
        String binario = "";
        char letra;

        do{
            //aqui estara el programa
            System.out.println("Bienvenido al programa: ");
            System.out.println("Eligi una opcion: ");
            System.out.println("1. Descuento por edad ");
            System.out.println("2. Convertir numeros decimales a binarios ");
            System.out.println("3. Convertir temperaturas ");
            System.out.println("4. Numero de positivos y negativos ");
            System.out.println("5. Tiendita ");
            System.out.println("6. Area y perimetro ");
            System.out.println("7. Tabla ");
            System.out.println("8. Factorial ");
            System.out.println("9. Dibujo ");
            System.out.println("10. Figura hueca ");
            System.out.println("11. Patron ");
            System.out.println("12. Diamante ");
            System.out.println("13. Calculadora ");
            System.out.println("14. Salir ");


            opcion = entrada.nextInt();

            switch(opcion){
                case 1:

                    break;
                case 2:
                    //Decimal a binario
                    System.out.println("Ingrese un numero positivo que desee convertir a binario: ");
                    numBinario = entrada.nextInt();
                    //saber que es positivo?
                    
                    if(numBinario > 0){
                       //conozco cuantas veces se va a dividir entre dos?
                       while(numBinario > 0){
                            if(numBinario % 2==0){
                                binario = "0" + binario;
                            }else{
                                binario = "1" + binario;
                            }
                            numBinario = (int)numBinario/2;
                       }        

                    }else if(numBinario == 0){
                        binario = "0" + binario;
                    }else {
                        binario = "No se puede convertir un numero negativo solamente postivos";
                    }
                    System.out.println("El numero binario es: " + binario);
                    break;
                case 3:
                
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Bienvenido a la tiendita Pepsi");
                    System.out.println("Por favor ingrese el numero de productos que desea comprar?");
                    total = entrada.nextInt();

                    for(int i = 1; i <= total; i++){
                        System.out.println("Ingrese el nombre del producto: ");
                        nombreProducto = entrada.next();
                        System.out.println("Ingrese el precio del producto: ");
                        precio = entrada.nextFloat();
                        System.out.println("Ingrese la cantidad del producto: ");
                        cantidadProducto = entrada.nextInt();
                        //mi operacion
                        resultado = precio * cantidadProducto;
                        compra  += resultado;        
                    }
                    System.out.println("El total de la compra es: " + compra);
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;
                default:
                    System.out.println("Solo opciones permiitidas del 1 al 14");
                    break;
            }
            

            //aqui la pregunta
            System.out.println("Te gustaria repetir el programa?, escrbie s para si ");
            letra = entrada.next().charAt(0);

        }while(letra == 'S' || letra == 's');


        









    }
}
