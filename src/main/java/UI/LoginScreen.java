/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import backend.SqlManager;
import backend.UserManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author aaminahv
 */
public class LoginScreen extends javax.swing.JFrame {
    public static String user = "";
    /**
     * Creates new form loginScreen
     */
    public LoginScreen() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        nameTextField = new javax.swing.JTextField();
        passwordtextField = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        signupButton = new javax.swing.JButton();
        signinButton = new javax.swing.JButton();
        exit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        showPasswordButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(234, 221, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_logo-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(103, 80, 164));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameTextField.setBackground(new java.awt.Color(103, 80, 164));
        nameTextField.setFont(new java.awt.Font("Arima Madurai", 1, 18)); // NOI18N
        nameTextField.setForeground(new java.awt.Color(255, 255, 255));
        nameTextField.setText("Username");
        nameTextField.setBorder(null);
        nameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameTextFieldMouseClicked(evt);
            }
        });
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });
        jPanel3.add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 185, 30));

        passwordtextField.setBackground(new java.awt.Color(103, 80, 164));
        passwordtextField.setFont(new java.awt.Font("Arima Madurai", 1, 18)); // NOI18N
        passwordtextField.setForeground(new java.awt.Color(255, 255, 255));
        passwordtextField.setText("Password");
        passwordtextField.setBorder(null);
        passwordtextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordtextFieldMouseClicked(evt);
            }
        });
        passwordtextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtextFieldActionPerformed(evt);
            }
        });
        jPanel3.add(passwordtextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 160, 30));

        jSeparator1.setBackground(new java.awt.Color(33, 0, 93));
        jSeparator1.setForeground(new java.awt.Color(33, 0, 93));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 200, 10));

        jSeparator3.setBackground(new java.awt.Color(33, 0, 93));
        jSeparator3.setForeground(new java.awt.Color(33, 0, 93));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 200, 10));

        signupButton.setBackground(new java.awt.Color(33, 0, 93));
        signupButton.setFont(new java.awt.Font("Arima Madurai", 1, 18)); // NOI18N
        signupButton.setForeground(new java.awt.Color(255, 255, 255));
        signupButton.setText("SIGNUP");
        signupButton.setBorder(null);
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });
        jPanel3.add(signupButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 90, 30));

        signinButton.setBackground(new java.awt.Color(33, 0, 93));
        signinButton.setFont(new java.awt.Font("Arima Madurai", 1, 18)); // NOI18N
        signinButton.setForeground(new java.awt.Color(255, 255, 255));
        signinButton.setText("LOGIN");
        signinButton.setBorder(null);
        signinButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signinButtonMouseClicked(evt);
            }
        });
        signinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinButtonActionPerformed(evt);
            }
        });
        jPanel3.add(signinButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 90, 30));

        exit.setFont(new java.awt.Font("Arima Madurai", 1, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(234, 221, 255));
        exit.setText("x");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel3.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 17, -1));

        jLabel2.setFont(new java.awt.Font("Arima Madurai", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LOGIN");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-lock-39.png"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 40, 40));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-user-38.png"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 40, 30));

        showPasswordButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye.png"))); // NOI18N
        showPasswordButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showPasswordButtonMouseClicked(evt);
            }
        });
        jPanel3.add(showPasswordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 50, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void passwordtextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordtextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordtextFieldActionPerformed

    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonActionPerformed
        // TODO add your handling code here:
        SignupScreen sc = new SignupScreen();
        sc.setVisible(true);
        dispose();

    }//GEN-LAST:event_signupButtonActionPerformed

    private void signinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinButtonActionPerformed
        // TODO add your handling code here:
        String userInput = nameTextField.getText();
        String pass = String.valueOf(passwordtextField.getPassword());
        user = userInput;

        boolean loginResult;
        try {
            loginResult = UserManager.checkPassword(userInput, pass);
            if (loginResult)
            {
                JOptionPane.showMessageDialog(null, "Your details are correct", "Information", JOptionPane.INFORMATION_MESSAGE);
                MainScreen msc = new MainScreen();
                dispose();
                msc.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Your details are Incorrect", "Warning", JOptionPane.WARNING_MESSAGE);            
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       

       
    }//GEN-LAST:event_signinButtonActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void signinButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinButtonMouseClicked
        // TODO add your handling code here:
    
    }//GEN-LAST:event_signinButtonMouseClicked

    private void nameTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameTextFieldMouseClicked
        // TODO add your handling code here:
        nameTextField.setText("");
    }//GEN-LAST:event_nameTextFieldMouseClicked

    private void passwordtextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordtextFieldMouseClicked
        // TODO add your handling code here:
        passwordtextField.setText("");

    }//GEN-LAST:event_passwordtextFieldMouseClicked

    private void showPasswordButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPasswordButtonMouseClicked
        // TODO add your handling code here:
        //show password
        passwordtextField.setEchoChar((char)0);

    }//GEN-LAST:event_showPasswordButtonMouseClicked

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
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JPasswordField passwordtextField;
    private javax.swing.JLabel showPasswordButton;
    private javax.swing.JButton signinButton;
    private javax.swing.JButton signupButton;
    // End of variables declaration//GEN-END:variables
}
