/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Usuario;
import Administrador.FrmAdmin;
import Data.*;
import java.util.ArrayList;
/**
 *
 * @author lenovo
 */
public class FrmReportesUsuario extends javax.swing.JFrame {
        Data data;
        public ArrayList<CTransaccion> listaTransacciones;

    public FrmReportesUsuario(Data data) {
        initComponents();
        this.data = data;
        listaTransacciones = data.getListaTransacciones();
        this.setTitle("Envios Solicitados");
        CargarEnvios();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnRegresar2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEnvios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel1.setText("Envios Solicitados");

        btnRegresar2.setText("Regresar");
        btnRegresar2.setBorder(null);
        btnRegresar2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresar2ActionPerformed(evt);
            }
        });

        jTableEnvios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo Paquete", "Tipo de Servicio", "Destinatario", "Total Envio", "Tipo de Pago"
            }
        ));
        jScrollPane1.setViewportView(jTableEnvios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegresar2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(btnRegresar2)
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresar2ActionPerformed
        FrmUser frmUser = new FrmUser(data);
        frmUser.setDefaultCloseOperation(FrmAdmin.DISPOSE_ON_CLOSE);
        frmUser.setLocationRelativeTo(null);
        frmUser.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresar2ActionPerformed

    private void CargarEnvios(){
       String Datos[][] = new String[listaTransacciones.size()][100];
    
        for (int i = 0; i < listaTransacciones.size(); i++) {
            
            Datos[i][0]=listaTransacciones.get(i).getCodigoEnvio();
            Datos[i][1]=listaTransacciones.get(i).getTipoPrecio();
            Datos[i][2]=listaTransacciones.get(i).getDeptoDestino();
            Datos[i][3]=listaTransacciones.get(i).getTotal();
            Datos[i][4]=listaTransacciones.get(i).getTipoPago();

        }
        jTableEnvios.setModel(new javax.swing.table.DefaultTableModel(Datos, new String [] {"Codigo Paquete","Tipo de Servicio", "Destinatario",
                            "Total Envio", "Tipo de Pago"}) );
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRegresar1;
    private javax.swing.JButton btnRegresar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEnvios;
    // End of variables declaration//GEN-END:variables
}
