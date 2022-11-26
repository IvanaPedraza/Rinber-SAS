package modelo;

import controlador.Coordinador;


public class Logica {
    
    
    private Coordinador miCoordinador;
    final String usuario_prueba = "kelly";
    final String contra_prueba = "12345";
    
    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
    }
    
    
    public String validarIngreso(String usuario, String contrasena){
        
        String retorno="";
        if(usuario.equals("") && contrasena.equals("")){
            retorno = "error";
        }else{
            if (usuario.equals(usuario_prueba)){
                retorno = validarContraseña(usuario,contrasena);
            }else{
                retorno = "Usuario inválido";
            }
        }
        return retorno;
        
    }

    private String validarContraseña(String usuario,String contrasena) {
        String retorno="";
        if(contrasena.equals(contra_prueba)){
            retorno = "Bienvenido(a) "+usuario; //aca debe ir la respuesta del que rol tiene el usuario
        }else{
            retorno = "Contraseña inválida";
        }
        return retorno;
    }
}
