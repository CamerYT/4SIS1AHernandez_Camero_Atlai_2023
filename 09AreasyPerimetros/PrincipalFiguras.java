import java.util.Scanner;
public class PrincipalFiguras extends CalculoDeLasFiguras{
       
    void menu(){
        int seleccion;
            Scanner entrada = new Scanner(System.in);
            System.out.println("Seleccione: ");
            System.out.println("1.- Calcular Rectangulo " + " 2.- Calcular Circulo " + " 3.- Calcular Triangulo " + " 4.- Calcular Rombo ");
        int perimetro;
        int area;
        int op;    
        int alto;
        int base;

        op = entrada.nextInt();

        switch(op){
            case 1:
                System.out.println("Ingrese el perimetro: ");
                perimetro = setPerimetro();
                System.out.println("Para el area: ");
                System.out.println("Ingrese su alto: ");
                alto = setArea();
                System.out.println("Ingrese su base: ");
                base = setArea();
                area = alto*base;
                mostrarRectangulo();
            break;
            default:
            break;
        }

    }


   

    public void mostrarRectangulo(){
        System.out.println("El area del circulo: " + getArea() + "\n" +  " El perimetro del area es: " + getPerimetro());
    }
    







}
