/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tagihan.page;

import java.awt.Frame;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ROG
 */
public class form_tagihan extends javax.swing.JFrame {

    /**
     * Creates new form form_tagihan
     */
    public form_tagihan() {
        initComponents();
        tampil_nama();
        tampil_kamar();
    }
    
// menampilkan nama di combobox
    public void tampil_nama(){
        try {
            String sql = "SELECT nama_penghuni FROM tb_penghuni";
            java.sql.Connection conn = (Connection)config.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet res = pst.executeQuery(sql);
            
            while(res.next()){
                combo_idpeng.addItem(res.getString("nama_penghuni"));
            }
            
            res.last();
            int jumlah_data = res.getRow();
            
            res.first();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    public void tampil_kamar(){
        try {
            String sql = "SELECT noKamar FROM tb_kamar";
            java.sql.Connection conn = (Connection)config.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet res = pst.executeQuery(sql);
            
            while(res.next()){
                combo_kamar.addItem(res.getString("noKamar"));
            }
    }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tgl = new com.toedter.calendar.JDateChooser();
        combo_idpeng = new javax.swing.JComboBox<>();
        combo_status = new javax.swing.JComboBox<>();
        combo_periode = new javax.swing.JComboBox<>();
        combo_kamar = new javax.swing.JComboBox<>();
        lbl_tagihan = new javax.swing.JTextField();
        lbl_id = new javax.swing.JTextField();
        btn_batal = new javax.swing.JLabel();
        btn_simpan = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        tgl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(tgl);
        tgl.setBounds(1108, 485, 373, 40);

        combo_idpeng.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        combo_idpeng.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih--" }));
        combo_idpeng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_idpengActionPerformed(evt);
            }
        });
        getContentPane().add(combo_idpeng);
        combo_idpeng.setBounds(1108, 310, 130, 40);

        combo_status.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        combo_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lunas\t", "Belum Lunas" }));
        combo_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_statusActionPerformed(evt);
            }
        });
        getContentPane().add(combo_status);
        combo_status.setBounds(547, 830, 180, 40);

        combo_periode.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        combo_periode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Bulan ", "2 Bulan", "3 Bulan ", "4 Bulan ", "5 Bulan ", "6 Bulan ", "1 Tahun" }));
        combo_periode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_periodeActionPerformed(evt);
            }
        });
        getContentPane().add(combo_periode);
        combo_periode.setBounds(547, 650, 140, 40);

        combo_kamar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        combo_kamar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih--" }));
        getContentPane().add(combo_kamar);
        combo_kamar.setBounds(546, 485, 373, 40);

        lbl_tagihan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_tagihan.setBorder(null);
        lbl_tagihan.setOpaque(false);
        getContentPane().add(lbl_tagihan);
        lbl_tagihan.setBounds(1108, 665, 370, 26);

        lbl_id.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_id.setBorder(null);
        lbl_id.setOpaque(false);
        getContentPane().add(lbl_id);
        lbl_id.setBounds(547, 320, 370, 26);

        btn_batal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_batalMouseClicked(evt);
            }
        });
        getContentPane().add(btn_batal);
        btn_batal.setBounds(1060, 940, 190, 60);

        btn_simpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_simpanMouseClicked(evt);
            }
        });
        getContentPane().add(btn_simpan);
        btn_simpan.setBounds(1290, 940, 180, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Tagihan.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1920, 1080);

        setSize(new java.awt.Dimension(1938, 1127));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void combo_idpengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_idpengActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_idpengActionPerformed

    private void combo_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_statusActionPerformed

    private void combo_periodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_periodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_periodeActionPerformed

    private void btn_batalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_batalMouseClicked
        this.setVisible(true);
        new pop_up_gagal().setVisible(true);
    }//GEN-LAST:event_btn_batalMouseClicked

    private void btn_simpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpanMouseClicked
       
       this.setVisible(true);
       new pop_up_berhasil().setVisible(true);

    
       
        
//        try{
//        String sql = "INSERT INTO simko(tb_tagihan) VALUES('"+lbl_id.getText()+"','"
//                +lbl_kamar.getText()+"','"
//                +tgl.getDate()+"','"+"','"
//                +lbl_tagihan.getText()+"')";
//        
//       java.sql.Connection conn = (Connection)config.configDB();
//       java.sql.PreparedStatement pst = conn.prepareStatement(sql);
//       pst.execute();
//       
////       JOptionPane.showMessageDialog(null, "Register Data Berhasil");
//       this.setVisible(true);
//       new pop_up_berhasil().setVisible(true);
//                
//        
//        } catch (Exception e){
//        this.setVisible(true);
//        new pop_up_gagal().setVisible(true);
//        }
    }//GEN-LAST:event_btn_simpanMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setExtendedState(JFrame.MAXIMIZED_BOTH);
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
            java.util.logging.Logger.getLogger(form_tagihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_tagihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_tagihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_tagihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_tagihan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_batal;
    private javax.swing.JLabel btn_simpan;
    private javax.swing.JComboBox<String> combo_idpeng;
    private javax.swing.JComboBox<String> combo_kamar;
    private javax.swing.JComboBox<String> combo_periode;
    private javax.swing.JComboBox<String> combo_status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField lbl_id;
    private javax.swing.JTextField lbl_tagihan;
    private com.toedter.calendar.JDateChooser tgl;
    // End of variables declaration//GEN-END:variables
}
