package controlador;

import interfaz.iLogin;
import interfaz.iVCatalogo;
import interfaz.iVCliente;
import interfaz.iVPVendedor;
import modelo.Conexion;

import modelo.Logica;
import interfaz.iVCorreo;
import interfaz.iVDireccion;
import interfaz.iVDirectorio;
import interfaz.iVEmpresae;
import interfaz.iVEnvio;
import interfaz.iVGerente;
import interfaz.iVProducto;
import interfaz.iVProveedor;
import interfaz.iVRepartidor;
import interfaz.iVRepre;
import interfaz.iVSolicitudes;
import interfaz.iVTelefono;
import modelo.dao.correoDao;
import modelo.dao.direccionDao;
import modelo.dao.empresaeDao;
import modelo.dao.representanteDao;
import modelo.dao.solicitudProdDao;
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
        iVGerente igerente = new iVGerente();
        iVCliente icliente = new iVCliente();
        iVRepartidor irepartidor = new iVRepartidor();
        iVSolicitudes isolicitudes = new iVSolicitudes();
        iVEnvio ienvio = new iVEnvio();
        iVProducto iproducto = new iVProducto();
        iVDirectorio idirectorio =new iVDirectorio();
        iVCatalogo icatalogo = new iVCatalogo();
        
        //Clases y demas
        Coordinador miCoordinador = new Coordinador();
        Logica miLogica = new Logica();
        correoDao miCorreoDao = new correoDao();
        representanteDao miRepresentanteDao = new representanteDao();
        telefonoDao miTelefonoDao = new telefonoDao();
        direccionDao miDireccionDao = new direccionDao();

        empresaeDao miEmpresaeDao = new empresaeDao();

        solicitudProdDao miSolicitudProdDao = new solicitudProdDao();
 
        
        // Relacionamos las clases coordinador
        miConexion.setCoordinador(miCoordinador);
        login.setCoordinador(miCoordinador);
        ventanaPrincipal.setCoordinador(miCoordinador);
        icorreo.setCoordinador(miCoordinador);
        irepre_legal.setCoordinador(miCoordinador);
        itelefono.setCoordinador(miCoordinador);
        idireccion.setCoordinador(miCoordinador);
 
        iempresae.setCoordinador(miCoordinador);

        isolicitudes.setCoordinador(miCoordinador);
 
        
        //se repite para todos las demas ventanas
        miLogica.setCoordinador(miCoordinador);
        miCorreoDao.setCoordinador(miCoordinador);
        miRepresentanteDao.setCoordinador(miCoordinador);
        miTelefonoDao.setCoordinador(miCoordinador);
        miDireccionDao.setCoordinador(miCoordinador);
 
        miEmpresaeDao.setCoordinador(miCoordinador);

        miSolicitudProdDao.setCoordinador(miCoordinador);
 
        
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
        miCoordinador.setVentanaDireccion(idireccion);
        miCoordinador.setDireccionDao(miDireccionDao);
 
        miCoordinador.setEmpresaeDao(miEmpresaeDao);

        miCoordinador.setVentanaSolicitud(isolicitudes);
        miCoordinador.setSolicitudProdDao(miSolicitudProdDao);
 
        
        //Conexion
        miCoordinador.setConexion(miConexion);
        

        
        //login.setVisible(true);
        //ventanaPrincipal.setVisible(true);
        //idireccion.setVisible(true);

        //login.setVisible(true);
        //login.setVisible(true);
        //iempresae.setVisible(true);
        //iempresae.setVisible(true);

        //login.setVisible(true);
        // iproveedor.setVisible(true);
        //login.setVisible(true);
        // iproveedor.setVisible(true);



        login.setVisible(true);
        //iproveedor.setVisible(true);

        //icorreo.setVisible(true);
        //igerente.setVisible(true);
        
        //irepre_legal.setVisible(true);
        //icliente.setVisible(true);

        //irepartidor.setVisible(true);

    }
}
