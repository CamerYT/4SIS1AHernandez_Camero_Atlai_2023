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
        
    }
    public void ejercicio2(){

    }
    public void ejercicio3(){

    }
    public void ejercicio4(){

    }
    public void ejercicio5(){

    }

}

