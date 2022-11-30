package modelo.dao;

import controlador.Coordinador;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.vo.solicitudProductoVo;

public class solicitudProdDao {
    private Coordinador miCoordinador;

    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
    }

    public ResultSet obtenerSolicitudes(String consulta){
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

    public String agregarSolicitud(solicitudProductoVo nuevaSolicitud, String clienteSeleccionado) {
        String resultado = "";
        Connection connection = miCoordinador.obtenerConexion();
        CallableStatement llamada = null;
        String consulta = "call agregarSolicitud(?,?,?,?,?)";
        try{
            llamada = connection.prepareCall(consulta);
            llamada.setString(1, String.valueOf(nuevaSolicitud.getNumSolicitud()));
            llamada.setString(2, String.valueOf(nuevaSolicitud.getTotalCompra()));
            llamada.setString(3, String.valueOf(nuevaSolicitud.getTotalCompra()));
            llamada.setString(4, clienteSeleccionado);
            llamada.setString(5, String.valueOf(nuevaSolicitud.getVenCedula()));
            llamada.execute();
            resultado = "OK";
            
        }catch(SQLException e){
            System.out.println("No se pudo registrar el dato "+e.getMessage());
            resultado = "ERROR";
        }
        
        return resultado;
    }
}
