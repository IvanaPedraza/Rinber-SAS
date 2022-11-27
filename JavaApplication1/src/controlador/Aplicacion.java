package controlador;

import interfaz.iLogin;
<<<<<<< HEAD
import interfaz.iVPVendedor;
=======
import modelo.Conexion;
>>>>>>> f49b65f5385d47bcff0e75e77bf61447633d67e9
import modelo.Logica;

public class Aplicacion {
    
    public void iniciarSistema(){
        
        // se instancias las clases unicas
        iLogin login = new iLogin();
        iVPVendedor ventana = new iVPVendedor();
        
        Coordinador miCoordinador = new Coordinador();
        Logica miLogica = new Logica();
        Conexion miConexion = new Conexion();
        
        // Relacionamos las clases coordinador
        login.setCoordinador(miCoordinador);
        //se repite para todos las demas ventanas
        miLogica.setCoordinador(miCoordinador);
        
        
        miConexion.setCoordinador(miCoordinador);
        
        //Relacionamos coordinador con las clases
        miCoordinador.setLogin(login);
        miCoordinador.setLogica(miLogica);
        
        ventana.setVisible(true);
        //login.setVisible(true);
    }
    
}
