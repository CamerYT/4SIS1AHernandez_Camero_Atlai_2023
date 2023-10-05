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

import javax.swing.JOptionPane;
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
        int opcion, numBinario, cantidadProducto, num1;
        double total;
        float precio, resultado = 0, compra = 0; //iniacializacion de la variable
        String nombreProducto;
        String binario = "";
        char letra;
        //case 1
        int edad;
        float descuento;
        char socios;
        //case 3
        int opConvertir; float cantidadConvertir, fah, cen, ran;
        double kel;
        //case 4
        float numero;
        //case 5
        float area, perimetro, base, altura, lado, volumen;
        double radio;
        int opFigura;
        //case 8:
        int fact = 1;  
        int number;
        //case 9
        int secuencia;
        String asteristico = "*";
        //case 10
        char elegirNum;
        float suma,resta,mult,div;
        int mensaje;
        
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
                    System.out.println("Ingrese la edad del usuario: ");
                    edad = entrada.nextInt();
                    if(edad >= 65){
                        System.out.println("Es mayor de edad el descuento sera del: %40");
                    }else if(edad <= 21){
                        System.out.println("Sus padres son socios? [s] para si o [n] para no: ");
                        socios = entrada.next().charAt(0);
                        if(socios == 's'){
                            System.err.println("Son socios tiene un descuento del:  45%");
                        }else{
                            System.out.println("No son socios solo un descuento del: 25%");
                        }
                    }
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
                    //convertir temperaturas --------------------------------------------------
                    System.out.println("Bienvenido al convertidor de temperaturas :3");
                    System.out.println("Seleccion lo que desea convertir: ");
                    System.out.println("1.- Convertir a Fahereint\n");
                    System.out.println("2.-Convertir a Celsius\n");
                    System.out.println("3.-Convertir a Kelvin\n");
                    System.out.println("4.-Convertir a Rankine\n");
        
                    opConvertir = entrada.nextInt();
                    switch(opConvertir){
                        case 1:
                                System.out.println("Ingrese cantidad a convertir: ");
                                cantidadConvertir = entrada.nextFloat();
                                fah = (float)(cantidadConvertir * 1.8) + 32;
                                System.out.println("La conversion de Fahereint a centigrados es: " + fah);
                            break;
                        case 2:
                                System.out.println("Ingrese cantidad a convertir: ");
                                cantidadConvertir = entrada.nextFloat();
                                cen = (float) ((cantidadConvertir - 32) / 1.8);
                                System.out.println("La conversion de centigrados a Fahereint es: " + cen);
                                break;
                        case 3:
                                System.out.println("Ingrese cantidad a convertir: ");
                                cantidadConvertir = entrada.nextFloat();
                                kel = ((cantidadConvertir + 49.67) / 5/9);
                                System.out.println("La conversion de Fahereint a Kelvin es: " + kel);
                            break;
                        case 4:
                                System.out.println("Ingrese cantidad a convertir: ");
                                cantidadConvertir = entrada.nextFloat();
                                ran = (float)((cantidadConvertir - 32) + 491.67);
                                System.out.println("La conversion de Fahereint a Kelvin es: " + ran);
                                break;
                        default:
                            System.out.println("Solo dos operadores permitidos del 1 al 2");
                            break;
                    }
                    break;
                case 4:
                        //numeros negativos o positivos
                        System.out.println("Saber si es numero negativo o positivo\n");
                        System.out.println("Ingrese un numero: ");
                        numero = entrada.nextFloat();
                        // Comparar
                        if (numero == 0) {
                            System.out.println("El número es neutro");
                        } else if (numero < 0) {
                            System.out.println("El número es negativo");
                        } else {
                            System.out.println("El número es positivo");
                        }
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
                    //area y perimetro
                    System.out.println("Bienvenido, para saber el area y perimetro de las figuaras porfavor: ");
                    System.out.println("1.-Triangulo");
                    System.out.println("2.-Rectangulo");
                    System.out.println("3.-Volumen de una esfera");
                    System.out.println("4.-Volumen de un cilindro");

                    opFigura = entrada.nextInt();
                    
                    switch(opFigura){
                        case 1:
                            System.out.println("Ingrese su base: ");
                            base = entrada.nextFloat();
                            System.out.println("Ingrese su altura: ");
                            altura = entrada.nextFloat();
                            //triangulo
                            area = base * altura;
                            System.out.println("Ingrese su lado del triangulo: ");
                            lado = entrada.nextFloat();
                            perimetro = lado + lado + lado;
                            System.out.println("El area de un triangulo es: " + area);
                            System.out.println("El perimetro de un triangulo es: " + perimetro);
                        break;
                        case 2:
                            System.out.println("Ingrese su base: ");
                            base = entrada.nextFloat();
                            System.out.println("Ingrese su altura: ");
                            altura = entrada.nextFloat();
                            //triangulo
                            area = base * altura;
                            System.out.println("Ingrese base del rectangulo: ");
                            base = entrada.nextFloat();
                            System.out.println("Ingrese su altura del rectangulo: ");
                            altura = entrada.nextFloat();
                            perimetro = ((2*base) + (2*altura));
                            System.out.println("El area de un triangulo es: " + area);
                            System.out.println("El perimetro de un triangulo es: " + perimetro);
                        break;
                        case 3:
                            System.out.println("Ingrese el radio de la esfera: ");
                            radio = entrada.nextFloat();
                            volumen = (float) (3/4*Math.PI*Math.pow(radio, 3));
                            System.out.println("El volumen de una esfera es: " + volumen);
                        break;
                        case 4:
                            System.out.println("Ingrese su radio: ");
                            radio = entrada.nextDouble();
                            System.out.println("Ingrese su altura: ");
                            altura = entrada.nextFloat();

                            volumen = (float) (Math.PI * Math.pow(radio, 2) * altura);
                            System.out.println("El volumen de un cilindro es: " + volumen);
                        break;
                    }
                    break;
                case 7:
                    //tabla hecho por el ms
                    for (int n = 1; n <= 10; n++){
                        System.out.println(n + " " + (n * 10) + " " +  (n * 100) + " " + (n * 1000) + " ");
                    }
                    break;
                case 8:  
                    System.out.println("Ingrese cantidad");
                    number = entrada.nextInt();
                    if(number >= 0){
                            for(int i = 1; i <= number; i++){    
                            fact = fact * i;    
                        }
                        System.out.println("Factorial de "+ number +" es: " + fact);    
                    }else if(number <= 0){
                        System.out.println("Solo numeros positivos");
                    }
                    break;
                case 9: 
                    //mr
                    System.out.println("Cuadro magico :3");
                    System.out.println("Ingrese el tamaño del cuadrado a pintar: ");
                    num1 = entrada.nextInt();

                    if(num1 >= 1 && num1 <= 20){
                        for(int i = 1; i <= num1; i++){
                            for(int j = 1; j <= num1; j++){
                                System.out.print("*");
                            }
                            System.out.println("");
                        }
                    }else{
                            System.out.println("Ingrese solo numeros entre el 1 y 20");
                    }
                    break;
                case 10:
                    break;
                case 11:
                    System.out.println("********\n");
                    System.out.println(" ********");
                    System.out.println("********");
                    System.out.println(" ********");
                    System.out.println("********");
                    System.out.println(" ********");
                    System.out.println("********");
                    System.out.println(" ********");
                    break;
                case 12:
                    System.out.println("   ***\n");
                    System.out.println("  *****");
                    System.out.println(" *******");
                    System.out.println("*********");
                    System.out.println(" *******");
                    System.out.println("  *****");
                    System.out.println("   ****");
                    System.out.println("     *");
                    break;
                case 13:
                    System.out.println(("Bienvenido a la calculadora Pepsi Blue"));
                    System.out.println("Desea entrar al programa? [s] para si o [n] para no: ");
                    elegirNum = entrada.next().charAt(0);

                    if(elegirNum == 's' || elegirNum == 'S'){
                        
                        mensaje = Integer.parseInt(JOptionPane.showInputDialog("MENU OPERACIONES\n 1.-Suma \n 2.-Resta \n 3.-Multiplicacion \n 4.-Division"));
                        switch(mensaje){
                            case 1:
                                suma = Float.parseFloat(JOptionPane.showInputDialog("Ingrese cantidad: "));
                                suma = Float.parseFloat(JOptionPane.showInputDialog("Ingrese segunda cantidad: "));
                                total = (float) (suma + suma); 
                                JOptionPane.showMessageDialog(null, "La suma es: " + total);
                            break;
                            case 2:
                                resta = Float.parseFloat(JOptionPane.showInputDialog("Ingrese cantidad: "));
                                resta = Float.parseFloat(JOptionPane.showInputDialog("Ingrese segunda cantidad: "));
                                total = (float) (resta - resta);
                                JOptionPane.showMessageDialog(null, "La resta es: " + total);
                            break;
                            case 3:
                                mult = Float.parseFloat(JOptionPane.showInputDialog("Ingrese cantidad: "));
                                mult = Float.parseFloat(JOptionPane.showInputDialog("Ingrese segunda cantidad: "));
                                total = (float) (mult * mult);
                                JOptionPane.showMessageDialog(null, "La multiplicion es: " + total);
                            break;
                            case 4:
                                div = Float.parseFloat(JOptionPane.showInputDialog("Ingrese cantidad: "));
                                div = Float.parseFloat(JOptionPane.showInputDialog("Ingrese segunda cantidad: "));
                                total = (float) (div / div);
                                JOptionPane.showMessageDialog(null, "La Division es: " + total);
                            break;
                        }
                    }
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
