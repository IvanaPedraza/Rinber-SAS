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
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;

import javax.swing.JTextField;
import javax.swing.border.Border;
import modelo.vo.solicitudProductoVo;

public class iVSolicitudes extends javax.swing.JFrame {
    
    private Coordinador miCoordinador;
    private Color azul = new Color(23, 60, 104);
    /*
    private void inicializar(){
        this.btn_leer.setBackground(new Color(87, 156, 194));
        this.btn_leer.setForeground(Color.white);
    }
    */
    private void ocultaPanel(){
        miCoordinador.cerrarSolicitudProdPanLeer();
        miCoordinador.cerrarSolicitudProdPanActualizar();
        miCoordinador.cerrarSolicitudProdPanLeer();
        miCoordinador.cerrarSolicitudProdPanAgregar();
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
    
    public iVSolicitudes() {
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
        th = this.tablaSol_Leer.getTableHeader();
        Font fuente = new Font("Century Gothic", Font.BOLD, 18);
        th.setFont(fuente);
        tablaSol_Leer.getTableHeader().setBackground(azul);
        tablaSol_Leer.getTableHeader().setForeground(Color.white);
        //tablaSol_Leer.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        JTableHeader th2;
        th2 = this.tablaSol_Eli.getTableHeader();
        Font fuente2 = new Font("Century Gothic", Font.BOLD, 18);
        th2.setFont(fuente2);
        tablaSol_Eli.getTableHeader().setBackground(azul);
        tablaSol_Eli.getTableHeader().setForeground(Color.white);
        //tablaSol_Eli.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        
    }
    
    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
    }
    
    public JPanel enviarPanelLeer() {
        return p_seccionLeer;
    }
    
    public JPanel enviarPanelAgregar() {

        return p_seccionAgregar;
    }

    public JPanel enviarPanelActualizar() {

        return p_seccionActualizar;
    }

    public JPanel enviarPanelEliminar() {

        return p_seccionEliminar;
    }
    
    public JTable enviarTabla_Leer() {
        return tablaSol_Leer;
    }

    public JTable enviarTabla_Eliminar() {
        return tablaSol_Eli;
    }
    
    public JComboBox enviarComboSolicitudesAct() {
        return cb_solicitudesAct;
    }
    
    public JComboBox enviarComboSolicitudesEli() {
        return cb_solicitudesEli;
    }
    
    public JTextField enviarVendedor(){
        return txtcvendedor;
    }
    
