/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author lenovo
 */
public class CKiosco {
    String codigoKiosco;
    String nombreKiosco;
    String regionKiosco;
    
    
    public CKiosco(String codigoKiosco, String nombreKiosco, String regionKiosco){
        this.codigoKiosco=codigoKiosco;
        this.nombreKiosco=nombreKiosco;
        this.regionKiosco=regionKiosco;
    }

    public String getCodigoKiosco() {
        return codigoKiosco;
    }

    public void setCodigoKiosco(String codigoKiosco) {
        this.codigoKiosco = codigoKiosco;
    }

    public String getNombreKiosco() {
        return nombreKiosco;
    }

    public void setNombreKiosco(String nombreKiosco) {
        this.nombreKiosco = nombreKiosco;
    }

    public String getRegionKiosco() {
        return regionKiosco;
    }

    public void setRegionKiosco(String regionKiosco) {
        this.regionKiosco = regionKiosco;
    }
    
 }

