/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import backend.profileManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Color;
/**
 *
 * @author Aaminah1
 */
public class profileScreen extends javax.swing.JFrame {

    /**
     * Creates new form profileScreen
     */
    public profileScreen() throws SQLException {
        initComponents();
        firstNameTextField.setText(profileManager.getFName());
        lastNameTextField.setText(profileManager.getLName());
        usernameTextField.setText(profileManager.getUsername());
        passwordTextField.setText(profileManager.getPassword());
        emailTextField1.setText(profileManager.getEmail());
        numberTextField.setText(profileManager.getPhone());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel5 = new keeptoo.KGradientPanel();
        emailTextField1 = new javax.swing.JTextField();
        numberTextField = new javax.swing.JTextField();
        usernameTextField = new javax.swing.JTextField();
        firstNameTextField = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        passwordTextField = new javax.swing.JPasswordField();
        lastNameTextField = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        kGradientPanel5.setFocusable(false);
        kGradientPanel5.setkEndColor(new java.awt.Color(234, 221, 255));
        kGradientPanel5.setkStartColor(new java.awt.Color(103, 80, 164));

        emailTextField1.setEditable(false);
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

        numberTextField.setEditable(false);
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

        usernameTextField.setEditable(false);
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

        firstNameTextField.setEditable(false);
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

        jSeparator5.setBackground(new java.awt.Color(33, 0, 93));
        jSeparator5.setForeground(new java.awt.Color(33, 0, 93));
        jSeparator5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(33, 0, 93), 1, true));

        passwordTextField.setEditable(false);
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

        lastNameTextField.setEditable(false);
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

        updateButton.setBackground(new java.awt.Color(33, 0, 93));
        updateButton.setFont(new java.awt.Font("Arima Madurai", 1, 16)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("UPDATE");
        updateButton.setBorder(null);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        editButton.setBackground(new java.awt.Color(33, 0, 93));
        editButton.setFont(new java.awt.Font("Arima Madurai", 1, 16)); // NOI18N
        editButton.setForeground(new java.awt.Color(255, 255, 255));
        editButton.setText("EDIT");
        editButton.setBorder(null);
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arima Madurai", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("jLabel1");

        jSeparator8.setBackground(new java.awt.Color(33, 0, 93));
        jSeparator8.setForeground(new java.awt.Color(33, 0, 93));
        jSeparator8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(33, 0, 93), 1, true));

        jSeparator10.setBackground(new java.awt.Color(33, 0, 93));
        jSeparator10.setForeground(new java.awt.Color(33, 0, 93));
        jSeparator10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(33, 0, 93), 1, true));

        jSeparator11.setBackground(new java.awt.Color(33, 0, 93));
        jSeparator11.setForeground(new java.awt.Color(33, 0, 93));
        jSeparator11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(33, 0, 93), 1, true));

        jSeparator12.setBackground(new java.awt.Color(33, 0, 93));
        jSeparator12.setForeground(new java.awt.Color(33, 0, 93));
        jSeparator12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(33, 0, 93), 1, true));

        jSeparator13.setBackground(new java.awt.Color(33, 0, 93));
        jSeparator13.setForeground(new java.awt.Color(33, 0, 93));
        jSeparator13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(33, 0, 93), 1, true));

        javax.swing.GroupLayout kGradientPanel5Layout = new javax.swing.GroupLayout(kGradientPanel5);
        kGradientPanel5.setLayout(kGradientPanel5Layout);
        kGradientPanel5Layout.setHorizontalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel5Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(firstNameTextField)
                            .addComponent(lastNameTextField)
                            .addComponent(emailTextField1)
                            .addComponent(numberTextField)
                            .addComponent(usernameTextField)
                            .addComponent(passwordTextField)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29))
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel5Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel5Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel5Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel5Layout.setVerticalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel5Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addComponent(editButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateButton)
                .addGap(17, 17, 17))
        );

        emailTextField1.setBackground(new Color(0,0,0,0));
        numberTextField.setBackground(new Color(0,0,0,0));
        usernameTextField.setBackground(new Color(0,0,0,0));
        firstNameTextField.setBackground(new Color(0,0,0,0));
        passwordTextField.setBackground(new Color(0,0,0,0));
        lastNameTextField.setBackground(new Color(0,0,0,0));

        getContentPane().add(kGradientPanel5);
        kGradientPanel5.setBounds(0, 0, 290, 484);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        firstNameTextField.isEditable();
        lastNameTextField.isEditable();
        usernameTextField.isEditable();
        passwordTextField.isEditable();
        emailTextField1.isEditable();
        numberTextField.isEditable();
    }//GEN-LAST:event_editButtonActionPerformed

    private void lastNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameTextFieldActionPerformed

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextFieldActionPerformed

    private void firstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextFieldActionPerformed

    private void numberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberTextFieldActionPerformed

    private void emailTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextField1ActionPerformed

    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextFieldActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        try {
            // TODO add your handling code here:
            profileManager.updateDetails(usernameTextField.getText(), passwordTextField.getText(), firstNameTextField.getText(), lastNameTextField.getText(), emailTextField1.getText(), numberTextField.getText());
            firstNameTextField.setText(profileManager.getFName());
            lastNameTextField.setText(profileManager.getLName());
            usernameTextField.setText(profileManager.getUsername());
            passwordTextField.setText(profileManager.getPassword());
            emailTextField1.setText(profileManager.getEmail());
            numberTextField.setText(profileManager.getPhone());
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(profileScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

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
            java.util.logging.Logger.getLogger(profileScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(profileScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(profileScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(profileScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new profileScreen().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(profileScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editButton;
    private javax.swing.JTextField emailTextField1;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator8;
    private keeptoo.KGradientPanel kGradientPanel5;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JTextField numberTextField;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
