
package simko;


public class frmLP extends javax.swing.JFrame {

    
    public frmLP() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtfusername = new javax.swing.JTextField();
        txtfnewpass = new javax.swing.JPasswordField();
        txtfconpass = new javax.swing.JPasswordField();
        lblreset = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        txtfusername.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        txtfusername.setBorder(null);
        txtfusername.setOpaque(false);
        txtfusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfusernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtfusername);
        txtfusername.setBounds(680, 360, 560, 60);

        txtfnewpass.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        txtfnewpass.setBorder(null);
        txtfnewpass.setOpaque(false);
        getContentPane().add(txtfnewpass);
        txtfnewpass.setBounds(680, 500, 540, 60);

        txtfconpass.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        txtfconpass.setBorder(null);
        txtfconpass.setOpaque(false);
        getContentPane().add(txtfconpass);
        txtfconpass.setBounds(680, 640, 540, 60);

        lblreset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblresetMouseClicked(evt);
            }
        });
        getContentPane().add(lblreset);
        lblreset.setBounds(810, 790, 300, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Lupa password.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1920, 1080);

        setSize(new java.awt.Dimension(1938, 1127));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtfusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfusernameActionPerformed

    private void lblresetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblresetMouseClicked
        
    }//GEN-LAST:event_lblresetMouseClicked

    
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
            java.util.logging.Logger.getLogger(frmLP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblreset;
    private javax.swing.JPasswordField txtfconpass;
    private javax.swing.JPasswordField txtfnewpass;
    private javax.swing.JTextField txtfusername;
    // End of variables declaration//GEN-END:variables
}
