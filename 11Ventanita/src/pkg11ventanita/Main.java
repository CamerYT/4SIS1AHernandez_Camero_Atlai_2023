/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg11ventanita;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Main {

    
    public static void main(String[] args) {
        //para ocupar interfaces necesitamos primero
        //frama
        
        JFrame ventana = new JFrame("Hola mundo");
        
        //tamaño en px de largo y ancho
        ventana.setSize(370, 170);
        
        //definir los botones de accion por defecto
        //cerrar defaultCloseOperation = cerrar la ventana exit_on_close
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //necesito donde incorporar los componenetes
        //los componentes son botones, cuadros de textos etc
       
        JPanel panel = new JPanel();
        
        ventana.add(panel);
        
        //tengo que crear un metodo para ir cargando cada componente
        //para ese panel
        agragarComponentes(panel);
        
        //tenemos que hacer visible la ventana para que se vea
        ventana.setVisible(true); //sea visible la ventana
        
    }

    private static void agragarComponentes(JPanel panel) {
         //lo tenemos que hacer es inicializar el panel
       panel.setLayout(null);//= traer su carga 
       
       //vamos agregar componentes al panel
       //etiqueta
       JLabel userLabel = new JLabel("Nombre de usuario");
       
       //debemos definir las propiedades
       //tamaño orientacion, tipo de letra, largo, ancho
       userLabel.setBounds(10, 10, 120, 50);
       //devuelve 4 x y y son las posiciones
       
       //agragamos al panel 
       panel.add(userLabel);  
       
       //campo de texto
       //definir cuantos caracteres
       JTextField usertxt = new JTextField(20);
       //defino sus propiedades
       usertxt.setBounds(160, 20, 160, 25);
       //lo agrago 
       panel.add(usertxt);
       
       //etiqueta de password
       JLabel userpass = new JLabel("Password");
       userpass.setBounds(10, 40, 80, 50);
       panel.add(userpass);
       
       
       //agregar campo de password
       JTextField passtxt = new JTextField(20);
       //propiedades
       passtxt.setBounds(160, 50, 160, 25);
       panel.add(passtxt);
       
       //vamos agregar los botones
       JButton loginButton = new JButton("Iniciar sesion");
       loginButton.setBounds(10, 80, 120, 25);
       panel.add(loginButton);
       
       JButton registroButton = new JButton("Registrate");
       registroButton.setBounds(180, 80, 120, 25);
       panel.add(registroButton);
       
    }
    
}
