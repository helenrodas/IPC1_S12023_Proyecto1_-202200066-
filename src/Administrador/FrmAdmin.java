/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Administrador;

import java.util.ArrayList;
import Inicializar.FrmInicio;
import Usuario.FrmUser;
//import Administrador.FrmRegiones;
import Data.*;
/**
 *
 * @author lenovo
 */
public class FrmAdmin extends javax.swing.JFrame {
    /**
     * Creates new form FrmAdmin
     */
    //ArrayList<CKiosco> MasterKioscos = null;
   // ArrayList<CRegiones> MasterRegiones = null;
       Data data;
       
    public FrmAdmin(Data data) {
        initComponents();
        this.data=data;
        this.setTitle("Administrador");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnManejoKioscos = new javax.swing.JButton();
        btnRegiones = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnDptMun = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel1.setText("Bienvenido Admin");

        btnManejoKioscos.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        btnManejoKioscos.setText("Manejo Kioscos");
        btnManejoKioscos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManejoKioscosActionPerformed(evt);
            }
        });

        btnRegiones.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        btnRegiones.setText("Manejo Regiones y Precios");
        btnRegiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegionesActionPerformed(evt);
            }
        });

        btnReportes.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        btnReportes.setText("Reportes");
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        btnDptMun.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        btnDptMun.setText("Manejo Departamentos y Municipios");
        btnDptMun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDptMunActionPerformed(evt);
            }
        });

        btnCerrarSesion.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.setBorder(null);
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCerrarSesion)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(btnManejoKioscos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(btnReportes))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnRegiones))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnDptMun)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(btnDptMun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnRegiones)
                .addGap(27, 27, 27)
                .addComponent(btnManejoKioscos)
                .addGap(27, 27, 27)
                .addComponent(btnReportes)
                .addGap(28, 28, 28)
                .addComponent(btnCerrarSesion)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        
                FrmInicio frmInicio = new FrmInicio(data);
                frmInicio.setLocationRelativeTo(null);
                frmInicio.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnManejoKioscosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManejoKioscosActionPerformed
                    
                    if(evt.getSource()== btnManejoKioscos){
                        FrmKiosco frmKiosco = new FrmKiosco(data);
                        frmKiosco.setDefaultCloseOperation(FrmUser.DISPOSE_ON_CLOSE);
                        frmKiosco.setLocationRelativeTo(null);
                        frmKiosco.setVisible(true);
                        this.setVisible(false);
                    }
    }//GEN-LAST:event_btnManejoKioscosActionPerformed

    private void btnRegionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegionesActionPerformed
        
                    if(evt.getSource()== btnRegiones){
                        
                        FrmRegiones frmRegiones = new FrmRegiones(data);
                        frmRegiones.setDefaultCloseOperation(FrmUser.DISPOSE_ON_CLOSE);
                        frmRegiones.setLocationRelativeTo(null);
                        frmRegiones.setVisible(true);
                        this.setVisible(false);
                    }
        
    }//GEN-LAST:event_btnRegionesActionPerformed

    private void btnDptMunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDptMunActionPerformed
                      if(evt.getSource()== btnDptMun){

                          FrmUbicacion frmUbicacion = new FrmUbicacion(data);
                          frmUbicacion.setDefaultCloseOperation(FrmUser.DISPOSE_ON_CLOSE);
                          frmUbicacion.setLocationRelativeTo(null);
                          frmUbicacion.setVisible(true);
                          this.setVisible(false);
                      }
    }//GEN-LAST:event_btnDptMunActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        if(evt.getSource()== btnReportes){
                        
                        FrmReportesAdmin frmReportesAdmin = new FrmReportesAdmin(data);
                        frmReportesAdmin.setDefaultCloseOperation(FrmUser.DISPOSE_ON_CLOSE);
                        frmReportesAdmin.setLocationRelativeTo(null);
                        frmReportesAdmin.setVisible(true);
                        this.setVisible(false);
                    }
    }//GEN-LAST:event_btnReportesActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FrmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmAdmin().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnDptMun;
    private javax.swing.JButton btnManejoKioscos;
    private javax.swing.JButton btnRegiones;
    private javax.swing.JButton btnReportes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
