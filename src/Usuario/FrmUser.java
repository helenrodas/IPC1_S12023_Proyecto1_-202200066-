/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Usuario;
import Data.*;
import Administrador.FrmAdmin;
import Administrador.FrmUbicacion;
import Inicializar.FrmInicio;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author lenovo
 */
public class FrmUser extends javax.swing.JFrame {
    Data data;
    /**
     * Creates new form FrmUser
     */
    public FrmUser(Data data) {
        initComponents();
        this.data=data;
        this.setTitle("Usuario/Cliente");
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
        btnCotizar = new javax.swing.JButton();
        btnDatosFactura = new javax.swing.JButton();
        btnRegistroTarjeta = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        btnCompra = new javax.swing.JButton();
        btnDescargarGuia = new javax.swing.JButton();
        btnEnvios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel1.setText("Bienvenido Usuario");

        btnCotizar.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        btnCotizar.setText("Cotizacion de Paquetes");
        btnCotizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCotizarActionPerformed(evt);
            }
        });

        btnDatosFactura.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        btnDatosFactura.setText("Registro datos de facturacion");
        btnDatosFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatosFacturaActionPerformed(evt);
            }
        });

        btnRegistroTarjeta.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        btnRegistroTarjeta.setText("Registro de tarjetas credito/debito");
        btnRegistroTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroTarjetaActionPerformed(evt);
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

        btnCompra.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        btnCompra.setText("Compra");

        btnDescargarGuia.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        btnDescargarGuia.setText("Descargar Factura y guia");
        btnDescargarGuia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescargarGuiaActionPerformed(evt);
            }
        });

        btnEnvios.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        btnEnvios.setText("Ver envios solicitados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion)
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEnvios)
                                    .addComponent(btnCotizar)))
                            .addComponent(btnRegistroTarjeta)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(btnCompra))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnDescargarGuia, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(btnDatosFactura))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnRegistroTarjeta)
                .addGap(18, 18, 18)
                .addComponent(btnDatosFactura)
                .addGap(18, 18, 18)
                .addComponent(btnDescargarGuia)
                .addGap(18, 18, 18)
                .addComponent(btnCotizar)
                .addGap(18, 18, 18)
                .addComponent(btnEnvios)
                .addGap(18, 18, 18)
                .addComponent(btnCompra)
                .addGap(18, 18, 18)
                .addComponent(btnCerrarSesion)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        //--setear usuario actual
        CUsuario usuarioActual = data.getUsuarioActual();
        usuarioActual = null;

//            data.getUsuarioActual().setNombre("");
//            data.getUsuarioActual().setApellido("");
//            data.getUsuarioActual().setAlias("");
//            data.getUsuarioActual().setCorreo("");
//            data.getUsuarioActual().setDpi("");
//            data.getUsuarioActual().setFecha("");
//            data.getUsuarioActual().setFoto("");
//            data.getUsuarioActual().setGenero("");
//            data.getUsuarioActual().setNacionalidad("");
//            data.getUsuarioActual().setNit("");
//            data.getUsuarioActual().setPassword("");
//            data.getUsuarioActual().setRol("");
//            data.getUsuarioActual().setTelefono("");
//            
        
                FrmInicio frmInicio = new FrmInicio(data);
                frmInicio.setLocationRelativeTo(null);
                frmInicio.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnRegistroTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroTarjetaActionPerformed
            if(evt.getSource()== btnRegistroTarjeta){

            FrmRegistroTarjetas frmRegistroTarjetas = new FrmRegistroTarjetas(data);
            frmRegistroTarjetas.setDefaultCloseOperation(FrmUser.DISPOSE_ON_CLOSE);
            frmRegistroTarjetas.setLocationRelativeTo(null);
            frmRegistroTarjetas.setVisible(true);
            this.setVisible(false);
                      }
    }//GEN-LAST:event_btnRegistroTarjetaActionPerformed

    private void btnDatosFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatosFacturaActionPerformed
            if(evt.getSource()== btnDatosFactura){
            FrmRegistroFactura frmRegistroFactura = new FrmRegistroFactura(data);
            frmRegistroFactura.setDefaultCloseOperation(FrmUser.DISPOSE_ON_CLOSE);
            frmRegistroFactura.setLocationRelativeTo(null);
            frmRegistroFactura.setVisible(true);
            this.setVisible(false);
                      }
    }//GEN-LAST:event_btnDatosFacturaActionPerformed

    private void btnCotizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCotizarActionPerformed
            if(evt.getSource()== btnCotizar){
            FrmCotizacion frmCotizacion = new FrmCotizacion(data);
            frmCotizacion.setDefaultCloseOperation(FrmUser.DISPOSE_ON_CLOSE);
            frmCotizacion.setLocationRelativeTo(null);
            frmCotizacion.setVisible(true);
            this.setVisible(false);
                      }
    }//GEN-LAST:event_btnCotizarActionPerformed

    private void btnDescargarGuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescargarGuiaActionPerformed
            if(evt.getSource()== btnDescargarGuia){
            FrmEtiquetaEnvio frmEtiquetaEnvio = new FrmEtiquetaEnvio(data);
            frmEtiquetaEnvio.setDefaultCloseOperation(FrmUser.DISPOSE_ON_CLOSE);
            frmEtiquetaEnvio.setLocationRelativeTo(null);
            frmEtiquetaEnvio.setVisible(true);
            this.setVisible(false);
                      }
    }//GEN-LAST:event_btnDescargarGuiaActionPerformed

    /**
     * @param args the command line arguments
     */
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
//            java.util.logging.Logger.getLogger(FrmUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmUser().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnCompra;
    private javax.swing.JButton btnCotizar;
    private javax.swing.JButton btnDatosFactura;
    private javax.swing.JButton btnDescargarGuia;
    private javax.swing.JButton btnEnvios;
    private javax.swing.JButton btnRegistroTarjeta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
