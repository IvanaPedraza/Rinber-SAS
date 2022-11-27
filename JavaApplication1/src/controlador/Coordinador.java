package controlador;

import interfaz.iLogin;
import interfaz.iVPVendedor;
import modelo.Conexion;
import modelo.Logica;


public class Coordinador {

    private iLogin login;
    private iVPVendedor ventanaPrincipal;
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
    
    void setVentanaPrincipal(iVPVendedor ventanaPrincipal){
        this.ventanaPrincipal = ventanaPrincipal;
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

    public void abrirVentanaPrincipal() {
        ventanaPrincipal.setVisible(true);
    }
    
    public String darIngreso(String user, String password){
        String mensaje = "";
        try{
            miConexion.definirUsuarioContra(user, password);
            mensaje = "Bienvenido";
        } catch (Exception e){
            mensaje = "Ha ocurrido un error, vuelva a intentar.";
        }
        return mensaje;
    }

    
}
