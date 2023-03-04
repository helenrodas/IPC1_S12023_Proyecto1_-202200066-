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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import jdk.dynalink.linker.support.DefaultInternalObjectFilter;

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
        
        //--Regiones
        jTableRegiones.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                int i = jTableRegiones.getSelectedRow();

                String codigo = jTableRegiones.getValueAt(i, 0).toString();

                JOptionPane.showMessageDialog(null, data.GetRegion(codigo).toString());

                ArrayList<String> listaCodigoDeptos = data.GetRegion(codigo).getListaCodigoDeptos();

                CargarDepartamentos(listaCodigoDeptos);
            }
       });
       
       //--Deptos
        jTableDepartamentos.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                
            int i = jTableDepartamentos.getSelectedRow();
        
            String codigoDepto=jTableDepartamentos.getValueAt(i, 0).toString();
            
            ArrayList<CUbicacion> listaMunicipiosEnDepto = data.getListaMunicipios(codigoDepto);
            
            CargarMunicipios(listaMunicipiosEnDepto, codigoDepto);
            }
       });
        
    }
   
    private void CargarDepartamentos(ArrayList<String> listaCodigoDeptos){
       String Datos[][] = new String[listaCodigoDeptos.size()][30];
       jTableDepartamentos.removeAll();
       
        for (int j = 0; j < listaCodigoDeptos.size(); j++) {
            for (int i = 0; i < listaDepartamentos.size(); i++) {
                if(listaDepartamentos.get(i).getCodigo().startsWith(listaCodigoDeptos.get(j))){
                    Datos[j][0]=listaDepartamentos.get(i).getCodigo();
                    Datos[j][1]=listaDepartamentos.get(i).getNombre();
                }
            }
        }
    
        jTableDepartamentos.setModel(new javax.swing.table.DefaultTableModel(Datos, new String [] {"Codigo","Nombre"}) );
    } 

    
    private void CargarMunicipios(ArrayList<CUbicacion> listaMunicipiosEnDepto, String codigoDepto){
       
       String Datos[][] = new String[listaMunicipiosEnDepto.size()][30];
       jTableMunicipios.removeAll();
       int indice=0;
            
        for (int i = 0; i < listaMunicipios.size(); i++) {
         if( listaMunicipios.get(i).getCodigo().startsWith(codigoDepto) ){
                Datos[indice][0]=listaMunicipios.get(i).getCodigo();
                Datos[indice][1]=listaMunicipios.get(i).getNombre();
                indice ++;
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableDepartamentos = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableRegiones = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableMunicipios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre"
            }
        ));
        jTableMunicipios.setName(""); // NOI18N
        jScrollPane3.setViewportView(jTableMunicipios);

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel1.setText("Manejo de Departamentos y Municipios");

        jLabel3.setText("Departamentos ");

        jLabel4.setText("Municipios");

        jLabel6.setText("Regiones");

        btnRegresar.setText("Regresar");
        btnRegresar.setBorder(null);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegresar)
                .addGap(121, 121, 121)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(152, 152, 152)
                .addComponent(jLabel4)
                .addGap(70, 70, 70))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegresar)))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTableDepartamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(btnAgregar)
                                .addGap(55, 55, 55)
                                .addComponent(btnEliminar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableDepartamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDepartamentosMouseClicked
       
    }//GEN-LAST:event_jTableDepartamentosMouseClicked

    private void jTableRegionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRegionesMouseClicked
            }//GEN-LAST:event_jTableRegionesMouseClicked

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        if(evt.getSource()== btnRegresar){

            FrmAdmin frmAdmin = new FrmAdmin(data);
            frmAdmin.setDefaultCloseOperation(FrmAdmin.DISPOSE_ON_CLOSE);
            frmAdmin.setLocationRelativeTo(null);
            frmAdmin.setVisible(true);
            this.setVisible(false);

        }

    }//GEN-LAST:event_btnRegresarActionPerformed

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
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTableDepartamentos;
    private javax.swing.JTable jTableMunicipios;
    private javax.swing.JTable jTableRegiones;
    // End of variables declaration//GEN-END:variables
}
