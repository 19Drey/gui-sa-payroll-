/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

import admin.adminDashboard;
import config.Hash;
import config.Session;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class l0ginform extends javax.swing.JFrame {

  
       
    /**
     * Creates new form l0ginform
     */
    public l0ginform() {
        initComponents();
    }
 public void handleLogin(javax.swing.JFrame frame, javax.swing.JTextField us, javax.swing.JPasswordField ps) throws NoSuchAlgorithmException {
    String username = us.getText().trim();
    char[] charpasswordChars = ps.getPassword(); // Corrected typo

    if (charpasswordChars != null) { // Add null check
        String password = new String(charpasswordChars).trim();

        // Clear password from memory
        java.util.Arrays.fill(charpasswordChars, '0');

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Username and password cannot be empty.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // ... (rest of your database code)

    } else {
        JOptionPane.showMessageDialog(frame, "Password field is empty.", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Exit the method
    }

}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Navigator = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        us = new javax.swing.JTextField();
        ps = new javax.swing.JPasswordField();
        Cancel = new javax.swing.JButton();
        UPDATE = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        regis = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Main.setBackground(new java.awt.Color(0, 153, 153));
        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(0, 153, 130));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("                                           LOGIN");
        jLabel2.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
                jLabel2AncestorMoved(evt);
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
            }
        });
        Header.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 960, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/photo-1574610758891-5b809b6e6e2e (1).jpg"))); // NOI18N
        Header.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 100));

        Main.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 100));

        Navigator.setBackground(new java.awt.Color(0, 204, 204));
        Navigator.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/th.jpg"))); // NOI18N
        Navigator.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 280, 230));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/photo-1574610758891-5b809b6e6e2e (1).jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        Navigator.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 230));

        Main.add(Navigator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 280, 470));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password:");
        Main.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 120, 30));

        us.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        us.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usActionPerformed(evt);
            }
        });
        Main.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 230, 40));

        ps.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ps.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psActionPerformed(evt);
            }
        });
        Main.add(ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 230, 40));

        Cancel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Cancel.setText("EXIT");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        Main.add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 110, 30));

        UPDATE.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UPDATE.setText("LOGIN");
        UPDATE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UPDATEMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UPDATEMouseEntered(evt);
            }
        });
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });
        Main.add(UPDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, 110, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Username:");
        Main.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 120, 30));

        regis.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        regis.setForeground(new java.awt.Color(255, 255, 255));
        regis.setText("No Account?Register here!");
        regis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regisMouseClicked(evt);
            }
        });
        Main.add(regis, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 230, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/th.jpg"))); // NOI18N
        Main.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 390, 400));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/photo-1574610758891-5b809b6e6e2e (1).jpg"))); // NOI18N
        Main.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 690, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usActionPerformed

    }//GEN-LAST:event_usActionPerformed

    private void psActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psActionPerformed

    }//GEN-LAST:event_psActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
      int choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
    if (choice == JOptionPane.YES_OPTION) {
        System.exit(0);
    }
    }//GEN-LAST:event_CancelActionPerformed

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
  String username = us.getText().trim();
String password = new String(ps.getPassword()).trim();
  try {
        handleLogin(this, us, ps);
    } catch (NoSuchAlgorithmException e) {
        e.printStackTrace();
    }

if (username.isEmpty() || password.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Username and password cannot be empty.", "Validation Error", JOptionPane.ERROR_MESSAGE);
    return;
}

try {
    String url = "jdbc:mysql://localhost:3306/payroll_dbbb";
    String dbUsername = "root";
    String dbPassword = "";

    // Use try-with-resources
    try (Connection con = DriverManager.getConnection(url, dbUsername, dbPassword);
         PreparedStatement pst = con.prepareStatement("SELECT * FROM your_table_name WHERE Username = ? AND Password = ?")) { // Replace "users"
        pst.setString(1, username);
        pst.setString(2, password); // In a real application, hash the password before this step

        try (ResultSet rs = pst.executeQuery()) {
            if (rs.next()) {
                Session ses = Session.getInstance();
             ses.setUserId(rs.getInt("id")); 
                ses.setFirstName(rs.getString("firstname") != null ? rs.getString("firstname") : "");
                ses.setLastName(rs.getString("lastname") != null ? rs.getString("lastname") : "");
                ses.setEmail(rs.getString("email") != null ? rs.getString("email") : "");
                ses.setUsername(rs.getString("username") != null ? rs.getString("username") : "");
                ses.setUserType(rs.getString("userType") != null ? rs.getString("userType") : "");
                ses.setStatus(rs.getString("status") != null ? rs.getString("status") : "");
                System.out.println("" + ses.getUserId());

                JOptionPane.showMessageDialog(this, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);

                adminDashboard adm = new adminDashboard();
                adm.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password.", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

} catch (SQLException ex) {
    JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    ex.printStackTrace();
}
           
    }//GEN-LAST:event_UPDATEActionPerformed

    private void regisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regisMouseClicked
        Regform rfm = new Regform();
        rfm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regisMouseClicked

    private void UPDATEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UPDATEMouseEntered

    }//GEN-LAST:event_UPDATEMouseEntered

    private void UPDATEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UPDATEMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_UPDATEMouseClicked

    private void jLabel2AncestorMoved(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jLabel2AncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2AncestorMoved

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(l0ginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(l0ginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(l0ginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(l0ginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new l0ginform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Main;
    private javax.swing.JPanel Navigator;
    private javax.swing.JButton UPDATE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField ps;
    private javax.swing.JLabel regis;
    private javax.swing.JTextField us;
    // End of variables declaration//GEN-END:variables

    private String Password() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String Username() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
