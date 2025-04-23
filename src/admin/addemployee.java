
package admin;

import config.Hash;
import config.dbConnect;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import payroll.Regform;
import payroll.l0ginform;

/**
 *
 * @author andre
 */
public class addemployee extends javax.swing.JFrame {

    /**
     
     */
    public addemployee() {
        initComponents();
    }

   public String destination = "";
   File selectedFile;
   public String oldpath;
   public String path;
    public int FileExistenceChecker(String path){
        File file = new File(path);
        String fileName = file.getName();
        
        Path filePath = Paths.get("src/userimages", fileName);
        boolean fileExists = Files.exists(filePath);
        
        if (fileExists) {
            return 1;
        } else {
            return 0;
        }
    }
    public static int getHeightFromWidth(String imagePath, int desiredWidth) {
        try {
            // Read the image file
            File imageFile = new File(imagePath);
            BufferedImage image = ImageIO.read(imageFile);
            
            // Get the original width and height of the image
            int originalWidth = image.getWidth();
            int originalHeight = image.getHeight();
            
            // Calculate the new height based on the desired width and the aspect ratio
            int newHeight = (int) ((double) desiredWidth / originalWidth * originalHeight);
            
            return newHeight;
        } catch (IOException ex) {
            System.out.println("No image found!");
        }
        
        return -1;}
    public  ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
    ImageIcon MyImage = null;
        if(ImagePath !=null){
            MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
        
    int newHeight = getHeightFromWidth(ImagePath, label.getWidth());

    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(label.getWidth(), newHeight, Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Navigator = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
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
        ty = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        use = new javax.swing.JComboBox<>();
        add = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        papas = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        r = new javax.swing.JButton();
        s = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Main.setBackground(new java.awt.Color(0, 153, 153));
        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(0, 153, 130));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("                              ADD");
        Header.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 40, 840, 50));

        Main.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 100));

        Navigator.setBackground(new java.awt.Color(0, 204, 204));
        Navigator.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ANdre logo.png"))); // NOI18N
        Navigator.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 160, 150));

        Main.add(Navigator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 220, 450));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password:");
        Main.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 120, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Type:");
        Main.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 120, 30));

        us.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        us.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usActionPerformed(evt);
            }
        });
        Main.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 230, 40));

        ps.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ps.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psActionPerformed(evt);
            }
        });
        Main.add(ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 230, 40));

        em.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        em.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emActionPerformed(evt);
            }
        });
        Main.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 230, 40));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Last Name:");
        Main.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 120, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Email:");
        Main.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 120, 30));

        fn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        fn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        Main.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 230, 40));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("First Name:");
        Main.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 120, 30));

        ln.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ln.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });
        Main.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 230, 40));

        ty.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT TYPE", "ADMIN", "USER", "EMPLOYEE" }));
        ty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tyActionPerformed(evt);
            }
        });
        Main.add(ty, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 230, 40));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Username:");
        Main.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 120, 30));

        use.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        use.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT STATUS", "ACTIVE", "PENDING" }));
        use.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useActionPerformed(evt);
            }
        });
        Main.add(use, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 230, 50));

        add.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        Main.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, 80, 30));

        Cancel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        Main.add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, 90, 30));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("STATUS:");
        Main.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 120, 40));

        papas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                papasActionPerformed(evt);
            }
        });
        Main.add(papas, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, 20, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );

        Main.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 430, 330));

        r.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        r.setText("REMOVE");
        r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rActionPerformed(evt);
            }
        });
        Main.add(r, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 470, 110, 40));

        s.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        s.setText("SELECT");
        s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sActionPerformed(evt);
            }
        });
        Main.add(s, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usActionPerformed
       

    }//GEN-LAST:event_usActionPerformed

    private void psActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psActionPerformed
        
    }//GEN-LAST:event_psActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
      usersForm adu =new usersForm();
        adu.setVisible(true);
        this.dispose();                             

    }//GEN-LAST:event_CancelActionPerformed

    private void emActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emActionPerformed
     
    }//GEN-LAST:event_emActionPerformed

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed

       

    }//GEN-LAST:event_fnActionPerformed

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed
   
    }//GEN-LAST:event_lnActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed






        
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

    String sql = "INSERT INTO your_table_name (FirstName, LastName, Email, UserType, Username, Password, Status, u_image) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

    try (Connection conn = dbConnect.getConnect();
         PreparedStatement checkStmt = conn.prepareStatement("SELECT COUNT(*) FROM your_table_name WHERE Username = ?");
         PreparedStatement emailCheckStmt = conn.prepareStatement("SELECT COUNT(*) FROM your_table_name WHERE Email = ?");
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        checkStmt.setString(1, us.getText().trim());
        emailCheckStmt.setString(1, em.getText().trim());

        try (ResultSet rs = checkStmt.executeQuery();
             ResultSet emailRs = emailCheckStmt.executeQuery()) {

            if (rs.next() && rs.getInt(1) > 0) {
                JOptionPane.showMessageDialog(this, "Error: Username already exists. Please choose a different username.", "Database Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (emailRs.next() && emailRs.getInt(1) > 0) {
                JOptionPane.showMessageDialog(this, "Error: Email already exists. Please choose a different email.", "Database Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            pstmt.setString(1, fn.getText().trim());
            pstmt.setString(2, ln.getText().trim());
            pstmt.setString(3, em.getText().trim());
            pstmt.setString(4, ty.getSelectedItem().toString());
            pstmt.setString(5, us.getText().trim());
             pstmt.setString(5, image.getText().trim());

            String hashedPassword = null;
            hashedPassword = Hash.hashPassword(ps.getText());

            pstmt.setString(6, hashedPassword);
            pstmt.setString(7, "Pending");
            pstmt.setBytes(8, null); // Still setting to null

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Added Successfully");
                usersForm u = new usersForm();
                u.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Failed to add user (no rows affected).", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(addemployee.class.getName()).log(Level.SEVERE, null, ex);
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }

    }//GEN-LAST:event_addActionPerformed

    private void tyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tyActionPerformed

    private void useActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useActionPerformed

    private void papasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_papasActionPerformed
         if (papas.isSelected()) {
        ps.setEchoChar((char) 0); 
    } else {
        ps.setEchoChar('*');
    }

    }//GEN-LAST:event_papasActionPerformed

    private void rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rActionPerformed
 r.setEnabled(false);
        s.setEnabled(true);
        image.setIcon(null);
        destination ="";
        path= "";
    }//GEN-LAST:event_rActionPerformed

    private void sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sActionPerformed
        JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    try {
                        selectedFile = fileChooser.getSelectedFile();
                        destination = "src/images/" + selectedFile.getName();
                        path  = selectedFile.getAbsolutePath();
                        
                        
                        if(FileExistenceChecker(path) == 1){
                          JOptionPane.showMessageDialog(null, "File Already Exist, Rename or Choose another!");
                            destination = "";
                            path="";
                        }else{
                            image.setIcon(ResizeImage(path, null, image));
                            s.setEnabled(false);
                             r.setEnabled(true);
                        
                        }
                    } catch (Exception ex) {
                        System.out.println("File Error!");
                    }
                } 
    }//GEN-LAST:event_sActionPerformed

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
    private javax.swing.JButton add;
    private javax.swing.JTextField em;
    private javax.swing.JTextField fn;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField ln;
    private javax.swing.JCheckBox papas;
    private javax.swing.JPasswordField ps;
    private javax.swing.JButton r;
    private javax.swing.JButton s;
    private javax.swing.JComboBox<String> ty;
    private javax.swing.JTextField us;
    public javax.swing.JComboBox<String> use;
    // End of variables declaration//GEN-END:variables
}
