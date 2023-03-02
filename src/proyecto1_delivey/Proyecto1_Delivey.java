/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto1_delivey;

import Data.*;
import Inicializar.FrmInicio;


/**
 *
 * @author lenovo
 */
public class Proyecto1_Delivey {
   //public class DatosUsuarios {
    
//}
   
    public static void main(String[] args) {
       
       Data data = new Data();
       data.InitRegiones();
       data.InitTarifas();
       data.InitUbicaciones();
        
        FrmInicio frmInicio = new FrmInicio(data);
        frmInicio.setLocationRelativeTo(null);
        frmInicio.setVisible(true);
  
    }
}
