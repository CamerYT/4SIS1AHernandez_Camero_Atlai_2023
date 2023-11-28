/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

/**
 *
 * @author Atlai Camero
 */
public class Profesor extends Persona{
    
    private int num_Empleado;
    
    public Profesor(){
        
    }
    
    public Profesor(int num_Empleado){
        this.num_Empleado = num_Empleado;
    }
    
    public Profesor(int num_Empleado, String nombre, int edad){
        super(nombre, edad);
        this.num_Empleado = num_Empleado;
    }
    
    @Override
    String tipoPersona() {
        return ("Profesor");
    }

    public int getNum_Empleado() {
        return num_Empleado;
    }

    public void setNum_Empleado(int num_Empleado) {
        this.num_Empleado = num_Empleado;
    }

    
    
    
    
    
}
