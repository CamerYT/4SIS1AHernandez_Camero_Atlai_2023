/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg16componentesatomicos;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.*;
import javax.swing.border.TitledBorder;
/**
 *
 * @author Atlai Camero
 */
public class ComponenteAtomico extends JFrame implements ActionListener, ChangeListener{
    
    private Container contenedor;
    //declarar todos los componentes que vamos a realizar
    JLabel labelTitulo;
    JLabel etiquetaLabel1;
    JLabel etiquetaBoton;
    JLabel etiquetaToogleButton;
    JLabel etiquetaCheckbox;
    JLabel etiquetaRadioButton;
    JLabel etiquetaCombo;
    JLabel etiquetaSeparador;
    JLabel etiquetaSpinner;
    JLabel etiquetaDeslizador;
    JLabel etiquetaBarra;
    JButton boton;
    JCheckBox checkbox1, checkbox2;
    ButtonGroup grupoRadios;
    JRadioButton radio1, radio2;
    JToggleButton toogleButton;
    JComboBox combo;
    JSeparator separadorVertical, separadorHorinzontal;
    JSpinner spinner;
    JSlider deslizador;
    JProgressBar bar;
    
    public ComponenteAtomico(){
        //vamos a crear un metodo para instanciar las propiedades de los componenetes
        inciarComponentes();
        //agregamos un titulo al contenedor
        setTitle("JFrame de componentes Atomicos");
        setSize(630, 250);
       //poner ventana al centro 
        setLocationRelativeTo(null);
        setResizable(false);//no cambie de tamaño
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void inciarComponentes() {
        contenedor = getContentPane();
        contenedor.setLayout(null);
        
        //definimos las propiedades de cada componente
        labelTitulo = new JLabel();
        labelTitulo.setText("Componentes Atomicos de Neatbeans");
        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 20));
        labelTitulo.setBounds(180,5,380,40);
        
        etiquetaLabel1 = new JLabel();
        etiquetaLabel1.setText("Este es una etiqueta");
        etiquetaLabel1.setBounds(20,50,280,25);
        
        etiquetaBoton = new JLabel();
        etiquetaBoton.setText("Boton ");
        etiquetaBoton.setBounds(20,80,80,25);
        
        boton = new JButton();
        boton.setText("Este es el boton");
        boton.setBounds(80,80,80,25);
        boton.addActionListener(this);
        
        etiquetaCheckbox = new JLabel();
        etiquetaCheckbox.setText("Etiqueta checkbox");
        etiquetaCheckbox.setBounds(20,110,80,25);
        
        checkbox1 = new JCheckBox();
        checkbox1.setText("Cuadritos");
        checkbox1.setBounds(100,110,80,25);
        
        checkbox2 = new JCheckBox();
        checkbox2.setText("Cuadritos");
        checkbox2.setBounds(100,110,80,25);
        
        etiquetaRadioButton = new JLabel();
        etiquetaRadioButton.setText("etiqueta radio");
        etiquetaRadioButton.setBounds(20,140,100,23);
        
        grupoRadios = new ButtonGroup();
        radio1 = new JRadioButton();
        radio1.setText("Radio button");
        radio1.setBounds(110,140,80,25);
        
        radio2 = new JRadioButton();
        radio2.setText("Radio button");
        radio2.setBounds(110,140,80,25);
        
        //grupo
        grupoRadios.add(radio1);
        grupoRadios.add(radio2);
        
        etiquetaToogleButton = new JLabel();
        etiquetaToogleButton.setText("Etiqueta toogle");
        etiquetaToogleButton.setBounds(20,180,100,25);
        
        toogleButton = new JToggleButton();
        toogleButton.setText("Activar");//activan y desactivan
        toogleButton.setBounds(120,180,80,25);
        
        etiquetaCombo = new JLabel();
        etiquetaCombo.setText("ComboBox");
        etiquetaCombo.setBounds(350,50,100,25);
        
        //agregamos las opciones del combo
        combo = new JComboBox();
        combo.addItem("Opciones");//como si fuera el titulo
        combo.addItem("Opcion1");
        combo.addItem("Opcion2");
        combo.addItem("Opcion3");
        combo.addItem("Opcion4");
        combo.setBounds(430,50,100,25);
        //donde inicia el indice para la lista
        combo.setSelectedIndex(0);
        
