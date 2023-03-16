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

/**
 *
 * @author lenovo
 */
public class FrmUbicacion extends javax.swing.JFrame {
    public ArrayList<CUbicacion> listaDepartamentos;
    public ArrayList<CUbicacion> listaMunicipios;
    public ArrayList<CRegion> listaRegiones;
    private String codigoSelectedRegion;
    private String codigoSelectedDepto;
    private ArrayList<String> listadoDeptosRegionSeleccionada;
    private ArrayList<String> listadoMunicipiosDeptoSeleccionado;
    
            Data data;
    /**
     * Creates new form FrmUbicacion
     */
    public FrmUbicacion(Data data) {
        initComponents();
        this.data=data;
        codigoSelectedRegion="";
        codigoSelectedDepto = "";
       
        listaDepartamentos = data.getDepartamentos();
        listaMunicipios = data.getMunicipios();
        listaRegiones = data.getRegiones();
         this.setTitle("Departamentos y Municipios");
        CargarRegiones();
        txtDepto.setEditable(false);
        txtcodigoDepto.setEditable(false);
        btnAgregarDepto.setEnabled(false);
        btnEliminarDepto.setEnabled(false);
        txtCodigoMunicipio.setEditable(false);
        txtMunicipio.setEditable(false);
        btnAgregarMuni.setEnabled(false);
        btnEliminarMuni.setEnabled(false);
        
        
        //--Regiones
        jTableRegiones.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                int i = jTableRegiones.getSelectedRow();
                txtRegion.setEditable(false);
                txtcodigoRegion.setEditable(false);
                txtDepto.setEditable(true);
                txtcodigoDepto.setEditable(true);
                btnAgregarDepto.setEnabled(true);
                btnEliminarDepto.setEnabled(true);
                
                String codigo = jTableRegiones.getValueAt(i, 0).toString();
                txtcodigoRegion.setText(data.GetRegion(codigo).getCodigo());
                txtRegion.setText(data.GetRegion(codigo).getNombre());

                listadoDeptosRegionSeleccionada = data.GetRegion(codigo).getListaCodigoDeptos();
                codigoSelectedRegion = codigo;
                
                CargarDepartamentos(listadoDeptosRegionSeleccionada);
            }
       });
       
       //--Deptos
        jTableDepartamentos.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                
            int i = jTableDepartamentos.getSelectedRow();
            txtCodigoMunicipio.setEditable(true);
            txtMunicipio.setEditable(true);
            btnAgregarMuni.setEnabled(true);
            btnEliminarMuni.setEnabled(true);
            
            String codigoDepto=jTableDepartamentos.getValueAt(i, 0).toString();
            String nombreDepto =jTableDepartamentos.getValueAt(i, 1).toString(); 
            codigoSelectedDepto=codigoDepto;
            
            txtcodigoDepto.setText(codigoDepto);
            txtDepto.setText(nombreDepto);
            txtcodigoDepto.setEditable(false);
            txtDepto.setEditable(false);
            
            ArrayList<CUbicacion> listaMunicipiosEnDepto = data.getListaMunicipios(codigoDepto);
            CargarMunicipios( listaMunicipiosEnDepto);
            
            //listadoMunicipiosDeptoSeleccionado = data.GetDepartamento(codigoDepto)
            }
       });
        
        //--Municipios
        jTableMunicipios.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                
            int i = jTableMunicipios.getSelectedRow();
            
            String codigoMunicipio=jTableMunicipios.getValueAt(i, 0).toString();
            String codigoDosCaracteres = codigoMunicipio.substring(codigoMunicipio.length() - 2);
            String nombreMunicipio =jTableMunicipios.getValueAt(i, 1).toString(); 
            //codigoSelectedDepto=codigoDepto;
            
            txtCodigoMunicipio.setText(codigoDosCaracteres);
            txtMunicipio.setText(nombreMunicipio);
            txtCodigoMunicipio.setEditable(false);
            txtMunicipio.setEditable(false);
            
