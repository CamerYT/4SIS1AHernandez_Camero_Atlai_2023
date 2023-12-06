/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg18hilos;

/**
 *
 * @author Atlai Camero
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ejemplo de hilo");
        Proceso hilo1 = new Proceso("Hilo 1");
        Proceso hilo2 = new Proceso("Hilo 2");
        Proceso hilo3 = new Proceso("Hilo 3");
        
        hilo1.valorDecondicion(5);
        hilo2.valorDecondicion(5);
        hilo3.valorDecondicion(5);
        /*osea el hilo1 va entrar y contar hasta 5 y asi*/
        
        //los iniciamos
        hilo1.start();
        hilo2.start();
        hilo3.start();
        
        //por eso aparece que hacemos actividades de forma simultanea
        //cada hilo puede tomar diferentes tiempos y se valen lo ¿mismo? = cierto tiempo o puedo que hacer que tenga preoridades
        //todas las acciones se van a realizar
        
        //lo vuelve tomar
        //y puede crear hilos que tenga su propio proceso
        /*
        parece que estan al mismo tiempo pero no lo estan
        si parece = uno va detras del otro, va rapido que parece
        que se hace al mismo tiempo, va a cierto tiempo
        */
    }
    
}
