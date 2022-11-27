package controlador;

import interfaz.iLogin;
import modelo.Conexion;
import modelo.Logica;


public class Coordinador {

    private iLogin login;
    private Logica miLogica;
    private Conexion miConexion;

    void setLogin(iLogin login) {
        this.login = login;
    }

    void setLogica(Logica miLogica) {
        this.miLogica = miLogica;
    }
    
    void setConexion(Conexion miConexion){
        this.miConexion = miConexion;
    }
    
    public String validarIngreso(String usuario, String contrasena){
        return miLogica.validarIngreso(usuario,contrasena);
    }

    public void cerrarVentanaLogin() {
        login.dispose();
    }

    public void asignarPrivilegios(String usuario) {
        //ventaja de inicio.asignarPrivilegios(usuario);
    }

    
}
