/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.io.Serializable;

/**
 *
 * @author Atlai Camero
 */

    /*es necesario tener una clase de tipo abstracta
       es aquella que podemos instanciar de forma tal que sus
       elementos son abstractos
       Osea que puede cambiar a la perspectiva de su
       comportamiennto
       como Persona que se puede convertir en: 
       alumno
       docente
       trabajador
       gerente
       empleado
       director
    */
    
public abstract class Persona implements Serializable{
    
    private String nombre;
    private int edad;
        
    public Persona(){
        
    }
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //el metodo abstracto que nos ayuda a definir el tipo persona
    
    abstract String tipoPersona();
    
    
    
    
}
