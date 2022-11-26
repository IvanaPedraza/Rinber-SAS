package controlador;

import interfaz.iLogin;
import modelo.Logica;

public class Aplicacion {
    
    public void iniciarSistema(){
        
        // se instancias las clases unicas
        iLogin login = new iLogin();
        Coordinador miCoordinador = new Coordinador();
        Logica miLogica = new Logica();
        
        
        // Relacionamos las clases coordinador
        login.setCoordinador(miCoordinador);
        //se repite para todos las demas ventanas
        miLogica.setCoordinador(miCoordinador);
        
        
        //Relacionamos coordinador con las clases
        miCoordinador.setLogin(login);
        miCoordinador.setLogica(miLogica);
        
        
        login.setVisible(true);
    }
    
}