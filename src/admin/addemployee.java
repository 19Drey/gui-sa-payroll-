/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.dbConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import payroll.Regform;
import payroll.l0ginform;

/**
 *
 * @author andre
 */
public class addemployee extends javax.swing.JFrame {

    /**
     * Creates new form addemployee
     */
    public addemployee() {
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

        Main = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Navigator = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        us = new javax.swing.JTextField();
        ps = new javax.swing.JPasswordField();
        Cancel = new javax.swing.JButton();
        em = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ln = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        ty = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Main.setBackground(new java.awt.Color(0, 153, 153));
        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(0, 153, 130));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setText("                              ADD");
        Header.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 32, 590, 50));

        Main.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 100));

        Navigator.setBackground(new java.awt.Color(0, 204, 204));
        Navigator.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/th.jpg"))); // NOI18N
        Navigator.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 420));

        Main.add(Navigator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 220, 450));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registration Form");
        Main.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 370, 50));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password:");
        Main.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 120, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Type:");
        Main.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 120, 30));

        us.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        us.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usActionPerformed(evt);
            }
        });
        Main.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 230, 40));

        ps.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ps.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psActionPerformed(evt);
            }
        });
        Main.add(ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 230, 40));

        Cancel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        Main.add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, 110, 30));

        em.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        em.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emActionPerformed(evt);
            }
        });
        Main.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 230, 40));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Last Name:");
        Main.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 120, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Email:");
        Main.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 120, 30));

        fn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        fn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        Main.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 230, 40));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("First Name:");
        Main.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 120, 30));

        ln.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ln.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });
        Main.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 230, 40));

        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setText("ADD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Main.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, 110, 30));

        ty.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT TYPE", "ADMIN", "USER", "EMPLOYEE" }));
        ty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tyActionPerformed(evt);
            }
        });
        Main.add(ty, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 230, 40));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Username:");
        Main.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, 548, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usActionPerformed
       

    }//GEN-LAST:event_usActionPerformed

    private void psActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psActionPerformed
        
    }//GEN-LAST:event_psActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
      adminUsers adu = new adminUsers();
        adu.setVisible(true);
        this.dispose();                             

    }//GEN-LAST:event_CancelActionPerformed

    private void emActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emActionPerformed
     
    }//GEN-LAST:event_emActionPerformed

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed

       

    }//GEN-LAST:event_fnActionPerformed

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed
   
    }//GEN-LAST:event_lnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   if (fn.getText().trim().isEmpty() ||
        ln.getText().trim().isEmpty() ||
        em.getText().trim().isEmpty() ||
        us.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all required fields.", "Fill It", JOptionPane.ERROR_MESSAGE);
        return;
    }

    dbConnect dbc = new dbConnect();

    if (fn.getText().trim().isEmpty() ||
        ln.getText().trim().isEmpty() ||
        em.getText().trim().isEmpty() ||
        us.getText().trim().isEmpty() ||
        ps.getText().trim().isEmpty() ||
        ty.getSelectedItem() == null ||
        ty.getSelectedItem().toString().equals("SELECT TYPE")) {
        JOptionPane.showMessageDialog(this, "Please fill in all required fields.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String password = ps.getText().trim();
    if (password.length() > 8) {
        JOptionPane.showMessageDialog(this, "Password must be 8 characters or less.", "Password Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

  
    String sql = "INSERT INTO `your_table_name` (FirstName, LastName, Email, UserType, Username, Password, Status) VALUES (?, ?, ?, ?, ?, ?, ?)";

    try (Connection conn = dbc.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, fn.getText().trim());
        pstmt.setString(2, ln.getText().trim());
        pstmt.setString(3, em.getText().trim());
        pstmt.setString(4, ty.getSelectedItem().toString());
        pstmt.setString(5, us.getText().trim());
        pstmt.setString(6, password); // Hash the password here!
        pstmt.setString(7, "Pending");

        int rowsAffected = pstmt.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Added Successfully");
            adminUsers adus = new adminUsers();
            adus.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Failed to add user (no rows affected).", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException ex) {
    JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    ex.printStackTrace(); 
}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tyActionPerformed

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
            java.util.logging.Logger.getLogger(addemployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addemployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addemployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addemployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addemployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Main;
    private javax.swing.JPanel Navigator;
    private javax.swing.JTextField em;
    private javax.swing.JTextField fn;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField ln;
    private javax.swing.JPasswordField ps;
    private javax.swing.JComboBox<String> ty;
    private javax.swing.JTextField us;
    // End of variables declaration//GEN-END:variables
}
