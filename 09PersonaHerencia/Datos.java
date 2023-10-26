//controlador 
/*
 * es una clase que se encarga de controlar las entradas y salidas de los
 * datos
 * se encarga de la manipulacion 
 */

import javax.swing.JOptionPane;

public class Datos {
    
    //intergrar
    /*
     * instancia de estudiante
     */

    Estudiante obj[] = new Estudiante[10];

    int x = 0;

    //crear el menu :3
    void menu(){
        String var = "si";
        String mensaje = "";

        while(var.equalsIgnoreCase("si")){
            int op = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingrese la opcion deseada: \n "
                + "1.- Dar de alta un nuevo estudiante.\n"
                + "2.- Mostrar los datos de los estudiantes\n"));
            
            switch (op) {
                case 1:
                    //un mometodo para solicitar la inf
                    pedirEstudiante();
                    break;
                case 2:
                    //metodo para mostrar la informacion
                    mostrarEstudiante();
                default:
                    JOptionPane.showMessageDialog(null,"Opcion no valida");
                    break;
            }
            mensaje = JOptionPane.showInputDialog("Deseas repetir");
        }
    }

    public void pedirEstudiante(){
        //solicitar los datos
        int numbol = Integer.parseInt(
            JOptionPane.showInputDialog(
                "Ingrese el numero de boleta del estudiante: "));
        String nom = JOptionPane.showInputDialog(
            "Ingrese el nombre del estudiante: ");
        
        int edad = Integer.parseInt(
            JOptionPane.showInputDialog(
                "Ingrese la edad del estudiante: "));
        
        char gen = JOptionPane.showInputDialog(
            "Ingrese el nombre del estudiante: ").charAt(0);
        
        //AGREGAR a mi arrgelo
        //estoy guardando los datos del estudiante
        obj[x] = new Estudiante(numbol, nom, edad, gen);
        x++;
    }

    public void mostrarEstudiante(){
        //usar el get para cada uno de los datos guardados del arreglo

        for(int i = 0; i <= x; i++){
            //visualizo
            JOptionPane.showMessageDialog(null,
            "La boleta del estudiante es: " + obj[i].getNumBoleta() + "\n"
            + "El nombre de la boleta es: " + obj[i].getNombre() + "\n"
            + "La edad del estudiante es: " + obj[i].getEdad() + "\n"
            + "El genero del estudiante es: " + obj[i].getNumBoleta() + "\n");
        }
    }
    

    





}
