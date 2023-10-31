/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg11ventanita;

/**
 *
 * @author Atlai Camero
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AutenticacionUsuarioJFrame {
    private static final String USUARIO_FICTICIO = "user";
    private static final String CONTRASENA_FICTICIA = "pass";

    public static void main(String[] args) {
        JFrame frame = new JFrame("Autenticación de Usuario");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        frame.add(panel);
        
        JLabel usuarioLabel = new JLabel("Usuario: ");
        JTextField usuarioTextField = new JTextField(20);

        JLabel contrasenaLabel = new JLabel("Contraseña: ");
        JPasswordField contrasenaField = new JPasswordField(20);

        JButton iniciarSesionButton = new JButton("Iniciar Sesión");

        panel.add(usuarioLabel);
        panel.add(usuarioTextField);
        panel.add(contrasenaLabel);
        panel.add(contrasenaField);
        panel.add(iniciarSesionButton);

        iniciarSesionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = usuarioTextField.getText();
                String contrasena = new String(contrasenaField.getPassword());

                if (usuario.equals(USUARIO_FICTICIO) && contrasena.equals(CONTRASENA_FICTICIA)) {
                    JOptionPane.showMessageDialog(frame, "Bienvenido");
                } else {
                    JOptionPane.showMessageDialog(frame, "Usuario inválido");
                }
            }
        });

        frame.setVisible(true);
    }
}
