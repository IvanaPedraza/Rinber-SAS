package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import controlador.Coordinador;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.vo.clienteVo;

public class clienteDao {
    private Coordinador miCoordinador;
    
    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
    }
    
    public ResultSet obtenerClientes(String consulta){
        Connection connection = miCoordinador.obtenerConexion();
        System.out.println(connection);
        Statement st;
        ResultSet datos = null;
        try{
            st = connection.createStatement();
            datos = st.executeQuery(consulta);
        }catch(Exception e){
            System.out.println(e.toString());
        }
        
        return datos;

    }

    public String agregarCliente(clienteVo nuevoCliente) {
        String resultado = "";
        Connection connection = miCoordinador.obtenerConexion();
        CallableStatement llamada = null;
        String consulta = "call insertarClientes(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
            llamada = connection.prepareCall(consulta);
            llamada.setString(1, String.valueOf(nuevoCliente.getNumCamara()));
            llamada.setString(2, String.valueOf(nuevoCliente.getCodCertificadoBanc()));
            llamada.setString(3, String.valueOf(nuevoCliente.getCliNit()));
            llamada.setString(4, nuevoCliente.getNombreCliente());
            llamada.setString(5, nuevoCliente.getRutCliente());
            llamada.setString(6, String.valueOf(nuevoCliente.getRepreCedula()));
            llamada.setString(7, nuevoCliente.getRepreNombre());
            llamada.setString(8, nuevoCliente.getRepreApellido());
            llamada.setString(9, nuevoCliente.getRepreCorreo());
            llamada.setString(10, String.valueOf(nuevoCliente.getRepreTelefono()));
            llamada.setString(11, nuevoCliente.getDireDireccion());
            llamada.setString(12, nuevoCliente.getDireCiudad());
            llamada.setString(13, String.valueOf(nuevoCliente.getTeleNumero()));
            llamada.setString(14, nuevoCliente.getTeleTipo());
            llamada.setString(15, nuevoCliente.getCorrCorreo());
            llamada.setString(16, nuevoCliente.getCorreoTipo());
            
            llamada.execute();
            resultado = "OK";
            
        }catch(SQLException e){
            System.out.println("No se pudo registrar el dato "+ e.getMessage());
            resultado = "ERROR";
        }
        
        return resultado;
        
    }
    
    public clienteVo consultarCliente(Long clienteSelec) {
        PreparedStatement statement = null;
        ResultSet rs = null;
        clienteVo clienteConsul = null;
        String clienteSeleccionado = String.valueOf(clienteSelec);
        Connection connection = miCoordinador.obtenerConexion();
        String consulta = "select * from vw_cliente where cliNit = ?";
        try{
            statement = connection.prepareStatement(consulta);
            statement.setString(1, clienteSeleccionado);
            rs = statement.executeQuery();
            
            while(rs.next()==true){
                clienteConsul = new clienteVo();
                clienteConsul.setNumCamara(rs.getLong("cliNumCamara"));
                clienteConsul.setCodCertificadoBanc(rs.getLong("cliCodigoCertficadoBancario"));
                clienteConsul.setCliNit(rs.getLong("cliNit"));
                clienteConsul.setNombreCliente(rs.getString("empNombre"));
                clienteConsul.setRutCliente(rs.getString("empRUT"));
                clienteConsul.setRepreCedula(rs.getInt("repCedula"));
                clienteConsul.setRepreNombre(rs.getString("perNombre"));
                clienteConsul.setRepreApellido(rs.getString("perApellido"));
                clienteConsul.setRepreCorreo(rs.getString("repreCorreo"));
                clienteConsul.setRepreTelefono(rs.getLong("repreTel"));
                clienteConsul.setDireDireccion(rs.getString("dirDireccion"));
                clienteConsul.setDireCiudad(rs.getString("dirCiudad"));
                clienteConsul.setTeleNumero(rs.getLong("telNumero"));
                clienteConsul.setTeleTipo(rs.getString("telTipo"));
                clienteConsul.setCorrCorreo(rs.getString("corCorreo"));
                clienteConsul.setCorreoTipo(rs.getString("tipoCorreo"));
            }
        
        }catch(SQLException e){
            System.out.println("No se pudo encontrar el cliente "+e.getMessage());
            
        }
        return clienteConsul;
    }

    public String actualizarCliente(clienteVo clienteActu, Long clienteSeleccionado) {
        String cliSelec = String.valueOf(clienteSeleccionado);
        String resultado = "";
        Connection connection = miCoordinador.obtenerConexion();
        CallableStatement llamada = null;
        try{
            String consulta = "call actualizarCliente(?,?,?,?,?,?)";
            llamada = connection.prepareCall(consulta);
            llamada.setString(1, cliSelec);
            llamada.setString(2, clienteActu.getNombreCliente());
            llamada.setString(3, clienteActu.getCorrCorreo());
            llamada.setString(4, clienteActu.getCorreoTipo());
            llamada.setString(5, String.valueOf(clienteActu.getTeleNumero()));
            llamada.setString(6, clienteActu.getTeleTipo());
            
            llamada.execute();
            resultado = "OK";
            
        }catch(SQLException e){
            System.out.println(e);
            resultado = "ERROR";
        }
        return resultado;
    }

    public String eliminarCliente(Long clienteSeleccionado) {
        String cliSelec = String.valueOf(clienteSeleccionado);
        String resultado = "";
        Connection connection = miCoordinador.obtenerConexion();
        CallableStatement llamada = null;
        try{
            String sentencia = "call eliminarCliente(?)";
            llamada = connection.prepareCall(sentencia);
            llamada.setString(1, cliSelec);
            llamada.execute();
            resultado = "OK";
        }catch(SQLException e){
            System.out.println(e);
            resultado = "ERROR";
        }
        return resultado;
    }

    
    
}
