/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Administrador;

import Data.*;
import java.awt.Point;
import java.util.ArrayList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;

/**
 *
 * @author lenovo
 */
public class FrmUbicacion extends javax.swing.JFrame {
    public ArrayList<CUbicacion> listaDepartamentos;
    public ArrayList<CUbicacion> listaMunicipios;
    public ArrayList<CRegion> listaRegiones;
    
    Data data;
    /**
     * Creates new form FrmUbicacion
     */
    public FrmUbicacion(Data data) {
        initComponents();
        this.data=data;
        listaDepartamentos = data.getDepartamentos();
        listaMunicipios = data.getMunicipios();
        listaRegiones = data.getRegiones();

        CargarRegiones();
        //CargarDepartamentos();
       // CargarMunicipios();
        
        jTableDepartamentos.addMouseListener(new MouseAdapter(){
        
            public void mouseClicked(MouseEvent e){
                
            int i = jTableDepartamentos.getSelectedRow();
        
            //txtNombreDpt.setText(jTableDepartamentos.getValueAt(i, 1).toString());
            
            String codigoDpt=jTableDepartamentos.getValueAt(i, 0).toString();
            //JOptionPane.showMessageDialog(null, codigoDpt);
                CargarMunicipios(codigoDpt);
            
            }
       });
        
        jTableMunicipios.addMouseListener(new MouseAdapter(){
        
            public void mouseClicked(MouseEvent e){
            int i = jTableMunicipios.getSelectedRow();
        
            txtNombreMuni.setText(jTableMunicipios.getValueAt(i, 1).toString());
            }
       });
        
        jTableRegiones.addMouseListener(new MouseAdapter(){
        
            public void mouseClicked(MouseEvent e){
            int i = jTableRegiones.getSelectedRow();
        
            txtRegion.setText(jTableRegiones.getValueAt(i, 1).toString());
            
            String codigoDpt=jTableRegiones.getValueAt(i, 0).toString();
                //CargarDepartamentos(codigoDpt);
                CargarDepartamentos(codigoDpt);
            }
       });
    }
    
    
    
    private void CargarDepartamentos(String codigoDpt){
       String Datos[][] = new String[listaDepartamentos.size()][100];
    
        for (int i = 0; i < listaDepartamentos.size(); i++) {
            //if(lista.get(i).getCodigo().equals(codigoDpt)){}
            Datos[i][0]=listaDepartamentos.get(i).getCodigo();
            Datos[i][1]=listaDepartamentos.get(i).getNombre();
            
        }
        jTableDepartamentos.setModel(new javax.swing.table.DefaultTableModel(Datos, new String [] {"Codigo","Nombre"}) );
    }
    
    private void CargarMunicipios(String codigoDepto){
       String Datos[][] = new String[listaMunicipios.size()][100];
    
        for (int i = 0; i < listaMunicipios.size(); i++) {
            if( listaMunicipios.get(i).getCodigo().startsWith(codigoDepto) ){
                Datos[i][0]=listaMunicipios.get(i).getCodigo();
                Datos[i][1]=listaMunicipios.get(i).getNombre();
            }
        }
        jTableMunicipios.setModel(new javax.swing.table.DefaultTableModel(Datos, new String [] {"Codigo","Nombre"}) );
    }
    
    private void CargarRegiones(){
       String Datos[][] = new String[listaRegiones.size()][100];
    
        for (int i = 0; i < listaRegiones.size(); i++) {
            
            Datos[i][0]=listaRegiones.get(i).getCodigo();
            Datos[i][1]=listaRegiones.get(i).getNombre();
        }
        jTableRegiones.setModel(new javax.swing.table.DefaultTableModel(Datos, new String [] {"Codigo","Nombre"}) );
    }
     
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTableMunicipios = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreDpt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNombreMuni = new javax.swing.JTextField();
        txtRegion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableDepartamentos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableRegiones = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableMunicipios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo", "Nombre"
            }
        ));
        jTableMunicipios.setName(""); // NOI18N
        jScrollPane3.setViewportView(jTableMunicipios);

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel1.setText("Manejo de Departamentos y Municipios");

        jLabel2.setText("Region");

        jLabel5.setText("Municipio");

        jLabel7.setText("Departamento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(154, 154, 154)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNombreDpt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(txtNombreMuni, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreDpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreMuni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTableDepartamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Codigo", "Nombre"
            }
        ));
        jTableDepartamentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTableDepartamentos.setName(""); // NOI18N
        jTableDepartamentos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableDepartamentos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableDepartamentos.setShowGrid(true);
        jTableDepartamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDepartamentosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableDepartamentos);

        jLabel3.setText("Departamentos ");

        jLabel4.setText("Municipios");

        btnAgregar.setText("Agregar");

        btnEliminar.setText("Eliminar");

        jTableRegiones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Codigo", "Nombre"
            }
        ));
        jTableRegiones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTableRegiones.setName(""); // NOI18N
        jTableRegiones.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableRegiones.setShowGrid(true);
        jTableRegiones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRegionesMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTableRegiones);

        jLabel6.setText("Regiones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addGap(39, 39, 39)
                .addComponent(btnEliminar)
                .addGap(299, 299, 299))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(61, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(169, 169, 169)
                .addComponent(jLabel4)
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableDepartamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDepartamentosMouseClicked
       
    }//GEN-LAST:event_jTableDepartamentosMouseClicked

    private void jTableRegionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRegionesMouseClicked
            }//GEN-LAST:event_jTableRegionesMouseClicked

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
//            java.util.logging.Logger.getLogger(FrmUbicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmUbicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmUbicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmUbicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmUbicacion().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTableDepartamentos;
    private javax.swing.JTable jTableMunicipios;
    private javax.swing.JTable jTableRegiones;
    private javax.swing.JTextField txtNombreDpt;
    private javax.swing.JTextField txtNombreMuni;
    private javax.swing.JTextField txtRegion;
    // End of variables declaration//GEN-END:variables
}