//            ArrayList<CUbicacion> listaMunicipiosEnDepto = data.getListaMunicipios(codigoDepto);
//            CargarMunicipios( listaMunicipiosEnDepto);
//            
            //listadoMunicipiosDeptoSeleccionado = data.GetDepartamento(codigoDepto)
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
        txtcodigoDepto.setText("");
        txtDepto.setText("");
    } 

    
    private void CargarMunicipios( ArrayList<CUbicacion> listaMunicipios){
       
       String Datos[][] = new String[listaMunicipios.size()][30];
       jTableMunicipios.removeAll();
//       int indice=0;
       
        for (int i = 0; i < listaMunicipios.size(); i++) {
//         if( listaMunicipios.get(i).getCodigo().startsWith(codigoDepto) ){
                Datos[i][0]=listaMunicipios.get(i).getCodigo();
                Datos[i][1]=listaMunicipios.get(i).getNombre();
//                indice ++;
//         }
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
        btnRegresar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableDepartamentos = new javax.swing.JTable();
        btnAgregarRegion = new javax.swing.JButton();
        btnEliminarRegion = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableRegiones = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtcodigoRegion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtRegion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtcodigoDepto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDepto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCodigoMunicipio = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtMunicipio = new javax.swing.JTextField();
        btnAgregarDepto = new javax.swing.JButton();
        btnEliminarDepto = new javax.swing.JButton();
        btnAgregarMuni = new javax.swing.JButton();
        btnEliminarMuni = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(20, 2147483647));
        setSize(new java.awt.Dimension(0, 0));

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
                .addGap(133, 133, 133)
                .addComponent(jLabel1)
                .addContainerGap(160, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        btnAgregarRegion.setText("Agregar");
        btnAgregarRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarRegionActionPerformed(evt);
            }
        });

        btnEliminarRegion.setText("Eliminar");
        btnEliminarRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarRegionActionPerformed(evt);
            }
        });

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

        jLabel3.setText("Departamento: ");

        jLabel4.setText("Municipio:");

        jLabel2.setText("Region:");

        jLabel5.setText("Region:");

        jLabel7.setText("Codigo:");

        jLabel8.setText("Codigo:");

        jLabel9.setText("Depto:");

        jLabel10.setText("Codigo:");

        txtCodigoMunicipio.setColumns(2);
        txtCodigoMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoMunicipioActionPerformed(evt);
            }
        });
        txtCodigoMunicipio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoMunicipioKeyTyped(evt);
            }
        });

        jLabel11.setText("Municipio:");

        btnAgregarDepto.setText("Agregar ");
        btnAgregarDepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDeptoActionPerformed(evt);
            }
        });

        btnEliminarDepto.setText("Eliminar");
        btnEliminarDepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDeptoActionPerformed(evt);
            }
        });

        btnAgregarMuni.setText("Agregar ");
        btnAgregarMuni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMuniActionPerformed(evt);
            }
        });

        btnEliminarMuni.setText("Eliminar");
        btnEliminarMuni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMuniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregarRegion)
                        .addGap(28, 28, 28)
                        .addComponent(btnEliminarRegion)))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtcodigoDepto, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDepto, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodigoMunicipio, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addComponent(txtMunicipio)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnAgregarDepto)
                        .addGap(29, 29, 29)
                        .addComponent(btnEliminarDepto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarMuni)
                        .addGap(29, 29, 29)
                        .addComponent(btnEliminarMuni)
                        .addGap(44, 44, 44))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jLabel3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(27, 27, 27)
                            .addComponent(txtRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(txtcodigoRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(146, 146, 146))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtcodigoRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtcodigoDepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtDepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtCodigoMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAgregarDepto)
                        .addComponent(btnEliminarDepto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAgregarMuni)
                        .addComponent(btnEliminarMuni, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
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

    public void mostrarRegiones(){
        String GuardarDatos[][] = new String[listaRegiones.size()][20];
    
        for (int i = 0; i < listaRegiones.size(); i++) {
            
            GuardarDatos[i][0]=listaRegiones.get(i).getCodigo();
            GuardarDatos[i][1]=listaRegiones.get(i).getNombre();
        }
        jTableRegiones.setModel(new javax.swing.table.DefaultTableModel(GuardarDatos, new String [] {"Codigo","Region"}) );
        txtcodigoRegion.setText("");
        txtRegion.setText("");
    } 
    

    
    private void btnAgregarRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarRegionActionPerformed
       String codigoRegionNueva = txtcodigoRegion.getText().trim();
       String nombreRegionNueva = txtRegion.getText().trim();
       
       if( data.existeRegion(codigoRegionNueva, nombreRegionNueva)){
           JOptionPane.showMessageDialog( this,  "La Region ya existe!");
            txtcodigoRegion.setText("");
            txtRegion.setText("");
       }else{
          CRegion regionNueva = new CRegion(codigoRegionNueva, nombreRegionNueva);
          listaRegiones.add(regionNueva);
          mostrarRegiones(); 
       }
       
       
       
       

    }//GEN-LAST:event_btnAgregarRegionActionPerformed

    private void btnAgregarDeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDeptoActionPerformed
        String codigoDeptoNuevo = txtcodigoDepto.getText().trim(); 
       String nombreDeptoNuevo = txtDepto.getText().trim();

       if( data.existeDepartamento(codigoDeptoNuevo, nombreDeptoNuevo)){
           JOptionPane.showMessageDialog( this,  "El Departamento ya existe!");
            txtMunicipio.setText("");
            txtCodigoMunicipio.setText("");
       }else{
           CUbicacion departamentoNuevo = new CUbicacion(codigoDeptoNuevo, nombreDeptoNuevo);
           listaDepartamentos.add(departamentoNuevo);
        
           data.GetRegion(codigoSelectedRegion).getListaCodigoDeptos().add(codigoDeptoNuevo);
           CargarDepartamentos(listadoDeptosRegionSeleccionada);
       }
       
    }//GEN-LAST:event_btnAgregarDeptoActionPerformed

    private void btnAgregarMuniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMuniActionPerformed
       String codigoMuniNuevo = txtCodigoMunicipio.getText().trim();
       String nombreMuniNuevo = txtMunicipio.getText().trim();

        if(txtCodigoMunicipio.getText().length() != 2) {
              JOptionPane.showMessageDialog( this,  "Codigo invalido!");
              return;
        }
       
        //0102
        codigoMuniNuevo = codigoSelectedDepto.concat(codigoMuniNuevo);
        
       if( data.existeMunicipio(codigoMuniNuevo, nombreMuniNuevo)){
           JOptionPane.showMessageDialog( this,  "El Municipio ya existe!");
           txtMunicipio.setText("");
           txtCodigoMunicipio.setText("");
           return;
       }
       
        CUbicacion municipioNuevo = new CUbicacion(codigoMuniNuevo, nombreMuniNuevo);
        listaMunicipios.add(municipioNuevo); 
        
        ArrayList<CUbicacion> listaMunicipiosEnDepto = data.getListaMunicipios(codigoSelectedDepto);
        CargarMunicipios( listaMunicipiosEnDepto);
       
    }//GEN-LAST:event_btnAgregarMuniActionPerformed

    private void txtCodigoMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoMunicipioActionPerformed
                    }//GEN-LAST:event_txtCodigoMunicipioActionPerformed

    private void txtCodigoMunicipioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoMunicipioKeyTyped
       if( txtCodigoMunicipio.getText().trim().length() >= 2){
        evt.consume();    
       }
        
    }//GEN-LAST:event_txtCodigoMunicipioKeyTyped

    private void btnEliminarRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarRegionActionPerformed
        String codigoRegion = txtcodigoRegion.getText().trim();
        String nombreRegion = txtRegion.getText().trim();
        
        if( codigoRegion.isBlank() || 
            nombreRegion.isBlank()){
            JOptionPane.showMessageDialog( this,  "No hay datos para eliminar");
            txtcodigoRegion.setText("");
            txtRegion.setText("");
            return;
        }
        
        data.eliminarRegion(codigoRegion);
        txtcodigoRegion.setEditable(true);
        txtRegion.setEditable(true);
        
        txtcodigoRegion.setText("");
        txtRegion.setText("");
        
        mostrarRegiones();
        
    }//GEN-LAST:event_btnEliminarRegionActionPerformed

    private void btnEliminarDeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDeptoActionPerformed
        String codigoDepto = txtcodigoDepto.getText().trim();
        String nombreDepto = txtDepto.getText().trim();
        
        if( codigoDepto.isBlank() || 
            nombreDepto.isBlank()){
            JOptionPane.showMessageDialog( this,  "No hay datos para eliminar");
            txtcodigoDepto.setText("");
            txtDepto.setText("");
            return;
        }
        
        data.eliminarDepartamento(codigoDepto);
     
        txtcodigoDepto.setEditable(true);
        txtDepto.setEditable(true);
        
        txtcodigoDepto.setText("");
        txtDepto.setText("");
        
        CargarDepartamentos(listadoDeptosRegionSeleccionada);
    }//GEN-LAST:event_btnEliminarDeptoActionPerformed

    private void btnEliminarMuniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMuniActionPerformed
        String codigoMuni = txtCodigoMunicipio.getText().trim();
        int i = jTableMunicipios.getSelectedRow();
        String codigoCuatroCaracteres = jTableMunicipios.getValueAt(i, 0).toString();
        String nombreMuni = txtMunicipio.getText().trim();
        
        if( codigoMuni.isBlank() || 
            nombreMuni.isBlank()){
            JOptionPane.showMessageDialog( this,  "No hay datos para eliminar");
            txtCodigoMunicipio.setText("");
            txtMunicipio.setText("");
            return;
        }
        
        data.eliminarMunicipio(codigoCuatroCaracteres);
        txtCodigoMunicipio.setEditable(true);
        txtMunicipio.setEditable(true);
        
        txtCodigoMunicipio.setText("");
        txtMunicipio.setText("");
        
        ArrayList<CUbicacion> listaMunicipiosEnDepto = data.getListaMunicipios(codigoSelectedDepto);
        CargarMunicipios( listaMunicipiosEnDepto);
       
    }//GEN-LAST:event_btnEliminarMuniActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarDepto;
    private javax.swing.JButton btnAgregarMuni;
    private javax.swing.JButton btnAgregarRegion;
    private javax.swing.JButton btnEliminarDepto;
    private javax.swing.JButton btnEliminarMuni;
    private javax.swing.JButton btnEliminarRegion;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTableDepartamentos;
    private javax.swing.JTable jTableMunicipios;
    private javax.swing.JTable jTableRegiones;
    private javax.swing.JTextField txtCodigoMunicipio;
    private javax.swing.JTextField txtDepto;
    private javax.swing.JTextField txtMunicipio;
    private javax.swing.JTextField txtRegion;
    private javax.swing.JTextField txtcodigoDepto;
    private javax.swing.JTextField txtcodigoRegion;
    // End of variables declaration//GEN-END:variables
}
