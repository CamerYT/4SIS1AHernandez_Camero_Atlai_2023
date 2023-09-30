import java.util.Scanner;

class ejercicio {
    
    Scanner entrada = new Scanner(System.in);

    //variable global
    char op;

    public void menu(){
        System.out.println("Selecciona operador a realizar: ");
        System.out.println("a.- Calculadora");
        System.out.println("b.- Conversion de unidades");
        System.out.println("c.- Crear cuadro magico");
        System.out.println("d.- Desplazamiento de un cuadrito");
        System.out.println("Elija una opcion deseada");

        op = entrada.next().charAt(0);

        switch(op){
            case 'a':
                //implementacion de los metodos:
                ejercicio1();
                break;
            case 'b':
                ejercicio2();
                break;
            case 'c':
                ejercicio3();
                break;
            case 'd':
                ejercicio4();
                break;
            case 'e':
                ejercicio5();
                break;
            default:
                System.out.println("Gracias por participar :3");
        }

    }
    
    //acciones que realizara: 

    public void ejercicio1(){
        /*metodos vacios = porque no posee argumentos y no son metodos
         o que necesiten algun tipo de dato*/

         //calculadora
         double num1 = 0.00, suma = 0.00, mult = 1.00;
         char operacion;

         System.out.println("Selecciona la operacion que deseas realizar:");
         System.out.println("a.- Suma y Resta");
         System.out.println("b.- Multiplicacion");
         System.out.println("c.- Division");
 
         operacion = entrada.next().charAt(0);
 
         switch(operacion){
            case 'a':
                //vamos a sumar o restar tantos numeros como desee el usuario
                //cuando coloque 0 la operacion termina
                System.out.println("Para detener la suma o resta, ingrese el 0");
                do{
                    System.out.println("Ingrese los numeros que desee sumar o restar: ");
                    num1 = entrada.nextDouble();
                    suma += num1;
                     //suma = suma + num1;
                }while(num1 != 0);
                System.out.println("El resultado de la operacion es: " + suma);
                break;
            case 'b':
                System.out.println("Para detener la multiplicacion ingrese el 0");
                do{
                    System.out.println("Ingrese los numeros que desee sumar o restar: ");
                    num1 = entrada.nextDouble();
                    if(num1 != 0){
                        mult *= num1;
                    }
                }while(num1 == 0);
                System.out.println("El resultado de la operacion es: " + mult);
                break;
            case 'c':
               //division de num1 / num2

                break;
        }       
    }

    public void ejercicio2(){

    }

    public void ejercicio3(){

    }

    public void ejercicio4(){

    }

}

