/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import java.sql.PreparedStatement;
import controlador.Coordinador;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.vo.direccionVo;

/**
 *
 * @author kelly
 */
public class direccionDao {
    
    private Coordinador miCoordinador;

    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
    }
    
    public ResultSet obtenerDirecciones(String consulta){
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
    
    public String agregarDireccion(direccionVo nuevaDireccion){
        String resultado = "";
        Connection connection = miCoordinador.obtenerConexion();
        PreparedStatement preStatement = null;
        
        String consulta = "insert into direccion (dirDireccion,dirCiudad,dirLocalidad,dirBarrio) "
                + "values (?,?,?,?)";
        try{
            preStatement = connection.prepareStatement(consulta);
            preStatement.setString(1, nuevaDireccion.getDirDireccion());
            preStatement.setString(2, nuevaDireccion.getDirCiudad());
            preStatement.setString(3, nuevaDireccion.getDirLocalidad());
            preStatement.setString(4, nuevaDireccion.getDirBarrio());
            preStatement.execute();
            
            resultado = "OK";
            
        }catch(SQLException e){
            System.out.println("No se pudo registrar el dato "+e.getMessage());
            resultado = "ERROR";
        }
        
        return resultado;
    }

    public direccionVo consultarDireccion(String direccionDirec) {
        PreparedStatement statement = null;
        ResultSet rs = null;
        direccionVo direccionConsul = null;
        Connection connection = miCoordinador.obtenerConexion();
        String consulta = "select * from direccion where dirDireccion = ?";
        try{
            statement = connection.prepareStatement(consulta);
            statement.setString(1, direccionDirec);
            rs = statement.executeQuery();
            
            while(rs.next()==true){
                direccionConsul = new direccionVo();
                direccionConsul.setDirDireccion(rs.getString("dirDireccion"));
                direccionConsul.setDirCiudad(rs.getString("dirCiudad"));
                direccionConsul.setDirLocalidad(rs.getString("dirCiudad"));
                direccionConsul.setDirBarrio(rs.getString("dirBarrio"));
                
            }
        
        }catch(SQLException e){
            System.out.println("No se pudo encontrar la direccion "+e.getMessage());
            
        }
        return direccionConsul;
    }

    public String actualizarDireccion(direccionVo direccionActu, String direccionSeleccionada) {
        String resultado = "";
        Connection connection = miCoordinador.obtenerConexion();
        try{
            String consulta = "update direccion set dirCiudad = ?,"
                    + "dirLocalidad = ?, dirBarrio = ? where dirDireccion = ?";
            PreparedStatement preStatement = connection.prepareStatement(consulta);
            //preStatement.setString(1, direccionActu.getDirDireccion());
            preStatement.setString(1, direccionActu.getDirCiudad());
            preStatement.setString(2, direccionActu.getDirLocalidad());
            preStatement.setString(3, direccionActu.getDirBarrio());
            preStatement.setString(4, direccionSeleccionada);
            
            preStatement.executeUpdate();
            
            resultado = "OK";
        }catch(SQLException e){
            System.out.println(e);
            resultado = "ERROR";
        }
                
        return resultado;
    }

    public String eliminarDireccion(String direccionSeleccionada) {
        Connection connection = miCoordinador.obtenerConexion();
        String respuesta="";
        try{
            String sentencia = "delete from direccion where dirDireccion = ?";
            PreparedStatement preStatement = connection.prepareStatement(sentencia);
            preStatement.setString(1, direccionSeleccionada);
            preStatement.executeUpdate();
            respuesta = "OK";
        }catch(SQLException e){
            System.out.println(e);
            respuesta = "ERROR";
        }
        
        return respuesta;
    }
    
}
