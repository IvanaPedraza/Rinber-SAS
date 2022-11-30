package modelo.dao;

import controlador.Coordinador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.vo.direccionVo;
import modelo.vo.vendedorActual;

public class vendedorDao {
    
    private Coordinador miCoordinador;

    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
    }
    
    public vendedorActual consultarVendedor(String vendedorActual) {
        
        PreparedStatement statement = null;
        ResultSet rs = null;
        vendedorActual vendedor = null;
        Connection connection = miCoordinador.obtenerConexion();
        String consulta = "select * from vw_vendedor where venCedula = ?";
        try{
            statement = connection.prepareStatement(consulta);
            statement.setString(1, vendedorActual);
            rs = statement.executeQuery();
            
            while(rs.next()==true){
                vendedor = new vendedorActual();
                vendedor.setVenCedula(rs.getInt("venCedula"));
                vendedor.setPerNombre(rs.getString("perNombre"));
                vendedor.setPerApellido(rs.getString("perApellido"));
                vendedor.setCorCorreo(rs.getString("corCorreo"));
                vendedor.setTelNumero(rs.getLong("telNumero"));
                vendedor.setVenTurno(rs.getString("venTurno"));
                
            }
        
        }catch(SQLException e){
            System.out.println("No se pudo encontrar el vendedor "+e.getMessage());
            
        }
        return vendedor;
    } 
    
}
