/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg12calculadora;

/**
 *
 * @author Atlai Camero
 */
//import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//implementar metodos abstractos
//cada boton va tener un acton event, y funcionan cuando le de click
public class Interfaz extends JFrame implements ActionListener{
    private ActionListener Interfaz;
    
    //FondoPanel fondo = new FondoPanel();
    //ActionListener actionListener = Interfaz;
    //vamos armar la computadora
    
    //deifinimos los campos
    JTextField textnum1;
    JTextField textnum2;
    
    //definimos los botones. con sus respetivos nombres para cada boton
    JButton btnSuma;
    JButton btnResta;
    JButton btnProducto;
    JButton btnDivision;
    JButton btnBorrador;
    JButton btnSeno;
    JButton btnCoseno;
    JButton btnTangente;
    JButton potencia;
    JButton raiz;
    
    //definimos las etiquetas
    JLabel numero1;
    JLabel numero2;
    JLabel resultado;
    JLabel mostrarResultado;
    
    
    //crear el panel para incorporar los componentes
    JPanel panel = (JPanel)this.getContentPane();
    //esto es mi contenedor de mi interfaz
    
   
    
    //constructor
    public Interfaz(){
        //inicializo los elementos del frame o ventana
        setLayout(null); //no mando margen, solo sale solito
        //La localizacion
        setLocation(100, 90);
        //this.setContentPane(fondo);
        /*
            donde le doy propiedades redimencional
            "donde no cambia el tamaño"
        */
        setResizable(false);
        //alto y largo
        setSize(600, 600);
        //opciones de salir
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //crear el metodo para la carga de los componentes
        componentes();
    }
    
