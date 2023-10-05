import java.util.Scanner;

import javax.swing.JOptionPane;

import java.lang.Math;

public class Figura {
    Scanner entrada = new Scanner(System.in);

    double area, perimetro, lado,base,altura,lado1,lado2,lado3,semiPerimetro;
    int opcion, opTriangulo;
    char letra;

    public void menu(){

        do{
            System.out.println("Bienvenido seleccion la accion que quiere realizar: ");
            System.out.println("1.- Calcular Cuadrado");
            System.out.println("2.- Calcular Rectangulo");
            System.out.println("3.- Calcular Triangulo (Ventada con JOptionPane)");

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
        System.out.println("Ingrese primero la base del cuadrado: ");
        System.out.println("Despues Ingrese la altura del cuadrado: ");
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
        JOptionPane.showMessageDialog(null, "Bienvenido seleccion el operador que desea realizar, precione (enter): ");
        opTriangulo = Integer.parseInt(JOptionPane.showInputDialog("1.- Equilatero \n 2.- Escaleno \n psdt: Cuando termine de seleccionar \n regrese a la consola :3"));
        
        switch(opTriangulo){
            case 1:
                calcularEquilatero();
                break;
            case 2:
                calcularEscaleno();
                break;
            default:
                System.out.println("Solo 2 opciones disponibles :3");
                break;
        }   
    }

    public void calcularEquilatero(){
        System.out.println("Ingrese primero la base del cuadrado: ");
        System.out.println("Despues Ingrese la altura del cuadrado: ");
        try{
            base = entrada.nextDouble();
            altura = entrada.nextDouble();
            area = (base * altura)/2;
            System.out.println("Ingrese los 3 lados del tringulo: ");
            lado1 = entrada.nextDouble();
            lado2 = entrada.nextDouble();
            lado3 = entrada.nextDouble();
            perimetro = lado1 + lado2 + lado3;
            System.out.println("El area es: " + area + " perimetro es: " + perimetro);
        }catch(Exception e){
                System.out.println("Ingresa solo numeros");
                System.out.println("Error: " + e.getMessage());
        }  
        letra = entrada.next().charAt(0); 
    }

    public void calcularEscaleno(){
        System.out.println("Ingrese los tres lados del triangulo: ");
        try{    
            lado1 = entrada.nextDouble();
            lado2 = entrada.nextDouble();
            lado3 = entrada.nextDouble();
            semiPerimetro = (lado1 + lado2 + lado3)/2;
            perimetro = lado1 + lado2 + lado3;
            area = Math.sqrt(semiPerimetro*(semiPerimetro - lado1)*(semiPerimetro - lado2)*(semiPerimetro - lado3));
            System.out.println("El area es: " + area + " El perimetro es: " + perimetro);
        }catch(Exception e){
            System.out.println("Ingresa solo numeros");
            System.out.println("Error: " + e.getMessage());
        }
        letra = entrada.next().charAt(0);
    }

   


   


}
