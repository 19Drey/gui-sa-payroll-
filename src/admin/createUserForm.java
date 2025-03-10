/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.dbConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class createUserForm extends javax.swing.JFrame {

    private String userId;
 
    /**
     * Creates new form createUserForm
     */
  public createUserForm(String userId) {
        this.userId = userId; // Store the passed userId
        initComponents();
    }

    createUserForm() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        us = new javax.swing.JTextField();
        ps = new javax.swing.JPasswordField();
        em = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ln = new javax.swing.JTextField();
        ADD = new javax.swing.JButton();
        ty = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        use = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Cancel = new javax.swing.JButton();
        Cancel3 = new javax.swing.JButton();
        u = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Cancel5 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Main.setBackground(new java.awt.Color(0, 153, 153));
        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(0, 153, 130));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/th.jpg"))); // NOI18N
        jLabel2.setText("CREATE USER FORM");
        Header.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, 0, 800, 90));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/th.jpg"))); // NOI18N
        Header.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 400, 90));
        Header.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 190, 70));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/th.jpg"))); // NOI18N
        Header.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 270, 90));

        Main.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 90));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registration Form");
        Main.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 370, 50));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password:");
        Main.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 120, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("STATUS:");
        Main.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 120, 40));

        us.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        us.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usActionPerformed(evt);
            }
        });
        Main.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 230, 40));

        ps.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ps.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psActionPerformed(evt);
            }
        });
        Main.add(ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 230, 40));

        em.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        em.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emActionPerformed(evt);
            }
        });
        Main.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 230, 50));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Last Name:");
        Main.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 120, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Email:");
        Main.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 120, 40));

        fn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        fn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        Main.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 230, 40));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("First Name:");
        Main.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 120, 30));

        ln.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ln.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });
        Main.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 230, 40));

        ADD.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ADD.setText("ADD");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });
        Main.add(ADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 110, 20));

        ty.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT TYPE", "USER", "EMPLOYEE", "CEO" }));
        ty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tyActionPerformed(evt);
            }
        });
        Main.add(ty, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 230, 50));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Username:");
        Main.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 120, 30));

        use.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        use.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT STATUS", "ACTIVE", "PENDING" }));
        use.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useActionPerformed(evt);
            }
        });
        Main.add(use, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 230, 50));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Type:");
        Main.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 120, 40));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Type:");
        Main.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 120, 40));

        Cancel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        Main.add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 110, 20));

        Cancel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Cancel3.setText("DELETE");
        Cancel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel3ActionPerformed(evt);
            }
        });
        Main.add(Cancel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 110, 20));

        u.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        u.setText("UPDATE");
        u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uActionPerformed(evt);
            }
        });
        Main.add(u, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 110, 20));

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Main.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 550, 100, -1));

        Cancel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Cancel5.setText("CLEAR");
        Cancel5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel5ActionPerformed(evt);
            }
        });
        Main.add(Cancel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 110, 20));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/photo-1574610758891-5b809b6e6e2e (1).jpg"))); // NOI18N
        Main.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 870, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usActionPerformed
        if (us.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username is required!");
            return;
        }
        if (us.getText().length() < 5) {
            JOptionPane.showMessageDialog(null, "Username must be at least 5 characters long.");
            return;
        }

    }//GEN-LAST:event_usActionPerformed

    private void psActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psActionPerformed
        if (ps.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Password is required!");
            return;
        }
        if (ps.getText().length() < 8) {
            JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long.");
            return;
        }
    }//GEN-LAST:event_psActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        int choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to cancel?", "", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
           usersForm usf = new usersForm();
            usf.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CancelActionPerformed

    private void emActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emActionPerformed
        if (em.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Email is required!");
            return;
        }
        if (!em.getText().matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            JOptionPane.showMessageDialog(null, "Invalid email format.");
            return;

        }
    }//GEN-LAST:event_emActionPerformed

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed

        if (fn.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "First name is required!");
            return;
        }
        if (!fn.getText().matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(null, "First name must contain only letters.");
            return;

        }

    }//GEN-LAST:event_fnActionPerformed

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed
        if (ln.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Last name is required!");
            return;
        }
        if (!ln.getText().matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(null, "Last name must contain only letters.");
            return;
        }
    }//GEN-LAST:event_lnActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
       if (fn.getText().trim().isEmpty() || ln.getText().trim().isEmpty() || em.getText().trim().isEmpty() || us.getText().trim().isEmpty() || ps.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all required fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (ps.getText().trim().length() < 8) {
        JOptionPane.showMessageDialog(this, "Password must be at least 8 characters long.", "Password Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (!em.getText().trim().matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
        JOptionPane.showMessageDialog(this, "Please enter a valid email address.", "Email Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String contactNumber = "";

    String sql = "INSERT INTO `your_table_name` (FirstName, LastName, Email, UserType, Username, Password, Status) VALUES (?, ?, ?, ?, ?, ?, ?)";

    try (Connection conn = dbConnect.getConnect();
         PreparedStatement checkStmt = conn.prepareStatement("SELECT COUNT(*) FROM `your_table_name` WHERE `Username` = ?");
         PreparedStatement emailCheckStmt = conn.prepareStatement("SELECT COUNT(*) FROM `your_table_name` WHERE `Email` = ?");
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        checkStmt.setString(1, us.getText().trim());
        emailCheckStmt.setString(1, em.getText().trim());

        try (ResultSet rs = checkStmt.executeQuery(); ResultSet emailRs = emailCheckStmt.executeQuery()) {
            if (rs.next() && rs.getInt(1) > 0) {
                JOptionPane.showMessageDialog(this, "Error: Username already exists. Please choose a different username.", "Database Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

           if (emailRs.next() && emailRs.getInt(1) > 0) {
    int choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to edit this user with an existing email?", "Confirm Edit", JOptionPane.YES_NO_OPTION);
    if (choice == JOptionPane.YES_OPTION) {
        // Proceed with the edit even though the email exists
    } else {
        JOptionPane.showMessageDialog(this, "Edit canceled.", "Information", JOptionPane.INFORMATION_MESSAGE);
        return; // Stop the edit process
    }
}

            pstmt.setString(1, fn.getText().trim());
            pstmt.setString(2, ln.getText().trim());
            pstmt.setString(3, em.getText().trim());
            pstmt.setString(4, ty.getSelectedItem().toString());
            pstmt.setString(5, us.getText().trim());
            pstmt.setString(6, ps.getText().trim());
            pstmt.setString(7, use.getSelectedItem().toString()); 
          

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Added Successfully");
                usersForm usf = new usersForm();
                usf.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Failed to add user (no rows affected).", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }
    }//GEN-LAST:event_ADDActionPerformed

    private void tyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tyActionPerformed

    private void useActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useActionPerformed

    private void uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uActionPerformed
      try {
        // 1. Get values from form fields
        String firstName = fn.getText().trim();
        String lastName = ln.getText().trim();
        String email = em.getText().trim();
        String userType = (String) ty.getSelectedItem(); 
        String username = us.getText().trim();
        String password = new String(ps.getPassword()); 
        String status = (String) use.getSelectedItem(); 
        
        if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || username.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all required fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (userExists(email, username, userId)) {
            JOptionPane.showMessageDialog(this, "Email or username already exists.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        
        String sql = "UPDATE your_table_name SET FirstName=?, LastName=?, Email=?, UserType=?, Username=?, Password=?, Status=? WHERE id=?";

       
        try (Connection conn = dbConnect.getConnect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            // 6. Set the parameters
            pstmt.setString(1, firstName);
            pstmt.setString(2, lastName);
            pstmt.setString(3, email);
            pstmt.setString(4, userType);
            pstmt.setString(5, username);
            pstmt.setString(6, password);
            pstmt.setString(7, status);
            pstmt.setInt(8, Integer.parseInt(userId));

            // 7. Execute the update
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Updated Successfully");

                // 8. Go to usersForm if update is successful
                usersForm uf = new usersForm();
                uf.setVisible(true);
                this.dispose();

            } else {
                JOptionPane.showMessageDialog(this, "Failed to update user (no rows affected).", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }
}


private boolean userExists(String email, String username, String userId) {
    try {
        String sql = "SELECT COUNT(*) FROM your_table_name WHERE (Email = ? OR Username = ?) AND id != ?";
        try (Connection conn = dbConnect.getConnect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, email);
            pstmt.setString(2, username);
            pstmt.setInt(3, Integer.parseInt(userId));
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    int count = rs.getInt(1);
                    return count > 0;
                }
            }
        }
    } catch (SQLException ex) {
        
        ex.printStackTrace();
    }
    return false;
    }//GEN-LAST:event_uActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   int choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "", JOptionPane.YES_NO_OPTION);
    if (choice == JOptionPane.YES_OPTION) {
        System.exit(0);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Cancel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cancel3ActionPerformed

    private void Cancel5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cancel5ActionPerformed

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
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton ADD;
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Cancel3;
    private javax.swing.JButton Cancel5;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Main;
    public javax.swing.JTextField em;
    public javax.swing.JTextField fn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JTextField ln;
    public javax.swing.JPasswordField ps;
    public javax.swing.JComboBox<String> ty;
    private javax.swing.JButton u;
    public javax.swing.JTextField us;
    public javax.swing.JComboBox<String> use;
    // End of variables declaration//GEN-END:variables
}
