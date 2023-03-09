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
    Double totalEstandar = 0.0;
     Double totalEspecial = 0.0;
     String tipoPrecio = "";
     String tipoPago="";
    
     public ArrayList<CTransaccion> listaTransacciones;
    /**
     * Creates new form FrmCotizacion
     */
    public FrmCotizacion(Data data) {
        initComponents();
        this.data = data;
        CargarDepartamentos();
        listaTransacciones = data.getListaTransacciones();
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
        jRadioButtonCobroContraEntrega = new javax.swing.JRadioButton();
        jRadioButtonCobroConTarjeta = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxDatosFactura = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTotalAPagar = new javax.swing.JTextField();
        btnRealizarPago = new javax.swing.JButton();
        btnFactura = new javax.swing.JButton();
        btnDescargarGuia = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanelDatosTarjeta = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jComboBoxTarjetas = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txtCvv = new javax.swing.JTextField();

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
        jRadioButtonPrecioEstandar.setActionCommand("PrecioEstandar");

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
        jRadioButtonPrecioEspecial.setActionCommand("PrecioEspecial");

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

        grpPago.add(jRadioButtonCobroContraEntrega);
        jRadioButtonCobroContraEntrega.setText("Cobro Contra Entrega (Se cobran Q5.00 Adicionales)");
        jRadioButtonCobroContraEntrega.setActionCommand("Contra_Entrega");
        jRadioButtonCobroContraEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCobroContraEntregaActionPerformed(evt);
            }
        });

        grpPago.add(jRadioButtonCobroConTarjeta);
        jRadioButtonCobroConTarjeta.setText("Cobro a mi cuenta(Pago con tarjeta)");
        jRadioButtonCobroConTarjeta.setActionCommand("Cobro_Con_Tarjeta");
        jRadioButtonCobroConTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCobroConTarjetaActionPerformed(evt);
            }
        });

        jLabel9.setText("Datos de Facturacion");

        jComboBoxDatosFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDatosFacturaActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setText("Tipo de Servicio(Estandar o Especial)");

        jLabel11.setText("Total: Q");

        txtTotalAPagar.setEditable(false);

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
                        .addComponent(txtTotalAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtTotalAPagar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        btnRealizarPago.setText("Realizar Pago y Enviar");
        btnRealizarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarPagoActionPerformed(evt);
            }
        });

        btnFactura.setText("Descargar Factura");
        btnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaActionPerformed(evt);
            }
        });

        btnDescargarGuia.setText("Descargar Guia");
        btnDescargarGuia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescargarGuiaActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jPanelDatosTarjeta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel14.setText("Seleccion Tarjeta ");

        jLabel15.setText("CVV");

        javax.swing.GroupLayout jPanelDatosTarjetaLayout = new javax.swing.GroupLayout(jPanelDatosTarjeta);
        jPanelDatosTarjeta.setLayout(jPanelDatosTarjetaLayout);
        jPanelDatosTarjetaLayout.setHorizontalGroup(
            jPanelDatosTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosTarjetaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxTarjetas, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(35, 35, 35)
                .addGroup(jPanelDatosTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCvv, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanelDatosTarjetaLayout.setVerticalGroup(
            jPanelDatosTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosTarjetaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxTarjetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelInfoPagoLayout = new javax.swing.GroupLayout(jPanelInfoPago);
        jPanelInfoPago.setLayout(jPanelInfoPagoLayout);
        jPanelInfoPagoLayout.setHorizontalGroup(
            jPanelInfoPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoPagoLayout.createSequentialGroup()
                .addGroup(jPanelInfoPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInfoPagoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelInfoPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelInfoPagoLayout.createSequentialGroup()
                                .addGroup(jPanelInfoPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonCobroConTarjeta)
                                    .addComponent(jLabel9)
                                    .addComponent(jComboBoxDatosFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jRadioButtonCobroContraEntrega))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanelInfoPagoLayout.createSequentialGroup()
                                .addGap(0, 12, Short.MAX_VALUE)
                                .addComponent(btnFactura)
                                .addGap(18, 18, 18)
                                .addComponent(btnDescargarGuia)
                                .addGap(30, 30, 30)
                                .addComponent(btnCancelar))))
                    .addGroup(jPanelInfoPagoLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanelInfoPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanelDatosTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanelInfoPagoLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(btnRealizarPago)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelInfoPagoLayout.setVerticalGroup(
            jPanelInfoPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoPagoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonCobroContraEntrega)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonCobroConTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxDatosFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelDatosTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRealizarPago)
                .addGap(26, 26, 26)
                .addGroup(jPanelInfoPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnFactura)
                    .addComponent(btnDescargarGuia))
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
                .addContainerGap(16, Short.MAX_VALUE))
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
        if( !validarCamposCotizacion()){
            return;
        }

        String deptoOrigen = jComboBoxDeptoOrigen.getSelectedItem().toString();
        int numPaquetes = Integer.parseInt(txtNumeroPaquetes.getText());
        String peso = jComboBoxPeso.getSelectedItem().toString();
        String codigodpto = data.GetCodigoDptoByNombre(deptoOrigen);
        String nombreRegion = data.GetRegionByCodigoDpto(codigodpto);
        Double tarifaEstandar = data.GetTarifaEstandarByNombreRegion(nombreRegion);
        Double tarifaEspecial = data.GetTarifaEspecialByNombreRegion(nombreRegion);
        
          
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

    private void btnRealizarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarPagoActionPerformed
        if( !validarCamposCotizacion()){
            return;
        }
        
       if( !validarCamposCompra() ){
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
        
        String tipoPrecio = grpPrecio.getSelection().getActionCommand();
        String tipoPago = grpPago.getSelection().getActionCommand();
        String datosFactura = jComboBoxDatosFactura.getSelectedItem().toString();
        String total = txtTotalAPagar.getText().trim();
        String datosTarjeta = jComboBoxTarjetas.getSelectedItem().toString();
        String cvv = txtCvv.getText().trim();
        
                
      CTransaccion compra = new CTransaccion(deptoOrigen, muniOrigen, direccionOrigen, deptoDestino, muniDestino, direccionDestino, peso, numPaquetes, tipoPrecio, 
               tipoPago,datosFactura, total,datosTarjeta ,cvv);
         
      listaTransacciones.add(compra);
      
      JOptionPane.showMessageDialog(this,"Operacion realizada con exito!");
      
      LimpiarFormulario();
    }//GEN-LAST:event_btnRealizarPagoActionPerformed

    private void jRadioButtonCobroContraEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCobroContraEntregaActionPerformed
       CargarDatosFactura();
       CargarTotalAPagar();
    }//GEN-LAST:event_jRadioButtonCobroContraEntregaActionPerformed

    private void jRadioButtonCobroConTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCobroConTarjetaActionPerformed
       CargarDatosFactura();
       CargarTotalAPagar();
    }//GEN-LAST:event_jRadioButtonCobroConTarjetaActionPerformed

    private void jComboBoxDatosFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDatosFacturaActionPerformed
        CargarDatosTarjeta();
    }//GEN-LAST:event_jComboBoxDatosFacturaActionPerformed

    private void btnDescargarGuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescargarGuiaActionPerformed
        if(evt.getSource()== btnDescargarGuia){
            FrmEtiquetaEnvio frmEtiquetaEnvio = new FrmEtiquetaEnvio(data);
            frmEtiquetaEnvio.setDefaultCloseOperation(FrmUser.DISPOSE_ON_CLOSE);
            frmEtiquetaEnvio.setLocationRelativeTo(null);
            frmEtiquetaEnvio.setVisible(true);
            this.setVisible(false);
                      }
    }//GEN-LAST:event_btnDescargarGuiaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        LimpiarFormulario();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed
        FrmFactura frmFactura = new FrmFactura(data);
        frmFactura.setDefaultCloseOperation(FrmAdmin.DISPOSE_ON_CLOSE);
        frmFactura.setLocationRelativeTo(null);
        frmFactura.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnFacturaActionPerformed

    public void LimpiarFormulario(){
       jComboBoxDeptoOrigen.setSelectedIndex(0);
        jComboBoxMuniOrigen.setSelectedIndex(0);
        jComboBoxDeptoDestino.setSelectedIndex(0);
        jComboBoxMuniDestino.setSelectedIndex(0);
        txtDireccionOrigen.setText("");
        txtDireccionDestino.setText("");
        txtNumeroPaquetes.setText("");
        jComboBoxPeso.setSelectedIndex(0);
        grpPrecio.clearSelection();
        txtTotalEspecial.setText("");
        txtTotalEstandar.setText("");
        grpPago.clearSelection();
        jComboBoxDatosFactura.setSelectedIndex(0);
        txtTotalAPagar.setText("");
        jComboBoxTarjetas.setSelectedIndex(0);
        txtCvv.setText(""); 
    }

    
    private boolean validarCamposCotizacion(){
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
        
      private boolean validarCamposCompra(){
        if(jRadioButtonPrecioEstandar.isSelected()==false && jRadioButtonPrecioEspecial.isSelected()==false){
            JOptionPane.showMessageDialog(this, "Seleccione un precio!", "Error", JOptionPane.ERROR_MESSAGE);          
            return  false;
        }
         
        if(jRadioButtonCobroContraEntrega.isSelected()==false && jRadioButtonCobroConTarjeta.isSelected()==false ){
            JOptionPane.showMessageDialog(this,"Seleccione un tipo de pago!","Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(jComboBoxDatosFactura.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this,"Seleccione datos para Factura!","Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
      
        if (jRadioButtonCobroConTarjeta.isSelected()) {
             String cvv = txtCvv.getText().trim();
            if (cvv.isBlank()) {
                JOptionPane.showMessageDialog(this, "Datos cvv son requeridos!", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            // Verificamos que el cvv contenga sólo números enteros
            if (!cvv.matches("\\d+")) {
             JOptionPane.showMessageDialog(this, "CVV es invalido!", "Error", JOptionPane.ERROR_MESSAGE);
             return false;
            }
            if (cvv.length() != 3) {
                 JOptionPane.showMessageDialog(this, "CVV es invalido!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
            }
        }
    return true;

      }
      
      private void CargarDatosTarjeta(){
         // String numTarjeta = data.getTarjetaIngresada().getNumero();
         String numTarjeta = "12345678932";
         String tarjetaOfuscada = "XXXX-XXXX-XXXX-";
         String caracteresAMostrar = numTarjeta.substring(numTarjeta.length() - 4);
         String tarjetaAMostrar = tarjetaOfuscada.substring(0, tarjetaOfuscada.length() - 4)  + caracteresAMostrar;
          
          jComboBoxTarjetas.removeAllItems();
          jComboBoxTarjetas.addItem("---");
          jComboBoxTarjetas.addItem(tarjetaAMostrar);
      }
      
      private void CargarDatosFactura(){
        String nombre = "Helen";
        String apellido = "Rodas";
        String nit = "12345678";
        //String nombre = data.getUsuarioActual().getNombre();
        //String apellido = data.getUsuarioActual().getApellido();
        //String nit = data.getUsuarioActual().getNit();
        String datosFactura = nombre + " " + apellido + " " + "||" + " " +"Nit: " + nit ;
        
        jComboBoxDatosFactura.removeAllItems();
        jComboBoxDatosFactura.addItem("---");
        jComboBoxDatosFactura.addItem(datosFactura);
      }
      
      private void CargarTotalAPagar(){
          if(jRadioButtonPrecioEstandar.isSelected() && jRadioButtonCobroContraEntrega.isSelected()){
            Double total = (totalEstandar + 5);
            String totalAsString = total.toString();
            txtTotalAPagar.setText(totalAsString);
            jPanelDatosTarjeta.setVisible(false);
            
        }else if(jRadioButtonPrecioEspecial.isSelected() && jRadioButtonCobroContraEntrega.isSelected()){
            Double total = (totalEspecial + 5);
            String totalAsString = total.toString();
            txtTotalAPagar.setText(totalAsString);
            jPanelDatosTarjeta.setVisible(false);
            
        }else if(jRadioButtonPrecioEstandar.isSelected() && jRadioButtonCobroConTarjeta.isSelected()){
            Double total = totalEstandar;
            String totalAsString = total.toString();
            txtTotalAPagar.setText(totalAsString);
            jPanelDatosTarjeta.setVisible(true);
            
        }else if(jRadioButtonPrecioEspecial.isSelected() && jRadioButtonCobroConTarjeta.isSelected()){
            Double total = totalEspecial;
            String totalAsString = total.toString();
            txtTotalAPagar.setText(totalAsString);
            jPanelDatosTarjeta.setVisible(true);
        
        }
      }
       
            
           
         
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCotizar;
    private javax.swing.JButton btnDescargarGuia;
    private javax.swing.JButton btnFactura;
    private javax.swing.JButton btnRealizarPago;
    private javax.swing.JButton btnRegresar;
    private javax.swing.ButtonGroup grpPago;
    private javax.swing.ButtonGroup grpPrecio;
    private javax.swing.ButtonGroup grpTamanio;
    private javax.swing.JComboBox<String> jComboBoxDatosFactura;
    private javax.swing.JComboBox jComboBoxDeptoDestino;
    private javax.swing.JComboBox jComboBoxDeptoOrigen;
    private javax.swing.JComboBox<String> jComboBoxMuniDestino;
    private javax.swing.JComboBox<String> jComboBoxMuniOrigen;
    private javax.swing.JComboBox<String> jComboBoxPeso;
    private javax.swing.JComboBox<String> jComboBoxTarjetas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelDatosTarjeta;
    private javax.swing.JPanel jPanelInfoPago;
    private javax.swing.JPanel jPanelInfoPrecios;
    private javax.swing.JPanel jPanelPrecioEspecial;
    private javax.swing.JPanel jPanelPrecioEstandar;
    private javax.swing.JRadioButton jRadioButtonCobroConTarjeta;
    private javax.swing.JRadioButton jRadioButtonCobroContraEntrega;
    private javax.swing.JRadioButton jRadioButtonPrecioEspecial;
    private javax.swing.JRadioButton jRadioButtonPrecioEstandar;
    private javax.swing.JTextField txtCvv;
    private javax.swing.JTextField txtDireccionDestino;
    private javax.swing.JTextField txtDireccionOrigen;
    private javax.swing.JTextField txtNumeroPaquetes;
    private javax.swing.JTextField txtTotalAPagar;
    private javax.swing.JTextField txtTotalEspecial;
    private javax.swing.JTextField txtTotalEstandar;
    // End of variables declaration//GEN-END:variables
}
