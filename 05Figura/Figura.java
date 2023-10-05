import java.util.Scanner;
import java.lang.Math;

public class Figura {
    Scanner entrada = new Scanner(System.in);

    double area, perimetro, lado,base,altura;
    int opcion;
    char letra;

    public void menu(){

        do{
            System.out.println("Bienvenido seleccion la accion que quiere realizar: ");
            System.out.println("1.- Calcular Cuadrado");
            System.out.println("2.- Calcular Rectangulo");
            System.out.println("3.- Calcular Triangulo");

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
        try{
            lado = entrada.nextDouble();
            perimetro = lado*4; 
            area = lado*lado;
        }catch(Exception e){
            System.out.println("Ingresa solo numeros");
            System.out.println("Error: " + e.getMessage());   
        }
        System.out.println("El perimetro es: " + perimetro + " El area es: " + area);
        letra = entrada.next().charAt(0);
    }

    public void calcularRectangulo(){
        System.out.println("Ingrese el la base del cuadrado: ");
        System.out.println("Ingrese la altura del cuadrado: ");
        try{
            base = entrada.nextDouble();
            altura = entrada.nextDouble();
            area = base * altura;
            perimetro = (2*base) + (2*altura);
        }catch(Exception e){
            System.out.println("Ingresa solo numeros");
            System.out.println("Error: " + e.getMessage());
        }  
        System.out.println("El area es: " + area + " perimetro es: " + perimetro);
        letra = entrada.next().charAt(0);
    }

    public void calcularTriangulo(){

    }




}
