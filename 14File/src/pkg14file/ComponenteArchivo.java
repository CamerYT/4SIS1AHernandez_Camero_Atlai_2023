/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg14file;

/**
 *
 * @author Atlai Camero
 */

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;

//crear una clase que nos permita crer un archivo desde una ventana
public class ComponenteArchivo extends JFrame implements ActionListener{

    //las variables
    private Container contenedor;
    JLabel labeltitulo;
    JTextArea areaTexto;
    JButton botonabrir;
    JButton botonguardar;
    JScrollPane scrollpane;
    JFileChooser filechooser;
    String texto;
    
    public ComponenteArchivo(){
        
        contenedor = getContentPane();
        contenedor.setLayout(null);
        
        //instancia del objeto de archivo
        filechooser = new JFileChooser();
        
        labeltitulo = new JLabel();
        labeltitulo.setText("Componente de JFileChooser");
        labeltitulo.setBounds(110, 290, 180, 25);
        
        areaTexto = new JTextArea();
        //ajustamos el texto dentro de texArea
        areaTexto.setLineWrap(true); // para ajustar el area
        //no quede las palabras completas y se haga automatico el santo de linea
        areaTexto.setWrapStyleWord(true);
        //vamos agregar el Scroll
        scrollpane = new JScrollPane();
        scrollpane.setBounds(20,50,350,270);
        scrollpane.setViewportView(areaTexto);//donde quiero que se visualice
        
        //botones
        botonabrir = new JButton();
        botonabrir.setText("Abrir");
        botonabrir.setBounds(100, 330, 80, 25);
        botonabrir.addActionListener(this);
        
        botonguardar = new JButton();
        botonguardar.setText("Guardar");
        botonguardar.setBounds(100, 230, 80, 25);
        botonguardar.addActionListener(this);
        
        //agregar los componentes al contenedor
        contenedor.add(labeltitulo);
        contenedor.add(scrollpane);
        contenedor.add(botonabrir);
        contenedor.add(botonguardar);
        
        //que se vea 
        setTitle("Ventana de JFileChooser");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == botonabrir){
            try {
                String archivo = abrirArchivo();
            } catch (Exception ex) {
                System.out.println("Error " + ex.getMessage());
                System.out.println("Fuente " + ex.getStackTrace());
            }
        }
        if(e.getSource() == botonguardar){
            try {
                guardarArchivo();
            } catch (Exception ex) {
                Logger.getLogger(ComponenteArchivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    } 

    private String abrirArchivo() throws Exception{
        //necesitamos es poder abrir un archivo
        String aux = "";
        texto = "";
        
        try {
            //lo primero es cargar la ventana del archivo
            filechooser.showOpenDialog(this);
            //abrir el archivo
            File abre = filechooser.getSelectedFile();
            
            //vamos a ver la ruta del archivo
            System.out.println(abre.getAbsoluteFile());
            System.out.println(abre.getAbsolutePath());
            System.out.println(abre.getPath());
            
            //ayudar si abre
                if(abre != null){
                    //ocupar el buffer para recorrer los elementos del archivo
                    FileReader archivos = new FileReader(abre);
                    BufferedReader lee = new BufferedReader(archivos);
                    //vamos a ver cuanta informacion tiene ocupamos un while
                    while((aux = lee.readLine()) != null){
                        texto += aux + "\n";
                    }
                    lee.close();
                }    
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
            System.out.println(e.getStackTrace());
        }
        return texto;
    }
    
    private void guardarArchivo() throws  Exception{
        try {
            String nombre = "";
            JFileChooser file = new JFileChooser();
            //para guardar un elemento para guardar
            file.showSaveDialog(this);
            //con esto escogemos un archivo
            File guardar = file.getSelectedFile();
            
            if(guardar != null){
                //para obtener el nombre del archivo
                nombre = file.getSelectedFile().getName();
                //tenemos que guardar acorde al tipo de formato que queremos
                FileWriter save = new FileWriter(guardar + ".txt");//con esto guardo la extension que de la gana :)
                save.write(areaTexto.getText()); //lo que yo escriba es lo que quiero que aparezca
                save.close();
                JOptionPane.showMessageDialog(null,
                        "/n  El archivo se guardo con exito /n");
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }

    
    
    
    
    
    
    
    
    
    
}

