package controlador;

import java.sql.Connection;
import interfaz.iLogin;
import interfaz.iVCliente;
import interfaz.iVCorreo;
import interfaz.iVDireccion;
import interfaz.iVEmpresae;
import interfaz.iVGerente;
import interfaz.iVPVendedor;
import interfaz.iVProveedor;
import interfaz.iVRepartidor;
import interfaz.iVRepre;
import interfaz.iVSolicitudes;
import interfaz.iVTelefono;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import modelo.Conexion;
import modelo.Logica;
import modelo.dao.clienteDao;
import modelo.dao.correoDao;
import modelo.dao.direccionDao;
import modelo.dao.empresaeDao;
import modelo.dao.gerenteDao;
import modelo.dao.proveedorDao;
import modelo.dao.repartidorDao;
import modelo.dao.representanteDao;
import modelo.dao.solicitudProdDao;
import modelo.dao.telefonoDao;
import modelo.vo.direccionVo;


public class Coordinador {

    private iLogin login;
    private iVPVendedor ventanaPrincipal;
    private iVCorreo ventanaCorreo;
    private iVRepre ventanaRepresentante;
    private iVTelefono ventanaTelefono;
    private iVDireccion ventanaDireccion;
    private iVEmpresae  ventanaEmpresae;
    private iVSolicitudes ventanaSolicitudProd;
    private iVProveedor ventanaProveedor;
    private iVCliente ventanaCliente;
    private iVRepartidor ventanaRepartidor;
    private iVGerente ventanaGerente;
    

    
    private correoDao miCorreoDao;
    private representanteDao miRepresentanteDao;
    private telefonoDao miTelefonoDao;
    private direccionDao miDireccionDao;

    private empresaeDao miEmpresaeDao;
    private clienteDao miClienteDao;


    private repartidorDao miRepartidorDao;
    private gerenteDao miGerenteDao;
    

    private solicitudProdDao miSolicitudProdDao;
    private proveedorDao miProveedorDao;

    private Logica miLogica;
    private Connection miConexionActual;
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
    
    void setVentanaTelefono(iVTelefono itelefono) {
        this.ventanaTelefono = itelefono;
    }
    
    void setTelefonoDao(telefonoDao miTelefonoDao){
        this.miTelefonoDao = miTelefonoDao;
    }
    
    void setVentanaDireccion(iVDireccion idireccion) {
        this.ventanaDireccion = idireccion;
    }

    void setDireccionDao(direccionDao miDireccionDao) {
        this.miDireccionDao = miDireccionDao;
        
    }
    
    void setVentanaEmpresae(iVEmpresae iempresae) {
        this.ventanaEmpresae = iempresae;
    }
    

    void setEmpresaeDao(empresaeDao miEmpresaeDao) {
        this.miEmpresaeDao = miEmpresaeDao;
    }
    
    

    void setVentanaSolicitud(iVSolicitudes solicitudes) {
        this.ventanaSolicitudProd = solicitudes;
    }

    void setSolicitudProdDao(solicitudProdDao miSolicitudProdDao) {
        this.miSolicitudProdDao = miSolicitudProdDao;
        
        
    }
    
    
    
     void setVentanaProveedor(iVProveedor iproveedor) {
        this.ventanaProveedor = iproveedor;
    }
    
    void setProveedorDao(proveedorDao miProveedorDao) {
        this.miProveedorDao = miProveedorDao;
    }
    

    void setVentanaCliente(iVCliente icliente) {
        this.ventanaCliente = icliente;
    }

    void setClienteDao(clienteDao miClienteDao) {
        this.miClienteDao = miClienteDao;
    }
    
    void setVentanaRepartidor(iVRepartidor irepartidor) {
        this.ventanaRepartidor = irepartidor;
    }
    
    void setRepartidorDao(repartidorDao miRepartidorDao) {
        this.miRepartidorDao = miRepartidorDao;

    }

   void setVentanaGerente(iVGerente igerente) {
        this.ventanaGerente = igerente;
    }
    
