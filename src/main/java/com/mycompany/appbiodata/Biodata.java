package com.mycompany.appbiodata;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;
/**
 *
 * @author YOGHI PRASETYO
 */
public class Biodata extends javax.swing.JFrame {
    int x=0;

   
    public Biodata() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        noHp = new javax.swing.JLabel();
        nama1 = new javax.swing.JLabel();
        jenisKelamin = new javax.swing.JLabel();
        alamat = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbData = new javax.swing.JTable();
        nama2 = new javax.swing.JTextField();
        noHp2 = new javax.swing.JTextField();
        pilihan = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        alamat2 = new javax.swing.JTextArea();
        simpan = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        bersihkan = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        simpanData = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("From Biodata");

        noHp.setText("No.hp");

        nama1.setText("Nama");

        jenisKelamin.setText("Jenis Kelamin");

        alamat.setText("Alamat");

        TbData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nama", "No.Hp", "Jenis Kelamin"
            }
        ));
        jScrollPane1.setViewportView(TbData);

        nama2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama2ActionPerformed(evt);
            }
        });

        pilihan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki - laki", "Prempuan" }));
        pilihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihanActionPerformed(evt);
            }
        });

        alamat2.setColumns(20);
        alamat2.setRows(5);
        jScrollPane2.setViewportView(alamat2);

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        jButton1.setText("Hapus");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bersihkan.setText("Bersihkan");
        bersihkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bersihkanActionPerformed(evt);
            }
        });

        jButton4.setText("Keluar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        simpanData.setText("Simpan Data");
        simpanData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanDataActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jenisKelamin)
                                    .addComponent(noHp, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nama1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(alamat, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(pilihan, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(nama2)
                                    .addComponent(noHp2)
                                    .addComponent(jScrollPane2)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(simpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(simpanData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bersihkan)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4)
                                .addGap(6, 6, 6)))
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nama1)
                    .addComponent(nama2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noHp)
                    .addComponent(noHp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jenisKelamin)
                    .addComponent(pilihan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alamat)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpan)
                    .addComponent(simpanData)
                    .addComponent(bersihkan)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nama2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama2ActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        TbData.setValueAt(nama2.getText(),x,0);
        TbData.setValueAt(noHp2.getText(),x,1);
        TbData.setValueAt(pilihan.getSelectedItem(),x,2);
        x=x=1;
    }//GEN-LAST:event_simpanActionPerformed

    private void pilihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihanActionPerformed
        String jenis, TbData;
        
        jenis = String.valueOf(pilihan.getSelectedItem());
        
        if (jenis.equals("Laki-laki")){
            TbData = "Laki - laki";
        }else  if (jenis.equals("Prempuan")){
            TbData = "Prempuan";
        }
    }//GEN-LAST:event_pilihanActionPerformed

    private void bersihkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bersihkanActionPerformed
        nama2.setText("");
        noHp2.setText("");
        pilihan.setSelectedItem("");
        alamat2.setText("");
        nama2.requestFocus();
    }//GEN-LAST:event_bersihkanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TbData.setValueAt("",TbData.getSelectedRow(),0);
        TbData.setValueAt("",TbData.getSelectedRow(),1);
        TbData.setValueAt("",TbData.getSelectedRow(),2);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int confirmation = JOptionPane.showConfirmDialog(Biodata.this,"Apakah anda yakin ingin keluar dari aplikasi?", "komfirmasi", JOptionPane.YES_NO_CANCEL_OPTION);
                if (confirmation == JOptionPane.YES_NO_OPTION)
                {
                    System.exit(0);
                } else 
                {
                    JOptionPane.showMessageDialog(Biodata.this, "Anda menekan tombol NO");
                }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void simpanDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanDataActionPerformed
        String nama1 = nama2.getText();
        String noHp = noHp2.getText();
        String alamat = alamat2.getText();
        String jenis, TbData;
        
        jenis = String.valueOf(pilihan.getSelectedItem());
        
        if (jenis.equals("Laki-laki")){
            TbData = "Laki - laki";
        }else  if (jenis.equals("Prempuan")){
            TbData = "Prempuan";
        }
        
        try {
            FileWriter Writer=new FileWriter("Data.txt",true);
            
            Writer.write(""+nama2);
            Writer.write(System.getProperty("line.sepatator"));
            Writer.write(""+noHp2);
            Writer.write(System.getProperty("line.sepatator"));
            Writer.write(""+pilihan);
            Writer.write(System.getProperty("line.sepatator"));
            Writer.write(""+alamat2);
            
            Writer.close();
            
            JOptionPane.showMessageDialog(Biodata.this, "Berhasil/Data Tersimpan");
            
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(Biodata.this, "Sepertinya Ada Yang Error :)");
        }
    }//GEN-LAST:event_simpanDataActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Biodata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TbData;
    private javax.swing.JLabel alamat;
    private javax.swing.JTextArea alamat2;
    private javax.swing.JButton bersihkan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jenisKelamin;
    private javax.swing.JLabel nama1;
    private javax.swing.JTextField nama2;
    private javax.swing.JLabel noHp;
    private javax.swing.JTextField noHp2;
    private javax.swing.JComboBox<String> pilihan;
    private javax.swing.JButton simpan;
    private javax.swing.JButton simpanData;
    // End of variables declaration//GEN-END:variables
}
