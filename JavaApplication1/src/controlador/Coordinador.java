package controlador;

import interfaz.iLogin;
import modelo.Logica;


public class Coordinador {

    private iLogin login;
    private Logica miLogica;

    void setLogin(iLogin login) {
        this.login = login;
    }

    void setLogica(Logica miLogica) {
        this.miLogica = miLogica;
    }
    
    public String validarIngreso(String usuario, String contrasena){
        return miLogica.validarIngreso(usuario,contrasena);
    }

    public void cerrarVentanaLogin() {
        login.dispose();
    }

    public void asignarPrivilegios(String respuesta) {
        
    }

    
}
