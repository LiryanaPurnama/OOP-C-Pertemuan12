package pertemuan10;

import static pertemuan10.dbkoneksi.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Liryana Purnama
 * TGL 31/05/2025
 */
public class fMahasiswa extends javax.swing.JFrame {
    
    DefaultTableModel DTM = new DefaultTableModel();
    
    
    public fMahasiswa() throws SQLException {
        initComponents();
        
        tblMhs.setModel(DTM);
        DTM.addColumn("NIM");
        DTM.addColumn("Nama Mahasiswa");
        DTM.addColumn("Jurusan");
        DTM.addColumn("Alamat");
        
        String[] opsiJUR = {"Pilih Jurusan", "IFKAB","IFMTI","DKV","IFPAR","BD","RSK"};
        cbJUR.removeAllItems();
        for(int i=0;i<7;i++){
         cbJUR.addItem(opsiJUR[i]);   
        }
        
        listdtmhs();
        clearform();     
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txNIM = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txNAMA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txJUR = new javax.swing.JTextField();
        txALAMAT = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMhs = new javax.swing.JTable();
        cTUTUP = new javax.swing.JButton();
        cHAPUS = new javax.swing.JButton();
        cUBAH = new javax.swing.JButton();
        cBARU = new javax.swing.JButton();
        cbJUR = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 55));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Data Mahasiswa");

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel2.setText("NIM");

        txNIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNIMActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel3.setText("Nama Mahasiswa");

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel4.setText("Jurusan");

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel5.setText("Alamat");

        tblMhs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NIM", "Nama Mahasiswa", "Jurusan", "Alamat"
            }
        ));
        tblMhs.setMinimumSize(new java.awt.Dimension(250, 150));
        tblMhs.setPreferredSize(new java.awt.Dimension(300, 150));
        tblMhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMhsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMhs);

        cTUTUP.setText("Tutup");

        cHAPUS.setText("Hapus");

        cUBAH.setText("Ubah");
        cUBAH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cUBAHActionPerformed(evt);
            }
        });

        cBARU.setText("Baru");
        cBARU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cBARUMouseClicked(evt);
            }
        });
        cBARU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBARUActionPerformed(evt);
            }
        });

        cbJUR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cBARU)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cUBAH)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cHAPUS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cTUTUP))
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(txALAMAT)
                            .addComponent(txJUR, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txNIM)
                            .addComponent(txNAMA))
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbJUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txNAMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txJUR, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txALAMAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbJUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cTUTUP)
                            .addComponent(cHAPUS)
                            .addComponent(cBARU)
                            .addComponent(cUBAH)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txNIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNIMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNIMActionPerformed

    private void cBARUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBARUActionPerformed
        
        if(cBARU.getText().equals("Baru")){
            clearform();
            cBARU.setText("Simpan");
            cTUTUP.setText("Batal");
            cUBAH.setEnabled(false);
            cHAPUS.setEnabled(false);
        }else{
            try {
                storeData();
                listdtmhs(); 
            } catch (SQLException ex) {
                Logger.getLogger(fMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
            }
            cBARU.setText("Baru");
            cTUTUP.setText("Batal");
            cUBAH.setEnabled(true);
            cHAPUS.setEnabled(true);
        }
        
    }//GEN-LAST:event_cBARUActionPerformed

    private void tblMhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMhsMouseClicked
         txNIM.setText(tblMhs.getValueAt(tblMhs.getSelectedRow() ,0).toString());
         txNAMA.setText(tblMhs.getValueAt(tblMhs.getSelectedRow() ,1).toString());
         txJUR.setText(tblMhs.getValueAt(tblMhs.getSelectedRow() ,2).toString());
         txALAMAT.setText(tblMhs.getValueAt(tblMhs.getSelectedRow() ,3).toString());
    }//GEN-LAST:event_tblMhsMouseClicked

    private void cUBAHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cUBAHActionPerformed
        
        if(cUBAH.getText().equals("Ubah")){
            clearform();
            cUBAH.setText("Simpan");
        }else{
            cUBAH.setText("Ubah");
        }
        
    }//GEN-LAST:event_cUBAHActionPerformed

    private void cBARUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cBARUMouseClicked
        
    }//GEN-LAST:event_cBARUMouseClicked

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
            java.util.logging.Logger.getLogger(fMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new fMahasiswa().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(fMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cBARU;
    private javax.swing.JButton cHAPUS;
    private javax.swing.JButton cTUTUP;
    private javax.swing.JButton cUBAH;
    private javax.swing.JComboBox<String> cbJUR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMhs;
    private javax.swing.JTextField txALAMAT;
    private javax.swing.JTextField txJUR;
    private javax.swing.JTextField txNAMA;
    private javax.swing.JTextField txNIM;
    // End of variables declaration//GEN-END:variables

    private void listdtmhs() throws SQLException {
      Connection cnn = koneksi ();
      
      DTM.getDataVector().removeAllElements();
      DTM.fireTableDataChanged();
      
      if( !cnn.isClosed()){
          PreparedStatement PS = cnn.prepareStatement("SELECT * FROM mhs;");
          ResultSet RS = PS.executeQuery();
          while( RS.next() ){
              Object[] dtmhs = new Object[4];
              dtmhs[0] = RS.getString("NIM");
              dtmhs[1] = RS.getString("NAMA");
              dtmhs[2] = RS.getString("JURUSAN");
              dtmhs[3] = RS.getString("ALAMAT");
              
              DTM.addRow(dtmhs);
          }
          
          
      }
    }
    
    private void clearform(){
        txNAMA.setText("");
        txNIM.setText("");
        txJUR.setText("");
        txALAMAT.setText("");
    }

    private void storeData() throws SQLException {
        Connection cnn = koneksi();
        String nim = txNIM.getText();
        String nama = txNAMA.getText();
        String jur = txJUR.getText();
        String alamat = txALAMAT.getText();
        
        if(!cnn.isClosed()){
            PreparedStatement PS = cnn.prepareStatement("INSERT INTO mhs(NIM,NAMA,JURUSAN,ALAMAT)VALUES(?,?,?,?);");
            PS.setString(1, nim);
            PS.setString(2, nama);
            PS.setString(3, jur);
            PS.setString(4, alamat);
            PS.executeUpdate();
        }
    }
    
}
