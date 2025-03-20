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
import user.accountDetails;

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
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Navigator = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        emp = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        add_employee = new javax.swing.JButton();
        add_employee1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

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

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit (1).png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        Header.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 40, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/—Pngtree—ethereal watercolor background in shades_13379941.jpg"))); // NOI18N
        Header.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 70));

        Main.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 70));

        Navigator.setBackground(new java.awt.Color(0, 204, 204));
        Navigator.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/images-removebg-preview (1).png"))); // NOI18N
        Navigator.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 20, -1, 180));

        emp.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        emp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emp.setText("USERS");
        emp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empMouseClicked(evt);
            }
        });
        Navigator.add(emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 170, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/times-hexagon (1).png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        Navigator.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 60, 80));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/—Pngtree—ethereal watercolor background in shades_13379941.jpg"))); // NOI18N
        Navigator.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, 510));

        Main.add(Navigator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 170, 520));

        add_employee.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        add_employee.setText("Employee Manager");
        add_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_employeeActionPerformed(evt);
            }
        });
        Main.add(add_employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add_employee1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        add_employee1.setText("Employee Manager");
        add_employee1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_employee1ActionPerformed(evt);
            }
        });
        Main.add(add_employee1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setLayout(null);
        Main.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, -1, -1));

        jPanel3.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pngtree-avatar-icon-profile-icon-member-login-vector-isolated-png-image_1978396-removebg-preview.png"))); // NOI18N
        jLabel4.setText("USERS");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel4);
        jLabel4.setBounds(-60, 10, 450, 180);

        Main.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 390, 180));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Deduction.png"))); // NOI18N
        jLabel9.setText("Deduction");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, 70));

        Main.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 390, 90));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/—Pngtree—ethereal watercolor background in shades_13379941_1.jpg"))); // NOI18N
        Main.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 70, 830, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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

    private void empMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empMouseClicked
            
    }//GEN-LAST:event_empMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
         l0ginform loginForm = new l0ginform();
    loginForm.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        int choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
    if (choice == JOptionPane.YES_OPTION) {
        System.exit(0);}
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
      usersForm     aus= new usersForm();
        aus.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void add_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_employeeActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_add_employeeActionPerformed

    private void add_employee1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_employee1ActionPerformed
      
    }//GEN-LAST:event_add_employee1ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
           employeeDeductions x = new employeeDeductions();
         x.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

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
    private javax.swing.JButton add_employee;
    private javax.swing.JButton add_employee1;
    private javax.swing.JLabel emp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
