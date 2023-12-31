
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Atlai Camero
 */
public class fromRecarga extends javax.swing.JFrame {

    /**
     * Creates new form fromRecarga
     */
    public fromRecarga() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Apartado de Recargas");
        SetImageIcon(imagenNino, "src/misImagenes/niñoCajero.jpg");
        SetImageIcon(logoAT, "src/misImagenes/logoCelAT.png");
        SetImageIcon(logoMovi, "src/misImagenes/logoMovistar.jpg");
        SetImageIcon(logoTel, "src/misImagenes/logoTelcel.jpg");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imagenNino = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        logoAT = new javax.swing.JLabel();
        logoMovi = new javax.swing.JLabel();
        logoTel = new javax.swing.JLabel();
        buttonAt = new javax.swing.JButton();
        buttonMovi = new javax.swing.JButton();
        buttonTel = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(239, 31, 31));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(51, 51, 51)));

        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hola, soy el Juan alias el (juancito), porfavor.");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Selecciona la compañia con el boton que tienen abajo.");

        logoAT.setBackground(new java.awt.Color(255, 255, 255));
        logoAT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        logoMovi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        logoTel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonAt.setBackground(new java.awt.Color(0, 0, 0));
        buttonAt.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        buttonAt.setForeground(new java.awt.Color(255, 255, 255));
        buttonAt.setText("Recarca AT&T");
        buttonAt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtActionPerformed(evt);
            }
        });

        buttonMovi.setBackground(new java.awt.Color(0, 0, 0));
        buttonMovi.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        buttonMovi.setForeground(new java.awt.Color(255, 255, 255));
        buttonMovi.setText("Recarga Movistar");
        buttonMovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMoviActionPerformed(evt);
            }
        });

        buttonTel.setBackground(new java.awt.Color(0, 0, 0));
        buttonTel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        buttonTel.setForeground(new java.awt.Color(255, 255, 255));
        buttonTel.setText("Recarga Telcel");
        buttonTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTelActionPerformed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(0, 0, 0));
        btnVolver.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver ");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(imagenNino, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(logoAT, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(logoMovi, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(logoTel, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(8, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(buttonAt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonMovi)
                .addGap(138, 138, 138)
                .addComponent(buttonTel)
                .addGap(141, 141, 141))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagenNino, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel1)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logoAT, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(logoMovi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoTel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAt)
                    .addComponent(buttonMovi)
                    .addComponent(buttonTel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtActionPerformed
        // recarga de AT&T
        String logAt = logoAT.getText();
        int op = 0;
        char seguirONo;
        String numeroCel;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la cantidad: \n " + 
                    "1.- Recarga de 20 \n" +
                    "2.- Recarga de 50 \n" + 
                    "3.- Recarga de 100 \n" + 
                    "4.- Recarga de 150 \n" + 
                    "5.- Salir"));
            switch(op){
                case 1:
                    numeroCel = JOptionPane.showInputDialog("Ingrese el numero: ");
                    JOptionPane.showMessageDialog(null,"Tu recibo \n" + " La recarga de 20 de A&YT \n" + 
                            " y su numero de celular es: " + numeroCel);
                    break;
                case 2:
                    numeroCel = JOptionPane.showInputDialog("Ingrese el numero: ");
                    JOptionPane.showMessageDialog(null,"Tu recibo \n" + " La recarga de 50 de A&YT \n" + 
                            " y su numero de celular es: " + numeroCel);
                    break;
                case 3:
                    numeroCel = JOptionPane.showInputDialog("Ingrese el numero: ");
                    JOptionPane.showMessageDialog(null,"Tu recibo \n" + " La recarga de 100 de A&YT \n" + 
                            " y su numero de celular es: " + numeroCel);
                    break;
                case 4:
                    numeroCel = JOptionPane.showInputDialog("Ingrese el numero: ");
                    JOptionPane.showMessageDialog(null,"Tu recibo \n" + " La recarga de 150 de A&YT \n" + 
                            " y su numero de celular es: " + numeroCel);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Gracias vuelva pronto!!");
                    break;
                default:
                    break;
            }
            seguirONo = JOptionPane.showInputDialog("¿Deseas hacer otra recarga?" + " [S] o [s] para Continuar o [n] o [N] para cancelar ").charAt(0);
            
        }while(seguirONo == 'S' || seguirONo == 's');
        JOptionPane.showMessageDialog(null, "Gracias vuelva pronto!!");
    }//GEN-LAST:event_buttonAtActionPerformed

    private void buttonMoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMoviActionPerformed
        // recarga Movistar
        String logAt = logoMovi.getText();
        int op = 0;
        char seguirONo;
        String numeroCel;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la cantidad: \n " + 
                    "1.- Recarga de 20 \n" +
                    "2.- Recarga de 50 \n" + 
                    "3.- Recarga de 100 \n" + 
                    "4.- Recarga de 150 \n" + 
                    "5.- Salir"));
            switch(op){
                case 1:
                    numeroCel = JOptionPane.showInputDialog("Ingrese el numero: ");
                    JOptionPane.showMessageDialog(null,"Tu recibo \n" + " La recarga de 20 de Movistar \n" + 
                            " y su numero de celular es: " + numeroCel);
                    break;
                case 2:
                    numeroCel = JOptionPane.showInputDialog("Ingrese el numero: ");
                    JOptionPane.showMessageDialog(null,"Tu recibo \n" + " La recarga de 50 de Movistar \n" + 
                            " y su numero de celular es: " + numeroCel);
                    break;
                case 3:
                    numeroCel = JOptionPane.showInputDialog("Ingrese el numero: ");
                    JOptionPane.showMessageDialog(null,"Tu recibo \n" + " La recarga de 100 de Movistar \n" + 
                            " y su numero de celular es: " + numeroCel);
                    break;
                case 4:
                    numeroCel = JOptionPane.showInputDialog("Ingrese el numero: ");
                    JOptionPane.showMessageDialog(null,"Tu recibo \n" + " La recarga de 150 de Movistar \n" + 
                            " y su numero de celular es: " + numeroCel);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Gracias vuelva pronto!!");
                    break;
                default:
                    break;
            }
            seguirONo = JOptionPane.showInputDialog("¿Deseas hacer otra recarga?" + " [S] o [s] para Continuar o [n] o [N] para cancelar ").charAt(0);
            
        }while(seguirONo == 'S' || seguirONo == 's');
        JOptionPane.showMessageDialog(null, "Gracias vuelva pronto!!");
    }//GEN-LAST:event_buttonMoviActionPerformed

    private void buttonTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTelActionPerformed
        // recarga Telcel
        String logAt = logoAT.getText();
        int op = 0;
        char seguirONo;
        String numeroCel;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la cantidad: \n " + 
                    "1.- Recarga de 20 \n" +
                    "2.- Recarga de 50 \n" + 
                    "3.- Recarga de 100 \n" + 
                    "4.- Recarga de 150 \n" + 
                    "5.- Salir"));
            switch(op){
                case 1:
                    numeroCel = JOptionPane.showInputDialog("Ingrese el numero: ");
                    JOptionPane.showMessageDialog(null,"Tu recibo \n" + " La recarga de 20 de Telcel \n" + 
                            " y su numero de celular es: " + numeroCel);
                    break;
                case 2:
                    numeroCel = JOptionPane.showInputDialog("Ingrese el numero: ");
                    JOptionPane.showMessageDialog(null,"Tu recibo \n" + " La recarga de 50 de Telcel \n" + 
                            " y su numero de celular es: " + numeroCel);
                    break;
                case 3:
                    numeroCel = JOptionPane.showInputDialog("Ingrese el numero: ");
                    JOptionPane.showMessageDialog(null,"Tu recibo \n" + " La recarga de 100 de Telcel \n" + 
                            " y su numero de celular es: " + numeroCel);
                    break;
                case 4:
                    numeroCel = JOptionPane.showInputDialog("Ingrese el numero: ");
                    JOptionPane.showMessageDialog(null,"Tu recibo \n" + " La recarga de 150 de Telcel \n" + 
                            " y su numero de celular es: " + numeroCel);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Gracias vuelva pronto!!");
                    break;
                default:
                    break;
            }
            seguirONo = JOptionPane.showInputDialog("¿Deseas hacer otra recarga?" + " [S] o [s] para Continuar o [n] o [N] para cancelar ").charAt(0);
            
        }while(seguirONo == 'S' || seguirONo == 's');
        JOptionPane.showMessageDialog(null, "Gracias vuelva pronto!!");
    }//GEN-LAST:event_buttonTelActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // btn para volver al menu de opciones
        login volverAlMenu = new login();
        volverAlMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fromRecarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fromRecarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fromRecarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fromRecarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fromRecarga().setVisible(true);
            }
        });
    }
    
    private void SetImageIcon(JLabel imagenNino, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(imagenNino.getWidth(), imagenNino.getHeight(), Image.SCALE_DEFAULT));
        imagenNino.setIcon(icon);
        this.repaint();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton buttonAt;
    private javax.swing.JButton buttonMovi;
    private javax.swing.JButton buttonTel;
    private javax.swing.JLabel imagenNino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoAT;
    private javax.swing.JLabel logoMovi;
    private javax.swing.JLabel logoTel;
    // End of variables declaration//GEN-END:variables
}
