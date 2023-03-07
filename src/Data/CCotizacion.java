/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author lenovo
 */
public class CCotizacion {
    String deptoOrigen;
    String municipioOrigen;
    String direccionOrigen;
    String deptoDestino;
    String municipioDestino;
    String direccionDestino;
    Integer paquetes;
    String size;
    //Double precio;

   
    public CCotizacion(String deptoOrigen, String municipioOrigen, String direccionOrigen, String deptoDestino, String municipioDestino, String direccionDestino, String size, Integer paquetes ){
        
        this.deptoOrigen = deptoOrigen;
        this.municipioOrigen = municipioOrigen;
        this.direccionOrigen = direccionOrigen;
        this.deptoDestino = deptoDestino;
        this.municipioDestino = municipioDestino;
        this.direccionDestino = direccionDestino;
        this.paquetes = paquetes;
        this.size = size;
        //this.precio = precio;
        
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
}

