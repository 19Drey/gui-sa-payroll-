/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.dbConnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import payroll.Regform;
import payroll.l0ginform;

/**
 *
 * @author andre
 */
public class adminUsers extends javax.swing.JFrame {

    /**
     * Creates new form adminUsers
     */
    public adminUsers() {
        initComponents();
        displayData();
    }

 public void displayData() {
    try {
        dbConnect dbc = new dbConnect();
        ResultSet rs = dbc.getData("SELECT * FROM `your_table_name`");
        admin.setModel(DbUtils.resultSetToTableModel(rs));
        rs.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error loading data: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    }
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        Main = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        emp = new javax.swing.JLabel();
        Navigator = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        emp1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        admin = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/th.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Main.setBackground(new java.awt.Color(0, 153, 153));
        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(0, 153, 130));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EMPLOYEE LIST");
        Header.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 970, 50));

        emp.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        emp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emp.setText("USERS");
        emp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empMouseClicked(evt);
            }
        });
        Header.add(emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 170, 60));

        Main.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 70));

        Navigator.setBackground(new java.awt.Color(0, 204, 204));
        Navigator.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 102));
        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Navigator.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 170, 30));

        jButton7.setBackground(new java.awt.Color(0, 153, 153));
        jButton7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 102, 102));
        jButton7.setText("BACKTO LOGIN");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        Navigator.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 170, 30));

        jButton9.setBackground(new java.awt.Color(0, 153, 153));
        jButton9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 102, 102));
        jButton9.setText("BACK");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        Navigator.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 170, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/852253-200.png"))); // NOI18N
        Navigator.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 180, 140));

        emp1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        emp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emp1.setText("USERS");
        emp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emp1MouseClicked(evt);
            }
        });
        Navigator.add(emp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 170, 60));

        Main.add(Navigator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 170, 650));

        admin.setForeground(new java.awt.Color(0, 153, 153));
        admin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(admin);

        Main.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 730, 440));

        jButton6.setBackground(new java.awt.Color(0, 153, 153));
        jButton6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 102, 102));
        jButton6.setText("DELETE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        Main.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 170, 30));

        refresh.setBackground(new java.awt.Color(0, 153, 153));
        refresh.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        refresh.setForeground(new java.awt.Color(0, 102, 102));
        refresh.setText("REFRESH");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        Main.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 110, 170, 30));

        jButton5.setBackground(new java.awt.Color(0, 153, 153));
        jButton5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 102, 102));
        jButton5.setText("EDIT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        Main.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 170, 30));

        jButton4.setBackground(new java.awt.Color(0, 153, 153));
        jButton4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 102, 102));
        jButton4.setText("ADD");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Main.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 170, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        addemployee emp = new addemployee();
    emp.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    int selectedRow = admin.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a user to edit.", "Selection Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Username is at column index 4 (Id, FirstName, LastName, Email, Username, Password, UserType, Status)
    String username = admin.getValueAt(selectedRow, 4).toString();
    if (username == null || username.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Selected user has no username.", "Selection Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    System.out.println("Selected Username for editing: " + username);
    edituser editForm = new edituser();
    editForm.setVisible(true);
    this.dispose();

    // Remove the redundant try-catch block with DriverManager

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     int selectedRow = admin.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a user to delete.", "Selection Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String username = admin.getValueAt(selectedRow, admin.getColumn("Username").getModelIndex()).toString();
        
        // Validation: Confirm deletion
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete user: " + username + "?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        // Database deletion
        dbConnect dbc = new dbConnect();
        Connection conn = dbc.getConnection();
        if (conn == null) {
            JOptionPane.showMessageDialog(this, "Failed to connect to the database.", "Database Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String query = "DELETE FROM `your_table_name` WHERE Username = ?";
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(query);
        } catch (SQLException ex) {
            Logger.getLogger(adminUsers.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            pstmt.setString(1, username);
        } catch (SQLException ex) {
            Logger.getLogger(adminUsers.class.getName()).log(Level.SEVERE, null, ex);
        }
        int rowsAffected = 0;
        try {
            rowsAffected = pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(adminUsers.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "User deleted successfully.");
            displayData(); // Refresh the table
        } else {
            JOptionPane.showMessageDialog(this, "Failed to delete user: " + username, "Error", JOptionPane.ERROR_MESSAGE);
        }
        try {
            pstmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(adminUsers.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(adminUsers.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        l0ginform loginForm = new l0ginform();
        loginForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
       DefaultTableModel model = (DefaultTableModel) admin.getModel(); 
    model.setRowCount(0);
    model.setColumnCount(0);

    dbConnect dbc = new dbConnect(); 

    try (Connection conn = dbc.getConnection();
         PreparedStatement pstmt = conn.prepareStatement("SELECT FirstName, LastName, Email, UserType, Username, Status FROM your_table_name");
         ResultSet rs = pstmt.executeQuery()) {

        
        model.addColumn("First Name");
        model.addColumn("Last Name");
        model.addColumn("Email");
        model.addColumn("User Type");
        model.addColumn("Username");
        model.addColumn("Status");
           
        
        while (rs.next()) {
            model.addRow(new Object[]{
                    rs.getString("FirstName"),
                    rs.getString("LastName"),
                    rs.getString("Email"),
                    rs.getString("UserType"),
                    rs.getString("Username"),
                    rs.getString("Status"),
                    
            });
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }
    }//GEN-LAST:event_refreshActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
   adminDashboard ads = new adminDashboard();
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void empMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empMouseClicked

    }//GEN-LAST:event_empMouseClicked

    private void emp1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emp1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_emp1MouseClicked

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
            java.util.logging.Logger.getLogger(adminUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Main;
    private javax.swing.JPanel Navigator;
    private javax.swing.JTable admin;
    private javax.swing.JLabel emp;
    private javax.swing.JLabel emp1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refresh;
    // End of variables declaration//GEN-END:variables

    private void refreshTable() {
         try {
        String url = "jdbc:mysql://localhost:3306/payroll_dbbb"; 
        String dbUsername = "root"; 
        String dbPassword = "";
        Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword);

        String query = "SELECT * FROM `your_table_name`"; 
        PreparedStatement pst = conn.prepareStatement(query);
        ResultSet rs = pst.executeQuery();

        DefaultTableModel tableModel = (DefaultTableModel) admin.getModel();
        tableModel.setRowCount(0); 

        while (rs.next()) {
            Object[] rowData = {
                
                rs.getString("FirstName"), 
                rs.getString("LastName"),
                rs.getString("Email"),
                rs.getString("Username"),
                rs.getString("UserType"),
                rs.getString("Password"),
                rs.getString("Status")
                    
               
            };
            tableModel.addRow(rowData);
        }

        rs.close();
        pst.close();
        conn.close();

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error refreshing table: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }
}

