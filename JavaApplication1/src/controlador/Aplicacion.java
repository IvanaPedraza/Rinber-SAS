package controlador;

import interfaz.iLogin;
import interfaz.iVPVendedor;
import modelo.Conexion;

import modelo.Logica;
import interfaz.iVCorreo;
import interfaz.iVDireccion;
import interfaz.iVEmpresae;
import interfaz.iVProveedor;
import interfaz.iVRepre;
import interfaz.iVTelefono;
import modelo.dao.correoDao;
import modelo.dao.representanteDao;
import modelo.dao.telefonoDao;
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
        iVTelefono itelefono = new iVTelefono();
        iVDireccion idireccion = new iVDireccion();
        iVEmpresae iempresae = new iVEmpresae();
        iVProveedor iproveedor = new iVProveedor();
        
        //Clases y demas
        Coordinador miCoordinador = new Coordinador();
        Logica miLogica = new Logica();
        correoDao miCorreoDao = new correoDao();
        representanteDao miRepresentanteDao = new representanteDao();
        telefonoDao miTelefonoDao = new telefonoDao();
        
        // Relacionamos las clases coordinador
        miConexion.setCoordinador(miCoordinador);
        login.setCoordinador(miCoordinador);
        ventanaPrincipal.setCoordinador(miCoordinador);
        icorreo.setCoordinador(miCoordinador);
        irepre_legal.setCoordinador(miCoordinador);
        itelefono.setCoordinador(miCoordinador);
        
        //se repite para todos las demas ventanas
        miLogica.setCoordinador(miCoordinador);
        miCorreoDao.setCoordinador(miCoordinador);
        miRepresentanteDao.setCoordinador(miCoordinador);
        miTelefonoDao.setMiCoordinador(miCoordinador);
        
        //Relacionamos coordinador con las clases
        miCoordinador.setLogin(login);
        miCoordinador.setLogica(miLogica);
        miCoordinador.setVentanaPrincipal(ventanaPrincipal);
        miCoordinador.setVentanaCorreo(icorreo);
        miCoordinador.setCorreoDao(miCorreoDao);
        miCoordinador.setVentanaRepresentante(irepre_legal);
        miCoordinador.setRepresentanteDao(miRepresentanteDao);
        miCoordinador.setVentanaTelefono(itelefono);
        miCoordinador.setTelefonoDao(miTelefonoDao);
        
        //Conexion
        miCoordinador.setConexion(miConexion);
        

        
        //login.setVisible(true);
        //ventanaPrincipal.setVisible(true);
        //idireccion.setVisible(true);
        //login.setVisible(true);
        //iempresae.setVisible(true);
        //login.setVisible(true);
        iproveedor.setVisible(true);
        //icorreo.setVisible(true);
        
    }
    
}
