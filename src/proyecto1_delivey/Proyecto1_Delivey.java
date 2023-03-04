/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto1_delivey;

import Data.*;

import Inicializar.FrmInicio;
import Usuario.FrmUser;


/**
 *
 * @author lenovo
 */
public class Proyecto1_Delivey {
   
    public static void main(String[] args) {
       
       Data data = new Data();
        
       data.Init();
        
//        FrmInicio frmInicio = new FrmInicio(data);
//        frmInicio.setLocationRelativeTo(null);
//        frmInicio.setVisible(true);

          FrmUser frmUser = new FrmUser(data);
          frmUser.setDefaultCloseOperation(FrmUser.DISPOSE_ON_CLOSE);
          frmUser.setLocationRelativeTo(null);
          frmUser.setVisible(true);

    }
}
