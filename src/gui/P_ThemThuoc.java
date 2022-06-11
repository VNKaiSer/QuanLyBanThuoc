/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

import connectDB.ConnectDB;
import dao.LoaiThuoc_DAO;
import dao.NhaCungCap_DAO;
import dao.Thuoc_DAO;
import entity.LoaiThuoc;
import entity.NhaCungCap;
import entity.Thuoc;

/**
 *
 * @author Asus
 */
public class P_ThemThuoc extends javax.swing.JFrame implements ActionListener, MouseListener, WindowListener {

	private NhaCungCap_DAO nhaCungCap_DAO;
	private LoaiThuoc_DAO loaiThuoc_DAO;
	private Thuoc_DAO thuoc_DAO;

	/**
	 * Creates new form P_ThemThuoc
	 */
	public P_ThemThuoc() {
		// setSize(WIDTH, HEIGHT);
		// setLocationRelativeTo(null);
		initComponents();
		btnFile.addActionListener(this);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jTextField2 = new javax.swing.JTextField();
		jTextField1 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jLabel24 = new javax.swing.JLabel();
		jLabel31 = new javax.swing.JLabel();
		jLabel27 = new javax.swing.JLabel();
		jLabel25 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		lblLoai = new javax.swing.JLabel();
		txtLoai = new javax.swing.JTextField();
		lblDonVi = new javax.swing.JLabel();
		txtSoLuong = new javax.swing.JTextField();
		lblSoLuong = new javax.swing.JLabel();
		txtGia = new javax.swing.JTextField();
		lblGia = new javax.swing.JLabel();
		txtHSD = new javax.swing.JTextField();
		lblHSD = new javax.swing.JLabel();
		lblMoTa = new javax.swing.JLabel();
		txtMoTa = new javax.swing.JTextField();
		txtHangSX = new javax.swing.JTextField();
		lblHangSX = new javax.swing.JLabel();
		lblNCC = new javax.swing.JLabel();
		txtNCC = new javax.swing.JTextField();
		txtMa = new javax.swing.JTextField();
		lblMa = new javax.swing.JLabel();
		lblTen = new javax.swing.JLabel();
		txtTen = new javax.swing.JTextField();
		lblFile = new javax.swing.JLabel();
		btnFile = new javax.swing.JButton();
		btnLuu = new javax.swing.JButton();
		jLabel4 = new javax.swing.JLabel();
		jLabel23 = new javax.swing.JLabel();
		jLabel26 = new javax.swing.JLabel();
		jLabel28 = new javax.swing.JLabel();
		jLabel29 = new javax.swing.JLabel();
		jLabel30 = new javax.swing.JLabel();
		jLabel32 = new javax.swing.JLabel();
		jLabel33 = new javax.swing.JLabel();
		jLabel34 = new javax.swing.JLabel();
		jLabel35 = new javax.swing.JLabel();
		String[] items = { "Viên", "Hộp", "Vĩ" };
		cbxModel = new DefaultComboBoxModel(items);
		cbxDonVi = new javax.swing.JComboBox<>();

		jTextField2.setText("");

		jTextField1.setText("");

		jLabel3.setText("Tên thuốc:");

		jLabel1.setText("Mã thuốc:");

		jLabel13.setText("jLabel13");

		jLabel24.setForeground(new java.awt.Color(255, 51, 0));
		jLabel24.setText("*");

		jLabel31.setForeground(new java.awt.Color(255, 51, 0));
		jLabel31.setText("*");

		jLabel27.setForeground(new java.awt.Color(255, 51, 0));
		jLabel27.setText("*");

		jLabel25.setForeground(new java.awt.Color(255, 51, 0));
		jLabel25.setText("*");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
		jLabel2.setForeground(new java.awt.Color(0, 0, 0));
		jLabel2.setText("Nhập thông tin thuốc");
		jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

		lblLoai.setText("Mã loại thuốc:");

		txtLoai.setText("");
		txtLoai.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
					e.consume(); // if it's not a number, ignore the event
				}
			}
		});
		lblDonVi.setText("Đơn vị:");

		lblSoLuong.setText("Số lượng");

		lblGia.setText("Giá bán:");

		lblHSD.setText("Hạn sử dụng:");

		lblMoTa.setText("Mô tả:");

		txtMoTa.setText("");

		lblHangSX.setText("Hãng sản xuất:");

		lblNCC.setText("Mã nhà cung cấp:");

		txtNCC.setText("");
		txtNCC.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
					e.consume(); // if it's not a number, ignore the event
				}
			}
		});
		txtMa.setText("");
		txtMa.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
					e.consume(); // if it's not a number, ignore the event
				}
			}
		});
		lblMa.setText("Mã thuốc:");

		lblTen.setText("Tên thuốc:");

		txtTen.setText("");

		lblFile.setText("File ảnh:");

		btnFile.setText("Chọn file");

		btnLuu.setBackground(new java.awt.Color(51, 255, 0));
		btnLuu.setText("Tiếp");

		jLabel4.setForeground(new java.awt.Color(255, 51, 0));
		jLabel4.setText("*");

		jLabel23.setForeground(new java.awt.Color(255, 51, 0));
		jLabel23.setText("*");

		jLabel26.setForeground(new java.awt.Color(255, 51, 0));
		jLabel26.setText("*");

		jLabel28.setForeground(new java.awt.Color(255, 51, 0));
		jLabel28.setText("*");

		jLabel29.setForeground(new java.awt.Color(255, 51, 0));
		jLabel29.setText("*");

		jLabel30.setForeground(new java.awt.Color(255, 51, 0));
		jLabel30.setText("*");

		jLabel32.setForeground(new java.awt.Color(255, 51, 0));
		jLabel32.setText("*");

		jLabel33.setForeground(new java.awt.Color(255, 51, 0));
		jLabel33.setText("*");

		jLabel34.setForeground(new java.awt.Color(255, 51, 0));
		jLabel34.setText("*");

		jLabel35.setForeground(new java.awt.Color(255, 51, 0));
		jLabel35.setText("*");

		cbxDonVi.setModel(cbxModel);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addGroup(layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(btnLuu,
								javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(layout.createSequentialGroup()
												.addComponent(lblGia, javax.swing.GroupLayout.PREFERRED_SIZE, 89,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 236,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup().addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(lblMoTa, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGroup(layout.createSequentialGroup()
														.addComponent(lblHSD, javax.swing.GroupLayout.PREFERRED_SIZE,
																89, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(0, 0, Short.MAX_VALUE)))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(txtHSD).addComponent(txtMoTa,
																javax.swing.GroupLayout.PREFERRED_SIZE, 236,
																javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGroup(layout.createSequentialGroup()
												.addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(layout.createSequentialGroup()
																.addComponent(lblSoLuong,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 89,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(0, 0, Short.MAX_VALUE))
														.addComponent(lblDonVi, javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(txtSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE,
																236, Short.MAX_VALUE)
														.addComponent(cbxDonVi, 0, javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)))
										.addGroup(layout.createSequentialGroup()
												.addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(lblTen, javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(lblLoai, javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(txtLoai, javax.swing.GroupLayout.DEFAULT_SIZE,
																236, Short.MAX_VALUE)
														.addComponent(txtTen)))
										.addGroup(layout.createSequentialGroup()
												.addComponent(lblMa, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGap(4, 4, 4).addComponent(txtMa,
														javax.swing.GroupLayout.PREFERRED_SIZE, 236,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup().addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(layout.createSequentialGroup()
														.addComponent(lblHangSX, javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addGap(7, 7, 7))
												.addGroup(layout.createSequentialGroup().addComponent(lblNCC)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
												.addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(txtHangSX)
														.addComponent(txtNCC, javax.swing.GroupLayout.PREFERRED_SIZE,
																236, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(layout.createSequentialGroup()
																.addComponent(btnFile,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 99,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(jLabel29))))
										.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
												layout.createSequentialGroup()
														.addComponent(lblFile, javax.swing.GroupLayout.PREFERRED_SIZE,
																73, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(0, 0, Short.MAX_VALUE)))))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel4).addComponent(jLabel23)
												.addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING))
										.addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING))
								.addComponent(jLabel34).addComponent(jLabel32)
								.addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING))
								.addComponent(jLabel30))
						.addContainerGap())
				.addGroup(layout.createSequentialGroup().addGap(85, 85, 85).addComponent(jLabel2)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
								.addContainerGap(347, Short.MAX_VALUE).addComponent(jLabel33).addContainerGap())));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addGap(8, 8, 8).addComponent(jLabel2)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblMa)
						.addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel4))
				.addGap(15, 15, 15)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblTen)
						.addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel23))
				.addGap(15, 15, 15)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblLoai)
						.addComponent(txtLoai, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel30))
				.addGap(15, 15, 15)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblDonVi)
						.addComponent(jLabel28).addComponent(cbxDonVi, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(15, 15, 15)
				.addGroup(
						layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblSoLuong)
								.addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel32))
				.addGap(15, 15, 15)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblGia)
						.addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel34))
				.addGap(15, 15, 15)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblMoTa)
						.addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(15, 15, 15)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblHSD)
						.addComponent(txtHSD, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel35))
				.addGap(15, 15, 15)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblNCC)
						.addComponent(txtNCC, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel26))
				.addGap(15, 15, 15)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblHangSX)
						.addComponent(txtHangSX, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(15, 15, 15)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblFile)
						.addComponent(btnFile).addComponent(jLabel29))
				.addGap(15, 15, 15).addComponent(btnLuu)
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
								.addContainerGap(386, Short.MAX_VALUE).addComponent(jLabel33).addGap(80, 80, 80))));

		try {
			ConnectDB.getInstance().connect();
		} catch (Exception e) {
			e.printStackTrace();
		}

		nhaCungCap_DAO = new NhaCungCap_DAO();
		loaiThuoc_DAO = new LoaiThuoc_DAO();
		try {
			thuoc_DAO = new Thuoc_DAO();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		moKhoaNhapDL(false);
		txtMa.setEnabled(true);
		txtMa.requestFocus();

		btnLuu.addActionListener(this);
		txtMa.addActionListener(this);
		txtMa.addMouseListener(this);
		txtSoLuong.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
					e.consume(); // if it's not a number, ignore the event
				}
			}
		});
		txtGia.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
					e.consume(); // if it's not a number, ignore the event
				}
			}
		});
		pack();
	}// </editor-fold>//GEN-END:initComponents

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
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
			java.util.logging.Logger.getLogger(P_ThemThuoc.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(P_ThemThuoc.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(P_ThemThuoc.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(P_ThemThuoc.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new P_ThemThuoc().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnFile;
	private javax.swing.JButton btnLuu;
	private javax.swing.JComboBox<String> cbxDonVi;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel23;
	private javax.swing.JLabel jLabel24;
	private javax.swing.JLabel jLabel25;
	private javax.swing.JLabel jLabel26;
	private javax.swing.JLabel jLabel27;
	private javax.swing.JLabel jLabel28;
	private javax.swing.JLabel jLabel29;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel30;
	private javax.swing.JLabel jLabel31;
	private javax.swing.JLabel jLabel32;
	private javax.swing.JLabel jLabel33;
	private javax.swing.JLabel jLabel34;
	private javax.swing.JLabel jLabel35;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JLabel lblDonVi;
	private javax.swing.JLabel lblFile;
	private javax.swing.JLabel lblGia;
	private javax.swing.JLabel lblHSD;
	private javax.swing.JLabel lblHangSX;
	private javax.swing.JLabel lblLoai;
	private javax.swing.JLabel lblMa;
	private javax.swing.JLabel lblMoTa;
	private javax.swing.JLabel lblNCC;
	private javax.swing.JLabel lblSoLuong;
	private javax.swing.JLabel lblTen;
	private javax.swing.JTextField txtGia;
	private javax.swing.JTextField txtHSD;
	private javax.swing.JTextField txtHangSX;
	private javax.swing.JTextField txtLoai;
	private javax.swing.JTextField txtMa;
	private javax.swing.JTextField txtMoTa;
	private javax.swing.JTextField txtNCC;
	private javax.swing.JTextField txtSoLuong;
	private javax.swing.JTextField txtTen;
	// End of variables declaration//GEN-END:variables
	private DefaultComboBoxModel cbxModel;
	private String filename;
	byte[] imageThuoc;

	private void napDLVaoTF(Thuoc thuoc) {
		txtTen.setText(thuoc.getTenThuoc());
		txtLoai.setText(thuoc.getLoaiThuoc().getMaLoai() + "");
		cbxDonVi.setSelectedItem(thuoc.getDonVi());
		txtMoTa.setText(thuoc.getMoTa());
		txtNCC.setText(thuoc.getNhaCungCap().getMaNCC() + "");
		txtHangSX.setText(thuoc.getHangSX());
//		btnFile.setText();
	}

	private void moKhoaNhapDL(boolean b) {
		txtMa.setEnabled(b);
		txtTen.setEnabled(b);
		txtHangSX.setEnabled(b);
		cbxDonVi.setEnabled(b);
		txtSoLuong.setEnabled(b);
		txtGia.setEnabled(b);
		txtMoTa.setEnabled(b);
		txtHSD.setEnabled(b);
		txtNCC.setEnabled(b);
		txtLoai.setEnabled(b);
		btnFile.setEnabled(b);
	}

	private void xoaTrang() {
		txtMa.setText("");
		txtTen.setText("");
		txtHangSX.setText("");
		cbxDonVi.setSelectedIndex(0);
		txtSoLuong.setText("");
		txtGia.setText("");
		txtMoTa.setText("");
		txtHSD.setText("");
		txtNCC.setText("");
		txtLoai.setText("");
		btnFile.setText("Chọn file");
	}

	private void sh_Mes(String mes, JTextField txt) {
		JOptionPane.showMessageDialog(null, mes);
		if (txt == null)
			return;
		txt.requestFocus();
	}

	private Thuoc ktra_LayDL() {
		String ma_S = txtMa.getText();
		String ten = txtTen.getText();
		String hangSX = txtHangSX.getText();
		String donVi = cbxModel.getSelectedItem().toString();
		String soLuong_S = txtSoLuong.getText();
		String gia_S = txtGia.getText();
		String moTa = txtMoTa.getText();
		String hSD = txtHSD.getText();
		String nCC_S = txtNCC.getText();
		String loai_S = txtLoai.getText();
//		String fAnh = btnFile.getText();

		// Kiểm tra mã
		if (ma_S.trim().equals("")) {
			sh_Mes("Mã không được để trống", txtMa);
			return null;
		}

		int ma;
		try {
			ma = Integer.parseInt(ma_S);
			if (ma <= 0) {
				sh_Mes("Mã phải > 0", txtMa);
				return null;
			}
		} catch (Exception e) {
			sh_Mes("Mã phải là số nguyên", txtMa);
			return null;
		}

		// Kiểm tra tên
		if (ten.trim().equals("")) {
			sh_Mes("Tên không được để trống", txtTen);
			return null;
		}

		// Kiểm tra hãng sản xuất
		if (hangSX.trim().equals("")) {
			sh_Mes("Hãng sản xuất không được để trống", txtHangSX);
			return null;
		}

		// Kiểm tra số lượng
		if (soLuong_S.trim().equals("")) {
			sh_Mes("Số lượng không được để trống", txtSoLuong);
			return null;
		}

		int soLuong;
		try {
			soLuong = Integer.parseInt(soLuong_S);
			if (soLuong <= 0) {
				sh_Mes("Số lượng phải > 0", txtSoLuong);
				return null;
			}

		} catch (Exception e) {
			sh_Mes("Số lượng phải là số nguyên", txtSoLuong);
			return null;
		}

		// Kiểm tra giá
		if (gia_S.trim().equals("")) {
			sh_Mes("Giá không được để trống", txtGia);
			return null;
		}

		double gia;
		try {
			gia = Double.parseDouble(gia_S);
			if (gia <= 0) {
				sh_Mes("Giá phải > 0", txtGia);
				return null;
			}
		} catch (Exception e) {
			sh_Mes("Giá phải nhập số", txtGia);
			return null;
		}

		// Kiểm tra hạn sử dụng
		if (hSD.trim().equals("")) {
			sh_Mes("Hạn sử dụng không được để trống", txtHSD);
			return null;
		}

		LocalDate hSD_D = null;
		try {
			hSD_D = LocalDate.parse(hSD, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		} catch (Exception e) {
			sh_Mes("Hạn sử dụng phải có định: dd/MM/yyyy", txtHSD);
			return null;
		}

		// Kiểm tra nhà cung cấp
		if (nCC_S.trim().equals("")) {
			sh_Mes("Nhà cung cấp không được để trống", txtNCC);
			return null;
		}

		int MaNCC;
		try {
			MaNCC = Integer.parseInt(nCC_S);
			if (MaNCC <= 0) {
				sh_Mes("Mã nhà cung cấp phải > 0", txtNCC);
				return null;
			}
		} catch (Exception e) {
			sh_Mes("Mã nhà cung cấp phải là số nguyên", txtNCC);
			return null;
		}

		NhaCungCap nCC = nhaCungCap_DAO.getNhaCungCapTheoMa(MaNCC);
		if (nCC == null) {
			sh_Mes("Mã nhà cung cấp không tồn tại: tạo mã mới", txtNCC);
			JTextField txt = new JTextField(5);
			int opt = JOptionPane.showConfirmDialog(null, txt, "Nhập tên mã nhà cung cấp thuốc: " + MaNCC,
					JOptionPane.OK_CANCEL_OPTION);
			if (opt == JOptionPane.CANCEL_OPTION) {
				return null;
			}
			nCC = new NhaCungCap(MaNCC);
			nCC.setTenNCC(txt.getText());
			nhaCungCap_DAO.themNCCThuoc(nCC);
		}

		// Kiểm tra
		if (loai_S.trim().equals("")) {
			sh_Mes("Mã loại thuốc không được để trống", txtLoai);
			return null;
		}

		int MaLoai;
		try {
			MaLoai = Integer.parseInt(loai_S);
			if (MaLoai <= 0) {
				sh_Mes("Mã loại thuốc phải > 0", txtLoai);
				return null;
			}
		} catch (Exception e) {
			sh_Mes("Mã loại thuốc phải là số nguyên", txtLoai);
			return null;
		}

		LoaiThuoc loai = loaiThuoc_DAO.getLoaiThuocTheoMa(MaLoai);
		if (loai == null) {
			sh_Mes("Mã loại không tồn tại: tạo mã mới", txtLoai);
			JTextField txt = new JTextField(5);
			int opt = JOptionPane.showConfirmDialog(null, txt, "Nhập tên mã loạithuốc: " + MaLoai,
					JOptionPane.OK_CANCEL_OPTION);
			if (opt == JOptionPane.CANCEL_OPTION) {
				return null;
			}
			loai = new LoaiThuoc(MaLoai);
			loai.setTenLoai(txt.getText());
			loaiThuoc_DAO.themLoaiThuoc(loai);
		}

		// Kiểm tra ảnh
		if (imageThuoc == null) {
			sh_Mes("Ảnh không được để trống", null);
			return null;
		}

		return new Thuoc(ma, ten, hangSX, donVi, soLuong, gia, moTa, imageThuoc, hSD_D, nCC, loai);
	}

	private void themThuoc() {
		Thuoc thuoc = ktra_LayDL();

		if (thuoc == null)
			return;

		try {
			thuoc_DAO.themThuoc(thuoc);
			sh_Mes("Thêm thuốc thành công", null);
			setVisible(false);
		} catch (Exception e) {
			sh_Mes("Thêm thuốc không thành công", null);
		}

	}

	private void capNhatThuoc(int ma) {
		Thuoc thuoc = ktra_LayDL();

		if (thuoc == null)
			return;

		try {
			thuoc_DAO.capNhatThuoc(ma, thuoc.getSoLuong(), thuoc.getGiaBan(), thuoc.getHanSD());
			sh_Mes("Cập nhật thuốc thành công", null);
			setVisible(false);
		} catch (Exception e) {
			sh_Mes("Cập nhật thuốc không thành công", null);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj.equals(btnLuu) || obj.equals(txtMa)) {
			if (btnLuu.getText().equalsIgnoreCase("Tiếp")) {
				String ma_S = txtMa.getText();
				if (ma_S.trim().equals("")) {
					sh_Mes("Mã không được để trống", txtMa);
					return;
				}

				int ma;
				try {
					ma = Integer.parseInt(ma_S);
					if (ma <= 0) {
						sh_Mes("Mã phải > 0", txtMa);
						return;
					}
				} catch (Exception e1) {
					sh_Mes("Mã phải là số nguyên 1", txtMa);
					return;
				}

				Thuoc thuocCu = thuoc_DAO.getThuocTheoMa(ma);

				if (thuocCu == null) {
					moKhoaNhapDL(true);
					txtMa.setEnabled(true);
					txtMa.setEditable(false);
					btnLuu.setText("Lưu");
					String maThuoc = txtMa.getText();
					xoaTrang();
					txtMa.setText(maThuoc);

				} else {
					moKhoaNhapDL(false);
					txtMa.setEnabled(true);
					txtMa.setEditable(false);
					txtSoLuong.setEnabled(true);
					txtGia.setEnabled(true);
					txtHSD.setEnabled(true);
					btnLuu.setText("Lưu");
					napDLVaoTF(thuocCu);
				}
			} else if (btnLuu.getText().equalsIgnoreCase("Lưu")) {
				Thuoc thuocCu = thuoc_DAO.getThuocTheoMa(Integer.parseInt(txtMa.getText()));
				if (thuocCu != null)
					capNhatThuoc(thuocCu.getMaThuoc());
				else
					themThuoc();

			}
		} else if (obj.equals(btnFile)) {
			layAnh();
		}

	}

	private void layAnh() {
		JFileChooser choice = new JFileChooser();
		choice.showOpenDialog(null);
		File f = choice.getSelectedFile();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
		choice.setFileFilter(filter);
		filename = f.getAbsolutePath();

		try {
			File image = new File(filename);
			FileInputStream fis = new FileInputStream(image);
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			byte[] buf = new byte[1024];
			for (int i; (i = fis.read(buf)) != -1;) {
				bos.write(buf, 0, i);

			}
			imageThuoc = null;
			imageThuoc = bos.toByteArray();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		moKhoaNhapDL(false);
		txtMa.setEnabled(true);
		txtMa.setEditable(true);
		btnLuu.setText("Tiếp");

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub

		this.dispose();
		// this = null;

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

}
