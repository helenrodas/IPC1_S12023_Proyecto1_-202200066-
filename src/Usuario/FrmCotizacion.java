/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Usuario;
import Administrador.FrmAdmin;
import Data.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author lenovo
 */
public class FrmCotizacion extends javax.swing.JFrame {
    Data data;
    /**
     * Creates new form FrmCotizacion
     */
    public FrmCotizacion(Data data) {
        initComponents();
        this.data = data;
        CargarDepartamentos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpTamanio = new javax.swing.ButtonGroup();
        grpPago = new javax.swing.ButtonGroup();
        grpPrecio = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jPanelInfoPrecios = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxDeptoDestino = new javax.swing.JComboBox();
        jComboBoxMuniDestino = new javax.swing.JComboBox<>();
        jComboBoxMuniOrigen = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxDeptoOrigen = new javax.swing.JComboBox();
        txtNumeroPaquetes = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanelPrecioEstandar = new javax.swing.JPanel();
        jRadioButtonPrecioEstandar = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txtTotalEstandar = new javax.swing.JTextField();
        jPanelPrecioEspecial = new javax.swing.JPanel();
        jRadioButtonPrecioEspecial = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        txtTotalEspecial = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDireccionOrigen = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDireccionDestino = new javax.swing.JTextField();
        btnCotizar = new javax.swing.JButton();
        jComboBoxPeso = new javax.swing.JComboBox<>();
        jPanelInfoPago = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel1.setText("Cotizacion");

        btnRegresar.setText("Regresar");
        btnRegresar.setBorder(null);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jPanelInfoPrecios.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setText("Destino");

        jComboBoxDeptoDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDeptoDestinoActionPerformed(evt);
            }
        });

        jLabel2.setText("Origen");

        jComboBoxDeptoOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDeptoOrigenActionPerformed(evt);
            }
        });

        txtNumeroPaquetes.setToolTipText("");

        jLabel3.setText("Numero de Paquetes");

        jLabel5.setText("Peso de Paquetes");

        jPanelPrecioEstandar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        grpPrecio.add(jRadioButtonPrecioEstandar);
        jRadioButtonPrecioEstandar.setText("Precio Estandar");

        jLabel6.setText("Total: Q");

        txtTotalEstandar.setEditable(false);
        txtTotalEstandar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalEstandarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPrecioEstandarLayout = new javax.swing.GroupLayout(jPanelPrecioEstandar);
        jPanelPrecioEstandar.setLayout(jPanelPrecioEstandarLayout);
        jPanelPrecioEstandarLayout.setHorizontalGroup(
            jPanelPrecioEstandarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrecioEstandarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrecioEstandarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonPrecioEstandar)
                    .addGroup(jPanelPrecioEstandarLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalEstandar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanelPrecioEstandarLayout.setVerticalGroup(
            jPanelPrecioEstandarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrecioEstandarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButtonPrecioEstandar)
                .addGap(18, 18, 18)
                .addGroup(jPanelPrecioEstandarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTotalEstandar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanelPrecioEspecial.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        grpPrecio.add(jRadioButtonPrecioEspecial);
        jRadioButtonPrecioEspecial.setText("Precio Especial");

        jLabel7.setText("Total: Q");

        txtTotalEspecial.setEditable(false);
        txtTotalEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalEspecialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPrecioEspecialLayout = new javax.swing.GroupLayout(jPanelPrecioEspecial);
        jPanelPrecioEspecial.setLayout(jPanelPrecioEspecialLayout);
        jPanelPrecioEspecialLayout.setHorizontalGroup(
            jPanelPrecioEspecialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrecioEspecialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrecioEspecialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonPrecioEspecial)
                    .addGroup(jPanelPrecioEspecialLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotalEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanelPrecioEspecialLayout.setVerticalGroup(
            jPanelPrecioEspecialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrecioEspecialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButtonPrecioEspecial)
                .addGap(18, 18, 18)
                .addGroup(jPanelPrecioEspecialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTotalEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel12.setText("Direccion Origen");

        txtDireccionOrigen.setToolTipText("");

        jLabel13.setText("Direccion Destino");

        txtDireccionDestino.setToolTipText("");

        btnCotizar.setText("Cotizar");
        btnCotizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCotizarActionPerformed(evt);
            }
        });

        jComboBoxPeso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "Pequeño de 1 a 10 lbs", "Mediano de 11 a 50 lbs", "Grande de  51 lbs. en adelante" }));

        javax.swing.GroupLayout jPanelInfoPreciosLayout = new javax.swing.GroupLayout(jPanelInfoPrecios);
        jPanelInfoPrecios.setLayout(jPanelInfoPreciosLayout);
        jPanelInfoPreciosLayout.setHorizontalGroup(
            jPanelInfoPreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoPreciosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInfoPreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInfoPreciosLayout.createSequentialGroup()
                        .addGroup(jPanelInfoPreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jComboBoxDeptoOrigen, 0, 98, Short.MAX_VALUE)
                            .addComponent(jComboBoxMuniOrigen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addGroup(jPanelInfoPreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInfoPreciosLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(116, 116, 116))
                            .addGroup(jPanelInfoPreciosLayout.createSequentialGroup()
                                .addGroup(jPanelInfoPreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxDeptoDestino, 0, 93, Short.MAX_VALUE)
                                    .addComponent(jComboBoxMuniDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())))
                    .addGroup(jPanelInfoPreciosLayout.createSequentialGroup()
                        .addGroup(jPanelInfoPreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelInfoPreciosLayout.createSequentialGroup()
                                .addComponent(jPanelPrecioEstandar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanelPrecioEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(txtNumeroPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelInfoPreciosLayout.createSequentialGroup()
                                .addGroup(jPanelInfoPreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(txtDireccionOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelInfoPreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelInfoPreciosLayout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addComponent(jLabel13))
                                    .addGroup(jPanelInfoPreciosLayout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(txtDireccionDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(25, Short.MAX_VALUE))))
            .addGroup(jPanelInfoPreciosLayout.createSequentialGroup()
                .addGroup(jPanelInfoPreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInfoPreciosLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(btnCotizar))
                    .addGroup(jPanelInfoPreciosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(jPanelInfoPreciosLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jComboBoxPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelInfoPreciosLayout.setVerticalGroup(
            jPanelInfoPreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoPreciosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInfoPreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInfoPreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDeptoOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxDeptoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelInfoPreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxMuniOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxMuniDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelInfoPreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInfoPreciosLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDireccionDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelInfoPreciosLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDireccionOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumeroPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnCotizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanelInfoPreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelPrecioEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelPrecioEstandar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanelInfoPago.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setText("Tipo de Pago");

        grpPago.add(jRadioButton6);
        jRadioButton6.setText("Cobro Contra Entrega (Se cobran Q5.00 Adicionales)");

        grpPago.add(jRadioButton7);
        jRadioButton7.setText("Cobro a mi cuenta(Pago con tarjeta)");

        jLabel9.setText("Datos de Facturacion");

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setText("Tipo de Servicio(Estandar o Especial)");

        jLabel11.setText("Total: Q");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField1))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jButton1.setText("Realizar Pago y Enviar");

        jButton2.setText("Descargar Factura");

        jButton3.setText("Descargar Guia");

        jButton4.setText("Cancelar Envio");

        javax.swing.GroupLayout jPanelInfoPagoLayout = new javax.swing.GroupLayout(jPanelInfoPago);
        jPanelInfoPago.setLayout(jPanelInfoPagoLayout);
        jPanelInfoPagoLayout.setHorizontalGroup(
            jPanelInfoPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoPagoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInfoPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInfoPagoLayout.createSequentialGroup()
                        .addGroup(jPanelInfoPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelInfoPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioButton7)
                                .addComponent(jLabel9)
                                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(jRadioButton6))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelInfoPagoLayout.createSequentialGroup()
                        .addGroup(jPanelInfoPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(jPanelInfoPagoLayout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        jPanelInfoPagoLayout.setVerticalGroup(
            jPanelInfoPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoPagoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton6)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton7)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(jPanelInfoPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegresar)
                        .addGap(268, 268, 268)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanelInfoPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelInfoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnRegresar)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelInfoPrecios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelInfoPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTotalEstandarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalEstandarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalEstandarActionPerformed

    private void txtTotalEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalEspecialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalEspecialActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        FrmUser frmUser = new FrmUser(data);
        frmUser.setDefaultCloseOperation(FrmAdmin.DISPOSE_ON_CLOSE);
        frmUser.setLocationRelativeTo(null);
        frmUser.setVisible(true); 
        this.setVisible(false);
    }
        
      //  frmUser.setVisible(true);    }//GEN-LAST:event_btnRegresarActionPerformed
    private void jComboBoxDeptoOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDeptoOrigenActionPerformed
        CargarMunicipiosOrigen();
    }//GEN-LAST:event_jComboBoxDeptoOrigenActionPerformed

    private void jComboBoxDeptoDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDeptoDestinoActionPerformed
        CargarMunicipiosDestino();
    }//GEN-LAST:event_jComboBoxDeptoDestinoActionPerformed

    private void btnCotizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCotizarActionPerformed

        if( !validarCampos()){
            return;
        }
        
        String deptoOrigen = jComboBoxDeptoOrigen.getSelectedItem().toString();
        String muniOrigen = jComboBoxMuniOrigen.getSelectedItem().toString();
        String direccionOrigen = txtDireccionOrigen.getText();
        String deptoDestino = jComboBoxDeptoDestino.getSelectedItem().toString();
        String muniDestino = jComboBoxMuniDestino.getSelectedItem().toString();
        String direccionDestino = txtDireccionDestino.getText();
        int numPaquetes = Integer.parseInt(txtNumeroPaquetes.getText());
        String peso = jComboBoxPeso.getSelectedItem().toString();
        Double totalEstandar = 0.0;
        Double totalEspecial = 0.0;
        
        CCotizacion cotizacion = new CCotizacion(deptoOrigen, muniOrigen, direccionOrigen, 
           deptoDestino,muniDestino, direccionDestino,peso ,numPaquetes );
         
        
        String codigodpto = data.GetCodigoDptoByNombre(deptoOrigen);
        String nombreRegion = data.GetRegionByCodigoDpto(codigodpto);
        Double tarifaEstandar = data.GetTarifaEstandarByNombreRegion(nombreRegion);
        Double tarifaEspecial = data.GetTarifaEspecialByNombreRegion(nombreRegion);
        
        //JOptionPane.showMessageDialog(null,"Cotizacion realizada con exito");
    
        if(peso.equalsIgnoreCase("Pequeño de 1 a 10 lbs")){
            totalEstandar = (tarifaEstandar * 15 * numPaquetes);
            totalEspecial = (tarifaEspecial * 15 * numPaquetes);
            
            txtTotalEstandar.setText(totalEstandar.toString());
            txtTotalEspecial.setText(totalEspecial.toString());
            
            
        }
        else if(peso.equalsIgnoreCase("Mediano de 11 a 50 lbs")){
            totalEstandar = (tarifaEstandar * 25 * numPaquetes);
            totalEspecial = (tarifaEspecial * 25 * numPaquetes);
            
            txtTotalEstandar.setText(totalEstandar.toString());
            txtTotalEspecial.setText(totalEspecial.toString());
        
        }else{
            totalEstandar = (tarifaEstandar * 35 * numPaquetes);
            totalEspecial = (tarifaEspecial * 35 * numPaquetes); 
            
            txtTotalEstandar.setText(totalEstandar.toString());
            txtTotalEspecial.setText(totalEspecial.toString());
        }
        
    }//GEN-LAST:event_btnCotizarActionPerformed

    
    private boolean validarCampos(){
        if(jComboBoxDeptoOrigen.getSelectedIndex() == 0 ){
            JOptionPane.showMessageDialog(this, "Departamento de origen es invalido!", "Error", JOptionPane.ERROR_MESSAGE);          
            return  false;
        }
         
        if(jComboBoxMuniOrigen.getSelectedIndex() == 0 ){
            JOptionPane.showMessageDialog(this,"Municipio de origen es invalido!","Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(txtDireccionOrigen.getText().isBlank() ){
            JOptionPane.showMessageDialog(this,"Direccion de origen es invalido!","Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(jComboBoxDeptoDestino.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this,"Departamento de destino es invalido!","Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(jComboBoxMuniDestino.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this,"Municipio de destino es invalido!","Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(txtDireccionDestino.getText().isBlank() ){
            JOptionPane.showMessageDialog(this,"Direccion de destino es invalido!","Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(txtNumeroPaquetes.getText().isBlank() ){
            JOptionPane.showMessageDialog(this,"Numero de paquetes es invalido!","Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(jComboBoxPeso.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this,"Peso de paquete es invalido!","Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
      return true;
    }
    
        private void CargarDepartamentos(){
          ArrayList<CUbicacion> listaDepartamentos = data.getDepartamentos();
          jComboBoxDeptoOrigen.removeAllItems();
          jComboBoxDeptoOrigen.addItem("-Departamento-");
          
          jComboBoxDeptoDestino.removeAllItems();
          jComboBoxDeptoDestino.addItem("-Departamento-");
        
                
            for (CUbicacion departamento : listaDepartamentos ) {
                //jComboBoxDeptoOrigen.addItem(departamento.getCodigo() + "-" + departamento.getNombre());
                jComboBoxDeptoOrigen.addItem(departamento);
            
            }
            
            for (CUbicacion departamento : listaDepartamentos ) {
                jComboBoxDeptoDestino.addItem(departamento);
            }
        }
        
        private void CargarMunicipiosOrigen(){
            
            if (jComboBoxDeptoOrigen.getSelectedIndex() > 0 ){
                String departamentoOrigenActual = ((CUbicacion) jComboBoxDeptoOrigen.getSelectedItem()).getCodigo() ;
                // "01-Guatemala"
                String codigoDepartamentoOrigen = departamentoOrigenActual.substring(0, 2);

                ArrayList<CUbicacion> listaMunicipiosOrigen = data.getListaMunicipios(codigoDepartamentoOrigen);

                jComboBoxMuniOrigen.removeAllItems();
                jComboBoxMuniOrigen.addItem("-Municipios-");

                

                  for(CUbicacion municipios : listaMunicipiosOrigen){
                  jComboBoxMuniOrigen.addItem(municipios.getNombre());
                  }
            }
                  
        }
        
        private void CargarMunicipiosDestino(){
         if(jComboBoxDeptoDestino.getSelectedIndex() > 0){
             String departamentoDestinoActual = ((CUbicacion)jComboBoxDeptoDestino.getSelectedItem()).getCodigo();
             // "01-Guatemala"
             String codigoDepartamentoDestino = departamentoDestinoActual.substring(0, 2);

             ArrayList<CUbicacion> listaMunicipiosDestino = data.getListaMunicipios(codigoDepartamentoDestino);

                jComboBoxMuniDestino.removeAllItems();
                jComboBoxMuniDestino.addItem("-Municipios-");
                
                for(CUbicacion municipios : listaMunicipiosDestino){
                  jComboBoxMuniDestino.addItem(municipios.getNombre());
                  }
            }   
        }
            
            
           
         
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCotizar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.ButtonGroup grpPago;
    private javax.swing.ButtonGroup grpPrecio;
    private javax.swing.ButtonGroup grpTamanio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox jComboBoxDeptoDestino;
    private javax.swing.JComboBox jComboBoxDeptoOrigen;
    private javax.swing.JComboBox<String> jComboBoxMuniDestino;
    private javax.swing.JComboBox<String> jComboBoxMuniOrigen;
    private javax.swing.JComboBox<String> jComboBoxPeso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelInfoPago;
    private javax.swing.JPanel jPanelInfoPrecios;
    private javax.swing.JPanel jPanelPrecioEspecial;
    private javax.swing.JPanel jPanelPrecioEstandar;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButtonPrecioEspecial;
    private javax.swing.JRadioButton jRadioButtonPrecioEstandar;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtDireccionDestino;
    private javax.swing.JTextField txtDireccionOrigen;
    private javax.swing.JTextField txtNumeroPaquetes;
    private javax.swing.JTextField txtTotalEspecial;
    private javax.swing.JTextField txtTotalEstandar;
    // End of variables declaration//GEN-END:variables
}
