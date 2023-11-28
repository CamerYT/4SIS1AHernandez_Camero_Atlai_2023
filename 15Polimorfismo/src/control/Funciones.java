/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

/**
 *
 * @author Atlai Camero
 */
import java.io.*;
import java.util.*;
import javax.swing.*;

public class Funciones {
    //vamos a crear de personas para registrar
    ArrayList<Persona> listaPersonas = new ArrayList();
    
    //variables
    String rep = "";
    String nombre = "";
    int edad, num_Empleado, bol;
    
    //en donde aplicamos el polimorfismo
    //vamos a transformar una persona en
    
    Persona profesor = new Profesor();
    Persona alumno = new Alumno();
    
    public void menu(){
        while(true){//entre en un ciclo infinity
            while(rep.equalsIgnoreCase("si")){
                try {
                    String var = JOptionPane.showInputDialog(
                            "Ingresa la opcion deseada: \n"
                                +"1.- Registrar nuevo Profesor\n"
                                +"2.- Registrar nuevo Alumno\n"
                                +"3.- Consultar Alumno\n");
                    if(var == null){
                        System.exit(0);
                    }
                    
                    int opcion = Integer.parseInt(var);
                    
                    switch (opcion){
                        case 1: 
                            //metodo para solicitar datos
                            pedirDatosProfesor();
                            //asignar a un obejto profesor
                            profesor = new Profesor(num_Empleado, nombre, edad);
                            //metodo para guardar
                            guardarProfesor();
                            break;
                        case 2:
                            //metodo para solicitar datos
                            pedirDatosAlumno();
                            //asignar a un obejto profesor
                            alumno = new Alumno(bol, nombre, edad);
                            //metodo para guardar
                            guardarAlumno();
                            break;
                        case 3:
                            //metodo para leer el archivo alumno
                            leerAlumno();
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                    rep = JOptionPane.showInputDialog("¿Deseas repetir?");
                } catch (Exception e) {
                    System.out.println("Error" + e.getMessage());
                }
            }
        }
        
        
    }

    private void pedirDatosProfesor() {
        num_Empleado = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingresa el numero de empleado del Profesor: "));
        nombre = JOptionPane.showInputDialog(
                "Ingresa el nombre del Profesor");
        bol = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingresa la edad del Profesor: "));
    }

    private void guardarProfesor() throws Exception{
        //crear un metodo para guardarlos
        listaPersonas.add(profesor);
        guardar();
    }

    private void pedirDatosAlumno() {
        bol = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingresa el numero de la boleta del Alumno: "));
        nombre = JOptionPane.showInputDialog(
                "Ingresa el nombre del Alumno");
        edad = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingresa la edad del Alumno: "));
    }

    private void guardarAlumno() throws Exception{
        listaPersonas.add(alumno);
        guardar();
    }

    private void leerAlumno() throws Exception{
        //vamos a leer un archivo
        /*
        Donde se aplica un archivo donde se puedan guardar
        los archivos de lista de personas
        vamos a ocupar flujos para crear el archivo
        */
        
        FileInputStream archivo = new FileInputStream("Archivo.dat");
        //ocupanos un buffer para los datos (objetos);
        ObjectInputStream entrada = new ObjectInputStream(archivo);
        //vamos a transformar los objetos de acuerdo a la entrada de datos
        listaPersonas = (ArrayList)entrada.readObject();
        
        //vamos a recorrela para saber que hay
        for(int i = 0; i < listaPersonas.size(); i++){
            //conforme vaya leyendo debemos asignar los datos
            Alumno obj = (Alumno)listaPersonas.get(i);//como identificador
            //desplegamos la informacion
            JOptionPane.showMessageDialog(null,
                    "\n"
                            + "Numeros de alumnos registrados" + (i+1) + "\n"
                            + "Boleta: " + obj.getBoleta() + "\n"
                            + "Nombre: " + obj.getNombre() + "\n"
                            + "Edad: " + obj.getEdad() + "\n"
                            + "Tipo persona: " + obj.tipoPersona() + "\n");
        }
        
    }

    private void guardar() throws  Exception{
        //CREAR EL ARCHIVO QUE GUARDA LA INFORMACION
        FileOutputStream archivo = new FileOutputStream("archivo.dat");
        ObjectOutputStream salida = new ObjectOutputStream(archivo);
        
        //escribir los datos
        salida.writeObject(listaPersonas);
        salida.close();
    }
    
    
}
