/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import controlador.Coordinador;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class telefonoDao {
    private Coordinador miCoordinador;

    public void setMiCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
    }

    public ResultSet obtenerTelefonos(String consulta){
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
    
}
