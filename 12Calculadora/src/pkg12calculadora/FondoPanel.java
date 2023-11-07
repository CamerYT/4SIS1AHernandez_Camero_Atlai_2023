/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg12calculadora;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Atlai Camero
 */

    class FondoPanel extends JPanel{
      private  Image imagen;
        private java.awt.Image img;
      
      @Override
      public void paint(Graphics g){
          imagen = new ImagenIcon(getClass().getResource("/pkg12calculadora.imagenes/fondoMorado.jpg")).getImage();
          g.drawImage(img, 0,0, getWidth(), getHeight(), this);
          setOpaque(false);
          super.paint(g);
      }
  }

