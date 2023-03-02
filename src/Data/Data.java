/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class Data {
    
    private ArrayList<CUsuario> Usuarios;
    private ArrayList<CKiosco> Kioscos;
    private ArrayList<CTarifa> Tarifas;
    private ArrayList<CUbicacion> Departamentos;
    private ArrayList<CUbicacion> Municipios;
    private ArrayList<CRegion> Regiones;
    
    public Data(){
       Usuarios=new ArrayList<>();
       Kioscos=new ArrayList<>();
       Tarifas=new ArrayList<>();
       Departamentos=new ArrayList<>();
       Municipios=new ArrayList<>();
       Regiones= new ArrayList<>();
    }    

    public ArrayList<CUsuario> getUsuarios() {
        return Usuarios;
    }

    public void setUsuarios(ArrayList<CUsuario> Usuarios) {
        this.Usuarios = Usuarios;
    }

    public ArrayList<CKiosco> getKioscos() {
        return Kioscos;
    }

    public void setKioscos(ArrayList<CKiosco> Kioscos) {
        this.Kioscos = Kioscos;
    }

    public ArrayList<CTarifa> getTarifas() {
        return Tarifas;
    }

    public void setTarifas(ArrayList<CTarifa> Tarifas) {
        this.Tarifas = Tarifas;
    }
    
    public ArrayList<CUbicacion> getDepartamentos() {
        return Departamentos;
    }

    public void setDepartamentos(ArrayList<CUbicacion> Departamentos) {
        this.Departamentos = Departamentos;
    }
    
    public ArrayList<CUbicacion> getMunicipios() {
        return Municipios;
    }

    public void setMunicipios(ArrayList<CUbicacion> Municipios) {
        this.Municipios = Municipios;
    }

    public ArrayList<CRegion> getRegiones() {
        return Regiones;
    }

    public void setRegiones(ArrayList<CRegion> Regiones) {
        this.Regiones = Regiones;
    }
    
    
    //--Seccion Usuario
    public CUsuario GetUsuario(String correo, String clave){
        for (CUsuario usuario : Usuarios ) {
            if ( correo.equals(usuario.getCorreo()) && clave.equals(usuario.getPassword())  ){
                return usuario;
            }
        }
        return null;
    }
    
    //--Seccion Tarifas
    
    public void eliminarTarifas(Double precioEstandar, Double precioEspecial){
        
        for (int i = 0; i < Tarifas.size(); i++) {
            if(precioEstandar.equals(Tarifas.get(i).getPrecioEstandar())){
            Tarifas.remove(i);
            }
        }
    }
    
    public void actualizarTarifas(String currentRegion,Double precioEspecialAsDouble, Double precioEstandarAsDouble){
        
        for (int i = 0; i < Tarifas.size(); i++) { //recorrer todas la regions en el array
            CTarifa region = Tarifas.get(i);
                
            //regionNombre = region.getNombre();
            
            if( currentRegion.equals(region.getNombre())) { //si encuentra la region que busco entrar al if
                region.setPrecioEspecial(precioEspecialAsDouble);
                region.setPrecioEstandar(precioEstandarAsDouble);
            }
        }
    }
    
        public void InitTarifas(){
        Tarifas.add(new CTarifa("M","Metropolitana", 35.00, 25.00));
        Tarifas.add(new CTarifa("NT","Norte", 68.50, 45.55));
        Tarifas.add(new CTarifa("NO","Nororiente", 58.68, 35.48));
        Tarifas.add(new CTarifa("SO","Suroriente", 38.68, 32.48));
        Tarifas.add(new CTarifa("SOC","Suroccidente", 34.00, 29.00));
        Tarifas.add(new CTarifa("NOC","Noroccidente", 44.50, 40.00));
        }
       
        
    //--Seccion kioscos--
    public boolean  existeKiosco( String codigo, String nombre){
        for (CKiosco kiosco : Kioscos) {
            if ( codigo.equalsIgnoreCase(kiosco.getCodigoKiosco()) && 
                 nombre.equalsIgnoreCase(kiosco.getNombreKiosco()) ){
                return true;
            }
        }
        return false;
    }    
    public void eliminarKiosco( String codigo ) {
         for (int i = 0; i < Kioscos.size(); i++) {
             if(codigo.equals(Kioscos.get(i).getCodigoKiosco())){
                 Kioscos.remove(i);
             }
         }
     }

    public void actualizarKiosco(String codigoKiosco, String nombreKiosco, String nombreRegion ){
         for (int i = 0; i < Kioscos.size(); i++) {
             if(codigoKiosco.equals(Kioscos.get(i).getCodigoKiosco())){
                 //Kioscos.get(i).setCodigoKiosco(txtCodigoKiosco.getText());
                 Kioscos.get(i).setNombreKiosco(nombreKiosco);
                 Kioscos.get(i).setRegionKiosco(nombreRegion);         
            }
         }
     }
    
    
    //--Seccion Ubicaciones--
    
    public void InitUbicaciones(){
        Departamentos.add(new CUbicacion("01", "Guatemala"));
        Municipios.add(new CUbicacion("0101","Mixco"));
        
        Departamentos.add(new CUbicacion("02", "Sacatepequez"));
        Municipios.add(new CUbicacion("0201","Nebaj"));
        
        Departamentos.add(new CUbicacion("03", "Quiche"));
        
    }
    
    
    //--seccion regiones
    public void InitRegiones(){
        ArrayList<String> listaDeptosMetro = new ArrayList<>();  //regMetropolitana.getDepartamentos();
        listaDeptosMetro.add("01"); //guate
        listaDeptosMetro.add("02"); //sacatepequez
     
        CRegion region = new CRegion("M", "Metropolitana"); 
        region.setListaCodigoDeptos(listaDeptosMetro);

        Regiones.add(region);

        
        //norte
        ArrayList<String> listaDeptosNorte = new ArrayList<>();
        listaDeptosNorte.add("03");
        listaDeptosNorte.add("04");
        
        region = new CRegion("NT", "Norte");
        region.setListaCodigoDeptos(listaDeptosNorte);
        
        Regiones.add(region);
     
        
//        Regiones.add(new CRegion("NT", "Norte"));
//        Regiones.add(new CRegion("NO","Nororiente"));
//        Regiones.add(new CRegion("SO","Suroriente"));
//        Regiones.add(new CRegion("SOC","Suroccidente"));
//        Regiones.add(new CRegion("NOC","Noroccidente"));
    }
    
     public CRegion GetRegion(String codigo){
        for (CRegion region : Regiones ) {
            if ( codigo.equals(region.getCodigo()) ){
                return region;
            }
        }
        return null;
    }
    
    
}