    private void componentes() {
        //empiezo con sus definiciones
        //no cargue absolutamente nada, la carga de etiqueta
        panel.setLayout(null);
        panel.setBackground(Color.ORANGE); //darle color a la pantalla
        //carga de etiqueta
        numero1 = new JLabel("Numero 1");
        numero1.setBounds(10, 10, 70, 30);
        panel.add(numero1);
        
        //para etiqueta 2
        numero2 = new JLabel("Numero 2");
        numero2.setBounds(10, 100, 70, 30);
        panel.add(numero2);
        
        //etiqueta resultado
        resultado = new JLabel("Resultado: ");
        resultado.setBounds(10, 140, 70, 30);
        panel.add(resultado);
        
        //mandar a mostrar el resultado pero estara vacio----------------------------------
        mostrarResultado = new JLabel("");
        mostrarResultado.setBounds(100, 140, 375, 30);
        panel.add(mostrarResultado);  
        
        //agrego los campos
        textnum1 = new JTextField();
        textnum1.setBounds(100,10,70,30);
        panel.add(textnum1);
       
        textnum2 = new JTextField();
        textnum2.setBounds(100,100,70,30);
        panel.add(textnum2);
       
        
        //mi action para "solucionar el error"
        //agrego los botones
        //suma     
        btnSuma = new JButton("+");
        btnSuma.setBounds(100, 200, 50, 50);
        panel.add(btnSuma);
        //agrego el listener
        btnSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                Operaciones op = new Operaciones();
                //transformalo
                try{
                    if(event.getSource() == btnSuma){
                    double num1 = Double.parseDouble(textnum1.getText());
                    op.setNum1(num1);
                    double num2 = Double.parseDouble(textnum2.getText());
                    op.setNum2(num2);
                    mostrarResultado.setText(String.valueOf(op.suma()));
                }} catch(NumberFormatException e){
                        mostrarResultado.setText("Falto colocar numero en la casilla 1 o en casilla 2");
                    }
            }
        });
        
        /*nota:  ActionListener actionListener = Interfaz; y
            btnSuma.addActionListener(actionListener);
            como en la suma voy intentar replicalo en las
            demas
        */
        
        //resta
        btnResta = new JButton("-");
        btnResta.setBounds(200, 200, 50, 50);
        panel.add(btnResta);
        //agrego el listener
        btnResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                Operaciones op = new Operaciones();
                //transformacion
                //resta
                try{
                    if(event.getSource() == btnResta){
                    double num1 = Double.parseDouble(textnum1.getText());
                    op.setNum1(num1);
                    double num2 = Double.parseDouble(textnum2.getText());
                    op.setNum2(num2);
                    mostrarResultado.setText(String.valueOf(op.resta()));
                    }
                }catch(NumberFormatException ex){
                    mostrarResultado.setText("Falto colocar numero en la casilla 1 o en casilla 2");
                }
                    
            }
        });
        
        //producto
        btnProducto = new JButton("*");
        btnProducto.setBounds(300, 200, 50, 50);
        panel.add(btnProducto);
        //agrego el listener
        btnProducto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                Operaciones op = new Operaciones();
                try{
                    if(event.getSource() == btnProducto){
                    double num1 = Double.parseDouble(textnum1.getText());
                    op.setNum1(num1);
                    double num2 = Double.parseDouble(textnum2.getText());
                    op.setNum2(num2);
                    mostrarResultado.setText(String.valueOf(op.producto()));
                    }
                }catch(NumberFormatException ex){
                    mostrarResultado.setText("Falto colocar numero en la casilla 1 o en casilla 2");
                }
            }
        });
        
        //division
        btnDivision = new JButton("/");
        btnDivision.setBounds(400, 200, 50, 50);
        panel.add(btnDivision);
        //agrego el listener
        btnDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                Operaciones op = new Operaciones();
                try {
                    if(event.getSource() == btnDivision){
                    double num1 = Double.parseDouble(textnum1.getText());
                    op.setNum1(num1);
                    double num2 = Double.parseDouble(textnum2.getText());
                    op.setNum2(num2);
                    mostrarResultado.setText(String.valueOf(op.division()));
                    }
                } catch (NumberFormatException e) {
                    mostrarResultado.setText("Falto colocar numero en la casilla 1 o en casilla 2");
                }
            }
        });
        
        //borrador
        btnBorrador = new JButton("Borrador");
        btnBorrador.setBounds(340, 420, 100, 50);
        panel.add(btnBorrador);
        btnBorrador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textnum1.setText("");//borrar el contenido de campo1 = textnum1
                textnum2.setText("");//borra el contenido de campo2 = textnum2
                mostrarResultado.setText("");
            }
        });
        
        //seno
        btnSeno = new JButton("Seno");
        btnSeno.setBounds(100, 350, 100, 50);
        panel.add(btnSeno);
        btnSeno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double anguloGrados = Double.parseDouble(textnum1.getText());
                    double anguloRadianes = Math.toRadians(anguloGrados);
                    double seno = Math.sin(anguloRadianes);
                    mostrarResultado.setText(String.valueOf(seno));
                } catch (NumberFormatException ex) {
                    mostrarResultado.setText("Entrada inválida");
                    mostrarResultado.setText("NO en la casiila 2");
                }
            }
        });
        
        //coseno
        btnCoseno = new JButton("Coseno");
        btnCoseno.setBounds(220, 350, 100, 50);
        panel.add(btnCoseno);
        btnCoseno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double anguloGrados = Double.parseDouble(textnum1.getText());
                    double anguloRadianes = Math.toRadians(anguloGrados);
                    double coseno = Math.cos(anguloRadianes);
                    mostrarResultado.setText(String.valueOf(coseno));
                } catch (NumberFormatException ex) {
                    mostrarResultado.setText("Porfavor en la casilla 1, No en la 2");
                }
            }
        });
        
        //aqui terminar y hacer la tangente potencia y raiz y tratar de poner imagen--------------------------------------
        
        //tangente
        btnTangente = new JButton("Tangente");
        btnTangente.setBounds(340, 350, 100, 50);
        panel.add(btnTangente);
        btnTangente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                try {
                    double anguloGrados = Double.parseDouble(textnum1.getText());
                    double anguloRadianes = Math.toRadians(anguloGrados);
                    double tangente = Math.tan(anguloRadianes);
                    mostrarResultado.setText(String.valueOf(tangente));
                } catch (NumberFormatException ex) {
                    mostrarResultado.setText("Porfavor en la casilla 1, No en la 2");
                }
            }
        });
        
        //potencia
        potencia = new JButton("Potencia");
        potencia.setBounds(100, 420, 100, 50);
        panel.add(potencia);
        potencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                 try {
                    double base = Double.parseDouble(textnum1.getText());
                    double exponente = Double.parseDouble(textnum2.getText());
                    double resultado = Math.pow(base, exponente);
                    mostrarResultado.setText(String.valueOf(resultado));
                } catch (NumberFormatException ex) {
                    mostrarResultado.setText("Falto colocar potencia la casilla 2,o el numero a elevar en casilla 1");   
                }
            }
        });
        
        //raiz
        raiz = new JButton("Raiz");
        raiz.setBounds(220, 420,100, 50);
        panel.add(raiz);
        raiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                 try {
                    double numero = Double.parseDouble(textnum1.getText());
                    if (numero >= 0) {
                        double resultado = Math.sqrt(numero);
                        mostrarResultado.setText(String.valueOf(resultado));
                    } else {
                        mostrarResultado.setText("Número inválido, porfavor vuelve a intentar");
                    }
                } catch (NumberFormatException ex) {
                    mostrarResultado.setText("Entrada inválida");
                }
            }
        });
        
        
        
    }
    //repetir para los demas resta, producto y division

   
    /*@Override 
    public void actionPerformed(ActionEvent event) {
        //aprender a diferenciar cada operacion del boton
        //instancia de operaciones
        Operaciones op = new Operaciones();
        //transformalo
        if(event.getSource() == btnSuma){
            double num1 = Double.parseDouble(textnum2.getText());
            op.setNum1(num1);
            double num2 = Double.parseDouble(textnum1.getText());
            op.setNum1(num2);
            mostrarResultado.setText(String.valueOf(op.suma()));
        }
        //resta
        if(event.getSource() == btnResta){
            double num1 = Double.parseDouble(textnum2.getText());
            op.setNum1(num1);
            double num2 = Double.parseDouble(textnum1.getText());
            op.setNum2(num2);
            mostrarResultado.setText(String.valueOf(op.resta()));
        }
        //producto
        if(event.getSource() == btnProducto){
            double num1 = Double.parseDouble(textnum2.getText());
            op.setNum1(num1);
            double num2 = Double.parseDouble(textnum1.getText());
            op.setNum2(num2);
            mostrarResultado.setText(String.valueOf(op.producto()));
        }
        //division
        if(event.getSource() == btnDivision){
            double num1 = Double.parseDouble(textnum2.getText());
            op.setNum1(num1);
            double num2 = Double.parseDouble(textnum1.getText());
            op.setNum2(num2);
            mostrarResultado.setText(String.valueOf(op.division()));
        }
    }*/

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
   
    
}
    
