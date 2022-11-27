package controlador;

import interfaz.iLogin;
import interfaz.iVPVendedor;
import modelo.Conexion;

import modelo.Logica;
import interfaz.iVCorreo;
import modelo.dao.correoDao;
public class Aplicacion {
    
    public void iniciarSistema(){
        
        // se instancias las clases unicas
        Conexion miConexion = new Conexion();
        iLogin login = new iLogin();
        iVPVendedor ventanaPrincipal = new iVPVendedor();
        iVCorreo icorreo= new iVCorreo();
        Coordinador miCoordinador = new Coordinador();
        Logica miLogica = new Logica();
        correoDao miCorreoDao = new correoDao();
        
        
        // Relacionamos las clases coordinador
        miConexion.setCoordinador(miCoordinador);
        login.setCoordinador(miCoordinador);
        ventanaPrincipal.setCoordinador(miCoordinador);
        icorreo.setCoordinador(miCoordinador);
        //se repite para todos las demas ventanas
        miLogica.setCoordinador(miCoordinador);
        miCorreoDao.setCoordinador(miCoordinador);
        
        
        //Relacionamos coordinador con las clases
        miCoordinador.setLogin(login);
        miCoordinador.setLogica(miLogica);
        miCoordinador.setVentanaPrincipal(ventanaPrincipal);
        miCoordinador.setVentanaCorreo(icorreo);
        miCoordinador.setConexion(miConexion);
        miCoordinador.setCorreoDao(miCorreoDao);

<<<<<<< HEAD
        
        icorreo.setVisible(false);
        login.setVisible(true);
        //ventana.setVisible(true);
=======
        //login.setVisible(true);
        ventana.setVisible(true);
>>>>>>> 2985e80c1eeb924dd20af2315e9f572c7ffdaa60
        //login.setVisible(true);
        
        //icorreo.setVisible(true);
        
    }
    
}
