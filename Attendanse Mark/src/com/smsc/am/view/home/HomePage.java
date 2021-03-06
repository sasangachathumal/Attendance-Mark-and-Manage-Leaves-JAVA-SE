/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smsc.am.view.home;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import org.jdesktop.swingx.JXImagePanel;

/**
 *
 * @author SASANGA
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        ImageIcon imageIcon =new ImageIcon("src/com/smsc/am/view/images/1.jpg");
        mainImagePanel.setImage(imageIcon.getImage());
        mainImagePanel.setStyle(JXImagePanel.Style.SCALED);
//        dcbm=(DefaultComboBoxModel) cmbName.getModel();
//        AutoCompleteDecorator.decorate(cmbName);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainImagePanel = new org.jdesktop.swingx.JXImagePanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        attendanseMenu = new javax.swing.JMenu();
        attendanseItem1 = new javax.swing.JMenuItem();
        leaveMenu = new javax.swing.JMenu();
        reportMenu = new javax.swing.JMenu();
        settingsMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout mainImagePanelLayout = new javax.swing.GroupLayout(mainImagePanel);
        mainImagePanel.setLayout(mainImagePanelLayout);
        mainImagePanelLayout.setHorizontalGroup(
            mainImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 834, Short.MAX_VALUE)
        );
        mainImagePanelLayout.setVerticalGroup(
            mainImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );

        attendanseMenu.setText("Attendanse");

        attendanseItem1.setText("jMenuItem1");
        attendanseMenu.add(attendanseItem1);

        jMenuBar1.add(attendanseMenu);

        leaveMenu.setText("Leave");
        jMenuBar1.add(leaveMenu);

        reportMenu.setText("Reportes");
        jMenuBar1.add(reportMenu);

        settingsMenu.setText("Settings");
        jMenuBar1.add(settingsMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainImagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainImagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem attendanseItem1;
    private javax.swing.JMenu attendanseMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu leaveMenu;
    private org.jdesktop.swingx.JXImagePanel mainImagePanel;
    private javax.swing.JMenu reportMenu;
    private javax.swing.JMenu settingsMenu;
    // End of variables declaration//GEN-END:variables
}
