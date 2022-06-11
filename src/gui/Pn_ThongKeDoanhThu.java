/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.util.ArrayList;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import dao.ChiTietHD_DAO;
import dao.ChiTietHD_DAO.DoanhThuTheoNam;
import entity.ChiTietHD;

/**
 *
 * @author bohie
 */
public class Pn_ThongKeDoanhThu extends javax.swing.JPanel {

    /**
     * Creates new form ThongKeDoanhThu
     */
    public Pn_ThongKeDoanhThu() {
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

        jpnThongKeDoanhThu = new javax.swing.JPanel();

        javax.swing.GroupLayout jpnThongKeDoanhThuLayout = new javax.swing.GroupLayout(jpnThongKeDoanhThu);
        jpnThongKeDoanhThu.setLayout(jpnThongKeDoanhThuLayout);
        jpnThongKeDoanhThuLayout.setHorizontalGroup(
            jpnThongKeDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );
        jpnThongKeDoanhThuLayout.setVerticalGroup(
            jpnThongKeDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnThongKeDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnThongKeDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ThongKe();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jpnThongKeDoanhThu;
    private ChiTietHD_DAO dao_CTHD = new ChiTietHD_DAO();
    // End of variables declaration//GEN-END:variables
    public void ThongKe(){
		ArrayList<DoanhThuTheoNam> dsCTHD = dao_CTHD.getAllCTHD_DoanhThu();
        	if (dsCTHD!=null){
        		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        		for (DoanhThuTheoNam chiTietHD : dsCTHD) {
    				dataset.addValue(chiTietHD.getDoanhThu(), "VND", ""+chiTietHD.getNam());
        			
      		}
        		JFreeChart chart = ChartFactory.createBarChart("Thống Kê Doanh Thu Theo Năm", "Thời gian", "Doanh Thu", dataset);
        		ChartPanel chartPanel = new ChartPanel(chart);
        		chartPanel.setPreferredSize(new Dimension(jpnThongKeDoanhThu.getWidth(),200));
        		jpnThongKeDoanhThu.removeAll();
        		jpnThongKeDoanhThu.setLayout(new CardLayout());
        		jpnThongKeDoanhThu.add(chartPanel);
        		jpnThongKeDoanhThu.validate();
        		jpnThongKeDoanhThu.repaint();
        	}
    }
}