/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Inicializar;

//import Administrador.CKiosco;
import Data.*;
//import Data.CUsuario;
//import Data.CKiosco;
import Administrador.FrmAdmin;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JOptionPane;
//import javax.swing.JFrame;
/**

 * @author lenovo
 */
public class FrmAutenticacion extends javax.swing.JFrame {
//    private ArrayList<CUsuario> Usuarios = null;
//    public ArrayList<CKiosco> Kioscos = new ArrayList();
//    public ArrayList<CRegiones> Regiones = new ArrayList();
    
    //public ArrayList<CKiosco> Kioscos = new ArrayList();
     // FrmRegistroUsuario ru;
    Data data;
    
    public FrmAutenticacion(Data data) {
        //Usuarios = Users;
       // Kioscos=kioscos;
        initComponents();
        // initRegiones();
        this.data=data;
        this.setTitle("Autenticacion");
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();
        jColorChooser3 = new javax.swing.JColorChooser();
        Autenticacion = new javax.swing.JPanel();
        lbCorreo = new javax.swing.JLabel();
        lbpassword = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        txtPwd = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));
        setForeground(new java.awt.Color(255, 204, 204));

        Autenticacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbCorreo.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        lbCorreo.setText("Correo electronico:");

        lbpassword.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        lbpassword.setText("Clave:");
        lbpassword.setMaximumSize(new java.awt.Dimension(96, 17));

        txtCorreo.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N

        btnIngresar.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AutenticacionLayout = new javax.swing.GroupLayout(Autenticacion);
        Autenticacion.setLayout(AutenticacionLayout);
        AutenticacionLayout.setHorizontalGroup(
            AutenticacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AutenticacionLayout.createSequentialGroup()
                .addGroup(AutenticacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AutenticacionLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(AutenticacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbCorreo)
                            .addComponent(lbpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(AutenticacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(txtPwd)))
                    .addGroup(AutenticacionLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        AutenticacionLayout.setVerticalGroup(
            AutenticacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AutenticacionLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(AutenticacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(AutenticacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnIngresar)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Autenticacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Autenticacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
        String correo = txtCorreo.getText();
        char [] pwd = txtPwd.getPassword();
        String pwdAsString = String.valueOf(pwd);
        String correoAdmin="123";
        String pwdAdmin = "123";

        
       
        if( correo.isBlank() || pwdAsString.isBlank() ){
            JOptionPane.showMessageDialog( this,  "Correo y clave son campos obligatorios");
            txtCorreo.setText("");
            txtPwd.setText("");
            txtCorreo.requestFocus();
            return;
        }
        
        //--validamos admin
        if( correo.equals(correoAdmin) && pwdAsString.equals(pwdAdmin)){ 
            //JOptionPane.showMessageDialog( this,  "Bienvenida Admin!");
           FrmAdmin frmAdmin = new FrmAdmin(data);
           frmAdmin.setDefaultCloseOperation(FrmAdmin.DISPOSE_ON_CLOSE);
            frmAdmin.setLocationRelativeTo(null);
            frmAdmin.setVisible(true);
            this.setVisible(false);
        }
        
        //otros usuarios...
        else{
            CUsuario usuario = data.GetUsuario(correo, pwdAsString);
            
            if (usuario == null){
                JOptionPane.showMessageDialog( this,  "Usuario no encontrado!");
                return;
            }
            
            //si encontro al usuraio!!
            //JOptionPane.showMessageDialog( this,  "Usuario encontrado!");

            String rol = usuario.getRol();
            
           JOptionPane.showMessageDialog( this,  "Rol encontreado: ".concat(rol));

            switch (rol) {
                case "Kiosco":
                    JOptionPane.showMessageDialog( this,  "Bienvenido a kiosco!");
                    break;
                case "Usuario Individual":
                   // JOptionPane.showMessageDialog( this,  "Bienvenido a Usuario Individual!");
                    FrmUser frmUser = new FrmUser(data);
                    frmUser.setDefaultCloseOperation(FrmUser.DISPOSE_ON_CLOSE);
                    frmUser.setLocationRelativeTo(null);
                    frmUser.setVisible(true);
                    this.setVisible(false);
                    break;
                case "Usuario Empresarial":
                    //JOptionPane.showMessageDialog( this,  "Bienvenido a Usuario Empresarial!");
                    FrmAdmin frmAdmin = new FrmAdmin(data);
                    frmAdmin.setDefaultCloseOperation(FrmAdmin.DISPOSE_ON_CLOSE);
                    frmAdmin.setLocationRelativeTo(null);
                    frmAdmin.setVisible(true);
                    this.setVisible(false);
                    break;
                default:
                    JOptionPane.showMessageDialog( this,  "Rol desconocido:".concat(rol) );
                    break;
            }
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

        
//    private void initRegiones(){
//        //CRegiones region = new CRegiones( "Metropolitana", "15", "10" );
//        
//        Regiones.add(new CRegiones("Norte","20", "40"));
//        Regiones.add(new CRegiones("Sur","20", "40"));
//        Regiones.add(new CRegiones("Central","20", "40"));
//        
//    }
    
//    private CUsuario GetUsuario(String correo, String clave){
//        for (CUsuario usuario : Usuarios ) {
//            if ( correo.equals(Usuario.getCorreo()) && clave.equals(Usuario.getPassword())  ){
//                return Usuario;
//            }
//        }
//        return null;
//    }
    
    @Override
    public Graphics getGraphics() {
        return super.getGraphics(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

//    public void windowClosing(java.awt.event.ActionEvent evt){
//        JOptionPane.showMessageDialog( this,  "test");
//        
//    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Autenticacion;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JColorChooser jColorChooser3;
    private javax.swing.JLabel lbCorreo;
    private javax.swing.JLabel lbpassword;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JPasswordField txtPwd;
    // End of variables declaration//GEN-END:variables


}
