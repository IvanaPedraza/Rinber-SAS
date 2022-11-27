package controlador;

import java.sql.Connection;
import interfaz.iLogin;
import interfaz.iVCorreo;
import interfaz.iVPVendedor;
import interfaz.iVRepre;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import modelo.Conexion;
import modelo.Logica;
import modelo.dao.correoDao;
import modelo.dao.representanteDao;


public class Coordinador {

    private iLogin login;
    private iVPVendedor ventanaPrincipal;
    private iVCorreo ventanaCorreo;
    private iVRepre ventanaRepresentante;
    private Logica miLogica;
    private Conexion miConexion;
    private correoDao miCorreoDao;
    private representanteDao miRepresentanteDao;
    private Connection miConexionActual;

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
    
    void setVentanaCorreo(iVCorreo icorreo) {
        this.ventanaCorreo = icorreo;
    }
    
    void setCorreoDao(correoDao miCorreoDao) {
        this.miCorreoDao = miCorreoDao;
    }
    
    void setVentanaRepresentante(iVRepre irepre_legal) {
        this.ventanaRepresentante = irepre_legal;
    }
    
    void setRepresentanteDao(representanteDao miRepresentanteDao) {
        this.miRepresentanteDao = miRepresentanteDao;
    }
    
    public String validarIngreso(String usuario, String contrasena){
        return miLogica.validarIngreso(usuario,contrasena);
    }

    public void cerrarVentanaLogin() {
        login.dispose();
    }

    //Apertura y cerrado de ventanas
    public void abrirVentanaPrincipal() {
        ventanaPrincipal.setVisible(true);
    }
    
    public void cerrarVentanaPrincipal() {
        ventanaPrincipal.setVisible(false);
    }
    
    public void abrirVentanaCorreo() {
        ventanaCorreo.setVisible(true);
        JTable tablaCorreo = ventanaCorreo.enviarTabla();
        mostrarCorreos(tablaCorreo);
        
    }

    public void cerrarVentanaCorreo() {
        ventanaCorreo.setVisible(false);
    }
    
    public void abrirVentanaRepresentante(){
        ventanaRepresentante.setVisible(true);
        JTable tablaRepresentante = ventanaRepresentante.enviarTabla();
        mostrarRepresentantes(tablaRepresentante);
        
    }
    
    public void cerrarVentanaRepresentante(){
        ventanaRepresentante.setVisible(false);
    }
    
    
    //Demas permisos
    
    public String darIngreso(String user, String password){
        String mensaje = "";
        try{
            miConexion.definirUsuarioContra(user, password);
            miConexion.Conexion();
            this.miConexionActual = miConexion.getConnection();
            mensaje = "Bienvenido";
        } catch (Exception e){
            mensaje = "Ha ocurrido un error, vuelva a intentar.";
        }
        return mensaje;
    }
    
    public Connection obtenerConexion(){
        
        return miConexion.getConnection();
    }
    
    public void mostrarCorreos(JTable table) {
        //System.out.println(miConexionActual);
    
        DefaultTableModel modelo = new DefaultTableModel();
        
        ResultSet rs = miCorreoDao.obtenerCorreos("select corCorreo, tipoCorreo from correo");
        modelo.setColumnIdentifiers(new Object[] {"corCorreo","tipoCorreo"});
        
        try{
            while(rs.next()){
                modelo.addRow(new Object[]{rs.getString("corCorreo"),rs.getString("tipoCorreo")});
                
            }
            table.setModel(modelo);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void mostrarRepresentantes(JTable table){
        DefaultTableModel modelo = new DefaultTableModel();
        
        ResultSet rs = miRepresentanteDao.obtenerRepresentantes("select repCedula, perNombre,perApellido, corCorreo, telNumero from vw_representante_legal");
        modelo.setColumnIdentifiers(new Object[] {"Cédula","Nombre","Apellido","Correo","Teléfono"});
        
        try{
            while(rs.next()){
                modelo.addRow(new Object[]{rs.getInt("repCedula"),rs.getString("perNombre"),rs.getString("perApellido"),rs.getString("corCorreo"),rs.getLong("telNumero")});
                
            }
            table.setModel(modelo);
        }catch(Exception e){
            System.out.println(e);
        }
    }

    

    
    

    
}
