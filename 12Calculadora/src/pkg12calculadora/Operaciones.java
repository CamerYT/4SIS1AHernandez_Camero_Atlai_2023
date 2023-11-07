/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg12calculadora;

/**
 *
 * @author Atlai Camero
 */
public class Operaciones {
    
    private double num1;
    private double num2;
    
    public Operaciones(){
        
    }
    
    //gets y sets
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    //crear los metodos de la calculadora -------------------
    public double suma(){
        return num1 + num2;
    }
    
    public double producto(){
        return num1 * num2;
    }
    
    public double resta(){
        return num1 - num2;
    }
    
    public double division(){
        //comprobar que se pueda dividir
        try{
            if(num2 == 0){
                System.out.println("No se puede realizar la division");
            }else{
                return num1 / num2;
            }
        }catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }
        return 0;
    }
    
    
    
    
    
}
