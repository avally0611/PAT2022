/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import static UI.MenuScreen.sectionsComboBox;
import static UI.ReservationScreen.id;
import backend.BasketManager;
import backend.MenuManager;
import backend.ReservationManager;
import java.awt.Color;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aaminah1
 */
public class BasketScreen extends javax.swing.JFrame {
    
    public static String type = "";

    /**
     * Creates new form basketScreen
     */
    public BasketScreen() throws SQLException {
        initComponents();
        
        deliveryRadio.setSelected(true);
        
        String colNames [] = {"Item", "Price"};
        String [][] data = BasketManager.getCurrentFood();
        DefaultTableModel tableModel = new DefaultTableModel(data,colNames);
        confirmedTable.setModel(tableModel);
        
    }
   


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        exit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        deliveryRadio = new javax.swing.JRadioButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        collectionRadio = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        confirmButton = new javax.swing.JButton();
        dateSpinner = new com.github.lgooddatepicker.components.DateTimePicker();
        jScrollPane2 = new javax.swing.JScrollPane();
        confirmedTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        kGradientPanel1.setkEndColor(new java.awt.Color(234, 221, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(103, 80, 164));

        exit.setText("x");
        exit.setFont(new java.awt.Font("Arima Madurai", 1, 18)); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("YOUR BASKET");
        jLabel1.setFont(new java.awt.Font("Arima Madurai", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        buttonGroup1.add(deliveryRadio);
        deliveryRadio.setFont(new java.awt.Font("Arima Madurai", 1, 18)); // NOI18N
        deliveryRadio.setText("DELIVERY");
        deliveryRadio.setBorder(null);
        deliveryRadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deliveryRadioMouseClicked(evt);
            }
        });

        buttonGroup1.add(collectionRadio);
        collectionRadio.setFont(new java.awt.Font("Arima Madurai", 1, 18)); // NOI18N
        collectionRadio.setText("COLLECTION");
        collectionRadio.setBorder(null);
        collectionRadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collectionRadioMouseClicked(evt);
            }
        });

        jLayeredPane1.setLayer(collectionRadio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(collectionRadio)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(collectionRadio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Delivery information:");
        jLabel2.setFont(new java.awt.Font("Arima Madurai", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(33, 0, 93));

        jTextField1.setFont(new java.awt.Font("Arima Madurai", 1, 16)); // NOI18N
        jTextField1.setText("Address...");
        jTextField1.setBackground(new java.awt.Color(184, 159, 227));
        jTextField1.setBorder(null);
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator1.setBackground(new java.awt.Color(33, 0, 93));
        jSeparator1.setForeground(new java.awt.Color(33, 0, 93));

        jTextField2.setFont(new java.awt.Font("Arima Madurai", 1, 16)); // NOI18N
        jTextField2.setText("Delivery Instructions...");
        jTextField2.setBackground(new java.awt.Color(33, 0, 93));
        jTextField2.setBorder(null);
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator2.setBackground(new java.awt.Color(33, 0, 93));
        jSeparator2.setForeground(new java.awt.Color(33, 0, 93));

        jLabel3.setText("Items:");
        jLabel3.setFont(new java.awt.Font("Arima Madurai", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(33, 0, 93));

        totalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(33, 0, 93), 2, true));
        totalLabel.setFont(new java.awt.Font("Arima Madurai", 1, 15)); // NOI18N

        confirmButton.setText("CONFIRM");
        confirmButton.setBackground(new java.awt.Color(33, 0, 93));
        confirmButton.setBorder(null);
        confirmButton.setFont(new java.awt.Font("Arima Madurai", 1, 18)); // NOI18N
        confirmButton.setForeground(new java.awt.Color(255, 255, 255));
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        dateSpinner.setBackground(new java.awt.Color(234, 221, 255));
        dateSpinner.setFont(new java.awt.Font("Arima Madurai", 1, 14)); // NOI18N
        dateSpinner.setForeground(new java.awt.Color(255, 255, 255));

        confirmedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Item ", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        confirmedTable.setFillsViewportHeight(true);
        jScrollPane2.setViewportView(confirmedTable);
        if (confirmedTable.getColumnModel().getColumnCount() > 0) {
            confirmedTable.getColumnModel().getColumn(0).setResizable(false);
            confirmedTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Delivery/Collection Date");
        jLabel4.setFont(new java.awt.Font("Arima Madurai", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator3.setBackground(new java.awt.Color(33, 0, 93));
        jSeparator3.setForeground(new java.awt.Color(33, 0, 93));

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(95, 95, 95)
                        .addComponent(exit))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(231, 231, 231)
                                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(jLabel2))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField1)
                                    .addComponent(jSeparator1)
                                    .addComponent(jSeparator2)
                                    .addComponent(deliveryRadio)
                                    .addComponent(dateSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                                    .addComponent(jSeparator3)))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jLabel4)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)))
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(deliveryRadio)))
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel4)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(dateSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 5, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmButton)
                .addGap(12, 12, 12))
        );

        jTextField1.setBackground(new Color(0, 0, 0, 0));
        jTextField2.setBackground(new Color(0, 0, 0, 0));

        getContentPane().add(kGradientPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void collectionRadioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collectionRadioMouseClicked
        // TODO add your handling code here:
        jLabel2.setVisible(false);
        jTextField1.setVisible(false);
        jSeparator1.setVisible(false);
        jTextField2.setVisible(false);
        jSeparator2.setVisible(false);
        type = "Collection";
        
//        int x = jLabel4.getX();
//        int y = jLabel4.getY();
//        jLabel4.setLocation(x, y - 50);
        
        //changing size of jFrame
        int width = this.getWidth();
        int height = this.getHeight();
        this.setSize(width, height - 150);
        
        try {
            totalLabel.setText("R" + MenuManager.getTotalPrice());
        } catch (SQLException ex) {
            Logger.getLogger(BasketScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_collectionRadioMouseClicked

    private void deliveryRadioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deliveryRadioMouseClicked
        // TODO add your handling code here:
        int width = this.getWidth();
        int height = this.getHeight();
        this.setSize(width, height + 150);
        jLabel2.setVisible(true);
        jTextField1.setVisible(true);
        jSeparator1.setVisible(true);
        jTextField2.setVisible(true);
        jSeparator2.setVisible(true);
        type = "Delivery";

       
        
        try {
            totalLabel.setText("R" + MenuManager.getTotalPrice());
        } catch (SQLException ex) {
            Logger.getLogger(BasketScreen.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_deliveryRadioMouseClicked

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        try {
            // TODO add your handling code here:
            LocalDateTime date = dateSpinner.getDateTimeStrict();
            id = BasketManager.addBookingDetails(date, type);
            JOptionPane.showMessageDialog(null, "Your booking has been confirmed", "Information", JOptionPane.INFORMATION_MESSAGE);
            MainScreen mSc = new MainScreen();
            mSc.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(BasketScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_confirmButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void BasketScreen(String args[]) {
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
            java.util.logging.Logger.getLogger(BasketScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BasketScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BasketScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BasketScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new BasketScreen().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(BasketScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton collectionRadio;
    private javax.swing.JButton confirmButton;
    private javax.swing.JTable confirmedTable;
    private com.github.lgooddatepicker.components.DateTimePicker dateSpinner;
    private javax.swing.JRadioButton deliveryRadio;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
}
