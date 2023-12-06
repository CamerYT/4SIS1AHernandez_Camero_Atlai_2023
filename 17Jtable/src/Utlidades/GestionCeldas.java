/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utlidades;

/**
 *
 * @author Atlai Camero
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer; //especial 
//DefaultTableCellRenderer = este se encarga que exita las celdas dentro de la tabla

public class GestionCeldas extends DefaultTableCellRenderer{
    /*
    Esta calse nos permite gestionar la tabla y los eventos que se van
    a realizar dentro de ella haciendo que sea un objeto 
    personalizable cada celda
    */
    
    private String tipo = "text";
    
    //definimos los tipos de datos por defecto
    private Font normal = new Font("Verdana", Font.PLAIN, 12);
    private Font boid = new Font("Verdana", Font.BOLD, 12);
    
    private JLabel label = new JLabel();
    
    //aqui van agregar los iconos de busqueda
    /*getClass() = obtener la locacion, 
      getResource() = se obtiene el pack de recurso
    */
    private ImageIcon iconoGuardar = new ImageIcon(getClass().getResource("/Recursos/nombreImagen.png"));
    private ImageIcon iconoBuscar = new ImageIcon(getClass().getResource("/Recursos/nombreImagenBuscar.png"));
      
    public GestionCeldas(){
        
    }
    
    public GestionCeldas(String tipo){
        this.tipo = tipo;
    }
    
    //un metodo para que se encarga de manipular la tabla
    public Component getTableCellRenderComponent(JTable table, 
            Object value, boolean selected, boolean focused, 
            int row, int column){
        //definimos colores
        Color colorFondo = null;
        Color colorFondoPorDefecto = new Color(192,192,192);
        Color colorFondoSeleccionado = new Color(140,140,140);
    
        //Si la celda del evento esta seleccionada entonces adigno el color
        if(selected){
            this.setBackground(colorFondoPorDefecto);
        }else{
            //para las que no estan seleecionadas 
            this.setBackground(Color.white);
        }
        /*
        se definen los tipos de datos que contendran las celdas basado en
        la instancia y ventana de la tabla al momento de construirla
        */
        
        if(tipo.equals("texto")){
            //el tipo de texto define el colo de fondo y la tabla
            if(focused){
                colorFondo = colorFondoSeleccionado;
            }else{
                colorFondo = colorFondoPorDefecto;
            }
            
            this.setHorizontalAlignment(JLabel.LEFT);
            this.setText((String) value);
            this.setBackground((selected)? colorFondo : Color.white);
            this.setFont(boid);
        
            return this;
        }
        
        //el tipo es icono entonces valida cual icono es
        if(tipo.equals("icono")){
            if(String.valueOf(value).equals("PERFIL")){
                label.setIcon(iconoBuscar);
            }else if(String.valueOf(value).equals("EVENTO")){
                label.setIcon(iconoGuardar);//para que busquen
            }
            label.setHorizontalAlignment(JLabel.LEFT);
            label.setBorder(
                    javax.swing.BorderFactory.createBevelBorder(
                            javax.swing.border.BevelBorder.RAISED));
            return label;
        }
        
        //cuando sea un numero
        if(tipo.equals("numerico")){
            if(focused){
                colorFondo = colorFondoSeleccionado;
            }else{
                colorFondo = colorFondoPorDefecto;
            }
            this.setHorizontalAlignment(JLabel.CENTER);
            this.setText((String)value);
            this.setForeground((selected)? new Color(255,255,255): new Color(32,117,32));
            this.setBackground((selected)? colorFondo : Color.magenta);

            return this;
        }
    return this;
    }
  
 
}

