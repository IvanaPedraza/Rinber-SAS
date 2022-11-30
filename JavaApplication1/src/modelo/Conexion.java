/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import controlador.Coordinador;
import java.sql.*;
import java.sql.Connection;

/**
 *
 * @author kelly
 */
public class Conexion {
    private Coordinador miCoordinador;
    private static String user;
    private static String password;
    private static String bd = "rinber";
    private static String host = "localhost";
    private static String server = "jdbc:mysql://" + host + "/" + bd + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode  = false & serverTimezone = UTC";
    
    Connection conn=null;
   
    public void definirUsuarioContra(String user, String password){
       this.user = user;
       this.password = password;
       System.out.println("Se define: " + user + " " + password);
    }
    
    
    public String devolverUsuario(){
        return this.user;
    }
	//constructor de la clase
	public void Conexion(){
		try {
			//obtener el driver
			Class.forName("com.mysql.jdbc.Driver");
//			//obtener la conexion
			conn = DriverManager.getConnection(server,user,password);
			if (conn!=null) {
                            System.out.println("Conexion Exitosa  a la BD: "+bd);
                            
			}
		} catch (ClassNotFoundException e) {
			System.out.println("ocurre una ClassNotFoundException : "+e.getMessage());
		} catch (SQLException e) {
			System.out.println("ocurre una SQLException: "+e.getMessage());
		}
            
	}
	public Connection getConnection(){
		return conn;
	}
	public void desconectar(){
		conn=null;
	}

    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
    }

    
    
}

