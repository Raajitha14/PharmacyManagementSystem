
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author user
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form login1
     */
    public Dashboard() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dashboardClose = new javax.swing.JButton();
        dashboardPanels = new javax.swing.JTabbedPane();
        sellMedOpen = new javax.swing.JPanel();
        logoutOpen = new javax.swing.JPanel();
        inventoryOpen = new javax.swing.JPanel();
        manageMedBtn = new javax.swing.JButton();
        manageCompanyBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        inventoryButton = new javax.swing.JButton();
        sellMedicineButton1 = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        purchaseHistoryButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboardClose.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dashboardClose.setForeground(new java.awt.Color(204, 0, 51));
        dashboardClose.setText("X");
        dashboardClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardCloseActionPerformed(evt);
            }
        });
        getContentPane().add(dashboardClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 0, -1, -1));

        dashboardPanels.setBackground(new java.awt.Color(102, 204,0));

        sellMedOpen.setBackground(new java.awt.Color(255,255,255,0));
        sellMedOpen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sellMedOpenKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout sellMedOpenLayout = new javax.swing.GroupLayout(sellMedOpen);
        sellMedOpen.setLayout(sellMedOpenLayout);
        sellMedOpenLayout.setHorizontalGroup(
            sellMedOpenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        sellMedOpenLayout.setVerticalGroup(
            sellMedOpenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 915, Short.MAX_VALUE)
        );

        dashboardPanels.addTab("tab1", sellMedOpen);

        logoutOpen.setBackground(new java.awt.Color(255, 255,255,0));

        javax.swing.GroupLayout logoutOpenLayout = new javax.swing.GroupLayout(logoutOpen);
        logoutOpen.setLayout(logoutOpenLayout);
        logoutOpenLayout.setHorizontalGroup(
            logoutOpenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        logoutOpenLayout.setVerticalGroup(
            logoutOpenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 915, Short.MAX_VALUE)
        );

        dashboardPanels.addTab("tab3", logoutOpen);

        inventoryOpen.setBackground(new java.awt.Color(255, 255,255,0));

        manageMedBtn.setBackground(new java.awt.Color(69, 75, 87));
        manageMedBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        manageMedBtn.setForeground(new java.awt.Color(255, 255, 255));
        manageMedBtn.setText("Manage Medicine");
        manageMedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageMedBtnActionPerformed(evt);
            }
        });

        manageCompanyBtn.setBackground(new java.awt.Color(69, 75, 87));
        manageCompanyBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        manageCompanyBtn.setForeground(new java.awt.Color(255, 255, 255));
        manageCompanyBtn.setText("Manage Company");
        manageCompanyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCompanyBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inventoryOpenLayout = new javax.swing.GroupLayout(inventoryOpen);
        inventoryOpen.setLayout(inventoryOpenLayout);
        inventoryOpenLayout.setHorizontalGroup(
            inventoryOpenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inventoryOpenLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(inventoryOpenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(manageCompanyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageMedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(741, Short.MAX_VALUE))
        );
        inventoryOpenLayout.setVerticalGroup(
            inventoryOpenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inventoryOpenLayout.createSequentialGroup()
                .addContainerGap(398, Short.MAX_VALUE)
                .addComponent(manageMedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(manageCompanyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );

        dashboardPanels.addTab("tab2", inventoryOpen);

        getContentPane().add(dashboardPanels, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, -40, 1200, 950));

        jPanel2.setBackground(new java.awt.Color(0, 153, 51));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("          PHARMACY MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(450, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(326, 326, 326))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 130));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        inventoryButton.setBackground(new java.awt.Color(0, 153, 51));
        inventoryButton.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        inventoryButton.setForeground(new java.awt.Color(255, 255, 255));
        inventoryButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-inventory-50.png")); // NOI18N
        inventoryButton.setText(" Inventory");
        inventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoryButtonActionPerformed(evt);
            }
        });

        sellMedicineButton1.setBackground(new java.awt.Color(0, 153, 51));
        sellMedicineButton1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        sellMedicineButton1.setForeground(new java.awt.Color(255, 255, 255));
        sellMedicineButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sellMedicine.png"))); // NOI18N
        sellMedicineButton1.setText("Sell Medicine");
        sellMedicineButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellMedicineButton1ActionPerformed(evt);
            }
        });

        logoutButton.setBackground(new java.awt.Color(0, 153, 51));
        logoutButton.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        purchaseHistoryButton.setBackground(new java.awt.Color(0, 153, 51));
        purchaseHistoryButton.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        purchaseHistoryButton.setForeground(new java.awt.Color(255, 255, 255));
        purchaseHistoryButton.setText("PURCHASE HISTORY");
        purchaseHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseHistoryButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(purchaseHistoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inventoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sellMedicineButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(inventoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sellMedicineButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(purchaseHistoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(268, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 350, 1030));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background_login.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 910));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardCloseActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(this, "Are you sure?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (choice == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_dashboardCloseActionPerformed
 
    public class inventoryOpen extends javax.swing.JFrame {

    public inventoryOpen() {
        initComponents();
        // Initially hide the panel
        setVisible(false);
    }

    private void initComponents() {
        // Your component initialization code here
    }
}
    private void inventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryButtonActionPerformed
        // TODO add your handling code here:
        dashboardPanels.setSelectedIndex(2);
       
      
    }//GEN-LAST:event_inventoryButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        dashboardPanels.setSelectedIndex(0);
        logout();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void sellMedicineButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellMedicineButton1ActionPerformed
        // TODO add your handling code here:
        dashboardPanels.setSelectedIndex(1);
          SellMedicine_Customer nextPage = new SellMedicine_Customer();
          nextPage.setVisible(true);
       
    }//GEN-LAST:event_sellMedicineButton1ActionPerformed

    private void sellMedOpenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sellMedOpenKeyPressed
        // TODO add your handling code here:
       
                
    }//GEN-LAST:event_sellMedOpenKeyPressed

    private void manageMedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageMedBtnActionPerformed
        // TODO add your handling code here:
        ManageMedicine nextPage = new ManageMedicine();
            nextPage.setVisible(true);
                
    }//GEN-LAST:event_manageMedBtnActionPerformed

    private void manageCompanyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCompanyBtnActionPerformed
        // TODO add your handling code here:
        ManageCompany nextPage = new ManageCompany();
         nextPage.setVisible(true);
                
    }//GEN-LAST:event_manageCompanyBtnActionPerformed

    private void purchaseHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseHistoryButtonActionPerformed
        // TODO add your handling code here:
        dashboardPanels.setSelectedIndex(1);
          purchaseHistory nextPage = new purchaseHistory();
          nextPage.setVisible(true);
    }//GEN-LAST:event_purchaseHistoryButtonActionPerformed
    private void logout() {
    // Close the current dashboard window
    this.dispose();
    
    // Open the login window
    login loginPage = new login();
    loginPage.setVisible(true);
}

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dashboardClose;
    private javax.swing.JTabbedPane dashboardPanels;
    private javax.swing.JButton inventoryButton;
    private javax.swing.JPanel inventoryOpen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel logoutOpen;
    private javax.swing.JButton manageCompanyBtn;
    private javax.swing.JButton manageMedBtn;
    private javax.swing.JButton purchaseHistoryButton;
    private javax.swing.JPanel sellMedOpen;
    private javax.swing.JButton sellMedicineButton1;
    // End of variables declaration//GEN-END:variables
}
