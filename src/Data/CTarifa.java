/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author lenovo
 */
public class CTarifa {
    String codigo;
    String nombre;
    Double precioEstandar;
    Double precioEspecial;
    
    
    public CTarifa( String codigo, String  nombre, Double precioEstandar, Double precioEspecial){
        this.codigo=codigo;
        this.nombre=nombre;
        this.precioEstandar=precioEstandar;
        this.precioEspecial=precioEspecial;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecioEstandar() {
        return precioEstandar;
    }

    public void setPrecioEstandar(Double precioEstandar) {
        this.precioEstandar = precioEstandar;
    }

    public Double getPrecioEspecial() {
        return precioEspecial;
    }

    public void setPrecioEspecial(Double precioEspecial) {
        this.precioEspecial = precioEspecial;
    }
    
    
    
}
   
