/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import backend.restaurantsManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author aaminahv
 */
public class mainScreen extends javax.swing.JFrame {

    /**
     * Creates new form mainScreen
     */
    public mainScreen() throws SQLException {
        
        initComponents();
        
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel ((restaurantsManager.getCities()).toArray());
	cityCombo.setModel(comboModel);
        
      
	
        
        
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // </editor-fold>
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        aboutScreen = new javax.swing.JLabel();
        profileScreen = new javax.swing.JLabel();
        logoutButton = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cityCombo = new javax.swing.JComboBox<>();
        outputTextArea = new javax.swing.JLabel();
        restaurantComboBox = new javax.swing.JComboBox<>();
        confirmButton = new javax.swing.JButton();
        profileScreen1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(234, 221, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(103, 80, 164));

        aboutScreen.setFont(new java.awt.Font("Arima Madurai", 1, 20)); // NOI18N
        aboutScreen.setForeground(new java.awt.Color(255, 255, 255));
        aboutScreen.setText("About");

        profileScreen.setFont(new java.awt.Font("Arima Madurai", 1, 20)); // NOI18N
        profileScreen.setForeground(new java.awt.Color(255, 255, 255));
        profileScreen.setText("Profile");
        profileScreen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileScreenMouseClicked(evt);
            }
        });

        logoutButton.setFont(new java.awt.Font("Arima Madurai", 1, 20)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(33, 0, 93));
        logoutButton.setText("Logout");
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });

        exit.setFont(new java.awt.Font("Arima Madurai", 1, 18)); // NOI18N
        exit.setText("x");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arima Madurai", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NAME");

        cityCombo.setFont(new java.awt.Font("Arima Madurai", 1, 14)); // NOI18N
        cityCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose your city", "Durban", "Johannesburg", "Cape Town" }));
        cityCombo.setBorder(null);
        cityCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityComboActionPerformed(evt);
            }
        });

        outputTextArea.setFont(new java.awt.Font("Arima Madurai", 0, 15)); // NOI18N
        outputTextArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        outputTextArea.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        outputTextArea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(33, 0, 93), 3, true));

        restaurantComboBox.setFont(new java.awt.Font("Arima Madurai", 1, 14)); // NOI18N
        restaurantComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose your restaurant", "" }));
        restaurantComboBox.setBorder(null);
        restaurantComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaurantComboBoxActionPerformed(evt);
            }
        });

        confirmButton.setBackground(new java.awt.Color(33, 0, 93));
        confirmButton.setFont(new java.awt.Font("Arima Madurai", 1, 18)); // NOI18N
        confirmButton.setForeground(new java.awt.Color(255, 255, 255));
        confirmButton.setText("CONFIRM");
        confirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmButtonMouseClicked(evt);
            }
        });

        profileScreen1.setFont(new java.awt.Font("Arima Madurai", 1, 20)); // NOI18N
        profileScreen1.setForeground(new java.awt.Color(255, 255, 255));
        profileScreen1.setText("Bookings");
        profileScreen1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileScreen1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cityCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(confirmButton)
                            .addComponent(restaurantComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 209, Short.MAX_VALUE)))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(aboutScreen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(profileScreen1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(profileScreen)
                        .addGap(20, 20, 20)
                        .addComponent(logoutButton))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel7)))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(outputTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aboutScreen)
                            .addComponent(profileScreen)
                            .addComponent(logoutButton)
                            .addComponent(profileScreen1)))
                    .addComponent(exit))
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(cityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(restaurantComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(confirmButton))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(outputTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        // TODO add your handling code here:
        loginScreen lsc = new loginScreen();
        lsc.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void profileScreenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileScreenMouseClicked
        // TODO add your handling code here:
        profileScreen psc = new profileScreen();
        psc.setVisible(true);
        dispose();
    }//GEN-LAST:event_profileScreenMouseClicked

    private void cityComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityComboActionPerformed
        try {
            // TODO add your handling code here:
            String selectedCity = (String) cityCombo.getSelectedItem();
            DefaultComboBoxModel comboModel1 = new DefaultComboBoxModel ((restaurantsManager.getRestaurants(selectedCity)).toArray());  
            restaurantComboBox.setModel(comboModel1);
        } catch (SQLException ex) {
            Logger.getLogger(mainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
       
    }//GEN-LAST:event_cityComboActionPerformed

    private void confirmButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButtonMouseClicked
        // TODO add your handling code here:
               try {
            // TODO add your handling code here:
            menuScreen mnS = new menuScreen();
            mnS.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            System.out.println("ERROR");
        }
     
    }//GEN-LAST:event_confirmButtonMouseClicked

    private void profileScreen1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileScreen1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_profileScreen1MouseClicked

    private void restaurantComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaurantComboBoxActionPerformed
        try {
            // TODO add your handling code here:
            String restaurant = (String) restaurantComboBox.getSelectedItem();
            outputTextArea.setText(restaurantsManager.getDesc(restaurant));
        } catch (SQLException ex) {
            Logger.getLogger(mainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_restaurantComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(mainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new mainScreen().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(mainScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aboutScreen;
    private javax.swing.JComboBox<String> cityCombo;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel7;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel logoutButton;
    private javax.swing.JLabel outputTextArea;
    private javax.swing.JLabel profileScreen;
    private javax.swing.JLabel profileScreen1;
    public static javax.swing.JComboBox<String> restaurantComboBox;
    // End of variables declaration//GEN-END:variables

  
}