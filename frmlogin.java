package simko;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static simko.beranda.lblnama;
import static simko.beranda.lblnama1;



public class frmlogin extends javax.swing.JFrame {

    
    public frmlogin() {
        initComponents();
        this.icon2.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtfusername = new javax.swing.JTextField();
        txtfpass = new javax.swing.JPasswordField();
        lbllogin = new javax.swing.JLabel();
        lbldaftar = new javax.swing.JLabel();
        lblLP = new javax.swing.JLabel();
        icon1 = new javax.swing.JLabel();
        icon2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        txtfusername.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        txtfusername.setBorder(null);
        txtfusername.setOpaque(false);
        getContentPane().add(txtfusername);
        txtfusername.setBounds(1050, 500, 550, 60);

        txtfpass.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        txtfpass.setBorder(null);
        txtfpass.setOpaque(false);
        txtfpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfpassActionPerformed(evt);
            }
        });
        getContentPane().add(txtfpass);
        txtfpass.setBounds(1040, 650, 550, 50);

        lbllogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblloginMouseClicked(evt);
            }
        });
        getContentPane().add(lbllogin);
        lbllogin.setBounds(1170, 820, 300, 90);

        lbldaftar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbldaftarMouseClicked(evt);
            }
        });
        getContentPane().add(lbldaftar);
        lbldaftar.setBounds(190, 600, 310, 100);
        getContentPane().add(lblLP);
        lblLP.setBounds(1480, 740, 240, 40);

        icon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon1MousePressed(evt);
            }
        });
        getContentPane().add(icon1);
        icon1.setBounds(1630, 640, 50, 50);

        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-hide-50.png"))); // NOI18N
        icon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon2MousePressed(evt);
            }
        });
        getContentPane().add(icon2);
        icon2.setBounds(1630, 640, 50, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Login.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1920, 1080);

        setSize(new java.awt.Dimension(1938, 1127));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbldaftarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbldaftarMouseClicked
        this.setVisible(false);
        new frmregister().setVisible(true);
    }//GEN-LAST:event_lbldaftarMouseClicked

    private void lblloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblloginMouseClicked
        try {
            String sql = "SELECT * FROM tb_login "
                    + "where username = '"+txtfusername.getText()+"' "
                    + "AND password = '"+txtfpass.getText()+"'";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            java.sql.ResultSet rs = pst.executeQuery(sql);
        
        if(rs.next()){
                if(txtfusername.getText().equals(rs.getString("username"))
                        && txtfpass.getText().equals(rs.getString("password"))){
                    this.setVisible(false);
                    new beranda().setVisible(true);
                    lblnama.setText(rs.getString(2));
                    lblnama1.setText(rs.getString(2));
                }
        }else{
            JOptionPane.showMessageDialog(null, "username atau password salah");
        }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_lblloginMouseClicked

    private void icon2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon2MousePressed
        icon1.setVisible(true);
        icon2.setVisible(false);
        txtfpass.setEchoChar((char)0);
    }//GEN-LAST:event_icon2MousePressed

    private void icon1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon1MousePressed
        icon2.setVisible(true);
        icon1.setVisible(false);
        txtfpass.setEchoChar('*');
    }//GEN-LAST:event_icon1MousePressed

    private void txtfpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfpassActionPerformed
       
    }//GEN-LAST:event_txtfpassActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblLP;
    private javax.swing.JLabel lbldaftar;
    private javax.swing.JLabel lbllogin;
    private javax.swing.JPasswordField txtfpass;
    private javax.swing.JTextField txtfusername;
    // End of variables declaration//GEN-END:variables
}
