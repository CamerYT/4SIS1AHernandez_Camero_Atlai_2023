import java.util.Scanner;
import java.lang.Math;

public class Figura {
    Scanner entrada = new Scanner(System.in);

    double area, perimetro, lado;
    int opcion;
    char letra;

    public void menu(){

        do{
            System.out.println("Bienvenido seleccion la accion que quiere realizar: ");
            System.out.println("1.- Calcular Cuadrado");
            System.out.println("2.- Calcular Rectangulo");
            System.out.println("1.- Calcular Triangulo");

            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    calcularCuadrado();
                    break;
                case 2:
                    calcularRectangulo();
                    break;
                case 3:
                    calcularTriangulo();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Gracias por participar :3");
                    break;
            } 
            System.out.println("Desea repetir el programa, seleccione [s] para si: ");
            letra = entrada.next().charAt(0);
        }while(letra == 's' || letra == 'S');
    }

    public void calcularCuadrado(){

        System.out.println("Ingrese el valor del lado del cuadrado: ");
        lado = entrada.nextDouble();
        perimetro = lado*4; 
        area = lado*lado;
        System.out.println("El perimetro es: " + perimetro + " .El area es: " + area);
    }

    public void calcularRectangulo(){

    }

    public void calcularTriangulo(){

    }




}