        separadorVertical = new JSeparator();
        separadorVertical.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separadorVertical.setBounds(300,60,10,200);
        
        etiquetaSeparador = new JLabel();
        etiquetaSeparador.setText("Separador");
        etiquetaSeparador.setBounds(350,80,100,25);
        
        separadorHorinzontal = new JSeparator();
        separadorHorinzontal.setBounds(430,90,100,5);
        
        etiquetaSpinner = new JLabel();
        etiquetaSpinner.setText("JSpinner");
        etiquetaSpinner.setBounds(350,110,100,25);
        
        spinner = new JSpinner();
        spinner.setBounds(110,110,80,25);
        
        etiquetaDeslizador = new JLabel();
        etiquetaDeslizador.setText("Deslizador");
        etiquetaDeslizador.setBounds(350,140,100,25);        
    
        deslizador = new JSlider(JSlider.HORIZONTAL, 0, 100, 30);
        deslizador.setBounds(430,140,100,30);
        deslizador.setPaintTicks(true);
        deslizador.setMajorTickSpacing(50);
        deslizador.setMinorTickSpacing(5);
        deslizador.setBorder(new TitledBorder("Puede ser lo que sea"));
        deslizador.setValue(0);
        deslizador.addChangeListener(this);
        
        etiquetaBarra = new JLabel();
        etiquetaBarra.setText("Barra de Progreso");
        etiquetaBarra.setBounds(350,100,100,25);
        
        bar = new JProgressBar();
        bar.setBounds(450,180,110,20);
        
        //agregar todo
        contenedor.add(labelTitulo);
        contenedor.add(etiquetaLabel1);
        contenedor.add(etiquetaBoton);
        contenedor.add(etiquetaCheckbox);
        contenedor.add(checkbox1);
        contenedor.add(checkbox2);
        contenedor.add(etiquetaRadioButton);
        contenedor.add(radio1);
        contenedor.add(radio2);
        contenedor.add(etiquetaToogleButton);
        contenedor.add(toogleButton);
        contenedor.add(etiquetaCombo);
        contenedor.add(separadorVertical);
        contenedor.add(etiquetaSeparador);
        contenedor.add(combo);
        contenedor.add(separadorHorinzontal);
        contenedor.add(etiquetaSpinner);
        contenedor.add(spinner);
        contenedor.add(etiquetaDeslizador);
        contenedor.add(deslizador);
        contenedor.add(bar);
        contenedor.add(etiquetaBarra);
        contenedor.add(boton);
        
    }
    
      @Override
    public void actionPerformed(ActionEvent e) {
        /*
        vamos a validar cuando se selecione un check, un radio o
        el toogle tenga una accion 
        */
        
        if(e.getSource() == boton){
            String salida = "";
            salida = validarEventos();
            JOptionPane.showInputDialog(null,salida);
            
        }
        
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        /*
        Esta estaciones sirven para elementos de cambio de evento
        como ejemplo mantener o soltar el mouse arrastrar,ec
        sirven para los deslizadores
        */
        int valor;
        if(e.getSource() == deslizador){
            valor = deslizador.getValue();
            bar.setValue(valor);
            spinner.setValue(valor);
        }
        
        if(e.getSource() == spinner){
            valor = (Integer)spinner.getValue();
            deslizador.setValue(valor);
            bar.setValue(valor);
        }
        
    }

    private String validarEventos() {
        String cadena = "Selecciona: \n";
        if(checkbox1.isSelected()){
            cadena += "check1";
        }
        if(checkbox2.isSelected()){
            cadena += "check2\n";
        }
        if(radio1.isSelected()){
            cadena += "radio1";
        }
        if(radio2.isSelected()){
            cadena += "radio2";
        }
        if(toogleButton.isSelected()){
            cadena += "toogle activo\n";
        }else{//puede estar activo o inactivo
            cadena += "toogle inactivo\n";
        }
        cadena+= combo.getSelectedItem() + "\n";
        return cadena;
    }
    
    
    
}
