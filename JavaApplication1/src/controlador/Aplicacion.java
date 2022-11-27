package controlador;

import interfaz.iLogin;
import interfaz.iVPVendedor;
import modelo.Conexion;

import modelo.Logica;
import interfaz.iVCorreo;
public class Aplicacion {
    
    public void iniciarSistema(){
        
        // se instancias las clases unicas
        iLogin login = new iLogin();

        iVPVendedor ventanaPrincipal = new iVPVendedor();
        iVPVendedor ventana = new iVPVendedor();
        iVCorreo icorreo= new iVCorreo();
        
        Coordinador miCoordinador = new Coordinador();
        Logica miLogica = new Logica();
        Conexion miConexion = new Conexion();
        
        // Relacionamos las clases coordinador
        miConexion.setCoordinador(miCoordinador);
        
        login.setCoordinador(miCoordinador);
        ventanaPrincipal.setCoordinador(miCoordinador);
        //se repite para todos las demas ventanas
        miLogica.setCoordinador(miCoordinador);
        
        
        //Relacionamos coordinador con las clases
        miCoordinador.setLogin(login);
        miCoordinador.setLogica(miLogica);
        miCoordinador.setVentanaPrincipal(ventanaPrincipal);
        miCoordinador.setConexion(miConexion);
        

        //login.setVisible(true);
        ventana.setVisible(true);
        //login.setVisible(true);
        
        //icorreo.setVisible(true);
    }
    
}
