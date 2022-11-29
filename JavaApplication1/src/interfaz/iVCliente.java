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

public class iVCliente extends javax.swing.JFrame {
    
    private Coordinador miCoordinador;
    private Color azul = new Color(23, 60, 104);
    private void inicializar(){
        this.p_seccionEliminar.setVisible(false);
        this.p_seccionActualizar.setVisible(false);
        this.p_seccionAgregar.setVisible(false);
        this.p_seccionLeer.setVisible(true);
        this.btn_leer.setBackground(new Color(87, 156, 194));
        this.btn_leer.setForeground(Color.white);
    }
    private void ocultaPanel(){
        this.p_seccionEliminar.setVisible(false);
        this.p_seccionActualizar.setVisible(false);
        this.p_seccionLeer.setVisible(false);
        this.p_seccionAgregar.setVisible(false);
    }
    
    private void colorBotones(){
        this.btn_leer.setBackground(Color.white);
        this.btn_leer.setForeground(Color.black);
        this.btn_actualizar.setBackground(Color.white);
        this.btn_actualizar.setForeground(Color.black);
        this.btn_eliminar.setBackground(Color.white);
        this.btn_eliminar.setForeground(Color.black);
        this.btn_agregar.setBackground(Color.white);
        this.btn_agregar.setForeground(Color.black);
    }
   
    Escalar escalar=new Escalar();
    
