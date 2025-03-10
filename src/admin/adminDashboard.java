/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.Session;
import config.dbConnect;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils; 
import payroll.l0ginform;
import sun.security.util.Password;

/**
 *
 * @author andre
 */
public class adminDashboard extends javax.swing.JFrame {
    
    
   

    
    private String firstName;
    private String lastName;

    private  adminDashboard(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        initComponents();
        displayData();
    }
    public adminDashboard() {
        initComponents();
        displayData();
        
    }

   public void displayData(){
     
      try {
        dbConnect dbc = new dbConnect();
        ResultSet rs = dbc.getData("SELECT * FROM `your_table_name`"); 

        rs.close();
        if (dbc != null) {
        
        }

    } catch (SQLException ex) {
        System.out.println("Errors: " + ex.getMessage());
        ex.printStackTrace();
    }

    
    }
   
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        baboy = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Navigator = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        acc_user = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        emp = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Main.setBackground(new java.awt.Color(0, 153, 153));
        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(0, 153, 130));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Admin Dashboard");
        Header.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 490, 50));

        baboy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/th.jpg"))); // NOI18N
        Header.add(baboy, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 300, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/th.jpg"))); // NOI18N
        Header.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 210, 100));

        Main.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 70));

        Navigator.setBackground(new java.awt.Color(0, 204, 204));
        Navigator.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 102));
        jButton2.setText("Cancel");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Navigator.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 170, 30));

        acc_user.setBackground(new java.awt.Color(0, 153, 153));
        acc_user.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        acc_user.setForeground(new java.awt.Color(0, 102, 102));
        acc_user.setText("EXIT");
        acc_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acc_userMouseClicked(evt);
            }
        });
        acc_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acc_userActionPerformed(evt);
            }
        });
        Navigator.add(acc_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 170, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/images-removebg-preview (1).png"))); // NOI18N
        Navigator.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 20, -1, 180));

        emp.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        emp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emp.setText("USERS");
        emp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empMouseClicked(evt);
            }
        });
        Navigator.add(emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 170, 60));

        Main.add(Navigator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 170, 520));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pngtree-avatar-icon-profile-icon-member-login-vector-isolated-png-image_1978396-removebg-preview.png"))); // NOI18N
        Main.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 300, 180));

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 102));
        jButton3.setText("Users");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Main.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 170, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    l0ginform loginForm = new l0ginform();
    loginForm.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        adminUsers adu = new adminUsers();
        adu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    usersForm     aus= new usersForm();
        aus.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    Session sess = Session.getInstance();
    Integer userId = sess.getUserId();
    System.out.println("UserId: " + userId); // Debugging line

    if (userId == null || userId <= 0) {
        JOptionPane.showMessageDialog(this, "Please log in first.");
        l0ginform loginForm = new l0ginform();
        loginForm.setVisible(true);
        this.dispose();
        return;
    }

  
    String firstName = sess.getFirstName();
    String lastName = sess.getLastName(); 

    if (firstName != null && !firstName.isEmpty() && lastName != null && !lastName.isEmpty()) {
        emp.setText(" " + firstName + " " + lastName); 
    } else if (firstName != null && !firstName.isEmpty()) {
        emp.setText(" " + firstName); 
    } else if (lastName != null && !lastName.isEmpty()){
        emp.setText(" " + lastName); 
    } else {
        emp.setText("Name"); 
    }

    }//GEN-LAST:event_formWindowActivated

    private void acc_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acc_userMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_acc_userMouseClicked

    private void acc_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acc_userActionPerformed
           int choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
    if (choice == JOptionPane.YES_OPTION) {
        System.exit(0);}
    }//GEN-LAST:event_acc_userActionPerformed

    private void empMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empMouseClicked
            
    }//GEN-LAST:event_empMouseClicked

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
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Main;
    private javax.swing.JPanel Navigator;
    private javax.swing.JButton acc_user;
    private javax.swing.JLabel baboy;
    private javax.swing.JLabel emp;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
