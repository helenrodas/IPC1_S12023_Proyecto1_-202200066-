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
    private ArrayList<CTarjeta> Tarjetas;
    private CUsuario usuarioActual;
    
    public Data(){
       Usuarios=new ArrayList<>();
       Kioscos=new ArrayList<>();
       Tarifas=new ArrayList<>();
       Departamentos=new ArrayList<>();
       Municipios=new ArrayList<>();
       Regiones= new ArrayList<>();
       Tarjetas = new ArrayList<>();
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

    public ArrayList<CTarjeta> getTarjetas() {
        return Tarjetas;
    }

    public void setTarjetas(ArrayList<CTarjeta> Tarjetas) {
        this.Tarjetas = Tarjetas;
    }
    
    public CUsuario getUsuarioActual() {
        return usuarioActual;
    }

    public void setUsurioActual(CUsuario usuario) {
        this.usuarioActual = usuario;
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
    
    public String GetNombreUsuario(String correo){
    for (CUsuario usuario : Usuarios ) {
        if ( correo.equals(usuario.getCorreo())){
            return usuario.getNombre();
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
    public ArrayList<CUbicacion> getListaMunicipios( String codigoDepto){
        ArrayList<CUbicacion> listaMunicipios = new ArrayList<>();
        
        for (CUbicacion municipio : Municipios) {
            if( municipio.getCodigo().startsWith(codigoDepto)){
                listaMunicipios.add(municipio);
            }
        }
        
        return  listaMunicipios;
    }
    
    
    public void InitUbicaciones(){
        Departamentos.add(new CUbicacion("01", "Guatemala"));
        
        Municipios.add(new CUbicacion("0101","Guatemala"));
        Municipios.add(new CUbicacion("0102","Mixco"));
        Municipios.add(new CUbicacion("0103","Amatitlan"));
        Municipios.add(new CUbicacion("0104","Villa Nueva"));
        Municipios.add(new CUbicacion("0105","Palencia"));
               
        Departamentos.add(new CUbicacion("15", "Baja Verapaz"));
        
        Municipios.add(new CUbicacion("1501","Salama"));
        Municipios.add(new CUbicacion("1502","El Chol"));
        Municipios.add(new CUbicacion("1503","Rabinal"));
        Municipios.add(new CUbicacion("1504","Cubulco"));
        Municipios.add(new CUbicacion("1505","Granados"));
        
        Departamentos.add(new CUbicacion("02", "El progreso"));
       
        Municipios.add(new CUbicacion("0201","Guastatoya"));
        Municipios.add(new CUbicacion("0202","Morazan"));
        Municipios.add(new CUbicacion("0203","El Jicaro"));
        Municipios.add(new CUbicacion("0204","Sansare"));
        Municipios.add(new CUbicacion("0205","Sanarate"));
        
        Departamentos.add(new CUbicacion("22", "Jutiapa"));
        
        Municipios.add(new CUbicacion("2201","Comapa"));
        Municipios.add(new CUbicacion("2202","Jalpatagua"));
        Municipios.add(new CUbicacion("2203","Conguaco"));
        Municipios.add(new CUbicacion("2204","Moyuta"));
        Municipios.add(new CUbicacion("2205","Pasaco"));
        
        Departamentos.add(new CUbicacion("09", "Quetzaltenango"));
        
        Municipios.add(new CUbicacion("0901","Almolonga"));
        Municipios.add(new CUbicacion("0902","Cantel"));
        Municipios.add(new CUbicacion("0903","Huitan"));
        Municipios.add(new CUbicacion("0904","Zunil"));
        Municipios.add(new CUbicacion("0905","Colomba"));

        Departamentos.add(new CUbicacion("14", "Quiche"));
        
        Municipios.add(new CUbicacion("1401","Chiche"));
        Municipios.add(new CUbicacion("1402","Chinique"));
        Municipios.add(new CUbicacion("1403","Zacualpa"));
        Municipios.add(new CUbicacion("1404","Chajul"));
        Municipios.add(new CUbicacion("1405","Pachalum"));
                        
    }
        
    public void Init(){
        InitRegiones();
        InitTarifas();
       InitUbicaciones();
    }
      
    //--seccion regiones
    public void InitRegiones(){
        //Metropolitana
        ArrayList<String> listaDeptosMetro = new ArrayList<>();  
        listaDeptosMetro.add("01"); //guate
            
        CRegion region = new CRegion("M", "Metropolitana"); 
        region.setListaCodigoDeptos(listaDeptosMetro);
        
        Regiones.add(region);

        
        //norte
        ArrayList<String> listaDeptosNorte = new ArrayList<>();
        listaDeptosNorte.add("15"); // Baja Verapaz
        
        region = new CRegion("NT", "Norte");
        region.setListaCodigoDeptos(listaDeptosNorte);
        
        Regiones.add(region);
     
        
        //nororiente
        ArrayList<String> listaDeptosNororiente = new ArrayList<>();
        listaDeptosNororiente.add("02"); //El Progreso
        
        region = new CRegion("NO", "Nororiente");
        region.setListaCodigoDeptos(listaDeptosNororiente);
        
        Regiones.add(region);
        
        
        //Suroriente
        ArrayList<String> listaDeptosSuroriente = new ArrayList<>();
        listaDeptosSuroriente.add("22"); //Jutiapa
        
        region = new CRegion("SO", "Suroriente");
        region.setListaCodigoDeptos(listaDeptosSuroriente);
        
        Regiones.add(region);
        
        
        //Suroccidente
        ArrayList<String> listaDeptosSuroccidente = new ArrayList<>();
        listaDeptosSuroccidente.add("09"); //Quetzaltenango
        
        region = new CRegion("SOC", "Suroccidente");
        region.setListaCodigoDeptos(listaDeptosSuroccidente);
        
        Regiones.add(region);
        
        
        //Noroccidente
        ArrayList<String> listaDeptosNoroccidente = new ArrayList<>();
        listaDeptosNoroccidente.add("14"); //Quiche
        
        region = new CRegion("NOC", "Noroccidente");
        region.setListaCodigoDeptos(listaDeptosNoroccidente);
        
        Regiones.add(region);
        
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
