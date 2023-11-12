/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg13componente;

/**
 *
 * @author Atlai Camero
 */
//color
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.border.BevelBorder;
import static javax.swing.border.BevelBorder.LOWERED;
import static javax.swing.border.BevelBorder.RAISED;



public class Ventana extends JFrame implements ActionListener{

    //declaracion de variables
    JLabel labelTitulo;
    private JPanel minipanelprincipal;
    //el panel de color
    private JPanel panelColor;
    //boton de color
    private JButton botoncolor;
    private Color color;
    
    //constructor
    public Ventana(){
        //vamos crear los metodos para la carga
        iniciaComponentes();
        setTitle("Ventana de coloeres :3");
        setSize(500, 540);
        //vamos a colocar en el centro
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }
    
    private void iniciaComponentes() {
        //declaracion de los eventos
        minipanelprincipal = new JPanel();
        minipanelprincipal.setLayout(null); //para que cargue
        
        //propiedades de los label
        //titulo
        labelTitulo = new JLabel();
        labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 28));
        labelTitulo.setHorizontalAlignment(CENTER);
        labelTitulo.setText("Componente JColorChooser");
        labelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(RAISED));
        labelTitulo.setBounds(40,20,410,40);
        
        //propiedades del panel
        componentesPanel1();
        
        //agregamos el boton
        botoncolor = new  JButton();
        botoncolor.setText("Seleccionar un color");
        botoncolor.setBounds(170,450,150,25);
        botoncolor.addActionListener(this);
        
        //agregar los componentes restantes al contenedor
        minipanelprincipal.add(labelTitulo);
        minipanelprincipal.add(panelColor);
        minipanelprincipal.add(botoncolor);
        add(minipanelprincipal);
        
    }
    
    private void componentesPanel1() {
        //Mi panel de color
        panelColor = new JPanel();
        panelColor.setBounds(10, 80, 460, 350);
        panelColor.setBorder(BorderFactory.createBevelBorder(LOWERED));
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        /*
            El siguiente codigo va definir cuando se presione
            el boton de entonces.
            Se crea una instancia de la clase de JColorChooser y luego el color seleccionado
            se asigna a un objeto a la clase Color, por medio de un metodo
            
        */
        //getSource = es para ver de donde viene
        if(e.getSource() == botoncolor){
            //primero vamos a crear el objeto
            JColorChooser ventanaColores = new JColorChooser();
            //definimos la nueva ventana
            color = ventanaColores.showDialog(null, "Seleccione un color", color.CYAN);
            //LO ENVIAMOS AL FONDO
            panelColor.setBackground(color);
        }
        
    }

}
