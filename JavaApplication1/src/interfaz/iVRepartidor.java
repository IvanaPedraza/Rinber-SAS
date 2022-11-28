/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;


import controlador.Coordinador;
import java.awt.Color;
import javax.swing.JOptionPane;

import controlador.Escalar;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;

import javax.swing.JTextField;
import javax.swing.border.Border;

public class iVRepartidor extends javax.swing.JFrame {
    
    private Coordinador miCoordinador;

    Escalar escalar=new Escalar();
    public iVRepartidor() {
        initComponents();
        setTitle("Correo");
        Color azul = new Color(23, 60, 104);
        p_scroll.setBackground(Color.WHITE);
        p_botones.setBackground(Color.white);
        p_ventana.setBackground(azul);
        this.setLocation(200, 0);  
        
        escalar.escalarLabel(this.logoRinber, "/img/imgiVPV/loguito-redondito.png");
        escalar.escalarLabel(this.imagen2, "/img/imgiVPV/Franja.jpg");
        
        this.btn_cliente.setOpaque(true);
        this.btn_cliente.setBackground(Color.white);
        this.btn_correo.setOpaque(true);
        this.btn_correo.setBackground(Color.white);
        this.btn_descripcion.setOpaque(true);
        this.btn_descripcion.setBackground(Color.white);
        this.btn_direccion.setOpaque(true);
        this.btn_direccion.setBackground(Color.white);
        this.btn_directorio.setOpaque(true);
        this.btn_directorio.setBackground(Color.white);
        this.btn_empresa.setOpaque(true);
        this.btn_empresa.setBackground(Color.white);
        this.btn_envios.setOpaque(true);
        this.btn_envios.setBackground(Color.white);
        this.btn_producto.setOpaque(true);
        this.btn_producto.setBackground(Color.white);
        this.btn_proveedor.setOpaque(true);
        this.btn_proveedor.setBackground(Color.white);
        this.btn_repartidor.setOpaque(true);
        this.btn_repartidor.setBackground(Color.white);
        this.btn_repreLegal.setOpaque(true);
        this.btn_repreLegal.setBackground(Color.white);
        this.btn_solicitudes.setOpaque(true);
        this.btn_solicitudes.setBackground(Color.white);
        this.btn_telefono.setOpaque(true);
        this.btn_telefono.setBackground(Color.white);
        this.btn_catalogo.setOpaque(true);
        this.btn_catalogo.setBackground(Color.white);
        this.btn_regresar.setOpaque(true);
        this.btn_regresar.setBackground(Color.white);
        this.btn_buscar.setOpaque(true);
        this.btn_buscar.setBackground(azul);
        this.btn_gerente.setOpaque(true);
        this.btn_gerente.setBackground(Color.white);
        
        
        String t= "<html>Representante<br>legal</html>";
        String t2= "<html>Empresa<br>envíos</html>";
        String t3= "<html>Solicitudes<br>producto</html>";
        String t4= "<html>Ordenes<br>compra</html>";
        this.titulo4.setText(t);
        this.titulo9.setText(t2);
        this.titulo12.setText(t3);
       
        
        JTableHeader th;
        th = this.tabla.getTableHeader();
        Font fuente = new Font("Century Gothic", Font.BOLD, 18);
        th.setFont(fuente);
        tabla.getTableHeader().setBackground(azul);
        tabla.getTableHeader().setForeground(Color.white);
        
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

        p_ventana = new javax.swing.JPanel();
        titulo2 = new javax.swing.JLabel();
        p_scroll = new javax.swing.JPanel();
        logoRinber = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        p_botones = new javax.swing.JPanel();
        btn_correo = new javax.swing.JButton();
        btn_telefono = new javax.swing.JButton();
        btn_repreLegal = new javax.swing.JButton();
        btn_direccion = new javax.swing.JButton();
        btn_proveedor = new javax.swing.JButton();
        btn_empresa = new javax.swing.JButton();
        btn_cliente = new javax.swing.JButton();
        btn_descripcion = new javax.swing.JButton();
        btn_producto = new javax.swing.JButton();
        btn_envios = new javax.swing.JButton();
        btn_solicitudes = new javax.swing.JButton();
        btn_repartidor = new javax.swing.JButton();
        btn_directorio = new javax.swing.JButton();
        titulo3 = new javax.swing.JLabel();
        titulo4 = new javax.swing.JLabel();
        titulo5 = new javax.swing.JLabel();
        titulo6 = new javax.swing.JLabel();
        titulo7 = new javax.swing.JLabel();
        titulo8 = new javax.swing.JLabel();
        titulo9 = new javax.swing.JLabel();
        titulo10 = new javax.swing.JLabel();
        titulo12 = new javax.swing.JLabel();
        titulo14 = new javax.swing.JLabel();
        titulo15 = new javax.swing.JLabel();
        titulo16 = new javax.swing.JLabel();
        titulo17 = new javax.swing.JLabel();
        titulo18 = new javax.swing.JLabel();
        btn_catalogo = new javax.swing.JButton();
        btn_gerente = new javax.swing.JButton();
        titulo19 = new javax.swing.JLabel();
        imagen2 = new javax.swing.JLabel();
        scroll_tabla = new javax.swing.JScrollPane();
        p_info = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        subtitulo = new javax.swing.JLabel();
        txtbusqueda = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));
        setMinimumSize(new java.awt.Dimension(1215, 800));
        setResizable(false);
        setSize(new java.awt.Dimension(1215, 800));
        getContentPane().setLayout(null);

        p_ventana.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        p_ventana.setForeground(new java.awt.Color(23, 60, 104));
        p_ventana.setMinimumSize(new java.awt.Dimension(1215, 800));
        p_ventana.setLayout(null);

        titulo2.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        titulo2.setForeground(new java.awt.Color(255, 255, 255));
        titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo2.setText("Ventana repartidor");
        titulo2.setToolTipText("");
        titulo2.setPreferredSize(new java.awt.Dimension(679, 138));
        p_ventana.add(titulo2);
        titulo2.setBounds(230, 20, 950, 90);

        scroll.setBorder(null);
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btn_correo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgiVPV/boton correo.png"))); // NOI18N
        btn_correo.setBorder(null);
        btn_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_correoActionPerformed(evt);
            }
        });

        btn_telefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgiVPV/boton telefono.png"))); // NOI18N
        btn_telefono.setBorder(null);
        btn_telefono.setMargin(new java.awt.Insets(2, 14, 30, 14));
        btn_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_telefonoActionPerformed(evt);
            }
        });

        btn_repreLegal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgiVPV/boton representante.png"))); // NOI18N
        btn_repreLegal.setBorder(null);

        btn_direccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgiVPV/boton direccion.png"))); // NOI18N
        btn_direccion.setBorder(null);
        btn_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_direccionActionPerformed(evt);
            }
        });

        btn_proveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgiVPV/boton proveedor.png"))); // NOI18N
        btn_proveedor.setBorder(null);

        btn_empresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgiVPV/boton empresa.png"))); // NOI18N
        btn_empresa.setBorder(null);

        btn_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgiVPV/boton cliente.png"))); // NOI18N
        btn_cliente.setToolTipText("");
        btn_cliente.setBorder(null);
        btn_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clienteActionPerformed(evt);
            }
        });

        btn_descripcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgiVPV/boton descripcion.png"))); // NOI18N
        btn_descripcion.setBorder(null);

        btn_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgiVPV/boton producto.png"))); // NOI18N
        btn_producto.setBorder(null);

        btn_envios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgiVPV/boton envios.png"))); // NOI18N
        btn_envios.setBorder(null);

        btn_solicitudes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgiVPV/boton solicitudes.png"))); // NOI18N
        btn_solicitudes.setBorder(null);

        btn_repartidor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton_seleccionado.png"))); // NOI18N
        btn_repartidor.setBorder(null);

        btn_directorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgiVPV/boton directorio.png"))); // NOI18N
        btn_directorio.setToolTipText("");
        btn_directorio.setBorder(null);

        titulo3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        titulo3.setForeground(new java.awt.Color(11, 43, 90));
        titulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo3.setText("Correo");
        titulo3.setToolTipText("");
        titulo3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titulo3.setPreferredSize(new java.awt.Dimension(679, 138));

        titulo4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        titulo4.setForeground(new java.awt.Color(11, 43, 90));
        titulo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo4.setToolTipText("");
        titulo4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titulo4.setPreferredSize(new java.awt.Dimension(679, 138));

        titulo5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        titulo5.setForeground(new java.awt.Color(11, 43, 90));
        titulo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo5.setText("Dirección");
        titulo5.setToolTipText("");
        titulo5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titulo5.setPreferredSize(new java.awt.Dimension(679, 138));

        titulo6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        titulo6.setForeground(new java.awt.Color(11, 43, 90));
        titulo6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo6.setText("Telefono");
        titulo6.setToolTipText("");
        titulo6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titulo6.setPreferredSize(new java.awt.Dimension(679, 138));

        titulo7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        titulo7.setForeground(new java.awt.Color(11, 43, 90));
        titulo7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo7.setText("Proveedor");
        titulo7.setToolTipText("");
        titulo7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titulo7.setPreferredSize(new java.awt.Dimension(679, 138));

        titulo8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        titulo8.setForeground(new java.awt.Color(11, 43, 90));
        titulo8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo8.setText("Repartidor");
        titulo8.setToolTipText("");
        titulo8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titulo8.setPreferredSize(new java.awt.Dimension(679, 138));

        titulo9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        titulo9.setForeground(new java.awt.Color(11, 43, 90));
        titulo9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo9.setToolTipText("");
        titulo9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titulo9.setPreferredSize(new java.awt.Dimension(679, 138));

        titulo10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        titulo10.setForeground(new java.awt.Color(11, 43, 90));
        titulo10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo10.setText("Cliente");
        titulo10.setToolTipText("");
        titulo10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titulo10.setPreferredSize(new java.awt.Dimension(679, 138));

        titulo12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        titulo12.setForeground(new java.awt.Color(11, 43, 90));
        titulo12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo12.setToolTipText("");
        titulo12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titulo12.setPreferredSize(new java.awt.Dimension(679, 138));

        titulo14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        titulo14.setForeground(new java.awt.Color(11, 43, 90));
        titulo14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo14.setText("Descripción");
        titulo14.setToolTipText("");
        titulo14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titulo14.setPreferredSize(new java.awt.Dimension(679, 138));

        titulo15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        titulo15.setForeground(new java.awt.Color(11, 43, 90));
        titulo15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo15.setText("Envíos");
        titulo15.setToolTipText("");
        titulo15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titulo15.setPreferredSize(new java.awt.Dimension(679, 138));

        titulo16.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        titulo16.setForeground(new java.awt.Color(11, 43, 90));
        titulo16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo16.setText("Producto");
        titulo16.setToolTipText("");
        titulo16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titulo16.setPreferredSize(new java.awt.Dimension(679, 138));

        titulo17.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        titulo17.setForeground(new java.awt.Color(11, 43, 90));
        titulo17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo17.setText("Directorio");
        titulo17.setToolTipText("");
        titulo17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titulo17.setPreferredSize(new java.awt.Dimension(679, 138));

        titulo18.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        titulo18.setForeground(new java.awt.Color(11, 43, 90));
        titulo18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo18.setText("Catalogo");
        titulo18.setToolTipText("");
        titulo18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titulo18.setPreferredSize(new java.awt.Dimension(679, 138));

        btn_catalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgiVPV/boton catalogo.png"))); // NOI18N
        btn_catalogo.setToolTipText("");
        btn_catalogo.setBorder(null);

        btn_gerente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgiVPV/boton gerente.png"))); // NOI18N
        btn_gerente.setToolTipText("");
        btn_gerente.setBorder(null);

        titulo19.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        titulo19.setForeground(new java.awt.Color(11, 43, 90));
        titulo19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo19.setText("Gerente");
        titulo19.setToolTipText("");
        titulo19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titulo19.setPreferredSize(new java.awt.Dimension(679, 138));

        javax.swing.GroupLayout p_botonesLayout = new javax.swing.GroupLayout(p_botones);
        p_botones.setLayout(p_botonesLayout);
        p_botonesLayout.setHorizontalGroup(
            p_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, p_botonesLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(titulo4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(p_botonesLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(p_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_gerente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo19, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_catalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo18, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_repreLegal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_repartidor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_solicitudes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_envios, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_directorio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );
        p_botonesLayout.setVerticalGroup(
            p_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_botonesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btn_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btn_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titulo6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_repreLegal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titulo4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titulo5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titulo7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titulo9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titulo10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_repartidor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titulo8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btn_solicitudes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titulo12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_envios, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titulo15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titulo16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titulo14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_directorio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titulo17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_catalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titulo18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_gerente, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titulo19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
        );

        scroll.setViewportView(p_botones);

        javax.swing.GroupLayout p_scrollLayout = new javax.swing.GroupLayout(p_scroll);
        p_scroll.setLayout(p_scrollLayout);
        p_scrollLayout.setHorizontalGroup(
            p_scrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_scrollLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(logoRinber, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(p_scrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_scrollLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        p_scrollLayout.setVerticalGroup(
            p_scrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_scrollLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(logoRinber, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(670, Short.MAX_VALUE))
            .addGroup(p_scrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_scrollLayout.createSequentialGroup()
                    .addContainerGap(216, Short.MAX_VALUE)
                    .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
        );

        p_ventana.add(p_scroll);
        p_scroll.setBounds(0, 0, 200, 850);

        imagen2.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        imagen2.setForeground(new java.awt.Color(255, 255, 255));
        imagen2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagen2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p_ventana.add(imagen2);
        imagen2.setBounds(230, 110, 950, 80);

        p_info.setBackground(new java.awt.Color(255, 255, 255));
        p_info.setForeground(new java.awt.Color(255, 255, 255));
        p_info.setLayout(null);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        tabla.setAutoCreateRowSorter(true);
        tabla.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        tabla.setForeground(new java.awt.Color(11, 43, 90));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cédula", "Nombre", "Apellido", "Placas vehiculo", "Correo", "Teléfono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setEnabled(false);
        tabla.setGridColor(new java.awt.Color(0, 0, 0));
        tabla.setOpaque(false);
        tabla.setRequestFocusEnabled(false);
        tabla.setRowHeight(30);
        tabla.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tabla.setSelectionForeground(new java.awt.Color(11, 43, 90));
        tabla.setShowGrid(true);
        tabla.getTableHeader().setResizingAllowed(false);
        tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setPreferredWidth(200);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(200);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(200);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(200);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(200);
            tabla.getColumnModel().getColumn(5).setPreferredWidth(200);
        }

        p_info.add(jScrollPane2);
        jScrollPane2.setBounds(10, 10, 660, 500);

        scroll_tabla.setViewportView(p_info);

        p_ventana.add(scroll_tabla);
        scroll_tabla.setBounds(230, 220, 680, 520);

        subtitulo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo.setForeground(new java.awt.Color(255, 255, 255));
        subtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitulo.setText("Busqueda rapida");
        p_ventana.add(subtitulo);
        subtitulo.setBounds(927, 226, 220, 40);

        txtbusqueda.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtbusqueda.setForeground(new java.awt.Color(23, 60, 104));
        txtbusqueda.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtbusqueda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.lightGray, java.awt.Color.darkGray));
        p_ventana.add(txtbusqueda);
        txtbusqueda.setBounds(930, 280, 170, 40);

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgiCorreo/boton lupa.png"))); // NOI18N
        btn_buscar.setBorder(null);
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        p_ventana.add(btn_buscar);
        btn_buscar.setBounds(1100, 280, 50, 40);

        btn_regresar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_regresar.setText("Regresar a inicio");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });
        p_ventana.add(btn_regresar);
        btn_regresar.setBounds(1000, 700, 180, 40);

        getContentPane().add(p_ventana);
        p_ventana.setBounds(0, 0, 1210, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_clienteActionPerformed

    private void btn_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_correoActionPerformed
        iVCorreo icorreo = new iVCorreo();
        this.setVisible(false);
        icorreo.setVisible(true);
    }//GEN-LAST:event_btn_correoActionPerformed

    private void btn_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_telefonoActionPerformed
        iVTelefono itelefono = new iVTelefono();
        this.setVisible(false);
        itelefono.setVisible(true);
    }//GEN-LAST:event_btn_telefonoActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        iVPVendedor iprincipal = new iVPVendedor();
        this.setVisible(false);
        iprincipal.setVisible(true);
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_direccionActionPerformed
        iVDireccion idireccion = new iVDireccion();
        this.setVisible(false);
        idireccion.setVisible(true);
    }//GEN-LAST:event_btn_direccionActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_catalogo;
    private javax.swing.JButton btn_cliente;
    private javax.swing.JButton btn_correo;
    private javax.swing.JButton btn_descripcion;
    private javax.swing.JButton btn_direccion;
    private javax.swing.JButton btn_directorio;
    private javax.swing.JButton btn_empresa;
    private javax.swing.JButton btn_envios;
    private javax.swing.JButton btn_gerente;
    private javax.swing.JButton btn_producto;
    private javax.swing.JButton btn_proveedor;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JButton btn_repartidor;
    private javax.swing.JButton btn_repreLegal;
    private javax.swing.JButton btn_solicitudes;
    private javax.swing.JButton btn_telefono;
    private javax.swing.JLabel imagen2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logoRinber;
    private javax.swing.JPanel p_botones;
    private javax.swing.JPanel p_info;
    private javax.swing.JPanel p_scroll;
    private javax.swing.JPanel p_ventana;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JScrollPane scroll_tabla;
    private javax.swing.JLabel subtitulo;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel titulo10;
    private javax.swing.JLabel titulo12;
    private javax.swing.JLabel titulo14;
    private javax.swing.JLabel titulo15;
    private javax.swing.JLabel titulo16;
    private javax.swing.JLabel titulo17;
    private javax.swing.JLabel titulo18;
    private javax.swing.JLabel titulo19;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    private javax.swing.JLabel titulo4;
    private javax.swing.JLabel titulo5;
    private javax.swing.JLabel titulo6;
    private javax.swing.JLabel titulo7;
    private javax.swing.JLabel titulo8;
    private javax.swing.JLabel titulo9;
    private javax.swing.JTextField txtbusqueda;
    // End of variables declaration//GEN-END:variables
}
