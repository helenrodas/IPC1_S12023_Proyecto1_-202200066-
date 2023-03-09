/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Usuario;

import Administrador.FrmAdmin;
import Data.CTransaccion;
import Data.Data;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;


/**
 *
 * @author lenovo
 */
public class FrmEtiquetaEnvio extends javax.swing.JFrame {
    Data data;

    public FrmEtiquetaEnvio(Data data) {
        initComponents();
        this.data = data;
        CargarDatosDeCotizacion();
        
 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDeptoOrigen = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMuniOrigen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDeptoDestino = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMuniDestino = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFechaEnvio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNumPaquetes = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSizePaquetes = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTipoDePago = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCodigoPaquete = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        btnEmitirFactura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Origen:");

        txtDeptoOrigen.setEditable(false);

        jLabel2.setText("/");

        txtMuniOrigen.setEditable(false);

        jLabel3.setText("Destino:");

        txtDeptoDestino.setEditable(false);

        jLabel4.setText("/");

        txtMuniDestino.setEditable(false);

        jLabel5.setText("Fecha de envio");

        txtFechaEnvio.setEditable(false);
        txtFechaEnvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaEnvioActionPerformed(evt);
            }
        });

        jLabel7.setText("Numero de Paquetes:");

        txtNumPaquetes.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDeptoOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMuniOrigen))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(2, 2, 2)
                        .addComponent(txtDeptoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMuniDestino, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDeptoOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtMuniOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDeptoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txtMuniDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFechaEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNumPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jLabel6.setText("Tamaño del paquete:");

        txtSizePaquetes.setEditable(false);
        txtSizePaquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSizePaquetesActionPerformed(evt);
            }
        });

        jLabel8.setText("Tipo de Pago:");

        txtTipoDePago.setEditable(false);

        jLabel9.setText("Codigo de Paquete:");

        txtCodigoPaquete.setEditable(false);

        btnRegresar.setText("Regresar");
        btnRegresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnEmitirFactura.setText("Emitir Factura");
        btnEmitirFactura.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEmitirFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmitirFacturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTipoDePago, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSizePaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegresar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEmitirFactura, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEmitirFactura)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCodigoPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSizePaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtTipoDePago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFechaEnvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaEnvioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaEnvioActionPerformed

    private void txtSizePaquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSizePaquetesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSizePaquetesActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        FrmUser frmUser = new FrmUser(data);
        frmUser.setDefaultCloseOperation(FrmAdmin.DISPOSE_ON_CLOSE);
        frmUser.setLocationRelativeTo(null);
        frmUser.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnEmitirFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmitirFacturaActionPerformed
        FrmFactura frmFactura = new FrmFactura(data);
        frmFactura.setDefaultCloseOperation(FrmAdmin.DISPOSE_ON_CLOSE);
        frmFactura.setLocationRelativeTo(null);
        frmFactura.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEmitirFacturaActionPerformed

    private void CargarDatosDeCotizacion(){ 
      // Guardando la última transacción en una variable
       CTransaccion ultimaTransaccion = data.getListaTransacciones().get(data.getListaTransacciones().size() - 1);

        
        String deptoOrigen = ultimaTransaccion.getDeptoOrigen();
        String muniOrigen = ultimaTransaccion.getMunicipioOrigen();
        String deptoDestino = ultimaTransaccion.getDeptoDestino();
        String muniDestino = ultimaTransaccion.getMunicipioDestino();
        String numPaquetes = ultimaTransaccion.getPaquetes().toString();
        String tipoDePago = ultimaTransaccion.getTipoPago();
        String peso= ultimaTransaccion.getSize();
        String code="";
        
        
        txtDeptoOrigen.setText(deptoOrigen);
        txtMuniOrigen.setText(muniOrigen);
        txtDeptoDestino.setText(deptoDestino);
        txtMuniDestino.setText(muniDestino);
        txtFechaEnvio.setText("13/03/2023");
        txtNumPaquetes.setText(numPaquetes);
        txtTipoDePago.setText(tipoDePago);
        txtSizePaquetes.setText(peso);
        
        
        
        GenerarCodigo generator = new GenerarCodigo();
        try {
                code = generator.codigoAGenerar();
                txtCodigoPaquete.setText(code);
                
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        ultimaTransaccion.setCodigoEnvio(code);
       
    }
    
    //==============================================
    
   public class GenerarCodigo {

    private static final String ALLOWED_CHARACTERS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz_";
    private static final int CODE_LENGTH = 10;
    private static final String PREFIX = "IPC1D";

    private Set<String> existeCodigo;
    private Random random;

    public GenerarCodigo() {
        existeCodigo = new HashSet<>();
        random = new Random();
    }

    public String codigoAGenerar() throws Exception {
        String code = "";
        boolean codeIsUnique = false;

        while (!codeIsUnique) {
            StringBuilder sb = new StringBuilder();
            sb.append(PREFIX);

            for (int i = 0; i < CODE_LENGTH - PREFIX.length(); i++) {
                int index = random.nextInt(ALLOWED_CHARACTERS.length());
                sb.append(ALLOWED_CHARACTERS.charAt(index));
            }
            code = sb.toString();

            if (!existeCodigo.contains(code)) {
                existeCodigo.add(code);
                codeIsUnique = true;
            }
        }
        return code;
    }

   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmitirFactura;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCodigoPaquete;
    private javax.swing.JTextField txtDeptoDestino;
    private javax.swing.JTextField txtDeptoOrigen;
    private javax.swing.JTextField txtFechaEnvio;
    private javax.swing.JTextField txtMuniDestino;
    private javax.swing.JTextField txtMuniOrigen;
    private javax.swing.JTextField txtNumPaquetes;
    private javax.swing.JTextField txtSizePaquetes;
    private javax.swing.JTextField txtTipoDePago;
    // End of variables declaration//GEN-END:variables
}
