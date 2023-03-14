/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author lenovo
 */
public class CReportesAdmin {
    String regionesConMasEnvios;
    String totalPaquetes;
    String totalIngresos;
    String usuariosConMasPaquetes;

    public CReportesAdmin(String regionesConMasEnvios, String totalPaquetes, String totalIngresos, String usuariosConMasPaquetes) {
        this.regionesConMasEnvios = regionesConMasEnvios;
        this.totalPaquetes = totalPaquetes;
        this.totalIngresos = totalIngresos;
        this.usuariosConMasPaquetes = usuariosConMasPaquetes;
    }

    public String getRegionesConMasEnvios() {
        return regionesConMasEnvios;
    }

    public void setRegionesConMasEnvios(String regionesConMasEnvios) {
        this.regionesConMasEnvios = regionesConMasEnvios;
    }

    public String getTotalPaquetes() {
        return totalPaquetes;
    }

    public void setTotalPaquetes(String totalPaquetes) {
        this.totalPaquetes = totalPaquetes;
    }

    public String getTotalIngresos() {
        return totalIngresos;
    }

    public void setTotalIngresos(String totalIngresos) {
        this.totalIngresos = totalIngresos;
    }

    public String getUsuariosConMasPaquetes() {
        return usuariosConMasPaquetes;
    }

    public void setUsuariosConMasPaquetes(String usuariosConMasPaquetes) {
        this.usuariosConMasPaquetes = usuariosConMasPaquetes;
    }
    
    
}
