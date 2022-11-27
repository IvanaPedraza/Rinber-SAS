
package controlador;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Image;


public class Escalar {
    public void escalarLabel(JLabel label, String rutaImagen ){
        label.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(rutaImagen)).getImage().
                getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT)));
    }
}