    private void registrarNuevaSoli() {

        solicitudProductoVo nuevaSolicitud = new solicitudProductoVo();
        Long clienteSeleccionado = (Long) cb_clientes.getSelectedItem();
        nuevaSolicitud.setNumSolicitud(Integer.parseInt(txtid.getText().trim()));
        nuevaSolicitud.setTotalIva(Double.parseDouble(txtiva.getText().trim()));
        nuevaSolicitud.setTotalCompra(Double.parseDouble(txtcompra.getText().trim()));
        nuevaSolicitud.setNitCliente(clienteSeleccionado);
        nuevaSolicitud.setVenCedula(Integer.parseInt(miCoordinador.devolverUsuario()));
        Date nuevaFecha = new Date(2022/11/9);
        nuevaSolicitud.setFechaFacturacion(nuevaFecha);

        String retorno = miCoordinador.agregarNuevaSolicitud(nuevaSolicitud,String.valueOf(clienteSeleccionado));

        if (retorno.equals("OK")) {
            JOptionPane.showMessageDialog(null, "¡La dirección fue agregada con éxito!");
            txtid.setText("");
            txtiva.setText("");
            txtcompra.setText("");
            txtcvendedor.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "La dirección no se pudo agregar, verifique el error.");
        }
    }
    
    public JComboBox enviarComboSolicitudesAgre() {
        return cb_clientes;
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
        titulo20 = new javax.swing.JLabel();
        imagen2 = new javax.swing.JLabel();
        p_seccionEliminar = new javax.swing.JPanel();
        p_scroll3 = new javax.swing.JPanel();
        scroll_tabla1 = new javax.swing.JScrollPane();
        tablaSol_Eli = new javax.swing.JTable();
        p_eliminar = new javax.swing.JPanel();
        subtitulo14 = new javax.swing.JLabel();
        subtitulo15 = new javax.swing.JLabel();
        cb_solicitudesEli = new javax.swing.JComboBox<>();
        btn_elim = new javax.swing.JButton();
        p_seccionLeer = new javax.swing.JPanel();
        subtitulo = new javax.swing.JLabel();
        txtbusqueda = new javax.swing.JTextField();
        p_scroll2 = new javax.swing.JPanel();
        scroll_tabla = new javax.swing.JScrollPane();
        tablaSol_Leer = new javax.swing.JTable();
        btn_buscar = new javax.swing.JButton();
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
        txtdniva = new javax.swing.JTextField();
        txtdnfecha = new javax.swing.JTextField();
        cb_solicitudesAct = new javax.swing.JComboBox<>();
        subtitulo9 = new javax.swing.JLabel();
        txtfechaAct = new javax.swing.JTextField();
        txtivaAct = new javax.swing.JTextField();
        subtitulo11 = new javax.swing.JLabel();
        txtcompraAct = new javax.swing.JTextField();
        btn_act = new javax.swing.JButton();
        subtitulo12 = new javax.swing.JLabel();
        txtdncompra = new javax.swing.JTextField();
        p_seccionAgregar = new javax.swing.JPanel();
        p_agregar = new javax.swing.JPanel();
        titulo1 = new javax.swing.JLabel();
        subtitulo1 = new javax.swing.JLabel();
        subtitulo3 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtcompra = new javax.swing.JTextField();
        decorador1 = new javax.swing.JLabel();
        decorador3 = new javax.swing.JLabel();
        btn_enviar = new javax.swing.JButton();
        decorador9 = new javax.swing.JLabel();
        subtitulo13 = new javax.swing.JLabel();
        txtiva = new javax.swing.JTextField();
        subtitulo18 = new javax.swing.JLabel();
        decorador12 = new javax.swing.JLabel();
        decorador13 = new javax.swing.JLabel();
        subtitulo19 = new javax.swing.JLabel();
        txtcvendedor = new javax.swing.JTextField();
        cb_clientes = new javax.swing.JComboBox<>();
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
        titulo2.setText("Ventana Solicitudes");
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

        btn_solicitudes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton_seleccionado.png"))); // NOI18N
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

        btn_gerente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgiVPV/boton gerente.png"))); // NOI18N
        btn_gerente.setToolTipText("");
        btn_gerente.setBorder(null);

        titulo20.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        titulo20.setForeground(new java.awt.Color(11, 43, 90));
        titulo20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo20.setText("Gerente");
        titulo20.setToolTipText("");
        titulo20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titulo20.setPreferredSize(new java.awt.Dimension(679, 138));

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
                .addGap(30, 30, 30)
                .addComponent(btn_gerente, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titulo20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(247, Short.MAX_VALUE))
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

        p_seccionEliminar.setBackground(new java.awt.Color(23, 60, 104));
        p_seccionEliminar.setLayout(null);

        p_scroll3.setBackground(new java.awt.Color(255, 255, 255));

        tablaSol_Eli.setAutoCreateRowSorter(true);
        tablaSol_Eli.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        tablaSol_Eli.setForeground(new java.awt.Color(11, 43, 90));
        tablaSol_Eli.setModel(new javax.swing.table.DefaultTableModel(
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
                "Id solicitud", "Fecha facturación", "Total IVA", "Total compra", "Cédula vendedor", "NIT Cliente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Long.class, java.lang.Long.class
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
        tablaSol_Eli.setEnabled(false);
        tablaSol_Eli.setGridColor(new java.awt.Color(0, 0, 0));
        tablaSol_Eli.setOpaque(false);
        tablaSol_Eli.setRequestFocusEnabled(false);
        tablaSol_Eli.setRowHeight(30);
        tablaSol_Eli.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tablaSol_Eli.setSelectionForeground(new java.awt.Color(11, 43, 90));
        tablaSol_Eli.setShowGrid(true);
        tablaSol_Eli.getTableHeader().setResizingAllowed(false);
        tablaSol_Eli.getTableHeader().setReorderingAllowed(false);
        scroll_tabla1.setViewportView(tablaSol_Eli);
        if (tablaSol_Eli.getColumnModel().getColumnCount() > 0) {
            tablaSol_Eli.getColumnModel().getColumn(0).setPreferredWidth(200);
            tablaSol_Eli.getColumnModel().getColumn(1).setPreferredWidth(200);
            tablaSol_Eli.getColumnModel().getColumn(2).setPreferredWidth(200);
            tablaSol_Eli.getColumnModel().getColumn(3).setPreferredWidth(200);
            tablaSol_Eli.getColumnModel().getColumn(4).setPreferredWidth(200);
            tablaSol_Eli.getColumnModel().getColumn(5).setPreferredWidth(200);
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
        subtitulo15.setText("Id solicitud a ");
        p_eliminar.add(subtitulo15);
        subtitulo15.setBounds(30, 10, 120, 50);

        cb_solicitudesEli.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cb_solicitudesEli.setForeground(new java.awt.Color(11, 43, 90));
        cb_solicitudesEli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        p_eliminar.add(cb_solicitudesEli);
        cb_solicitudesEli.setBounds(10, 90, 170, 40);

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

        tablaSol_Leer.setAutoCreateRowSorter(true);
        tablaSol_Leer.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        tablaSol_Leer.setForeground(new java.awt.Color(11, 43, 90));
        tablaSol_Leer.setModel(new javax.swing.table.DefaultTableModel(
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
                "Id solicitud", "Fecha facturación", "Total IVA", "Total compra", "Cédula vendedor", "NIT Cliente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Long.class, java.lang.Long.class
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
        tablaSol_Leer.setEnabled(false);
        tablaSol_Leer.setGridColor(new java.awt.Color(0, 0, 0));
        tablaSol_Leer.setOpaque(false);
        tablaSol_Leer.setRequestFocusEnabled(false);
        tablaSol_Leer.setRowHeight(30);
        tablaSol_Leer.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tablaSol_Leer.setSelectionForeground(new java.awt.Color(11, 43, 90));
        tablaSol_Leer.setShowGrid(true);
        tablaSol_Leer.getTableHeader().setResizingAllowed(false);
        tablaSol_Leer.getTableHeader().setReorderingAllowed(false);
        scroll_tabla.setViewportView(tablaSol_Leer);
        if (tablaSol_Leer.getColumnModel().getColumnCount() > 0) {
            tablaSol_Leer.getColumnModel().getColumn(0).setPreferredWidth(200);
            tablaSol_Leer.getColumnModel().getColumn(1).setPreferredWidth(200);
            tablaSol_Leer.getColumnModel().getColumn(2).setPreferredWidth(200);
            tablaSol_Leer.getColumnModel().getColumn(3).setPreferredWidth(200);
            tablaSol_Leer.getColumnModel().getColumn(4).setPreferredWidth(200);
            tablaSol_Leer.getColumnModel().getColumn(5).setPreferredWidth(200);
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
        subtitulo5.setBounds(30, 280, 130, 30);

        decorador6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        p_actualizar.add(decorador6);
        decorador6.setBounds(30, 130, 30, 40);

        subtitulo6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo6.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo6.setText("Fecha:");
        p_actualizar.add(subtitulo6);
        subtitulo6.setBounds(60, 130, 100, 40);

        decorador7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        p_actualizar.add(decorador7);
        decorador7.setBounds(30, 230, 30, 40);

        subtitulo7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo7.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo7.setText("Total IVA:");
        p_actualizar.add(subtitulo7);
        subtitulo7.setBounds(60, 230, 90, 40);

        decorador8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        p_actualizar.add(decorador8);
        decorador8.setBounds(30, 330, 30, 50);

        subtitulo8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo8.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo8.setText("Total compra:");
        p_actualizar.add(subtitulo8);
        subtitulo8.setBounds(60, 330, 140, 50);
        p_actualizar.add(txtdniva);
        txtdniva.setBounds(170, 280, 500, 30);
        p_actualizar.add(txtdnfecha);
        txtdnfecha.setBounds(170, 180, 500, 30);

        cb_solicitudesAct.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cb_solicitudesAct.setForeground(new java.awt.Color(11, 43, 90));
        cb_solicitudesAct.setMaximumRowCount(200);
        cb_solicitudesAct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        p_actualizar.add(cb_solicitudesAct);
        cb_solicitudesAct.setBounds(30, 90, 640, 30);

        subtitulo9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo9.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo9.setText("Elige id de la solicitud a actualizar");
        p_actualizar.add(subtitulo9);
        subtitulo9.setBounds(60, 50, 310, 40);

        txtfechaAct.setEditable(false);
        p_actualizar.add(txtfechaAct);
        txtfechaAct.setBounds(170, 142, 500, 30);

        txtivaAct.setEditable(false);
        p_actualizar.add(txtivaAct);
        txtivaAct.setBounds(170, 240, 500, 30);

        subtitulo11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo11.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo11.setText("Dato nuevo:");
        p_actualizar.add(subtitulo11);
        subtitulo11.setBounds(30, 180, 130, 30);

        txtcompraAct.setEditable(false);
        p_actualizar.add(txtcompraAct);
        txtcompraAct.setBounds(200, 342, 470, 30);

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

        subtitulo12.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo12.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo12.setText("Dato nuevo:");
        p_actualizar.add(subtitulo12);
        subtitulo12.setBounds(30, 380, 130, 30);
        p_actualizar.add(txtdncompra);
        txtdncompra.setBounds(170, 380, 500, 30);

        p_seccionActualizar.add(p_actualizar);
        p_actualizar.setBounds(6, 6, 710, 540);

        p_ventana.add(p_seccionActualizar);
        p_seccionActualizar.setBounds(460, 190, 720, 550);

        p_seccionAgregar.setBackground(new java.awt.Color(23, 60, 104));
        p_seccionAgregar.setLayout(null);

        p_agregar.setBackground(new java.awt.Color(255, 255, 255));
        p_agregar.setLayout(null);

        titulo1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        titulo1.setForeground(new java.awt.Color(11, 43, 90));
        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo1.setText("Digita los datos nuevos");
        p_agregar.add(titulo1);
        titulo1.setBounds(0, 0, 720, 80);

        subtitulo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo1.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo1.setText("id");
        p_agregar.add(subtitulo1);
        subtitulo1.setBounds(50, 60, 70, 40);

        subtitulo3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo3.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo3.setText("Total compra");
        p_agregar.add(subtitulo3);
        subtitulo3.setBounds(50, 180, 130, 40);
        p_agregar.add(txtid);
        txtid.setBounds(220, 60, 400, 40);
        p_agregar.add(txtcompra);
        txtcompra.setBounds(220, 180, 400, 40);

        decorador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        p_agregar.add(decorador1);
        decorador1.setBounds(10, 60, 30, 40);

        decorador3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        p_agregar.add(decorador3);
        decorador3.setBounds(10, 180, 30, 40);

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
        btn_enviar.setBounds(470, 370, 180, 40);

        decorador9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        p_agregar.add(decorador9);
        decorador9.setBounds(10, 120, 30, 40);

        subtitulo13.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo13.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo13.setText("Total IVA");
        p_agregar.add(subtitulo13);
        subtitulo13.setBounds(50, 120, 90, 40);
        p_agregar.add(txtiva);
        txtiva.setBounds(220, 120, 400, 40);

        subtitulo18.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo18.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo18.setText("Cédula vendedor");
        p_agregar.add(subtitulo18);
        subtitulo18.setBounds(50, 240, 170, 40);

        decorador12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        p_agregar.add(decorador12);
        decorador12.setBounds(10, 240, 30, 40);

        decorador13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        p_agregar.add(decorador13);
        decorador13.setBounds(10, 300, 30, 40);

        subtitulo19.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo19.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo19.setText("NIT cliente");
        p_agregar.add(subtitulo19);
        subtitulo19.setBounds(50, 300, 160, 40);
        p_agregar.add(txtcvendedor);
        txtcvendedor.setBounds(220, 240, 400, 40);

        cb_clientes.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cb_clientes.setForeground(new java.awt.Color(11, 43, 90));
        cb_clientes.setMaximumRowCount(200);
        cb_clientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        p_agregar.add(cb_clientes);
        cb_clientes.setBounds(220, 300, 400, 40);

        p_seccionAgregar.add(p_agregar);
        p_agregar.setBounds(9, 11, 700, 440);

        p_ventana.add(p_seccionAgregar);
        p_seccionAgregar.setBounds(460, 190, 720, 560);

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
        registrarNuevaSoli();
    }//GEN-LAST:event_btn_enviarActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        ocultaPanel();
        miCoordinador.abrirSolicitudProdPanAgregar();
        colorBotones();
        this.btn_agregar.setBackground(new Color(87, 156, 194));
        this.btn_agregar.setForeground(Color.white);
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_leerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_leerActionPerformed
        ocultaPanel();
        miCoordinador.abrirSolicitudProdPanLeer();
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
    private javax.swing.JComboBox<String> cb_clientes;
    private javax.swing.JComboBox<String> cb_solicitudesAct;
    private javax.swing.JComboBox<String> cb_solicitudesEli;
    private javax.swing.JLabel decorador1;
    private javax.swing.JLabel decorador12;
    private javax.swing.JLabel decorador13;
    private javax.swing.JLabel decorador3;
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
    private javax.swing.JLabel subtitulo11;
    private javax.swing.JLabel subtitulo12;
    private javax.swing.JLabel subtitulo13;
    private javax.swing.JLabel subtitulo14;
    private javax.swing.JLabel subtitulo15;
    private javax.swing.JLabel subtitulo18;
    private javax.swing.JLabel subtitulo19;
    private javax.swing.JLabel subtitulo3;
    private javax.swing.JLabel subtitulo5;
    private javax.swing.JLabel subtitulo6;
    private javax.swing.JLabel subtitulo7;
    private javax.swing.JLabel subtitulo8;
    private javax.swing.JLabel subtitulo9;
    private javax.swing.JTable tablaSol_Eli;
    private javax.swing.JTable tablaSol_Leer;
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
    private javax.swing.JTextField txtcompra;
    private javax.swing.JTextField txtcompraAct;
    private javax.swing.JTextField txtcvendedor;
    private javax.swing.JTextField txtdncompra;
    private javax.swing.JTextField txtdnfecha;
    private javax.swing.JTextField txtdniva;
    private javax.swing.JTextField txtfechaAct;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtiva;
    private javax.swing.JTextField txtivaAct;
    // End of variables declaration//GEN-END:variables
}
