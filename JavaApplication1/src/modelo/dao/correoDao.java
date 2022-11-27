package modelo.dao;

import java.sql.Connection;
import controlador.Coordinador;
import java.sql.Statement;
import java.sql.ResultSet;
import modelo.Conexion;

public class correoDao {

    private Coordinador miCoordinador;
    
    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
    }
    
    public ResultSet obtenerCorreos(String consulta){
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
