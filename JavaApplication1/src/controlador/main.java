/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlador;

import java.sql.*;

public class main {

    private static Connection conexion;
    private static String bd = "rinber";
    private static String user = "root";
    private static String password = "";
    private static String host = "localhost";
    private static String server = "jdbc:mysql://" + host + "/" + bd + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode  = false & serverTimezone = UTC";

    public static void main(String[] args) {
        
        Aplicacion miAplicacion = new Aplicacion();
        miAplicacion.iniciarSistema();
        
        //Conexión a la base de datos rinber
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(server, user, password);
            System.out.println("ConexiÃ3n a base de datos " + server + " ... OK");
        }
        catch (ClassNotFoundException ex) {
                System.out.println("Error cargando el Driver MySQL JDBC ... FAIL");
        }
        catch (SQLException ex) {
                System.out.println("Imposible realizar conexion con " + server + " ... FAIL");
        }
       

        
    }

}
