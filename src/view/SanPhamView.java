/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.util.List;
import javax.swing.JOptionPane;
import model.SanPham;
import javax.swing.table.DefaultTableModel;
import model.KichCo;
import model.LoaiSanPham;
import model.MauSac;
import model.SanPhamViewModel;
import respository.SanPham_ResPository;
import service.SanPham_Ser;
import serviceimplement.SanPham_Imply;

/**
 *
 * @author ADMIN
 */
public class SanPhamView extends javax.swing.JPanel {

    List<LoaiSanPham> listLSP;
    List<MauSac> listMS;
    List<KichCo> listKC;
    DefaultTableModel modell, modelm, modelk;
    int index;

    /**
     * Creates new form ChiTietSP
     */
    public SanPhamView() {
        initComponents();
        fillTableLSP();
        fillTableKC();
        fillTableMS();

    }

    public void fillTableLSP() {

        listLSP = SanPham_ResPository.getAllLSP();
        modell = (DefaultTableModel) tblLSP.getModel();
        modell.setRowCount(0);
        for (LoaiSanPham sp : listLSP) {
            modell.addRow(new Object[]{sp.getId(), sp.getMa(), sp.getTen()});
        }
    }

    public void fillTableMS() {

        listMS = SanPham_ResPository.getAllMauSac();
        modelm = (DefaultTableModel) tblMS.getModel();
        modelm.setRowCount(0);
        for (MauSac sp : listMS) {
            modelm.addRow(new Object[]{sp.getId(), sp.getMa(), sp.getTen()});
        }
    }

