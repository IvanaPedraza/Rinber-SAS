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
    
}
