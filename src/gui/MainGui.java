/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


/**
 *
 * @author DatPC
 */
public class MainGui extends javax.swing.JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Creates new form MainGui
	 */
	
	public MainGui() {
		 
		initComponents();
		btnBanHang.addActionListener(this);
		btnKhachHang.addActionListener(this);
        btnQuanLyKho.addActionListener(this);
        btnNhanSu.addActionListener(this);
        btnLSBanHang.addActionListener(this);
        btnThanhVien.addActionListener(this);
        btnThongKe.addActionListener(this);
        btnDangXuat.addActionListener(this);
		//setSize(1320, 650);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        //setVisible(true);
        setLocationRelativeTo(null);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGropLeft = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnQuanLyKho = new javax.swing.JToggleButton();
        btnBanHang = new javax.swing.JToggleButton();
        btnNhanSu = new javax.swing.JToggleButton();
        btnKhachHang = new javax.swing.JToggleButton();
        btnLSBanHang = new javax.swing.JToggleButton();
        btnThongKe = new javax.swing.JToggleButton();
        btnThanhVien = new javax.swing.JToggleButton();
        btnDangXuat = new com.k33ptoo.components.KButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        pnSlider = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 0));

        btnQuanLyKho.setBackground(new java.awt.Color(51, 204, 0));
        btnGropLeft.add(btnQuanLyKho);
        btnQuanLyKho.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQuanLyKho.setForeground(new java.awt.Color(255, 255, 255));
        btnQuanLyKho.setIcon(new ImageIcon("img/quanlykho.png")); // NOI18N
        btnQuanLyKho.setText("Quản Lý Kho");

        btnBanHang.setBackground(new java.awt.Color(51, 204, 0));
        btnGropLeft.add(btnBanHang);
        btnBanHang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBanHang.setForeground(new java.awt.Color(255, 255, 255));
        btnBanHang.setIcon(new ImageIcon("img/icons8-sell-30.png")); // NOI18N
        btnBanHang.setText("Bán Hàng");
        btnBanHang.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnBanHangFocusGained(evt);
            }
        });
        btnBanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBanHangActionPerformed(evt);
            }
        });

        btnNhanSu.setBackground(new java.awt.Color(51, 204, 0));
        btnGropLeft.add(btnNhanSu);
        btnNhanSu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNhanSu.setForeground(new java.awt.Color(255, 255, 255));
        btnNhanSu.setIcon(new ImageIcon("img/thanhvien.png")); // NOI18N
        btnNhanSu.setText("Nhân Sự");

        btnKhachHang.setBackground(new java.awt.Color(51, 204, 0));
        btnGropLeft.add(btnKhachHang);
        btnKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        btnKhachHang.setIcon(new ImageIcon("img/icons8-customer-30.png")); // NOI18N
        btnKhachHang.setText("Khách Hàng");
        btnKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhachHangActionPerformed(evt);
            }
        });

        btnLSBanHang.setBackground(new java.awt.Color(51, 204, 0));
        btnGropLeft.add(btnLSBanHang);
        btnLSBanHang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLSBanHang.setForeground(new java.awt.Color(255, 255, 255));
        btnLSBanHang.setIcon(new ImageIcon("img/icons8-order-history-30.png")); // NOI18N
        btnLSBanHang.setText("Lịch Sử Bán Hàng");
        btnLSBanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLSBanHangActionPerformed(evt);
            }
        });

        btnThongKe.setBackground(new java.awt.Color(51, 204, 0));
        btnGropLeft.add(btnThongKe);
        btnThongKe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThongKe.setForeground(new java.awt.Color(255, 255, 255));
        btnThongKe.setIcon(new ImageIcon("img/icons8-statistics-30.png")); // NOI18N
        btnThongKe.setText("Thống Kê");
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        btnThanhVien.setBackground(new java.awt.Color(51, 204, 0));
        btnGropLeft.add(btnThanhVien);
        btnThanhVien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThanhVien.setForeground(new java.awt.Color(255, 255, 255));
        btnThanhVien.setText("Thành Viên");
        btnThanhVien.setIcon(new ImageIcon("img/icons8-team-leader-30.png"));
        
        btnDangXuat.setIcon(new ImageIcon("img/icons8-logout-30 (1).png")); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQuanLyKho, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNhanSu, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLSBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(btnBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnQuanLyKho, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNhanSu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLSBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jPanel2.setBackground(new java.awt.Color(51, 204, 0));

        lblUser.setText(Login.getTenNV());
        lblUser.setForeground(Color.BLACK);
        lblUser.setFont(new Font("Segoe UI", 1, 16));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("PHARMACITY SYSTEM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 281, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pnSlider.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBanHangFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnBanHangFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBanHangFocusGained

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDangXuatActionPerformed

	private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnThongKeActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_btnThongKeActionPerformed

	private void btnLSBanHangActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnLSBanHangActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_btnLSBanHangActionPerformed

	private void btnBanHangActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnBanHangActionPerformed
		// TODO add your handling code here:

	}// GEN-LAST:event_btnBanHangActionPerformed

	private void btnKhachHangActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnKhachHangActionPerformed
		// TODO add your handling code here:

	}// GEN-LAST:event_btnKhachHangActionPerformed

	@Override
	public void actionPerformed(ActionEvent e) {
		/**
		 * @param args the command line arguments
		 */
		Object o = e.getSource();
		if (o.equals(btnBanHang)) {
			pnSlider.removeAll();
			pnSlider.repaint();
			pnSlider.revalidate();

			pnSlider.add(new pnBanHang());
			pnSlider.repaint();
			pnSlider.revalidate();
		} else if (o.equals(btnKhachHang)) {
			pnSlider.removeAll();
			pnSlider.repaint();
			pnSlider.revalidate();

			pnSlider.add(new P_QLyKhachHang());
			pnSlider.repaint();
			pnSlider.revalidate();
		} else if (o.equals(btnQuanLyKho)) {
            pnSlider.removeAll();
			pnSlider.repaint();
			pnSlider.revalidate();

			pnSlider.add(new pQLKho());
			pnSlider.repaint();
			pnSlider.revalidate();
                
		} else if(o.equals(btnNhanSu)) {
			pnSlider.removeAll();
			pnSlider.repaint();
			pnSlider.revalidate();

			pnSlider.add(new P_QLyNhanVien());
			pnSlider.repaint();
			pnSlider.revalidate();
		} else if (o.equals(btnLSBanHang)) {
			pnSlider.removeAll();
			pnSlider.repaint();
			pnSlider.revalidate();

			pnSlider.add(new LSBH());
			pnSlider.repaint();
			pnSlider.revalidate();
		}else if (o.equals(btnThanhVien)) {
			pnSlider.removeAll();
			pnSlider.repaint();
			pnSlider.revalidate();

			pnSlider.add(new pnThanhVienNhom());
			pnSlider.repaint();
			pnSlider.revalidate();
		}else if (o.equals(btnThongKe)) {
			pnSlider.removeAll();
			pnSlider.repaint();
			pnSlider.revalidate();

			pnSlider.add(new P_ThongKe());
			pnSlider.repaint();
			pnSlider.revalidate();
		} else if (o.equals(btnDangXuat)) {
			try {
				Login lg = new Login();
				lg.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				lg.setVisible(true);
			this.dispose();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
        
    public static void main(String[] args) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
                            new MainGui().setVisible(true);
			}
		});
	}
    
    static javax.swing.JPanel getPnSlider() {
		return pnSlider;
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBanHang;
    private javax.swing.JToggleButton btnThanhVien;
    private com.k33ptoo.components.KButton btnDangXuat;
    private javax.swing.ButtonGroup btnGropLeft;
    private javax.swing.JToggleButton btnKhachHang;
    private javax.swing.JToggleButton btnQuanLyKho;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton btnNhanSu;
    private javax.swing.JToggleButton btnLSBanHang;
    private javax.swing.JToggleButton btnThongKe;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUser;
    private static javax.swing.JPanel pnSlider;
    // End of variables declaration//GEN-END:variables
}