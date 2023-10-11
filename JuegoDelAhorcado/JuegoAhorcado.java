package JuegoDelAhorcado;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class JuegoAhorcado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String palabraSecreta = "programacion"; // <---Aqui cambia la palabra secreta :3
        char[] letrasAdivinadas = new char[palabraSecreta.length()];
        boolean[] letraAdivinada = new boolean[palabraSecreta.length()];
        
        //Inicialización de las variables
        int intentosRestantes = 6;
        int puntaje = 0;
        
        //Aqui las pista
        char primeraLetra = palabraSecreta.charAt(0);
        char ultimaLetra = palabraSecreta.charAt(palabraSecreta.length() - 1);
        int longitudPalabra = palabraSecreta.length();

        JOptionPane.showMessageDialog(null,"Hola el fue por elaborado por: Atlai Hernandez Camero");
        System.out.println("¡Bienvenido al juego del AHORCADO!");
        System.out.println("La palabra tiene " + longitudPalabra + " letras.");
        System.out.println("La primera letra es: " + primeraLetra);
        System.out.println("La última letra es: " + ultimaLetra);
        System.out.println("Tienes 3 pistas en total.");
        
        while (intentosRestantes > 0) {
            //Imprimir el estado actual de la palabra ;)
            System.out.print("Palabra: ");
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (letraAdivinada[i]) {
                    System.out.print(letrasAdivinadas[i]);
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println("\nIntentos restantes: " + intentosRestantes);
            System.out.println("Puntaje: " + puntaje);
            
            //Leera la letra ingresada por el jugador o juagadora 
            System.out.print("Ingresa una letra: ");
            char letra = scanner.next().charAt(0);
            
            //Comprobar si la letra está en la palabra secreta (Ayuda si esta en el lugar)
            boolean adivino = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraAdivinada[i] = true;
                    puntaje += 10; // Sumar puntaje por acierto
                    adivino = true;
                }
            }
            
            if (!adivino) {
                intentosRestantes--;
                puntaje -= 5; //Se Restara el puntaje por equivocación
            }
            
            //Se comprobara si se ha adivinado toda la palabra o... no :3
            boolean adivinoPalabra = true;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (!letraAdivinada[i]) {
                    adivinoPalabra = false;
                    break;
                }
            }
            
            if (adivinoPalabra) {
                System.out.println("¡Felicidades! Has adivinado la palabra secreta: " + palabraSecreta);
                System.out.println("Tu puntaje final es: " + puntaje);
                break;
            }
        }
        
        if (intentosRestantes <= 0) {
            System.out.println("¡Agotaste tus intentos! La palabra secreta era: " + palabraSecreta);
        }
        
        scanner.close();
        String name = "Atlai Hernández Camero";
        System.out.println("El juego fue hecho por: " + name);
        JOptionPane.showMessageDialog(null,"El juego fue hecho por: " + name);
    }
}

