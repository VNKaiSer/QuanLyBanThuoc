/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

/**
 *
 * @author bohie
 */

import java.awt.CardLayout;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import dao.ChiTietHD_DAO;
import entity.ChiTietHD;

public class Pn_ThongKeSoLuongThuocBanDuoc extends javax.swing.JPanel {

	/**
	 * Creates new form ThongKeSoLuongThuocBanDuoc
	 */
	public Pn_ThongKeSoLuongThuocBanDuoc() {
		initComponents();
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

		jpnThongKeSLThuocBanDuoc = new javax.swing.JPanel();

		javax.swing.GroupLayout jpnThongKeSLThuocBanDuocLayout = new javax.swing.GroupLayout(jpnThongKeSLThuocBanDuoc);
		jpnThongKeSLThuocBanDuoc.setLayout(jpnThongKeSLThuocBanDuocLayout);
		jpnThongKeSLThuocBanDuocLayout.setHorizontalGroup(jpnThongKeSLThuocBanDuocLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 1030, Short.MAX_VALUE));
		jpnThongKeSLThuocBanDuocLayout.setVerticalGroup(jpnThongKeSLThuocBanDuocLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 544, Short.MAX_VALUE));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jpnThongKeSLThuocBanDuoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
				Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addComponent(jpnThongKeSLThuocBanDuoc,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));
		ThongKeSoLuong();
	}// </editor-fold>//GEN-END:initComponents

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JPanel jpnThongKeSLThuocBanDuoc;
	private ChiTietHD_DAO dao_CTHD = new ChiTietHD_DAO();
	private JFreeChart jfreeChart;
	private ChartPanel chartPanel;

	// End of variables declaration//GEN-END:variables
	public void ThongKeSoLuong() {
		ResultSet duLieu = dao_CTHD.getTop10Thuoc();
		DefaultPieDataset dataset = new DefaultPieDataset();
		try {
			while (duLieu.next()) {
				dataset.setValue("" + duLieu.getString(1), duLieu.getInt(2));
				JFreeChart jFreeChart = ChartFactory.createPieChart3D("Top 10 Loại Thuốc Bán Chạy Nhất", dataset, true, true,
						false);
				chartPanel = new ChartPanel(jFreeChart);
				jpnThongKeSLThuocBanDuoc.setLayout(new CardLayout());
				jpnThongKeSLThuocBanDuoc.add(chartPanel);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
