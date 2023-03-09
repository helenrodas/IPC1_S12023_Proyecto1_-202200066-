/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author lenovo
 */
public class CTransaccion {
    String deptoOrigen;
    String municipioOrigen;
    String direccionOrigen;
    String deptoDestino;
    String municipioDestino;
    String direccionDestino;
    Integer paquetes;
    String size;
    String tipoPrecio;
    String tipoPago;
    String datosFacturacion;
    String total;
    String datosTarjeta;
    String cvv;
    String codigoEnvio;
    

   
    public CTransaccion(String deptoOrigen, String municipioOrigen, String direccionOrigen, String deptoDestino, String municipioDestino, String direccionDestino, String size, Integer paquetes,
                   String tipoPrecio, String tipoPago, String datosFacturacion, String total, String datosTarjeta, String cvv){
        
        this.deptoOrigen = deptoOrigen;
        this.municipioOrigen = municipioOrigen;
        this.direccionOrigen = direccionOrigen;
        this.deptoDestino = deptoDestino;
        this.municipioDestino = municipioDestino;
        this.direccionDestino = direccionDestino;
        this.paquetes = paquetes;
        this.size = size;
        this.tipoPrecio = tipoPrecio;
        this.tipoPago = tipoPago;
        this.datosFacturacion = datosFacturacion;
        this.total = total;
        this.datosTarjeta = datosTarjeta;
        this.cvv = cvv;        
        
    }

    public String getDeptoOrigen() {
        return deptoOrigen;
    }

    public void setDeptoOrigen(String deptoOrigen) {
        this.deptoOrigen = deptoOrigen;
    }

    public String getMunicipioOrigen() {
        return municipioOrigen;
    }

    public void setMunicipioOrigen(String municipioOrigen) {
        this.municipioOrigen = municipioOrigen;
    }

    public String getDireccionOrigen() {
        return direccionOrigen;
    }

    public void setDireccionOrigen(String direccionOrigen) {
        this.direccionOrigen = direccionOrigen;
    }

    public String getDeptoDestino() {
        return deptoDestino;
    }

    public void setDeptoDestino(String deptoDestino) {
        this.deptoDestino = deptoDestino;
    }

    public String getMunicipioDestino() {
        return municipioDestino;
    }

    public void setMunicipioDestino(String municipioDestino) {
        this.municipioDestino = municipioDestino;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public void setDireccionDestino(String direccionDestino) {
        this.direccionDestino = direccionDestino;
    }

    public Integer getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(Integer paquetes) {
        this.paquetes = paquetes;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
        public String getTipoPrecio() {
        return tipoPrecio;
    }

    public void setTipoPrecio(String tipoPrecio) {
        this.tipoPrecio = tipoPrecio;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getDatosFacturacion() {
        return datosFacturacion;
    }

    public void setDatosFacturacion(String datosFacturacion) {
        this.datosFacturacion = datosFacturacion;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getDatosTarjeta() {
        return datosTarjeta;
    }

    public void setDatosTarjeta(String datosTarjeta) {
        this.datosTarjeta = datosTarjeta;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getCodigoEnvio() {
        return codigoEnvio;
    }

    public void setCodigoEnvio(String codigoEnvio) {
        this.codigoEnvio = codigoEnvio;
    }
    
    
    
}

