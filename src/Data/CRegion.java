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
public class CRegion {
    String codigo;
    String nombre;
   private ArrayList<String> Departamentos;
    
    public CRegion(String codigo, String  nombre){
        this.codigo=codigo;
        this.nombre=nombre; 
        Departamentos=new ArrayList<>();
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

    public ArrayList<String> getDepartamentos() {
        return Departamentos;
    }

    public void setDepartamentos(ArrayList<String> Departamentos) {
        this.Departamentos = Departamentos;
    }
    
}