    void setGerenteDao(gerenteDao miGerenteDao) {
        this.miGerenteDao = miGerenteDao;
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
    
    public void abrirVentanaTelefono(){
        ventanaTelefono.setVisible(true);
        JTable tablaTelefono = ventanaTelefono.enviarTabla();
        mostrarTelefono(tablaTelefono);
        
    }
    
    public void cerrarVentanaTelefono(){
        ventanaTelefono.setVisible(false);
    }
    
    public void abrirVentanaDireccion(){
        
        ventanaDireccion.setVisible(true);
        abrirDireccionPanLeer();
        cerrarDireccionPanActualizar();
        cerrarDireccionPanAgregar();
        cerrarDireccionPanEliminar();
        JTable tablaDireccionLeer = ventanaDireccion.enviarTabla_Leer();
        mostrarDireccionesLeer(tablaDireccionLeer);
    }
    
    public void cerrarVentanaDireccion(){
        ventanaDireccion.setVisible(false);
    }
    
    public void abrirDireccionPanLeer(){
        ventanaDireccion.enviarPanelLeer().setVisible(true);
        JTable tablaDireccionLeer = ventanaDireccion.enviarTabla_Leer();
        mostrarDireccionesLeer(tablaDireccionLeer);
    }
    
    public void cerrarDireccionPanLeer(){
        ventanaDireccion.enviarPanelLeer().setVisible(false);
    }
    
    public void abrirDireccionPanActualizar(){
        ventanaDireccion.enviarPanelActualizar().setVisible(true);
        JComboBox comboDireccionesActu = ventanaDireccion.enviarComboDireccionesAct();
        llenarComboDirecAct(comboDireccionesActu);
    }
    
    public void cerrarDireccionPanActualizar(){
        ventanaDireccion.enviarPanelActualizar().setVisible(false);
    }
    
    public void abrirDireccionPanAgregar(){
        ventanaDireccion.enviarPanelAgregar().setVisible(true);
    }
    
    public void cerrarDireccionPanAgregar(){
        ventanaDireccion.enviarPanelAgregar().setVisible(false);
    }
    
    public void abrirDireccionPanEliminar(){
        ventanaDireccion.enviarPanelEliminar().setVisible(true);
        JTable tablaDireccionEli = ventanaDireccion.enviarTabla_Eliminar();
        JComboBox comboDireccionesEli = ventanaDireccion.enviarComboDireccionesEli();
        mostrarDireccionesDel(tablaDireccionEli);
        llenarComboDirecEli(comboDireccionesEli);
    }
    
    public void cerrarDireccionPanEliminar(){
        ventanaDireccion.enviarPanelEliminar().setVisible(false);
    }
    
    

    public void abrirVentanaEmpresae(){
        ventanaEmpresae.setVisible(true);
        JTable tablaEmpresae = ventanaEmpresae.enviarTabla();
        mostrarEmpresae(tablaEmpresae);
        
    }
    
    public void cerrarVentanaEmpresae(){
        ventanaEmpresae.setVisible(false);
    }
    
    
    public void abrirVentanaProveedor(){
        ventanaProveedor.setVisible(true);
        JTable tablaProveedor = ventanaProveedor.enviarTabla();
        mostrarProveedor(tablaProveedor);
        
    }
    
    public void cerrarVentanaProveedor(){
        ventanaProveedor.setVisible(false);
    }
    
    
    public void abrirVentanaRepartidor(){
        ventanaRepartidor.setVisible(true);
        JTable tablaRepartidor = ventanaRepartidor.enviarTabla();
        mostrarRepartidor(tablaRepartidor);
        
    }
   
    
    public void cerrarVentanaRepartidor(){
        ventanaRepartidor.setVisible(false);
    }
    
    
    public void abrirVentanaGerente(){
        ventanaGerente.setVisible(true);
        JTable tablaGerente = ventanaGerente.enviarTabla();
        mostrarGerente(tablaGerente);
        
    }
   
    
    public void cerrarVentanaGerente(){
        ventanaGerente.setVisible(false);
    }
    

    public void abrirVentanaSolicitudes(){
        
        ventanaSolicitudProd.setVisible(true);
        abrirSolicitudProdPanLeer();
        cerrarSolicitudProdPanActualizar();
        cerrarSolicitudProdPanAgregar();
        cerrarSolicitudProdPanEliminar();
        JTable tablaSolicitudesLeer = ventanaSolicitudProd.enviarTabla_Leer();
        mostrarSolicitudesProdLeer(tablaSolicitudesLeer);
    }
    
    public void cerrarVentanaSolicitudes(){
        ventanaDireccion.setVisible(false);
    }
    
    public void abrirSolicitudProdPanLeer(){
        ventanaSolicitudProd.enviarPanelLeer().setVisible(true);
        JTable tablaSolicitudesLeer = ventanaSolicitudProd.enviarTabla_Leer();
        mostrarSolicitudesProdLeer(tablaSolicitudesLeer);
    }
    
    public void cerrarSolicitudProdPanLeer(){
        ventanaSolicitudProd.enviarPanelLeer().setVisible(false);
    }
    
    public void abrirSolicitudProdPanActualizar(){
        ventanaSolicitudProd.enviarPanelActualizar().setVisible(true);
        JComboBox comboSolicitudesActu = ventanaSolicitudProd.enviarComboSolicitudesAct();
        llenarComboSoliciAct(comboSolicitudesActu);
    }
    
    public void cerrarSolicitudProdPanActualizar(){
        ventanaSolicitudProd.enviarPanelActualizar().setVisible(false);
    }
    
    public void abrirSolicitudProdPanAgregar(){
        ventanaSolicitudProd.enviarPanelAgregar().setVisible(true);
    }
    
    public void cerrarSolicitudProdPanAgregar(){
        ventanaSolicitudProd.enviarPanelAgregar().setVisible(false);
    }
    
    public void abrirSolicitudProdPanEliminar(){
        ventanaSolicitudProd.enviarPanelEliminar().setVisible(true);
        JTable tablaSoliProdEli = ventanaSolicitudProd.enviarTabla_Eliminar();
        JComboBox comboSoliProdEli = ventanaSolicitudProd.enviarComboSolicitudesEli();
        mostrarSolicitudesProdDel(tablaSoliProdEli);
        llenarComboSoliciEli(comboSoliProdEli);
    }
    
    public void cerrarSolicitudProdPanEliminar(){
        ventanaSolicitudProd.enviarPanelEliminar().setVisible(false);
    }
    
    
    
    public void abrirVentanaClientes(){
        
        ventanaCliente.setVisible(true);
        abrirClientePanLeer();
        cerrarClientePanActualizar();
        cerrarClientePanAgregar();
        cerrarClientePanEliminar();
        JTable tablaClienteLeer = ventanaCliente.enviarTabla_Leer();
        mostrarClienteProdLeer(tablaClienteLeer);
    }
    
    public void cerrarVentanaClientes(){
        ventanaCliente.setVisible(false);
    }
    
    public void abrirClientePanLeer(){
        ventanaCliente.enviarPanelLeer().setVisible(true);
        JTable tablaClienteLeer = ventanaCliente.enviarTabla_Leer();
        mostrarClienteProdLeer(tablaClienteLeer);
    }
    
    public void cerrarClientePanLeer(){
        ventanaCliente.enviarPanelLeer().setVisible(false);
    }
    
    public void abrirClientePanActualizar(){
        ventanaCliente.enviarPanelActualizar().setVisible(true);
        JComboBox comboClienteActu = ventanaCliente.enviarComboClienteAct();
        llenarComboClienteAct(comboClienteActu);
    }
    
    public void cerrarClientePanActualizar(){
        ventanaCliente.enviarPanelActualizar().setVisible(false);
    }
    
    public void abrirClientePanAgregar(){
        ventanaCliente.enviarPanelAgregar().setVisible(true);
    }
    
    public void cerrarClientePanAgregar(){
        ventanaCliente.enviarPanelAgregar().setVisible(false);
    }
    
    public void abrirClientePanEliminar(){
        ventanaCliente.enviarPanelEliminar().setVisible(true);
        JTable tablaClienteEli = ventanaCliente.enviarTabla_Eliminar();
        JComboBox comboClienteEli = ventanaCliente.enviarComboClienteEli();
        mostrarClientesDel(tablaClienteEli);
        llenarComboClienteEli(comboClienteEli);
    }
    
    public void cerrarClientePanEliminar(){
        ventanaCliente.enviarPanelEliminar().setVisible(false);
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
        modelo.setColumnIdentifiers(new Object[] {"Correo","Tipo"});
        
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

    
    public void mostrarTelefono(JTable table){
        DefaultTableModel modelo = new DefaultTableModel();
        
        ResultSet rs = miTelefonoDao.obtenerTelefonos("select telNumero, telTipo from telefono");
        modelo.setColumnIdentifiers(new Object[] {"Teléfono","Tipo"});
        
        try{
            while(rs.next()){
                modelo.addRow(new Object[]{rs.getLong("telNumero"),rs.getString("telTipo")});
                
            }
            table.setModel(modelo);
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void mostrarDireccionesLeer(JTable table){
        DefaultTableModel modelo = new DefaultTableModel();
        
        ResultSet rs = miDireccionDao.obtenerDirecciones("select dirDireccion, dirCiudad, dirLocalidad, dirBarrio from direccion");
        modelo.setColumnIdentifiers(new Object[] {"Dirección","Ciudad", "Localidad", "Barrio"});
        
        try{
            while(rs.next()){
                modelo.addRow(new Object[]{rs.getString("dirDireccion"),rs.getString("dirCiudad"),rs.getString("dirLocalidad"), rs.getString("dirBarrio")});
                
            }
            table.setModel(modelo);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void mostrarDireccionesDel(JTable table){
        DefaultTableModel modelo = new DefaultTableModel();
        
        ResultSet rs = miDireccionDao.obtenerDirecciones("select dirDireccion, dirCiudad, dirLocalidad, dirBarrio from direccion");
        modelo.setColumnIdentifiers(new Object[] {"Dirección","Ciudad", "Localidad", "Barrio"});
        
        try{
            while(rs.next()){
                modelo.addRow(new Object[]{rs.getString("dirDireccion"),rs.getString("dirCiudad"),rs.getString("dirLocalidad"), rs.getString("dirBarrio")});
                
            }
            table.setModel(modelo);
        }catch(Exception e){
            System.out.println(e);
        }
    }

    
    public String agregarNuevaDireccion(direccionVo nuevaDireccion){
        return miDireccionDao.agregarDireccion(nuevaDireccion);
    }
    
    public void llenarComboDirecAct(JComboBox combo){
        
        ResultSet rs = miDireccionDao.obtenerDirecciones("select dirDireccion from direccion");
        try{
            combo.removeAllItems();
            while(rs.next()){
                
                combo.addItem(rs.getObject("dirDireccion"));
            }
            
            combo.setSelectedIndex(0);
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void llenarComboDirecEli(JComboBox combo){
        
        ResultSet rs = miDireccionDao.obtenerDirecciones("select dirDireccion from direccion");
        try{
            combo.removeAllItems();
            while(rs.next()){
                
                combo.addItem(rs.getObject("dirDireccion"));
            }
            
            combo.setSelectedIndex(0);
            
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public direccionVo consultarDireccion(String direccionDirec) {
        
        return miDireccionDao.consultarDireccion(direccionDirec);
    }

    public boolean validarCampos(direccionVo direccionActu) {
        return miLogica.validarCampos(direccionActu);
    }

    public String actualizarDireccion(direccionVo direccionActu, String direccionSeleccionada) {
        return miDireccionDao.actualizarDireccion(direccionActu, direccionSeleccionada);
    }
    
    public String eliminarDireccion(String direccionSeleccionada) {
        return miDireccionDao.eliminarDireccion(direccionSeleccionada);
    }


    public void mostrarEmpresae(JTable tablaEmpresae) {
        DefaultTableModel modelo = new DefaultTableModel();
        
        ResultSet rs = miEmpresaeDao.obtenerEmpresae("select empNit, epnNumeroSeguro, empNombre, empRUT, repCedula, dirDireccion, corCorreo, telNumero from vw_empresa_envios");
        modelo.setColumnIdentifiers(new Object[] {"NIT","Seguro","Nombre","RUT","Cédula Representante", "Dirección", "Correo", "Teléfono"});
        
        try{
            while(rs.next()){
                modelo.addRow(new Object[]{rs.getLong("empNit"),rs.getLong("epnNumeroSeguro"),rs.getString("empNombre"),rs.getLong("empRUT"),rs.getLong("repCedula"), rs.getString("dirDireccion"), rs.getString("corCorreo"), rs.getLong("telNumero")});
                
            }
            tablaEmpresae.setModel(modelo);
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
     public void mostrarProveedor(JTable table) {
        //System.out.println(miConexionActual);
    
        DefaultTableModel modelo = new DefaultTableModel();
        
        ResultSet rs = miProveedorDao.obtenerProveedor("select proTipoProducto, proNit, enviosNit, empNombre, empRUT, repCedula, dirDireccion, corCorreo from vw_proveedor");
        modelo.setColumnIdentifiers(new Object[] {"Tipo Producto","NIT Proveedor", "NIT Empresa Envios", "Nombre", "RUT", "Cédula representante", "Dirección", "Correo"});
        
        try{
            while(rs.next()){
                modelo.addRow(new Object[]{rs.getString("proTipoProducto"),rs.getLong("proNit"), rs.getLong("enviosNit"),rs.getString("empNombre"),rs.getLong("empRUT"),rs.getLong("repCedula"),rs.getString("dirDireccion"),rs.getString("corCorreo")});
                
            }
            table.setModel(modelo);
        }catch(Exception e){
            System.out.println(e);
        }
    }
     public void mostrarRepartidor(JTable table){
        DefaultTableModel modelo = new DefaultTableModel();
        
        ResultSet rs = miRepartidorDao.obtenerRepartidor("select repaPlacas, repaCedula, perNombre, perApellido, corCorreo, telNumero from vw_repartidor");
        modelo.setColumnIdentifiers(new Object[] {"Placa vehículo","Cédula","Nombre","Apellido","Correo", "Número"});
        
        try{
            while(rs.next()){
                modelo.addRow(new Object[]{rs.getString("repaPlacas"),rs.getLong("repaCedula"),rs.getString("perNombre"),rs.getString("perApellido"),rs.getString("corCorreo"), rs.getLong("telNumero")});
                
            }
            table.setModel(modelo);
        }catch(Exception e){
            System.out.println(e);
        }
    }
     
     public void mostrarGerente(JTable table){
        DefaultTableModel modelo = new DefaultTableModel();
        
        ResultSet rs = miGerenteDao.obtenerGerente("select gerCodigoTarjetaProfesional, gerCedula, perNombre, perApellido, corCorreo, telNumero from vw_gerente");
        modelo.setColumnIdentifiers(new Object[] {"Tarjeta Profesional","Cédula","Nombre","Apellido","Correo", "Número"});
        
        try{
            while(rs.next()){
                modelo.addRow(new Object[]{rs.getLong("gerCodigoTarjetaProfesional"),rs.getLong("gerCedula"),rs.getString("perNombre"),rs.getString("perApellido"),rs.getString("corCorreo"), rs.getLong("telNumero")});
                
            }
            table.setModel(modelo);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    

    private void mostrarSolicitudesProdLeer(JTable tablaSolicitudesLeer) {
        DefaultTableModel modelo = new DefaultTableModel();
        
        ResultSet rs = miSolicitudProdDao.obtenerSolicitudes("select numSolicitud, fechaFacturacion, totalIva, totalCompra, "
                + "nitCliente, nombreCliente, venCedula, venNombre from vw_solprod");
        modelo.setColumnIdentifiers(new Object[] {"Número Solicitud","Fecha Facturación", "Total IVA", "Total Compra", "NIT Cliente",
                "Nombre Cliente", "Cédula Vendedor", "Nombre Vendedor"});
        
        try{
            while(rs.next()){
                modelo.addRow(new Object[]{rs.getInt("numSolicitud"),rs.getDate("fechaFacturacion"),rs.getDouble("totalIva"), rs.getDouble("totalCompra"),
                                            rs.getString("nitCliente"),rs.getString("nombreCliente"),rs.getInt("venCedula"),rs.getString("venNombre")});
                
            }
            tablaSolicitudesLeer.setModel(modelo);

        }catch(Exception e){
            System.out.println(e);
        }
    }


    private void llenarComboSoliciAct(JComboBox comboDireccionesActu) {
        
    }

    private void mostrarSolicitudesProdDel(JTable tablaSoliProdEli) {
        
    }

    private void llenarComboSoliciEli(JComboBox comboSoliProdEli) {
        
    }

    private void mostrarClienteProdLeer(JTable tablaClienteLeer) {
        DefaultTableModel modelo = new DefaultTableModel();
        
        ResultSet rs = miClienteDao.obtenerClientes("select cliNit, empNombre, empRUT, cliNumCamara, cliCodigoCertficadoBancario,"
                + "repCedula,dirDireccion,corCorreo,telNumero from vw_cliente");
        modelo.setColumnIdentifiers(new Object[] {"NIT","Nombre Cliente", "RUT", "Número Camara y Comercio","Cert. Bancario", "Cédula Representante","Dirección","Correo","Teléfono"});
        
        try{
            while(rs.next()){
                modelo.addRow(new Object[]{rs.getLong("cliNit"),rs.getString("empNombre"),rs.getLong("cliNumCamara"), rs.getLong("cliCodigoCertficadoBancario"),
                rs.getInt("repCedula"),rs.getString("dirDireccion"),rs.getString("corCorreo"),rs.getLong("telNumero")});
                
            }
            tablaClienteLeer.setModel(modelo);
        }catch(Exception e){
            System.out.println(e);
        }
    }

    private void llenarComboClienteAct(JComboBox comboClienteActu) {
        
    }

    private void mostrarClientesDel(JTable tablaClienteEli) {
        
    }

    private void llenarComboClienteEli(JComboBox comboClienteEli) {
        
    }

    


    
}

    


    
