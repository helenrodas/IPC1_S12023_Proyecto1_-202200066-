/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class CUsuario  implements Cloneable  {
    String correo;
    String nombre;
    String apellido;
    String password;
    String pwdVerificado;
    String dpi;
    String telefono;
    String fecha;
    String genero;
    String rol;
    String nacionalidad;
    String alias;
    String foto;
    String nit;
    private ArrayList<CTarjeta> ListaTarjetas;
    String kiosco;
    

    public CUsuario(String correo, String nombre, String apellido, String password, String pwdVerificado ,String dpi, String telefono, String fecha, 
            String genero, String rol, String nacionalidad, String kiosco ) {
        this.correo = correo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.password  = password;
        this.pwdVerificado = pwdVerificado;
        this.dpi = dpi;
        this.telefono=telefono;
        this.fecha=fecha;
        this.genero=genero;
        this.rol=rol;
        this.nacionalidad=nacionalidad;
        this.ListaTarjetas = new ArrayList<>();
        this.kiosco = kiosco;
       
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPwdVerificado() {
        return pwdVerificado;
    }

    public void setPwdVerificado(String pwdVerificado) {
        this.pwdVerificado = pwdVerificado;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }
    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
    
    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public ArrayList<CTarjeta> getListaTarjetas() {
        return ListaTarjetas;
    }

    public void setListaTarjetas(ArrayList<CTarjeta> ListaTarjetas) {
        this.ListaTarjetas = ListaTarjetas;
    }

    public String getKiosco() {
        return kiosco;
    }

    public void setKiosco(String kiosco) {
        this.kiosco = kiosco;
    }


    
    @Override
    public Object clone() throws CloneNotSupportedException{  
        return super.clone();  
    }  
}
