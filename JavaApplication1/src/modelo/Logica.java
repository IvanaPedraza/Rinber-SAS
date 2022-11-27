package modelo;

import controlador.Coordinador;


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
}
