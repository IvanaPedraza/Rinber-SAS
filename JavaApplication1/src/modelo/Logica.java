package modelo;

import controlador.Coordinador;
import modelo.vo.direccionVo;


public class Logica {
    

    private Coordinador miCoordinador;
    //private Conexion miConexion;
    
    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
    }
    
    
    public String validarIngreso(String usuario, String contrasena){
        
   
        String retorno="";
        if(usuario.equals("") && contrasena.equals("")){
            retorno = "error";
        }else{
            
            retorno = miCoordinador.darIngreso(usuario, contrasena);

        }
        return retorno;
        
    }

    /*
    private String validarContraseña(String usuario,String contrasena) {
        String retorno="";
        if(contrasena.equals(contra_prueba)){
            retorno = "Bienvenido(a) "+usuario; //aca debe ir la respuesta del que rol tiene el usuario
        }else{
            retorno = "Contraseña inválida";
        }
        return retorno;
    }
    */

    public boolean validarCampos(direccionVo direccionActu) {
        boolean validarDireccion = false;
        boolean validarCiudad = false;
        boolean validarLocalidad = false;
        boolean validarBarrio = false;
        
        String direccion = direccionActu.getDirDireccion();
        String ciudad = direccionActu.getDirCiudad();
        String localidad = direccionActu.getDirLocalidad();
        String barrio = direccionActu.getDirBarrio();
        
        if(direccion!=null && !direccion.equals("")){
            validarDireccion = true;
        }
        
        if(ciudad!=null && !ciudad.equals("")){
            validarCiudad = true;
        }
        
        if(localidad!=null && !localidad.equals("")){
            validarLocalidad = true;
        }
        
        if(barrio!=null && !barrio.equals("")){
            validarBarrio = true;
        }
        
        if(validarDireccion==true && validarCiudad==true && validarLocalidad==true && validarBarrio==true){
            return true;
        }else{
            return false;
        }
            
    }

    
}
