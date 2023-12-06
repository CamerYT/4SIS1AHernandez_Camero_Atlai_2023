/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg18hilos;

/**
 *
 * @author Atlai Camero
 */
public class Proceso extends Thread{
    /*
       nos permiten ejecutar procesos de forma independiente
       todas las computadoras realizan procesos
       formato lineal, pero cada procesador cuenta con un numero
       de hilos, lo que les permite realizar mas tareas de forma
       "simultanea o en parelelo", esto que quiere decir
       entre mas numero de hilos tenga un procesador, mas actividades
       o procesos puede realizar
    
       //como que tengo "1700 hilos", con velocidad de 3.70GHz
       3.7*1000000000 = 37000000000 = velocidad frecuencia en tiempo en minutos(2.702)
       osea un proceso lo realiza en 1 -> 2 nanoSegundo
    
    ejemplo:
    dos nuecleos pero se comparten 1 y 1, no importa en numero de nucleos sigo teniendo una salida
    va rapido porque se busca la mejora de los tiempo de respuesta, la frecuncia para que pueda realizar operaciones por segundo
    
    hilos = permiten crear operadores en conjunto 
    cada conexion es un hilo
    
    */

    /*
    cada hilo puede tener sus propias operaciones 
    cada hilo puede mandar a llamar a mas hilos
    */
    
    public Proceso(){
    
    }
    
    public Proceso(String nombreHilo){
        super(nombreHilo);
        
    }
    //correr el hilo+
    int num_int;
    
    //exite un metodo reservado para ejecutar un hilo
    public void run(){//-> este es un metodo reservado para ejecutar los hilos
        for(int i = 0; i <= num_int; i++){
            System.out.println(" + " + this.getName());
        }
        System.out.println("");
    }
    
    public void valorDecondicion(int valor){
        this.num_int = valor;//yo le voy a dar un valor y me dara el numero de hilos
    }
    
}
