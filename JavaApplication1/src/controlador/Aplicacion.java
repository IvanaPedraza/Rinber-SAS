package controlador;

import interfaz.iLogin;
import interfaz.iVPVendedor;
import modelo.Conexion;

import modelo.Logica;
import interfaz.iVCorreo;
import interfaz.iVRepre;
import modelo.dao.correoDao;
import modelo.dao.representanteDao;
public class Aplicacion {
    
    public void iniciarSistema(){
        
        // se instancias las clases unicas
        //Conexion
        Conexion miConexion = new Conexion();
        //Interfaces
        iLogin login = new iLogin();
        iVPVendedor ventanaPrincipal = new iVPVendedor();
        iVCorreo icorreo= new iVCorreo();
        iVRepre irepre_legal = new iVRepre();
        
        //Clases y demas
        Coordinador miCoordinador = new Coordinador();
        Logica miLogica = new Logica();
        correoDao miCorreoDao = new correoDao();
        representanteDao miRepresentanteDao = new representanteDao();
        
        // Relacionamos las clases coordinador
        miConexion.setCoordinador(miCoordinador);
        login.setCoordinador(miCoordinador);
        ventanaPrincipal.setCoordinador(miCoordinador);
        icorreo.setCoordinador(miCoordinador);
        irepre_legal.setCoordinador(miCoordinador);
        //se repite para todos las demas ventanas
        miLogica.setCoordinador(miCoordinador);
        miCorreoDao.setCoordinador(miCoordinador);
        miRepresentanteDao.setCoordinador(miCoordinador);
        
        //Relacionamos coordinador con las clases
        miCoordinador.setLogin(login);
        miCoordinador.setLogica(miLogica);
        miCoordinador.setVentanaPrincipal(ventanaPrincipal);
        miCoordinador.setVentanaCorreo(icorreo);
        miCoordinador.setCorreoDao(miCorreoDao);
        miCoordinador.setVentanaRepresentante(irepre_legal);
        miCoordinador.setRepresentanteDao(miRepresentanteDao);
        
        //Conexion
        miCoordinador.setConexion(miConexion);
        

        
        login.setVisible(true);
        //ventana.setVisible(true);

        //login.setVisible(true);
     
        //login.setVisible(true);
        
        //icorreo.setVisible(true);
        
    }
    
}
