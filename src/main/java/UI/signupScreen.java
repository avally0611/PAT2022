/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import backend.userManager;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Aaminah1
 */
public class signupScreen extends javax.swing.JFrame {

    /**
     * Creates new form signupScreen
     */
    public signupScreen() {
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
        jPanel3 = new javax.swing.JPanel();
        passwordTextField = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        signupButton = new javax.swing.JButton();
        lastNameTextField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        numberTextField = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        firstNameTextField = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        usernameTextField = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        exit = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        emailTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(234, 221, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(103, 80, 164));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwordTextField.setBackground(new java.awt.Color(103, 80, 164));
        passwordTextField.setFont(new java.awt.Font("Arima Madurai", 1, 18)); // NOI18N
        passwordTextField.setForeground(new java.awt.Color(255, 255, 255));
        passwordTextField.setText("Password");
        passwordTextField.setBorder(null);
        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });
        jPanel3.add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 185, 30));

        jSeparator1.setBackground(new java.awt.Color(33, 0, 93));
        jSeparator1.setForeground(new java.awt.Color(33, 0, 93));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 130, 10));

        jSeparator3.setBackground(new java.awt.Color(33, 0, 93));
        jSeparator3.setForeground(new java.awt.Color(33, 0, 93));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 130, 40));

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
        jPanel3.add(signupButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 130, 30));

        lastNameTextField.setBackground(new java.awt.Color(103, 80, 164));
        lastNameTextField.setFont(new java.awt.Font("Arima Madurai", 1, 18)); // NOI18N
        lastNameTextField.setForeground(new java.awt.Color(255, 255, 255));
        lastNameTextField.setText("last name...");
        lastNameTextField.setBorder(null);
        lastNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTextFieldActionPerformed(evt);
            }
        });
        jPanel3.add(lastNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 185, 30));

        jSeparator2.setBackground(new java.awt.Color(33, 0, 93));
        jSeparator2.setForeground(new java.awt.Color(33, 0, 93));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 130, 10));

        numberTextField.setBackground(new java.awt.Color(103, 80, 164));
        numberTextField.setFont(new java.awt.Font("Arima Madurai", 1, 18)); // NOI18N
        numberTextField.setForeground(new java.awt.Color(255, 255, 255));
        numberTextField.setText("number...");
        numberTextField.setBorder(null);
        numberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberTextFieldActionPerformed(evt);
            }
        });
        jPanel3.add(numberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 185, 30));

        jSeparator4.setBackground(new java.awt.Color(33, 0, 93));
        jSeparator4.setForeground(new java.awt.Color(33, 0, 93));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 130, 10));

        firstNameTextField.setBackground(new java.awt.Color(103, 80, 164));
        firstNameTextField.setFont(new java.awt.Font("Arima Madurai", 1, 18)); // NOI18N
        firstNameTextField.setForeground(new java.awt.Color(255, 255, 255));
        firstNameTextField.setText("first name...");
        firstNameTextField.setBorder(null);
        firstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextFieldActionPerformed(evt);
            }
        });
        jPanel3.add(firstNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 185, 30));

        jSeparator5.setBackground(new java.awt.Color(33, 0, 93));
        jSeparator5.setForeground(new java.awt.Color(33, 0, 93));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 130, 40));

        usernameTextField.setBackground(new java.awt.Color(103, 80, 164));
        usernameTextField.setFont(new java.awt.Font("Arima Madurai", 1, 18)); // NOI18N
        usernameTextField.setForeground(new java.awt.Color(255, 255, 255));
        usernameTextField.setText("username...");
        usernameTextField.setBorder(null);
        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });
        jPanel3.add(usernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 185, 30));

        jSeparator6.setBackground(new java.awt.Color(33, 0, 93));
        jSeparator6.setForeground(new java.awt.Color(33, 0, 93));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 130, 10));

        exit.setFont(new java.awt.Font("Arima Madurai", 1, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(234, 221, 255));
        exit.setText("x");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel3.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 17, -1));

        jSeparator7.setBackground(new java.awt.Color(33, 0, 93));
        jSeparator7.setForeground(new java.awt.Color(33, 0, 93));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 130, 10));

        emailTextField1.setBackground(new java.awt.Color(103, 80, 164));
        emailTextField1.setFont(new java.awt.Font("Arima Madurai", 1, 18)); // NOI18N
        emailTextField1.setForeground(new java.awt.Color(255, 255, 255));
        emailTextField1.setText("email...");
        emailTextField1.setBorder(null);
        emailTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextField1ActionPerformed(evt);
            }
        });
        jPanel3.add(emailTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 185, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
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

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextFieldActionPerformed

    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonActionPerformed
        // TODO add your handling code here:
        String lastName = lastNameTextField.getText();
        String firstName = firstNameTextField.getText();
        String email = lastNameTextField.getText();
        String number = numberTextField.getText();
        String username = usernameTextField.getText();
        String password = String.valueOf(passwordTextField.getPassword());
        
        try {
            userManager.addUser(firstName, lastName, email, number, username, password);
            loginScreen.user = username;
            JOptionPane.showMessageDialog(null, "SIGNUP SUCCESSFUL", "SIGNUP", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(signupScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_signupButtonActionPerformed

    private void lastNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameTextFieldActionPerformed

    private void numberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberTextFieldActionPerformed

    private void firstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextFieldActionPerformed

    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextFieldActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void emailTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void signUpScreen(String args[]) {
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
            java.util.logging.Logger.getLogger(signupScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signupScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signupScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signupScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signupScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailTextField1;
    private javax.swing.JLabel exit;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JTextField numberTextField;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JButton signupButton;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
