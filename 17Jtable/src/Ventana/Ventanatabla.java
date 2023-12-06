/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventana;

import Persona.Persona;
import Utlidades.GestionCeldas;
import Utlidades.GestionEncabezadoTable;
import Utlidades.Utilidades;

/**
 *
 * @author Atlai Camero
 */

import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;


public class Ventanatabla extends JFrame implements MouseListener{
    
    private JPanel contentPanel;
    private JScrollPane scrollPaneTable;
    private JTable tablaPersonas;
    ArrayList<Persona> listapersona;
    ModeloTabla modelo;
    private int filasTabla;
    private int columnasTabla;
    
    //contrusctir
    public Ventanatabla(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1120,450);
        iniciarComponentes();
        setLocationRelativeTo(null);
        construirTabla();
    }
   
    private void iniciarComponentes() {
        contentPanel = new JPanel();
        contentPanel.setBorder(new EmptyBorder(
                5,5,5,5));
        setContentPane(contentPanel);
        contentPanel.setLayout(new BorderLayout(0,0));
        
        JLabel labelTablapersona = new JLabel("Tabla personas");
        labelTablapersona.setFont(new Font("Verdana", Font.BOLD,25));
        contentPanel.add(labelTablapersona,BorderLayout.NORTH);
    
        scrollPaneTable = new JScrollPane();
        contentPanel.add(scrollPaneTable);
        
        tablaPersonas = new JTable();
        tablaPersonas.setBackground(Color.WHITE);
        tablaPersonas.setBorder(new BevelBorder(BevelBorder.RAISED, null,null,null,null));
        
        tablaPersonas.addMouseListener(this);
        tablaPersonas.setOpaque(false);
        scrollPaneTable.setViewportView(tablaPersonas);//para que el scroll este dentro 
    }

    private void construirTabla() {
        //imaginar como es qye serian los elementos de la misma
        
        listapersona = consultarListaPersonas();
        
        ArrayList<String> titulolista = new ArrayList<>();
        titulolista.add("Documento");
        titulolista.add("Nombre");
        titulolista.add("Direccion");
        titulolista.add("Telefono");
        titulolista.add("Profesion");
        titulolista.add("Edad");
        titulolista.add("Nota1");
        titulolista.add("Nota2");
        titulolista.add("Nota3");
        titulolista.add("Promedio");
        titulolista.add("");
        titulolista.add("");

        //asignar las columnas al arrelgo para enviar al momento de construir la tabla
        //de construir la tabla
        
        String titulos[] = new String[titulolista.size()];
        for(int i = 0; i < titulos.length; i++){
            titulos[i] = titulolista.get(i);
        }
        
        //obtenemos los datos de la lista y los guardamos en la
        //matriz
        
        Objetc[][] data = obtenerMatrizDatos();
        construirTabla(titulo, data);
        
    }
    
    private AbstractList<Persona> consultarListaPersonas(){
        //precarga de datos
        ArrayList<Personas> lista = new ArrayList<>();
        
        lista.add(new Persona("1234","Juanito perez montecinos",
                "vive cerca","1234567890", "Ing",
                20, 6, 7 8, (6+7+8)/30));
        lista.add(new Persona("1234","Juanita perez montecinos",
                "vive cerca","1234567890", "Ing",
                22, 6, 7 8, (6+7+8)/30));
        return lista;
    }
    
    private Object[][] obtenerMatrizDatos(ArrayList<String> titulolista){
        //matriz debe de ser dinamica pues corresponde a todos los usuarios
        String informacion[][] = 
                new String[listapersona.size()][titulolista.size()];
        //llenar la matriz
        
        for(int x = 0; i<informacion.length; x++){
            informacion[x][Utilidades.DOCUMENTO] = 
                    listapersona.get(x).getDocumento()+ " ";
            informacion[x][Utilidades.NOMBRE] = 
                    listapersona.get(x).getNombre()+ " ";
            informacion[x][Utilidades.DIRECCION] = 
                    listapersona.get(x).getDireccion()+ " ";
            informacion[x][Utilidades.TELEFONO] = 
                    listapersona.get(x).getTelefono()+ " ";
            informacion[x][Utilidades.PROFESION] = 
                    listapersona.get(x).getProfesion()+ " ";
            informacion[x][Utilidades.EDAD] = 
                    listapersona.get(x).getEdad()+ " ";
            informacion[x][Utilidades.NOTA1] = 
                    listapersona.get(x).getNota1()+ " ";
            informacion[x][Utilidades.NOTA2] = 
                    listapersona.get(x).getNota2()+ " ";
            informacion[x][Utilidades.NOTA3] = 
                    listapersona.get(x).getNota3()+ " ";
            informacion[x][Utilidades.PROMEDIO] = 
                    listapersona.get(x).getPromedio()+ " ";
            //los utlimos dos para los eventos
            informacion[x][Utilidades.PERFIL] = "PERFIL";
            informacion[x][Utilidades.EVENTO] = "EVENTO";
        }
        return informacion;
    }
    private void construirTabla(String[] titulos, Object[][] data){
        modelo = new ModeloTabla(data, titulos);
        //asigno el modelo
        tablaPersonas.setModel(modelo);
        filasTabla = tablaPersonas.getRowCount();
        columnasTabla = tablaPersonas.getColumnCount();
        
        //asigno el tipo de dato que tendran las celdas
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.EDAD).setCellRenderer(
                        new GestionCeldas("numerico"));//tener formato a lo que no seran cadena
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.NOTA1).setCellRenderer(
                        new GestionCeldas("numerico"));
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.NOTA2).setCellRenderer(
                        new GestionCeldas("numerico"));
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.NOTA3).setCellRenderer(
                        new GestionCeldas("numerico"));
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.PROMEDIO).setCellRenderer(
                        new GestionCeldas("numero"));
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.PERFIL).setCellRenderer(
                        new GestionCeldas("icono"));
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.EVENTO).setCellRenderer(
                        new GestionCeldas("icono"));
        //debemos de recorrer el resto y asinar 
        for(int i = 0; i < titulos.length-7; i++){
            System.out.println(i);
            tablaPersonas.getColumnModel().getColumn(
                    i).setCellRenderer(
                            new GestionCeldas("texto"));
            
        }
        
        tablaPersonas.getTableHeader().setReorderingAllowed(false);
        tablaPersonas.setRowHeight(25);
        tablaPersonas.setGridColor(new java.awt.Color(0,0,0));
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.DOCUMENTO).setPreferredWidth(
                        130);
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.NOMBRE).setPreferredWidth(
                        300);
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.DIRECCION).setPreferredWidth(
                        400);
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.TELEFONO).setPreferredWidth(
                        130);
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.PROFESION).setPreferredWidth(
                        280);
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.EDAD).setPreferredWidth(
                        100);
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.NOTA1).setPreferredWidth(
                        100);
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.NOTA2).setPreferredWidth(
                        100);
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.NOTA3).setPreferredWidth(
                        100);
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.PROMEDIO).setPreferredWidth(
                        100);
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.PERFIL).setPreferredWidth(
                        50);
        tablaPersonas.getColumnModel().getColumn(
                Utilidades.EVENTO).setPreferredWidth(
                        50);
        
        //encabezado
        JTableHader jtableheader = tablaPersonas.getTableHeader();
        jtableheader.setDefaulRender(new GestionEncabezadoTable());
        tablaPersonas.setTableHeader(jtableheader);
            
        //le agrego el scroll
        scrollPaneTable.setViewportView(tablaPersonas);
        
    }
    
    
    
    
    
    
    @Override
    public void mouseClicked(MouseEvent e){
        throw new UnsupportedOperationException("Not supported yet.");
    }
   
    @Override
    public void mousePressed(MouseEvent e){
         throw new UnsupportedOperationException("Not supported yet.");
    }
        
        
}
