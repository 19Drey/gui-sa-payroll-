/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.Session;
import config.dbConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import payroll.l0ginform;

/**
 *
 * @author andre
 */
public class usersForm extends javax.swing.JFrame {
   

    /**
     * Creates new form usersForm
     */
    public usersForm() {
        initComponents();
         displayData();
    }

    public void displayData() {
     try {
        dbConnect dbc = new dbConnect();
        String sql = "SELECT id, FirstName, LastName, Email , Status FROM your_table_name"; // Modified SQL query
        ResultSet rs = dbc.getData(sql);
        admin.setModel(DbUtils.resultSetToTableModel(rs));
        rs.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error loading data: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        Main = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        user1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Navigator = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        emp1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        add = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        admin = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/photo-1574610758891-5b809b6e6e2e (1).jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Main.setBackground(new java.awt.Color(0, 153, 153));
        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(0, 204, 153));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EMPLOYEE LIST");
        Header.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 330, 50));

        user.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user.setText("0");
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userMouseClicked(evt);
            }
        });
        Header.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 160, 60));

        user1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        user1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user1.setText("Current user:");
        user1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user1MouseClicked(evt);
            }
        });
        Header.add(user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 120, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh (1).png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        Header.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 60, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/left (1).png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        Header.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, -1));
        Header.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/—Pngtree—ethereal watercolor background in shades_13379941.jpg"))); // NOI18N
        Header.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 70));

        Main.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 70));

        Navigator.setBackground(new java.awt.Color(51, 255, 204));
        Navigator.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jButton4.setBackground(new java.awt.Color(0, 153, 153));
        jButton4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 102, 102));
        jButton4.setText("ADD");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Navigator.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 170, 30));

        jButton5.setBackground(new java.awt.Color(0, 153, 153));
        jButton5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 102, 102));
        jButton5.setText("ADD");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        Navigator.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 170, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit (1).png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        Navigator.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 60, 60));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trash (1).png"))); // NOI18N
        jLabel8.setText("DELETE");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
        });
        Navigator.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 130, 70));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pen-circle (1).png"))); // NOI18N
        jLabel9.setText("EDIT");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
        });
        Navigator.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 100, 60));

        add.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user-add (1) (1).png"))); // NOI18N
        add.setText("ADD");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
        });
        Navigator.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 90, 60));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/—Pngtree—ethereal watercolor background in shades_13379941_1.jpg"))); // NOI18N
        Navigator.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 170, 600));

        Main.add(Navigator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 170, 650));

        admin.setForeground(new java.awt.Color(0, 153, 153));
        admin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(admin);

        Main.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 760, 540));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/photo-1574610758891-5b809b6e6e2e (1).jpg"))); // NOI18N
        Main.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 800, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseClicked

    }//GEN-LAST:event_userMouseClicked

    private void emp1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emp1MouseClicked
     
    }//GEN-LAST:event_emp1MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
  Session sess = Session.getInstance();
    Integer userId = sess.getUserId();
    System.out.println("UserId: " + userId);

    if (userId == null || userId <= 0) {
        JOptionPane.showMessageDialog(this, "Please log in first.");
        l0ginform loginForm = new l0ginform();
        loginForm.setVisible(true);
        this.dispose();
        return;
    }

 
    if (userId != null && userId > 0) {
        user.setText(" " + userId);
    } else {
        user.setText("ID: Not Available");
    }
        
    }//GEN-LAST:event_formWindowActivated

    private void user1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_user1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        addemployee emp = new addemployee();
        emp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        addemployee emp = new addemployee();
        emp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
          DefaultTableModel model = (DefaultTableModel) admin.getModel();
        model.setRowCount(0);
        model.setColumnCount(0);

        dbConnect dbc = new dbConnect();

        try (Connection conn = dbc.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("SELECT id,FirstName, LastName, Email, UserType, Username, Status FROM your_table_name");
            ResultSet rs = pstmt.executeQuery()) {

            model.addColumn("id");
            model.addColumn("First Name");
            model.addColumn("Last Name");
            model.addColumn("Email");
            model.addColumn("User Type");
            model.addColumn("Username");
            model.addColumn("Status");

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("id"),
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
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
         int choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
    if (choice == JOptionPane.YES_OPTION) {
        System.exit(0);
    }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
         adminDashboard ads = new adminDashboard();
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        int selectedRow = admin.getSelectedRow();

    if (selectedRow < 0) {
        JOptionPane.showMessageDialog(this, "Please select an item to delete.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this user?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
    if (confirm != JOptionPane.YES_OPTION) {
        return; // User canceled the deletion
    }

    try {
        dbConnect dbc = new dbConnect();
        TableModel model = admin.getModel();
        int userId = (int) model.getValueAt(selectedRow, 0); // Assuming 'id' is the first column

        String sql = "DELETE FROM `your_table_name` WHERE id = ?";
        try (PreparedStatement pstmt = dbc.getConnection().prepareStatement(sql)) {
            pstmt.setInt(1, userId);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "User deleted successfully.");
                displayData(); // Refresh the table data
            } else {
                JOptionPane.showMessageDialog(this, "Failed to delete user.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        int selectedRow = admin.getSelectedRow();

if (selectedRow < 0) {
    JOptionPane.showMessageDialog(this, "Please select an item!", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

try {
    dbConnect dbc = new dbConnect();
    TableModel model = admin.getModel();
    int userId = (Integer) model.getValueAt(selectedRow, 0);

    String sql = "SELECT id, FirstName, LastName, Email, UserType, Username, Password, Status FROM `your_table_name` WHERE id = ?";
    try (PreparedStatement pstmt = dbc.getConnection().prepareStatement(sql)) {
        pstmt.setInt(1, userId);
        try (ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                createUserForm crf = new createUserForm(String.valueOf(userId)); // Pass userId as String

                crf.fn.setText(rs.getString("FirstName"));
                crf.ln.setText(rs.getString("LastName"));
                crf.em.setText(rs.getString("Email"));
                crf.us.setText(rs.getString("Username"));
               

                crf.ty.setSelectedItem(rs.getString("UserType"));
                crf.use.setSelectedItem(rs.getString("Status"));
                   
                
                 createUserForm adm = new createUserForm();
                crf.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "User not found.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    ex.printStackTrace();
}
    }//GEN-LAST:event_jLabel9MouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
addemployee adm = new addemployee();
adm.setVisible(true);
this.dispose();

  

    }//GEN-LAST:event_addMouseClicked

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseEntered

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
    
    }//GEN-LAST:event_addMouseEntered

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseEntered

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
            java.util.logging.Logger.getLogger(usersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usersForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Main;
    private javax.swing.JPanel Navigator;
    private javax.swing.JLabel add;
    private javax.swing.JTable admin;
    private javax.swing.JLabel emp1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel user;
    private javax.swing.JLabel user1;
    // End of variables declaration//GEN-END:variables
}