    public iVCliente() {
        initComponents();
        setTitle("Correo");
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
        this.btn_enviar.setOpaque(true);
        this.btn_enviar.setBackground(Color.white);
        this.btn_buscar.setOpaque(true);
        this.btn_buscar.setBackground(azul);
        this.btn_agregar.setOpaque(true);
        this.btn_agregar.setBackground(Color.white);
        this.btn_enviar.setOpaque(true);
        this.btn_enviar.setBackground(azul);
        this.btn_actualizar.setOpaque(true);
        this.btn_actualizar.setBackground(Color.white);
        this.btn_leer.setOpaque(true);
        this.btn_leer.setBackground(Color.white);
        this.btn_eliminar.setOpaque(true);
        this.btn_eliminar.setBackground(Color.white);
        this.btn_regresar.setOpaque(true);
        this.btn_regresar.setBackground(Color.white);
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
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        JTableHeader th2;
        th2 = this.tabla2.getTableHeader();
        Font fuente2 = new Font("Century Gothic", Font.BOLD, 18);
        th2.setFont(fuente2);
        tabla2.getTableHeader().setBackground(azul);
        tabla2.getTableHeader().setForeground(Color.white);
        //tabla2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        inicializar();
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
        titulo20 = new javax.swing.JLabel();
        btn_gerente = new javax.swing.JButton();
        imagen2 = new javax.swing.JLabel();
        p_seccionAgregar = new javax.swing.JPanel();
        p_agregar = new javax.swing.JPanel();
        titulo1 = new javax.swing.JLabel();
        subtitulo1 = new javax.swing.JLabel();
        subtitulo2 = new javax.swing.JLabel();
        subtitulo3 = new javax.swing.JLabel();
        subtitulo4 = new javax.swing.JLabel();
        txtncb = new javax.swing.JTextField();
        txtnit = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtncc = new javax.swing.JTextField();
        decorador1 = new javax.swing.JLabel();
        decorador2 = new javax.swing.JLabel();
        decorador3 = new javax.swing.JLabel();
        decorador4 = new javax.swing.JLabel();
        btn_enviar = new javax.swing.JButton();
        decorador9 = new javax.swing.JLabel();
        subtitulo13 = new javax.swing.JLabel();
        txtrut = new javax.swing.JTextField();
        decorador10 = new javax.swing.JLabel();
        subtitulo16 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        subtitulo17 = new javax.swing.JLabel();
        decorador11 = new javax.swing.JLabel();
        txttipo1 = new javax.swing.JTextField();
        subtitulo18 = new javax.swing.JLabel();
        decorador12 = new javax.swing.JLabel();
        decorador13 = new javax.swing.JLabel();
        subtitulo19 = new javax.swing.JLabel();
        txtdcliente = new javax.swing.JTextField();
        txtcrrepresentante = new javax.swing.JTextField();
        txttipo2 = new javax.swing.JTextField();
        subtitulo20 = new javax.swing.JLabel();
        decorador14 = new javax.swing.JLabel();
        txttcliente = new javax.swing.JTextField();
        subtitulo21 = new javax.swing.JLabel();
        decorador15 = new javax.swing.JLabel();
        decorador17 = new javax.swing.JLabel();
        subtitulo25 = new javax.swing.JLabel();
        txttipo3 = new javax.swing.JTextField();
        subtitulo26 = new javax.swing.JLabel();
        decorador18 = new javax.swing.JLabel();
        txtcrrepresentante1 = new javax.swing.JTextField();
        subtitulo27 = new javax.swing.JLabel();
        decorador19 = new javax.swing.JLabel();
        txtdcliente1 = new javax.swing.JTextField();
        subtitulo28 = new javax.swing.JLabel();
        decorador20 = new javax.swing.JLabel();
        txttipo5 = new javax.swing.JTextField();
        txtcrrepresentante2 = new javax.swing.JTextField();
        subtitulo29 = new javax.swing.JLabel();
        decorador21 = new javax.swing.JLabel();
        p_seccionActualizar = new javax.swing.JPanel();
        p_actualizar = new javax.swing.JPanel();
        titulo19 = new javax.swing.JLabel();
        decorador5 = new javax.swing.JLabel();
        subtitulo5 = new javax.swing.JLabel();
        decorador6 = new javax.swing.JLabel();
        subtitulo6 = new javax.swing.JLabel();
        decorador7 = new javax.swing.JLabel();
        subtitulo7 = new javax.swing.JLabel();
        decorador8 = new javax.swing.JLabel();
        subtitulo8 = new javax.swing.JLabel();
        txtdnlocorreo = new javax.swing.JTextField();
        txtdnnombre = new javax.swing.JTextField();
        cb_nitcliente = new javax.swing.JComboBox<>();
        subtitulo9 = new javax.swing.JLabel();
        txtnombreAct = new javax.swing.JTextField();
        subtitulo10 = new javax.swing.JLabel();
        txtcorreoAct = new javax.swing.JTextField();
        subtitulo11 = new javax.swing.JLabel();
        txtnumeroAct = new javax.swing.JTextField();
        btn_act = new javax.swing.JButton();
        subtitulo22 = new javax.swing.JLabel();
        decorador16 = new javax.swing.JLabel();
        subtitulo23 = new javax.swing.JLabel();
        txtdndireccion = new javax.swing.JTextField();
        txtdireccionAct = new javax.swing.JTextField();
        subtitulo12 = new javax.swing.JLabel();
        txtdnnumero1 = new javax.swing.JTextField();
        subtitulo24 = new javax.swing.JLabel();
        cb_tipo2 = new javax.swing.JComboBox<>();
        cb_tipo1 = new javax.swing.JComboBox<>();
        p_seccionLeer = new javax.swing.JPanel();
        subtitulo = new javax.swing.JLabel();
        txtbusqueda = new javax.swing.JTextField();
        p_scroll2 = new javax.swing.JPanel();
        scroll_tabla = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btn_buscar = new javax.swing.JButton();
        p_seccionEliminar = new javax.swing.JPanel();
        p_scroll3 = new javax.swing.JPanel();
        scroll_tabla1 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        p_eliminar = new javax.swing.JPanel();
        subtitulo14 = new javax.swing.JLabel();
        subtitulo15 = new javax.swing.JLabel();
        cb_direcciones2 = new javax.swing.JComboBox<>();
        btn_elim = new javax.swing.JButton();
        p_opciones = new javax.swing.JPanel();
        btn_regresar = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();
        btn_leer = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();

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
        titulo2.setText("Ventana Cliente");
        titulo2.setToolTipText("");
        titulo2.setPreferredSize(new java.awt.Dimension(679, 138));
        p_ventana.add(titulo2);
        titulo2.setBounds(460, 20, 700, 90);

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

        btn_proveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgiVPV/boton proveedor.png"))); // NOI18N
        btn_proveedor.setBorder(null);

        btn_empresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgiVPV/boton empresa.png"))); // NOI18N
        btn_empresa.setBorder(null);

        btn_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton_seleccionado.png"))); // NOI18N
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

        btn_repartidor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgiVPV/boton repartidor.png"))); // NOI18N
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

        titulo20.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        titulo20.setForeground(new java.awt.Color(11, 43, 90));
        titulo20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo20.setText("Gerente");
        titulo20.setToolTipText("");
        titulo20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titulo20.setPreferredSize(new java.awt.Dimension(679, 138));

        btn_gerente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgiVPV/boton gerente.png"))); // NOI18N
        btn_gerente.setToolTipText("");
        btn_gerente.setBorder(null);
        btn_gerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gerenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_botonesLayout = new javax.swing.GroupLayout(p_botones);
        p_botones.setLayout(p_botonesLayout);
        p_botonesLayout.setHorizontalGroup(
            p_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, p_botonesLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(titulo4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(p_botonesLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(p_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_gerente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo20, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(52, 52, 52))
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
                .addGap(30, 30, 30)
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
                .addGap(18, 18, 18)
                .addComponent(btn_gerente, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titulo20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(259, Short.MAX_VALUE))
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
        imagen2.setBounds(460, 100, 720, 80);

        p_seccionAgregar.setBackground(new java.awt.Color(23, 60, 104));
        p_seccionAgregar.setLayout(null);

        p_agregar.setBackground(new java.awt.Color(255, 255, 255));
        p_agregar.setLayout(null);

        titulo1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        titulo1.setForeground(new java.awt.Color(11, 43, 90));
        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo1.setText("Digita los datos nuevos");
        p_agregar.add(titulo1);
        titulo1.setBounds(0, 0, 720, 50);

        subtitulo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo1.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo1.setText("NIT");
        p_agregar.add(subtitulo1);
        subtitulo1.setBounds(50, 60, 70, 30);

        subtitulo2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo2.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo2.setText("Nombre");
        p_agregar.add(subtitulo2);
        subtitulo2.setBounds(50, 100, 80, 30);

        subtitulo3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo3.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo3.setText("NumCamaraComercio");
        p_agregar.add(subtitulo3);
        subtitulo3.setBounds(50, 180, 220, 30);

        subtitulo4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo4.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo4.setText("NumCertificadoBancario");
        p_agregar.add(subtitulo4);
        subtitulo4.setBounds(50, 220, 230, 30);
        p_agregar.add(txtncb);
        txtncb.setBounds(280, 220, 400, 30);
        p_agregar.add(txtnit);
        txtnit.setBounds(130, 60, 550, 30);
        p_agregar.add(txtnombre);
        txtnombre.setBounds(130, 100, 550, 30);
        p_agregar.add(txtncc);
        txtncc.setBounds(280, 180, 400, 30);

        decorador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        p_agregar.add(decorador1);
        decorador1.setBounds(10, 60, 30, 30);

        decorador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        p_agregar.add(decorador2);
        decorador2.setBounds(10, 100, 30, 30);

        decorador3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        p_agregar.add(decorador3);
        decorador3.setBounds(10, 180, 30, 30);

        decorador4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        p_agregar.add(decorador4);
        decorador4.setBounds(10, 220, 30, 30);

        btn_enviar.setBackground(new java.awt.Color(23, 60, 104));
        btn_enviar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_enviar.setForeground(new java.awt.Color(255, 255, 255));
        btn_enviar.setText("Agregar");
        btn_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarActionPerformed(evt);
            }
        });
        p_agregar.add(btn_enviar);
        btn_enviar.setBounds(470, 500, 180, 40);

        decorador9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        p_agregar.add(decorador9);
        decorador9.setBounds(10, 140, 30, 30);

        subtitulo13.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo13.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo13.setText("RUT");
        p_agregar.add(subtitulo13);
        subtitulo13.setBounds(50, 140, 70, 30);
        p_agregar.add(txtrut);
        txtrut.setBounds(130, 140, 550, 30);

        decorador10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        p_agregar.add(decorador10);
        decorador10.setBounds(10, 260, 30, 30);

        subtitulo16.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo16.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo16.setText("Correo");
        p_agregar.add(subtitulo16);
        subtitulo16.setBounds(50, 260, 70, 30);
        p_agregar.add(txtcorreo);
        txtcorreo.setBounds(130, 260, 290, 30);

        subtitulo17.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo17.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo17.setText("Tipo");
        p_agregar.add(subtitulo17);
        subtitulo17.setBounds(460, 260, 50, 30);

        decorador11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        p_agregar.add(decorador11);
        decorador11.setBounds(430, 260, 30, 30);
        p_agregar.add(txttipo1);
        txttipo1.setBounds(510, 260, 170, 30);

        subtitulo18.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo18.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo18.setText("Cédula representante");
        p_agregar.add(subtitulo18);
        subtitulo18.setBounds(50, 300, 200, 30);

        decorador12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        p_agregar.add(decorador12);
        decorador12.setBounds(10, 300, 30, 30);

        decorador13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        p_agregar.add(decorador13);
        decorador13.setBounds(10, 420, 30, 30);

        subtitulo19.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo19.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo19.setText("Dirección cliente");
        p_agregar.add(subtitulo19);
        subtitulo19.setBounds(50, 420, 160, 30);
        p_agregar.add(txtdcliente);
        txtdcliente.setBounds(260, 380, 140, 30);
        p_agregar.add(txtcrrepresentante);
        txtcrrepresentante.setBounds(190, 340, 170, 30);
        p_agregar.add(txttipo2);
        txttipo2.setBounds(510, 380, 170, 30);

        subtitulo20.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo20.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo20.setText("Tipo");
        p_agregar.add(subtitulo20);
        subtitulo20.setBounds(410, 460, 50, 30);

        decorador14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        p_agregar.add(decorador14);
        decorador14.setBounds(380, 460, 30, 30);
        p_agregar.add(txttcliente);
        txttcliente.setBounds(200, 460, 170, 30);

        subtitulo21.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo21.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo21.setText("Teléfono cliente");
        p_agregar.add(subtitulo21);
        subtitulo21.setBounds(50, 460, 150, 30);

        decorador15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        p_agregar.add(decorador15);
        decorador15.setBounds(10, 460, 30, 30);

        decorador17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        p_agregar.add(decorador17);
        decorador17.setBounds(450, 420, 30, 30);

        subtitulo25.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo25.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo25.setText("Ciudad");
        p_agregar.add(subtitulo25);
        subtitulo25.setBounds(480, 420, 80, 30);
        p_agregar.add(txttipo3);
        txttipo3.setBounds(460, 460, 220, 30);

        subtitulo26.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo26.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo26.setText("Teléfono representante");
        p_agregar.add(subtitulo26);
        subtitulo26.setBounds(50, 380, 210, 30);

        decorador18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        p_agregar.add(decorador18);
        decorador18.setBounds(10, 380, 30, 30);
        p_agregar.add(txtcrrepresentante1);
        txtcrrepresentante1.setBounds(260, 300, 420, 30);

        subtitulo27.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo27.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo27.setText("Nombre repre.");
        p_agregar.add(subtitulo27);
        subtitulo27.setBounds(50, 340, 210, 30);

        decorador19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        p_agregar.add(decorador19);
        decorador19.setBounds(10, 340, 30, 30);
        p_agregar.add(txtdcliente1);
        txtdcliente1.setBounds(210, 420, 230, 30);

        subtitulo28.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo28.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo28.setText("Correo ");
        p_agregar.add(subtitulo28);
        subtitulo28.setBounds(440, 380, 80, 30);

        decorador20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        p_agregar.add(decorador20);
        decorador20.setBounds(410, 380, 30, 30);
        p_agregar.add(txttipo5);
        txttipo5.setBounds(550, 420, 130, 30);
        p_agregar.add(txtcrrepresentante2);
        txtcrrepresentante2.setBounds(540, 340, 140, 30);

        subtitulo29.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo29.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo29.setText("Apellido repre.");
        p_agregar.add(subtitulo29);
        subtitulo29.setBounds(400, 340, 150, 30);

        decorador21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        p_agregar.add(decorador21);
        decorador21.setBounds(360, 340, 24, 30);

        p_seccionAgregar.add(p_agregar);
        p_agregar.setBounds(9, 11, 700, 550);

        p_ventana.add(p_seccionAgregar);
        p_seccionAgregar.setBounds(460, 190, 720, 570);

        p_seccionActualizar.setBackground(new java.awt.Color(23, 60, 104));
        p_seccionActualizar.setLayout(null);

        p_actualizar.setBackground(new java.awt.Color(255, 255, 255));
        p_actualizar.setLayout(null);

        titulo19.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        titulo19.setForeground(new java.awt.Color(11, 43, 90));
        titulo19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo19.setText("¿Qué dato se actualizará?");
        p_actualizar.add(titulo19);
        titulo19.setBounds(-10, 0, 720, 50);

        decorador5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        p_actualizar.add(decorador5);
        decorador5.setBounds(30, 50, 30, 40);

        subtitulo5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo5.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo5.setText("Dato nuevo:");
        p_actualizar.add(subtitulo5);
        subtitulo5.setBounds(30, 250, 130, 20);

        decorador6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        p_actualizar.add(decorador6);
        decorador6.setBounds(30, 130, 30, 30);

        subtitulo6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo6.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo6.setText("Nombre:");
        p_actualizar.add(subtitulo6);
        subtitulo6.setBounds(60, 130, 100, 30);

        decorador7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        p_actualizar.add(decorador7);
        decorador7.setBounds(30, 210, 30, 30);

        subtitulo7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo7.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo7.setText("Correo empresa");
        p_actualizar.add(subtitulo7);
        subtitulo7.setBounds(60, 210, 146, 30);

        decorador8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        p_actualizar.add(decorador8);
        decorador8.setBounds(30, 290, 30, 40);

        subtitulo8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo8.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo8.setText("Número teléfonico");
        p_actualizar.add(subtitulo8);
        subtitulo8.setBounds(70, 290, 180, 40);
        p_actualizar.add(txtdnlocorreo);
        txtdnlocorreo.setBounds(170, 250, 220, 22);
        p_actualizar.add(txtdnnombre);
        txtdnnombre.setBounds(170, 170, 500, 22);

        cb_nitcliente.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cb_nitcliente.setForeground(new java.awt.Color(11, 43, 90));
        cb_nitcliente.setMaximumRowCount(200);
        cb_nitcliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        p_actualizar.add(cb_nitcliente);
        cb_nitcliente.setBounds(30, 90, 640, 30);

        subtitulo9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo9.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo9.setText("Elige NIT del cliente a actualizar");
        p_actualizar.add(subtitulo9);
        subtitulo9.setBounds(60, 50, 310, 40);

        txtnombreAct.setEditable(false);
        p_actualizar.add(txtnombreAct);
        txtnombreAct.setBounds(170, 140, 500, 22);

        subtitulo10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo10.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo10.setText("Tipo:");
        p_actualizar.add(subtitulo10);
        subtitulo10.setBounds(400, 250, 50, 20);

        txtcorreoAct.setEditable(false);
        p_actualizar.add(txtcorreoAct);
        txtcorreoAct.setBounds(250, 220, 420, 20);

        subtitulo11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo11.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo11.setText("Dato nuevo:");
        p_actualizar.add(subtitulo11);
        subtitulo11.setBounds(30, 170, 130, 20);

        txtnumeroAct.setEditable(false);
        p_actualizar.add(txtnumeroAct);
        txtnumeroAct.setBounds(260, 300, 410, 22);

        btn_act.setBackground(new java.awt.Color(23, 60, 104));
        btn_act.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_act.setForeground(new java.awt.Color(255, 255, 255));
        btn_act.setText("Actualizar");
        btn_act.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actActionPerformed(evt);
            }
        });
        p_actualizar.add(btn_act);
        btn_act.setBounds(490, 490, 180, 40);

        subtitulo22.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo22.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo22.setText("Dirección cliente");
        p_actualizar.add(subtitulo22);
        subtitulo22.setBounds(70, 370, 180, 40);

        decorador16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        p_actualizar.add(decorador16);
        decorador16.setBounds(30, 370, 30, 40);

        subtitulo23.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo23.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo23.setText("Dato nuevo:");
        p_actualizar.add(subtitulo23);
        subtitulo23.setBounds(30, 410, 130, 20);
        p_actualizar.add(txtdndireccion);
        txtdndireccion.setBounds(170, 410, 500, 22);

        txtdireccionAct.setEditable(false);
        p_actualizar.add(txtdireccionAct);
        txtdireccionAct.setBounds(260, 380, 410, 22);

        subtitulo12.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo12.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo12.setText("Dato nuevo:");
        p_actualizar.add(subtitulo12);
        subtitulo12.setBounds(30, 330, 130, 20);
        p_actualizar.add(txtdnnumero1);
        txtdnnumero1.setBounds(170, 330, 220, 22);

        subtitulo24.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo24.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo24.setText("Tipo:");
        p_actualizar.add(subtitulo24);
        subtitulo24.setBounds(400, 330, 50, 20);

        cb_tipo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        p_actualizar.add(cb_tipo2);
        cb_tipo2.setBounds(460, 330, 210, 22);

        cb_tipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        p_actualizar.add(cb_tipo1);
        cb_tipo1.setBounds(460, 250, 210, 22);

        p_seccionActualizar.add(p_actualizar);
        p_actualizar.setBounds(6, 6, 710, 540);

        p_ventana.add(p_seccionActualizar);
        p_seccionActualizar.setBounds(460, 190, 720, 550);

        p_seccionLeer.setBackground(new java.awt.Color(23, 60, 104));
        p_seccionLeer.setLayout(null);

        subtitulo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo.setForeground(new java.awt.Color(255, 255, 255));
        subtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitulo.setText("Busqueda rapida:");
        p_seccionLeer.add(subtitulo);
        subtitulo.setBounds(10, 10, 190, 40);

        txtbusqueda.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtbusqueda.setForeground(new java.awt.Color(23, 60, 104));
        txtbusqueda.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtbusqueda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.lightGray, java.awt.Color.darkGray));
        p_seccionLeer.add(txtbusqueda);
        txtbusqueda.setBounds(210, 10, 440, 40);

        p_scroll2.setBackground(new java.awt.Color(255, 255, 255));

        tabla.setAutoCreateRowSorter(true);
        tabla.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        tabla.setForeground(new java.awt.Color(11, 43, 90));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIT", "Nombre", "RUT", "Camara comercio", "Certificado Bancario", "Correo", "Cédula representante", "Dirección", "Teléfono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Long.class, java.lang.Long.class, java.lang.Long.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, false
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
        scroll_tabla.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setPreferredWidth(200);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(200);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(200);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(200);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(200);
            tabla.getColumnModel().getColumn(5).setPreferredWidth(200);
            tabla.getColumnModel().getColumn(6).setPreferredWidth(200);
            tabla.getColumnModel().getColumn(7).setPreferredWidth(200);
            tabla.getColumnModel().getColumn(8).setPreferredWidth(200);
        }

        javax.swing.GroupLayout p_scroll2Layout = new javax.swing.GroupLayout(p_scroll2);
        p_scroll2.setLayout(p_scroll2Layout);
        p_scroll2Layout.setHorizontalGroup(
            p_scroll2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(p_scroll2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(p_scroll2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(scroll_tabla, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        p_scroll2Layout.setVerticalGroup(
            p_scroll2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
            .addGroup(p_scroll2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(p_scroll2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(scroll_tabla, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        p_seccionLeer.add(p_scroll2);
        p_scroll2.setBounds(10, 60, 700, 450);

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgiCorreo/boton lupa.png"))); // NOI18N
        btn_buscar.setBorder(null);
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        p_seccionLeer.add(btn_buscar);
        btn_buscar.setBounds(660, 10, 50, 40);

        p_ventana.add(p_seccionLeer);
        p_seccionLeer.setBounds(460, 200, 720, 540);

        p_seccionEliminar.setBackground(new java.awt.Color(23, 60, 104));
        p_seccionEliminar.setLayout(null);

        p_scroll3.setBackground(new java.awt.Color(255, 255, 255));

        tabla2.setAutoCreateRowSorter(true);
        tabla2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        tabla2.setForeground(new java.awt.Color(11, 43, 90));
        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIT", "Nombre", "RUT", "Camara comercio", "Certificado Bancario", "Correo", "Cédula representante", "Dirección", "Teléfono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Long.class, java.lang.Long.class, java.lang.Long.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla2.setEnabled(false);
        tabla2.setGridColor(new java.awt.Color(0, 0, 0));
        tabla2.setOpaque(false);
        tabla2.setRequestFocusEnabled(false);
        tabla2.setRowHeight(30);
        tabla2.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tabla2.setSelectionForeground(new java.awt.Color(11, 43, 90));
        tabla2.setShowGrid(true);
        tabla2.getTableHeader().setResizingAllowed(false);
        tabla2.getTableHeader().setReorderingAllowed(false);
        scroll_tabla1.setViewportView(tabla2);
        if (tabla2.getColumnModel().getColumnCount() > 0) {
            tabla2.getColumnModel().getColumn(0).setPreferredWidth(200);
            tabla2.getColumnModel().getColumn(1).setPreferredWidth(200);
            tabla2.getColumnModel().getColumn(2).setPreferredWidth(200);
            tabla2.getColumnModel().getColumn(3).setPreferredWidth(200);
            tabla2.getColumnModel().getColumn(4).setPreferredWidth(200);
            tabla2.getColumnModel().getColumn(5).setPreferredWidth(200);
            tabla2.getColumnModel().getColumn(6).setPreferredWidth(200);
            tabla2.getColumnModel().getColumn(7).setPreferredWidth(200);
            tabla2.getColumnModel().getColumn(8).setPreferredWidth(200);
        }

        javax.swing.GroupLayout p_scroll3Layout = new javax.swing.GroupLayout(p_scroll3);
        p_scroll3.setLayout(p_scroll3Layout);
        p_scroll3Layout.setHorizontalGroup(
            p_scroll3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(p_scroll3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(p_scroll3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(scroll_tabla1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        p_scroll3Layout.setVerticalGroup(
            p_scroll3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(p_scroll3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(p_scroll3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(scroll_tabla1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        p_seccionEliminar.add(p_scroll3);
        p_scroll3.setBounds(10, 10, 500, 500);

        p_eliminar.setBackground(new java.awt.Color(255, 255, 255));
        p_eliminar.setLayout(null);

        subtitulo14.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo14.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo14.setText("eliminar:");
        p_eliminar.add(subtitulo14);
        subtitulo14.setBounds(50, 30, 80, 50);

        subtitulo15.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo15.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo15.setText("NIT a ");
        p_eliminar.add(subtitulo15);
        subtitulo15.setBounds(60, 10, 60, 50);

        cb_direcciones2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cb_direcciones2.setForeground(new java.awt.Color(11, 43, 90));
        cb_direcciones2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        p_eliminar.add(cb_direcciones2);
        cb_direcciones2.setBounds(10, 90, 170, 40);

        btn_elim.setBackground(new java.awt.Color(23, 60, 104));
        btn_elim.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_elim.setForeground(new java.awt.Color(255, 255, 255));
        btn_elim.setText("Eliminar");
        btn_elim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_elimActionPerformed(evt);
            }
        });
        p_eliminar.add(btn_elim);
        btn_elim.setBounds(20, 160, 140, 30);

        p_seccionEliminar.add(p_eliminar);
        p_eliminar.setBounds(520, 10, 190, 260);

        p_ventana.add(p_seccionEliminar);
        p_seccionEliminar.setBounds(460, 190, 720, 550);

        p_opciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p_opciones.setLayout(null);

        btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton_regresar.png"))); // NOI18N
        btn_regresar.setText("Regresar a inicio");
        btn_regresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });
        p_opciones.add(btn_regresar);
        btn_regresar.setBounds(0, 440, 190, 110);

        btn_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgiDireccion/boton agregar.png"))); // NOI18N
        btn_agregar.setText("Agregar datos");
        btn_agregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        p_opciones.add(btn_agregar);
        btn_agregar.setBounds(0, 0, 190, 110);

        btn_leer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgiDireccion/boton leer.png"))); // NOI18N
        btn_leer.setText("   Leer datos");
        btn_leer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_leer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_leerActionPerformed(evt);
            }
        });
        p_opciones.add(btn_leer);
        btn_leer.setBounds(0, 110, 190, 110);

        btn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgiDireccion/boton actualizar.png"))); // NOI18N
        btn_actualizar.setText("  Actualizar datos");
        btn_actualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        p_opciones.add(btn_actualizar);
        btn_actualizar.setBounds(0, 220, 190, 110);

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgiDireccion/boton eliminar.png"))); // NOI18N
        btn_eliminar.setText("Eliminar datos");
        btn_eliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        p_opciones.add(btn_eliminar);
        btn_eliminar.setBounds(0, 330, 190, 110);

        p_ventana.add(p_opciones);
        p_opciones.setBounds(200, 0, 190, 800);

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

    private void btn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarActionPerformed
    
    }//GEN-LAST:event_btn_enviarActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        ocultaPanel();
        this.p_seccionAgregar.setVisible(true);
        colorBotones();
        this.btn_agregar.setBackground(new Color(87, 156, 194));
        this.btn_agregar.setForeground(Color.white);
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_leerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_leerActionPerformed
        ocultaPanel();
        this.p_seccionLeer.setVisible(true);
        colorBotones();
        this.btn_leer.setBackground(new Color(87, 156, 194));
        this.btn_leer.setForeground(Color.white);
    }//GEN-LAST:event_btn_leerActionPerformed

    private void btn_actActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_actActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        ocultaPanel();
        this.p_seccionActualizar.setVisible(true);
        colorBotones();
        this.btn_actualizar.setBackground(new Color(87, 156, 194));
        this.btn_actualizar.setForeground(Color.white);
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_elimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_elimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_elimActionPerformed

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
       iVPVendedor iprincipal = new iVPVendedor();
        this.setVisible(false);
        iprincipal.setVisible(true);
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
       ocultaPanel();
       this.p_seccionEliminar.setVisible(true);
       colorBotones();
       this.btn_eliminar.setBackground(new Color(87, 156, 194));
       this.btn_eliminar.setForeground(Color.white);
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_gerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gerenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_gerenteActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_act;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_catalogo;
    private javax.swing.JButton btn_cliente;
    private javax.swing.JButton btn_correo;
    private javax.swing.JButton btn_descripcion;
    private javax.swing.JButton btn_direccion;
    private javax.swing.JButton btn_directorio;
    private javax.swing.JButton btn_elim;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_empresa;
    private javax.swing.JButton btn_enviar;
    private javax.swing.JButton btn_envios;
    private javax.swing.JButton btn_gerente;
    private javax.swing.JButton btn_leer;
    private javax.swing.JButton btn_producto;
    private javax.swing.JButton btn_proveedor;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JButton btn_repartidor;
    private javax.swing.JButton btn_repreLegal;
    private javax.swing.JButton btn_solicitudes;
    private javax.swing.JButton btn_telefono;
    private javax.swing.JComboBox<String> cb_direcciones2;
    private javax.swing.JComboBox<String> cb_nitcliente;
    private javax.swing.JComboBox<String> cb_tipo1;
    private javax.swing.JComboBox<String> cb_tipo2;
    private javax.swing.JLabel decorador1;
    private javax.swing.JLabel decorador10;
    private javax.swing.JLabel decorador11;
    private javax.swing.JLabel decorador12;
    private javax.swing.JLabel decorador13;
    private javax.swing.JLabel decorador14;
    private javax.swing.JLabel decorador15;
    private javax.swing.JLabel decorador16;
    private javax.swing.JLabel decorador17;
    private javax.swing.JLabel decorador18;
    private javax.swing.JLabel decorador19;
    private javax.swing.JLabel decorador2;
    private javax.swing.JLabel decorador20;
    private javax.swing.JLabel decorador21;
    private javax.swing.JLabel decorador3;
    private javax.swing.JLabel decorador4;
    private javax.swing.JLabel decorador5;
    private javax.swing.JLabel decorador6;
    private javax.swing.JLabel decorador7;
    private javax.swing.JLabel decorador8;
    private javax.swing.JLabel decorador9;
    private javax.swing.JLabel imagen2;
    private javax.swing.JLabel logoRinber;
    private javax.swing.JPanel p_actualizar;
    private javax.swing.JPanel p_agregar;
    private javax.swing.JPanel p_botones;
    private javax.swing.JPanel p_eliminar;
    private javax.swing.JPanel p_opciones;
    private javax.swing.JPanel p_scroll;
    private javax.swing.JPanel p_scroll2;
    private javax.swing.JPanel p_scroll3;
    private javax.swing.JPanel p_seccionActualizar;
    private javax.swing.JPanel p_seccionAgregar;
    private javax.swing.JPanel p_seccionEliminar;
    private javax.swing.JPanel p_seccionLeer;
    private javax.swing.JPanel p_ventana;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JScrollPane scroll_tabla;
    private javax.swing.JScrollPane scroll_tabla1;
    private javax.swing.JLabel subtitulo;
    private javax.swing.JLabel subtitulo1;
    private javax.swing.JLabel subtitulo10;
    private javax.swing.JLabel subtitulo11;
    private javax.swing.JLabel subtitulo12;
    private javax.swing.JLabel subtitulo13;
    private javax.swing.JLabel subtitulo14;
    private javax.swing.JLabel subtitulo15;
    private javax.swing.JLabel subtitulo16;
    private javax.swing.JLabel subtitulo17;
    private javax.swing.JLabel subtitulo18;
    private javax.swing.JLabel subtitulo19;
    private javax.swing.JLabel subtitulo2;
    private javax.swing.JLabel subtitulo20;
    private javax.swing.JLabel subtitulo21;
    private javax.swing.JLabel subtitulo22;
    private javax.swing.JLabel subtitulo23;
    private javax.swing.JLabel subtitulo24;
    private javax.swing.JLabel subtitulo25;
    private javax.swing.JLabel subtitulo26;
    private javax.swing.JLabel subtitulo27;
    private javax.swing.JLabel subtitulo28;
    private javax.swing.JLabel subtitulo29;
    private javax.swing.JLabel subtitulo3;
    private javax.swing.JLabel subtitulo4;
    private javax.swing.JLabel subtitulo5;
    private javax.swing.JLabel subtitulo6;
    private javax.swing.JLabel subtitulo7;
    private javax.swing.JLabel subtitulo8;
    private javax.swing.JLabel subtitulo9;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla2;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo10;
    private javax.swing.JLabel titulo12;
    private javax.swing.JLabel titulo14;
    private javax.swing.JLabel titulo15;
    private javax.swing.JLabel titulo16;
    private javax.swing.JLabel titulo17;
    private javax.swing.JLabel titulo18;
    private javax.swing.JLabel titulo19;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo20;
    private javax.swing.JLabel titulo3;
    private javax.swing.JLabel titulo4;
    private javax.swing.JLabel titulo5;
    private javax.swing.JLabel titulo6;
    private javax.swing.JLabel titulo7;
    private javax.swing.JLabel titulo8;
    private javax.swing.JLabel titulo9;
    private javax.swing.JTextField txtbusqueda;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtcorreoAct;
    private javax.swing.JTextField txtcrrepresentante;
    private javax.swing.JTextField txtcrrepresentante1;
    private javax.swing.JTextField txtcrrepresentante2;
    private javax.swing.JTextField txtdcliente;
    private javax.swing.JTextField txtdcliente1;
    private javax.swing.JTextField txtdireccionAct;
    private javax.swing.JTextField txtdndireccion;
    private javax.swing.JTextField txtdnlocorreo;
    private javax.swing.JTextField txtdnnombre;
    private javax.swing.JTextField txtdnnumero1;
    private javax.swing.JTextField txtncb;
    private javax.swing.JTextField txtncc;
    private javax.swing.JTextField txtnit;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnombreAct;
    private javax.swing.JTextField txtnumeroAct;
    private javax.swing.JTextField txtrut;
    private javax.swing.JTextField txttcliente;
    private javax.swing.JTextField txttipo1;
    private javax.swing.JTextField txttipo2;
    private javax.swing.JTextField txttipo3;
    private javax.swing.JTextField txttipo5;
    // End of variables declaration//GEN-END:variables
}