    public void fillTableKC() {

        listKC = SanPham_ResPository.getAllKichCo();
        modelk = (DefaultTableModel) tblKC.getModel();
        modelk.setRowCount(0);
        for (KichCo sp : listKC) {
            modelk.addRow(new Object[]{sp.getId(), sp.getMa(), sp.getTen()});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLSP = new javax.swing.JTable();
        btnThemLSP = new javax.swing.JButton();
        txtIDLSP = new javax.swing.JTextField();
        txtTenLSP = new javax.swing.JTextField();
        txtMaLSP = new javax.swing.JTextField();
        btnCapNhatLSP = new javax.swing.JButton();
        btnXoaLSP = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMS = new javax.swing.JTable();
        btnThemMS = new javax.swing.JButton();
        txtIDMauSac = new javax.swing.JTextField();
        txtTenMS = new javax.swing.JTextField();
        txtMaMS = new javax.swing.JTextField();
        btnCapNhatMS = new javax.swing.JButton();
        btnXoaMS = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblKC = new javax.swing.JTable();
        btnThemKC = new javax.swing.JButton();
        txtIDKichCo = new javax.swing.JTextField();
        txtTenKichCo = new javax.swing.JTextField();
        txtMaKichCo = new javax.swing.JTextField();
        btnCapNhatKC = new javax.swing.JButton();
        btnXoaKC = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(51, 204, 255));

        jTabbedPane4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel1.setText("ID loại sản phẩm:");

        jLabel2.setText("Mã loại sản phẩm:");

        jLabel3.setText("Tên loại sản phẩm:");

        tblLSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID loại sản phẩm", "Mã loại sản phẩm", "Tên loại sản phẩm"
            }
        ));
        tblLSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLSP);

        btnThemLSP.setText("Thêm ");
        btnThemLSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemLSPActionPerformed(evt);
            }
        });

        txtIDLSP.setEnabled(false);

        btnCapNhatLSP.setText("Cập nhật ");
        btnCapNhatLSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatLSPActionPerformed(evt);
            }
        });

        btnXoaLSP.setText("Xóa");
        btnXoaLSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaLSPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaLSP, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIDLSP, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTenLSP, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(76, 76, 76))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(btnThemLSP, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(btnCapNhatLSP, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)))
                        .addComponent(btnXoaLSP, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIDLSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaLSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenLSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemLSP, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapNhatLSP, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaLSP, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Loại sản phẩm", jPanel4);

        tblMS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID màu sắc", "Mã màu sắc", "Tên màu sắc"
            }
        ));
        tblMS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMSMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblMS);

        btnThemMS.setText("Thêm ");
        btnThemMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMSActionPerformed(evt);
            }
        });

        txtIDMauSac.setEnabled(false);

        btnCapNhatMS.setText("Cập nhật");
        btnCapNhatMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatMSActionPerformed(evt);
            }
        });

        btnXoaMS.setText("Xóa");
        btnXoaMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaMSActionPerformed(evt);
            }
        });

        jLabel7.setText("ID màu sắc:");

        jLabel8.setText("Mã màu sắc:");

        jLabel9.setText("Tên màu sắc:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaMS, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIDMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTenMS, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(103, 103, 103))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(btnThemMS, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(btnCapNhatMS, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)))
                        .addComponent(btnXoaMS, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtIDMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtMaMS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTenMS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemMS, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapNhatMS, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaMS, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Màu sắc", jPanel6);

        tblKC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID kích cỡ", "Mã kích cỡ", "Tên kích cỡ"
            }
        ));
        tblKC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKCMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblKC);

        btnThemKC.setText("Thêm ");
        btnThemKC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemKCActionPerformed(evt);
            }
        });

        txtIDKichCo.setEnabled(false);

        btnCapNhatKC.setText("Cập nhật ");
        btnCapNhatKC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatKCActionPerformed(evt);
            }
        });

        btnXoaKC.setText("Xóa");
        btnXoaKC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaKCActionPerformed(evt);
            }
        });

        jLabel4.setText("ID kích cỡ:");

        jLabel5.setText("Mã kích cỡ:");

        jLabel6.setText("Tên kích cỡ:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaKichCo, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIDKichCo, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenKichCo, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btnThemKC, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(btnCapNhatKC, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(btnXoaKC, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIDKichCo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMaKichCo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTenKichCo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemKC, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapNhatKC, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaKC, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Kích cỡ", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemLSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemLSPActionPerformed
        try {
            if (txtMaLSP.getText().isEmpty() || txtTenLSP.getText().isEmpty()) {
                JOptionPane.showMessageDialog(btnThemLSP, "Không được để trống");
                return;
            }
            for (LoaiSanPham lsp : listLSP) {
                if (txtMaLSP.getText().equalsIgnoreCase(lsp.getMa())) {
                    JOptionPane.showMessageDialog(btnThemLSP, "Trùng mã sản phẩm");
                    return;
                }
            }
            LoaiSanPham sp = getLSP();
            SanPham_ResPository.themLoaiSanPham(sp);
            fillTableLSP();
            clear();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(btnThemLSP, "thêm thất bại");
        }

    }//GEN-LAST:event_btnThemLSPActionPerformed

    private void btnCapNhatLSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatLSPActionPerformed
        LoaiSanPham sp = getLSP();
        SanPham_ResPository.updateLSP(sp);
        fillTableLSP();
        clear();
    }//GEN-LAST:event_btnCapNhatLSPActionPerformed

    private void btnXoaLSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaLSPActionPerformed
        LoaiSanPham sp = getLSP();
        SanPham_ResPository.deleteLSP(sp);
        fillTableLSP();
        clear();
    }//GEN-LAST:event_btnXoaLSPActionPerformed

    private void btnThemMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMSActionPerformed
        try {
            if (txtMaMS.getText().isEmpty() || txtTenMS.getText().isEmpty()) {
                JOptionPane.showMessageDialog(btnThemMS, "Không được để trống");
                return;
            }
            for (MauSac ms : listMS) {
                if (txtMaMS.getText().equalsIgnoreCase(ms.getMa())) {
                    JOptionPane.showMessageDialog(btnThemMS, "Trùng mã sản phẩm");
                    return;
                }
            }
        MauSac ms = getMS();
        SanPham_ResPository.themMauSac(ms);
        fillTableMS();
        clear();
         } catch (Exception e) {
            JOptionPane.showMessageDialog(btnThemMS, "thêm thất bại");
        }
    }//GEN-LAST:event_btnThemMSActionPerformed

    private void btnCapNhatMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatMSActionPerformed
        MauSac ms = getMS();
        SanPham_ResPository.updateMS(ms);
        fillTableMS();
        clear();
    }//GEN-LAST:event_btnCapNhatMSActionPerformed

    private void btnXoaMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaMSActionPerformed
        MauSac ms = getMS();
        SanPham_ResPository.deleteMS(ms);
        fillTableMS();
        clear();
    }//GEN-LAST:event_btnXoaMSActionPerformed

    private void btnThemKCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemKCActionPerformed
       try {
            if (txtMaKichCo.getText().isEmpty() || txtTenKichCo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(btnThemKC, "Không được để trống");
                return;
            }
            for (KichCo kc : listKC) {
                if (txtMaKichCo.getText().equalsIgnoreCase(kc.getMa())) {
                    JOptionPane.showMessageDialog(btnThemKC, "Trùng mã sản phẩm");
                    return;
                }
            }
        KichCo kc = getKC();
        SanPham_ResPository.themKichCo(kc);
        fillTableKC();
        clear();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(btnThemKC, "thêm thất bại");
        }
    }//GEN-LAST:event_btnThemKCActionPerformed

    private void btnCapNhatKCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatKCActionPerformed
        KichCo kc = getKC();
        SanPham_ResPository.updateKC(kc);
        fillTableKC();
        clear();
    }//GEN-LAST:event_btnCapNhatKCActionPerformed

    private void btnXoaKCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaKCActionPerformed
        KichCo kc = getKC();
        SanPham_ResPository.deleteKichCo(kc);
        fillTableKC();
        clear();
    }//GEN-LAST:event_btnXoaKCActionPerformed

    private void tblKCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKCMouseClicked
        index = tblKC.getSelectedRow();
        showDetailKC();
    }//GEN-LAST:event_tblKCMouseClicked

    private void tblMSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMSMouseClicked
        index = tblMS.getSelectedRow();
        showDetailMS();
    }//GEN-LAST:event_tblMSMouseClicked

    private void tblLSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLSPMouseClicked
        index = tblLSP.getSelectedRow();
        showDetailLSP();
    }//GEN-LAST:event_tblLSPMouseClicked
    public void showDetailLSP() {
        LoaiSanPham sp = listLSP.get(index);
        txtIDLSP.setText(sp.getId());
        txtMaLSP.setText(sp.getMa());
        txtTenLSP.setText(sp.getTen());

    }

    public void showDetailMS() {
        MauSac ms = listMS.get(index);
        txtIDMauSac.setText(ms.getId());
        txtMaMS.setText(ms.getMa());
        txtTenMS.setText(ms.getTen());
    }

    public void showDetailKC() {
        KichCo kc = listKC.get(index);
        txtIDKichCo.setText(kc.getId());
        txtMaKichCo.setText(kc.getMa());
        txtTenKichCo.setText(kc.getTen());
    }

    public LoaiSanPham getLSP() {
        String malsp = txtMaLSP.getText();
        String tenlsp = txtTenLSP.getText();
        String idlsp = txtIDLSP.getText();

        return new LoaiSanPham(malsp, tenlsp, idlsp, null);
    }

    public MauSac getMS() {
        String mams = txtMaMS.getText();
        String tenms = txtTenMS.getText();
        String idms = txtIDMauSac.getText();

        return new MauSac(mams, tenms, idms, null);
    }

    public KichCo getKC() {
        String makc = txtMaKichCo.getText();
        String tenkc = txtTenKichCo.getText();
        String idkc = txtIDKichCo.getText();

        return new KichCo(makc, tenkc, idkc, null);
    }

    public void clear() {
        txtIDLSP.setText("");
        txtMaLSP.setText("");
        txtTenLSP.setText("");
        txtIDMauSac.setText("");
        txtMaMS.setText("");
        txtTenMS.setText("");
        txtIDKichCo.setText("");
        txtMaKichCo.setText("");
        txtTenKichCo.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhatKC;
    private javax.swing.JButton btnCapNhatLSP;
    private javax.swing.JButton btnCapNhatMS;
    private javax.swing.JButton btnThemKC;
    private javax.swing.JButton btnThemLSP;
    private javax.swing.JButton btnThemMS;
    private javax.swing.JButton btnXoaKC;
    private javax.swing.JButton btnXoaLSP;
    private javax.swing.JButton btnXoaMS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTable tblKC;
    private javax.swing.JTable tblLSP;
    private javax.swing.JTable tblMS;
    private javax.swing.JTextField txtIDKichCo;
    private javax.swing.JTextField txtIDLSP;
    private javax.swing.JTextField txtIDMauSac;
    private javax.swing.JTextField txtMaKichCo;
    private javax.swing.JTextField txtMaLSP;
    private javax.swing.JTextField txtMaMS;
    private javax.swing.JTextField txtTenKichCo;
    private javax.swing.JTextField txtTenLSP;
    private javax.swing.JTextField txtTenMS;
    // End of variables declaration//GEN-END:variables
}
