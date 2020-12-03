/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.view;

import model.NguoiChoi;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

/**
 *
 * @author VanAnh
 */
public class OnlineView extends javax.swing.JFrame {

    private final NguoiChoi nguoichoi;

    /**
     * Creates new form LoseList
     */
    public OnlineView(NguoiChoi nguoichoi) {
        this.nguoichoi = nguoichoi;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton3.setText("Xem xếp hạng");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Danh sách online");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên tài khoản", "Tổng số điểm hiện tại", "Trạng thái online"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Quay lại");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Làm mới");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(21, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jButton3)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton2)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton1)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2)
                                        .addComponent(jButton3))
                                .addGap(90, 90, 90))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jButton3;

    public JTable getJTable() {
        return jTable1;
    }
    public void addRefreshButtonListener(ActionListener actionListener) {
        jButton2.addActionListener(actionListener);
    }

    public void addOnlinePlayersTableListener(MouseAdapter mouseAdapter) {
        jTable1.addMouseListener(mouseAdapter);
    }
    public NguoiChoi getNguoichoi() {
        return nguoichoi;
    }

    public void updateTable(Object[] objects) {
        ((DefaultTableModel) jTable1.getModel()).setRowCount(objects.length - 1);
        int j = 0;
        for (int i = 0; i < objects.length; i++) {
            NguoiChoi curNguoiChoi = (NguoiChoi) objects[i];
            if (curNguoiChoi.getId() != this.getNguoichoi().getId()) {
                jTable1.setValueAt(curNguoiChoi.getTenDangNhap(), j, 0);
                jTable1.setValueAt(curNguoiChoi.getTrangThai(), j, 2);
                j ++;
            }
        }
    }

    public void addRankingButtonListener(ActionListener actionListener) {
        jButton3.addActionListener(actionListener);
    }
    public int showConfirmDialog(String s) {
        return JOptionPane.showConfirmDialog(null, s);
    }
    // End of variables declaration//GEN-END:variables
}
