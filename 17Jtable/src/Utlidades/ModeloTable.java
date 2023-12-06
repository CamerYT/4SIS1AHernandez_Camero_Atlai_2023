/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utlidades;

/**
 *
 * @author Atlai Camero
 * 
 */

import javax.swing.table.DefaultTableModel;

public class ModeloTable extends DefaultTableModel{
    //heredar los elemento de la interfaz
    String[] titulos;
    Object[][] datos;//bidimencionales
    
    public ModeloTable(){
        
    }
    //hacerlo a la antigua para definir varios tipos de constructores
    
    //primer constructor = cuando se agregan los datos con un titulo
    //estos le van a pertener alguien 
    public ModeloTable(Object[][] datos, String[] titulos){
        super();
        this.titulos = titulos;
        this.datos = datos;
        setDataVector(datos, titulos);//lo que vamos a definir
        //asi cuando lo vamos a mandar en su interfaz
    }
    
    //y aqui puede ser que manden los titulos y despues los datos
    public ModeloTable(String[] titulos, Object[][] datos){
        super();
        this.titulos = titulos;
        this.datos = datos;
        setDataVector(datos, titulos);//lo que vamos a definir
        //asi cuando lo vamos a mandar en su interfaz
    }
    
    //definir si una celda puede ser o no editada
    public boolean isCellEditable(int row, int column){
        if(column != Utilidades.PERFIL && column != Utilidades.EVENTO && 
                column != Utilidades.NOTA1 && column != Utilidades.NOTA2 &&
                column != Utilidades.NOTA3){//saber quien es quien
            return false;
        }else{ //osea si son diferentes no puede editar y si es un si lo puede editar
            return true;
        }
    }
      
    
    
    
}
