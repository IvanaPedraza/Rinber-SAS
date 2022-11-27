/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;


import controlador.Coordinador;
import java.awt.Color;
import javax.swing.JOptionPane;


/**
 *
 * @author ander
 */
public class iLogin extends javax.swing.JFrame {
    
    private Coordinador miCoordinador;
    
    /**
     * Creates new form NewJFrame
     */
    public iLogin() {
        
        initComponents();
        setTitle("Login");
        getContentPane().setBackground(Color.white);
        this.setLocation(200, 0);  
    }
    
    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
    }
    
    
    
    /**
     * Componentes logicos
     */
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo2 = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        logoRinber = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        subtitulo3 = new javax.swing.JLabel();
        lineasTitulo = new javax.swing.JLabel();
        subtitulo1 = new javax.swing.JLabel();
        subtitulo2 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        btn_ingresar = new javax.swing.JButton();
        decorador2 = new javax.swing.JLabel();
        decorador1 = new javax.swing.JLabel();
        txtcontrasena = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));
        setMinimumSize(new java.awt.Dimension(1215, 800));
        setPreferredSize(new java.awt.Dimension(1215, 800));
        setSize(new java.awt.Dimension(1215, 800));
        getContentPane().setLayout(null);

        titulo2.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        titulo2.setForeground(new java.awt.Color(11, 43, 90));
        titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo2.setText("Rinber S.A.S!");
        titulo2.setToolTipText("");
        titulo2.setPreferredSize(new java.awt.Dimension(679, 138));
        getContentPane().add(titulo2);
        titulo2.setBounds(110, 70, 320, 138);

        titulo1.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        titulo1.setForeground(new java.awt.Color(11, 43, 90));
        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo1.setText("¡Bienvenido a");
        titulo1.setToolTipText("");
        titulo1.setPreferredSize(new java.awt.Dimension(679, 138));
        getContentPane().add(titulo1);
        titulo1.setBounds(90, 40, 350, 80);

        logoRinber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loguito.png"))); // NOI18N
        getContentPane().add(logoRinber);
        logoRinber.setBounds(1080, 10, 120, 130);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo 3.jpg"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(580, 0, 630, 810);

        subtitulo3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo3.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo3.setText("Contraseña");
        getContentPane().add(subtitulo3);
        subtitulo3.setBounds(60, 510, 230, 30);

        lineasTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lineasTitulo.setForeground(new java.awt.Color(11, 43, 90));
        lineasTitulo.setText("________________                                    _______________");
        getContentPane().add(lineasTitulo);
        lineasTitulo.setBounds(10, 230, 570, 30);

        subtitulo1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        subtitulo1.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo1.setText("Por favor ingresa tus datos");
        getContentPane().add(subtitulo1);
        subtitulo1.setBounds(210, 250, 190, 16);

        subtitulo2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo2.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo2.setText("Usuario");
        getContentPane().add(subtitulo2);
        subtitulo2.setBounds(60, 350, 230, 30);

        txtusuario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtusuario);
        txtusuario.setBounds(60, 400, 430, 40);

        btn_ingresar.setBackground(new java.awt.Color(8, 19, 48));
        btn_ingresar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        btn_ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/image (1).png"))); // NOI18N
        btn_ingresar.setText("Ingresar ");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ingresar);
        btn_ingresar.setBounds(280, 680, 210, 40);

        decorador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        getContentPane().add(decorador2);
        decorador2.setBounds(30, 510, 30, 30);

        decorador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        getContentPane().add(decorador1);
        decorador1.setBounds(30, 350, 30, 30);

        txtcontrasena.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtcontrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontrasenaActionPerformed(evt);
            }
        });
        getContentPane().add(txtcontrasena);
        txtcontrasena.setBounds(60, 560, 430, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        String valorPass = new String(txtcontrasena.getPassword());
        String respuesta = miCoordinador.validarIngreso(txtusuario.getText(),valorPass);
        if(respuesta.equals("error")){
            JOptionPane.showMessageDialog(null, "Los campos están vacíos");
        }else{
            JOptionPane.showMessageDialog(null, respuesta);
            // miCoordinador.asignarPrivilegios(respuesta);
            miCoordinador.cerrarVentanaLogin();
        }
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void txtcontrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontrasenaActionPerformed
       
    }//GEN-LAST:event_txtcontrasenaActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JLabel decorador1;
    private javax.swing.JLabel decorador2;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel lineasTitulo;
    private javax.swing.JLabel logoRinber;
    private javax.swing.JLabel subtitulo1;
    private javax.swing.JLabel subtitulo2;
    private javax.swing.JLabel subtitulo3;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JPasswordField txtcontrasena;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
