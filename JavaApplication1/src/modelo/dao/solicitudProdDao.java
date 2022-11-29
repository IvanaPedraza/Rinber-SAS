package modelo.dao;

import controlador.Coordinador;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

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
}
