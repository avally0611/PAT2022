/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import backend.MenuManager;
import backend.RestaurantManager;
import javax.swing.DefaultComboBoxModel;
import UI.MainScreen;
import backend.BasketManager;
import backend.SqlManager;
import java.awt.Color;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aaminah1
 */
public class MenuScreen extends javax.swing.JFrame {
    static boolean resFood = false;
    static int count = 0;

    /**
     * 
     */
    public MenuScreen() throws SQLException {
        initComponents();

        //reset the currentBooking table each time & reset auto-incrementer so that it starts from 1
        SqlManager.update("DELETE FROM currentBooking");
        SqlManager.update("ALTER TABLE currentBooking AUTO_INCREMENT = 1");
        
        String selectedRes = (String) MainScreen.restaurantComboBox.getSelectedItem();
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel ((MenuManager.getSections(selectedRes)).toArray());
	sectionsComboBox.setModel(comboModel);
        
        //set size of column
        foodTable.getColumnModel().getColumn(0).setPreferredWidth(300);
        foodTable.getColumnModel().getColumn(0).setMaxWidth(300);
        
        
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        exit = new javax.swing.JLabel();
        reservationButton = new javax.swing.JButton();
        sectionsComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        foodReservationButton = new javax.swing.JButton();
        totalOutput = new javax.swing.JLabel();
        deliveryButton = new javax.swing.JButton();
        totalButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        foodTable = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        foodList = new javax.swing.JList<>();
        removeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(234, 221, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(103, 80, 164));

        exit.setFont(new java.awt.Font("Arima Madurai", 1, 18)); // NOI18N
        exit.setText("x");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        reservationButton.setBackground(new java.awt.Color(33, 0, 93));
        reservationButton.setFont(new java.awt.Font("Arima Madurai", 1, 18)); // NOI18N
        reservationButton.setForeground(new java.awt.Color(255, 255, 255));
        reservationButton.setText("RESERVE ONLY");
        reservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservationButtonActionPerformed(evt);
            }
        });

        sectionsComboBox.setFont(new java.awt.Font("Arima Madurai", 1, 14)); // NOI18N
        sectionsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Starters", "Mains", "Pasta", "Beverages" }));
        sectionsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectionsComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arima Madurai", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENU");

        foodReservationButton.setBackground(new java.awt.Color(33, 0, 93));
        foodReservationButton.setFont(new java.awt.Font("Arima Madurai", 1, 18)); // NOI18N
        foodReservationButton.setForeground(new java.awt.Color(255, 255, 255));
        foodReservationButton.setText("RESERVE WITH FOOD");
        foodReservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodReservationButtonActionPerformed(evt);
            }
        });

        totalOutput.setFont(new java.awt.Font("Arima Madurai", 1, 16)); // NOI18N
        totalOutput.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalOutput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(33, 0, 93), 3, true));

        deliveryButton.setBackground(new java.awt.Color(33, 0, 93));
        deliveryButton.setFont(new java.awt.Font("Arima Madurai", 1, 18)); // NOI18N
        deliveryButton.setForeground(new java.awt.Color(255, 255, 255));
        deliveryButton.setText("DELIVERY");
        deliveryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliveryButtonActionPerformed(evt);
            }
        });

        totalButton.setBackground(new java.awt.Color(33, 0, 93));
        totalButton.setFont(new java.awt.Font("Arima Madurai", 1, 18)); // NOI18N
        totalButton.setForeground(new java.awt.Color(255, 255, 255));
        totalButton.setText("Get Total");
        totalButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                totalButtonMouseClicked(evt);
            }
        });

        foodTable.setAutoCreateRowSorter(true);
        foodTable.setFont(new java.awt.Font("Arima Madurai", 0, 14)); // NOI18N
        foodTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food Item", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        foodTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        foodTable.setColumnSelectionAllowed(true);
        foodTable.setFillsViewportHeight(true);
        foodTable.setFocusable(false);
        foodTable.setOpaque(false);
        foodTable.setRowHeight(25);
        foodTable.setSelectionBackground(new java.awt.Color(33, 0, 93));
        foodTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        foodTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        foodTable.setShowGrid(false);
        foodTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(foodTable);
        foodTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (foodTable.getColumnModel().getColumnCount() > 0) {
            foodTable.getColumnModel().getColumn(0).setResizable(false);
            foodTable.getColumnModel().getColumn(1).setResizable(false);
        }

        addButton.setBackground(new java.awt.Color(33, 0, 93));
        addButton.setFont(new java.awt.Font("Arima Madurai", 1, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("ADD");
        addButton.setBorder(null);
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });

        foodList.setBorder(null);
        foodList.setFont(new java.awt.Font("Arima Madurai", 0, 14)); // NOI18N
        jScrollPane3.setViewportView(foodList);

        removeButton.setBackground(new java.awt.Color(33, 0, 93));
        removeButton.setFont(new java.awt.Font("Arima Madurai", 1, 16)); // NOI18N
        removeButton.setForeground(new java.awt.Color(255, 255, 255));
        removeButton.setText("Remove Item");
        removeButton.setBorder(null);
        removeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(deliveryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(reservationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(foodReservationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                            .addComponent(totalOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(23, 23, 23)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                        .addComponent(totalButton)
                                        .addGap(41, 41, 41))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(sectionsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(154, 154, 154)
                                .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exit)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)))
                        .addGap(177, 177, 177)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sectionsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(totalOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(totalButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deliveryButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(foodReservationButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reservationButton)
                                .addGap(34, 34, 34))
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void foodReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodReservationButtonActionPerformed
        // TODO add your handling code here:
        //when you press this button it takes you to reservation screen but also saves yur order and total for the confirmation screen
        resFood = true;
        ReservationScreen rsvSc = new ReservationScreen();
        rsvSc.setVisible(true);
        dispose();
        //should call method which saves order somewhere as array
    }//GEN-LAST:event_foodReservationButtonActionPerformed

    private void sectionsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectionsComboBoxActionPerformed
        try 
        {
            // TODO add your handling code here:
            String section = (String) sectionsComboBox.getSelectedItem();
            String colNames [] = {"Item", "Price"};
            String [][] data = MenuManager.getFood((String) MainScreen.restaurantComboBox.getSelectedItem(),section);
            DefaultTableModel tableModel = new DefaultTableModel(data,colNames);
            foodTable.setModel(tableModel);
            foodTable.getColumnModel().getColumn(0).setPreferredWidth(300);
            foodTable.getColumnModel().getColumn(0).setMaxWidth(300);
        } 
        
        catch (SQLException ex) 
        {
            System.out.println("error");
        }
        
        
    }//GEN-LAST:event_sectionsComboBoxActionPerformed

    private void reservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservationButtonActionPerformed
        // TODO add your handling code here:
        ReservationScreen rsvSc = new ReservationScreen();
        rsvSc.setVisible(true);
        dispose();
    }//GEN-LAST:event_reservationButtonActionPerformed

    private void deliveryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliveryButtonActionPerformed
        try {
            // TODO add your handling code here:
            BasketScreen bskSc = new BasketScreen();
            bskSc.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(MenuScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deliveryButtonActionPerformed

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        try {
            // TODO add your handling code here:
            
            //get which rows selected and add to new mySQL table
            int row = foodTable.getSelectedRow();
            String value = (String) foodTable.getModel().getValueAt(row, 0);
            String prices = (String) foodTable.getModel().getValueAt(row, 1);
            MenuManager.currentOrder(value, prices);
            
            //get order and add to list
            ArrayList<String> listCurrent = MenuManager.getCurrentOrder();
            
            DefaultListModel model = new DefaultListModel();
            for (int i = 0; i < listCurrent.size(); i++) {
                model.add(i, listCurrent.get(i));
            }
            foodList.setModel(model);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(MenuScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_addButtonMouseClicked

    private void removeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeButtonMouseClicked
        try {
            // TODO add your handling code here: (Remove from mysql table and list)
            int row = foodList.getSelectedIndex();
            String item = (String) foodList.getModel().getElementAt(row);
            row += 1;
            MenuManager.removeItem(item, row);
            

            
            ArrayList<String> listCurrent = MenuManager.getCurrentOrder();
            
            DefaultListModel model1 = new DefaultListModel();
            for (int i = 0; i < listCurrent.size(); i++) {
                model1.add(i, listCurrent.get(i));
            }
            foodList.setModel(model1);
            
            
            
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(MenuScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_removeButtonMouseClicked

    private void totalButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totalButtonMouseClicked
        try {
            // TODO add your handling code here:
            //get prices from selected rows
            totalOutput.setText("R" + MenuManager.getTotalPrice());
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(MenuScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_totalButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void MenuScreen(String args[]) {
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
            java.util.logging.Logger.getLogger(MenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MenuScreen mnSc = new MenuScreen();
                    mnSc.setVisible(true);
                } catch (SQLException ex) {
                    System.out.println("ERROR");;
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton deliveryButton;
    private javax.swing.JLabel exit;
    private javax.swing.JList<String> foodList;
    private javax.swing.JButton foodReservationButton;
    private javax.swing.JTable foodTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton reservationButton;
    public static javax.swing.JComboBox<String> sectionsComboBox;
    private javax.swing.JButton totalButton;
    private javax.swing.JLabel totalOutput;
    // End of variables declaration//GEN-END:variables
}
