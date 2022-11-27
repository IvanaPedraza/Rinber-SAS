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
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;

import javax.swing.JTextField;
import javax.swing.border.Border;
import modelo.vo.direccionVo;

public class iVDireccion extends javax.swing.JFrame {
    
    private Coordinador miCoordinador;
    private Color azul = new Color(23, 60, 104);
    
    /*
    private void inicializar(){
        this.btn_leer.setBackground(new Color(87, 156, 194));
        this.btn_leer.setForeground(Color.white);
    }
    */
    private void ocultaPanel(){
        miCoordinador.cerrarDireccionPanEliminar();
        miCoordinador.cerrarDireccionPanActualizar();
        miCoordinador.cerrarDireccionPanLeer();
        miCoordinador.cerrarDireccionPanAgregar();
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
    
    public iVDireccion() {
        initComponents();
        setTitle("Correo");
        p_scroll.setBackground(Color.WHITE);
        p_botones.setBackground(Color.white);
        p_ventana.setBackground(azul);
        this.setLocation(200, 0);  
        
        escalar.escalarLabel(this.logoRinber, "/img/imgiVPV/loguito-redondito.png");
        escalar.escalarLabel(this.imagen2, "/img/imgiVPV/Franja.jpg");
        
        //this.cb_direcciones.setSelectedIndex(0);
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
        this.btn_ordenes.setOpaque(true);
        this.btn_ordenes.setBackground(Color.white);
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
        this.btn_enviar_agregar.setOpaque(true);
        this.btn_enviar_agregar.setBackground(Color.white);
        this.btn_buscar.setOpaque(true);
        this.btn_buscar.setBackground(azul);
        this.btn_agregar.setOpaque(true);
        this.btn_agregar.setBackground(Color.white);
        this.btn_enviar_agregar.setOpaque(true);
        this.btn_enviar_agregar.setBackground(azul);
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
        this.titulo13.setText(t4);
        
        JTableHeader th;
        th = this.tablaLeer.getTableHeader();
        Font fuente = new Font("Century Gothic", Font.BOLD, 18);
        th.setFont(fuente);
        tablaLeer.getTableHeader().setBackground(azul);
        tablaLeer.getTableHeader().setForeground(Color.white);
        //tablaLeer.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        JTableHeader th2;
        th2 = this.tablaEliminar.getTableHeader();
        Font fuente2 = new Font("Century Gothic", Font.BOLD, 18);
        th2.setFont(fuente2);
        tablaEliminar.getTableHeader().setBackground(azul);
        tablaEliminar.getTableHeader().setForeground(Color.white);
        //tablaEliminar.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        //inicializar();
    }
    
    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
    }
    
    public JPanel enviarPanelLeer(){
        this.btn_leer.setBackground(new Color(87, 156, 194));
        this.btn_leer.setForeground(Color.white);
        return p_seccionLeer;
    }
    
    public JPanel enviarPanelAgregar(){
        this.btn_agregar.setBackground(new Color(87, 156, 194));
        this.btn_agregar.setForeground(Color.white);
        return p_seccionAgregar;
    }
    
    public JPanel enviarPanelActualizar(){
        this.btn_actualizar.setBackground(new Color(87, 156, 194));
        this.btn_actualizar.setForeground(Color.white);
        return p_seccionActualizar;
    }
    
    public JPanel enviarPanelEliminar(){
        this.btn_eliminar.setBackground(new Color(87, 156, 194));
        this.btn_eliminar.setForeground(Color.white);
        return p_seccionEliminar;
    }
    
    public JTable enviarTabla_Leer(){
        return tablaLeer;
    }
    
    
    public JTable enviarTabla_Eliminar(){
        return tablaEliminar;
    }
    
    public JComboBox enviarComboDireccionesAct(){
        return cb_direcciones;
    }
    
    private void registrarNuevaDire() {
        
        direccionVo nuevaDireccion = new direccionVo();
        
        nuevaDireccion.setDirDireccion(txtdireccion_agregar.getText().trim());
        nuevaDireccion.setDirCiudad(txtciudad_agregar.getText().trim());
        nuevaDireccion.setDirLocalidad(txtlocalidad_agregar.getText().trim());
        nuevaDireccion.setDirBarrio(txtbarrio_agregar.getText().trim());
        
        String retorno = miCoordinador.agregarNuevaDireccion(nuevaDireccion);
        
        if(retorno.equals("OK")){
            JOptionPane.showMessageDialog(null, "¡La dirección fue agregada con éxito!");
            txtdireccion_agregar.setText("");
            txtciudad_agregar.setText("");
            txtlocalidad_agregar.setText("");
            txtbarrio_agregar.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "La dirección no se pudo agregar, verifique el error.");
        }
    }
    
    private void consultarDireccion() {
        String valorSeleccionado = (String) cb_direcciones.getSelectedItem();
        direccionVo direccionConsulta = miCoordinador.consultarDireccion(valorSeleccionado);
        
        if(direccionConsulta!=null){
            txtciudadAct.setText(direccionConsulta.getDirCiudad());
            txtlocalidadAct.setText(direccionConsulta.getDirLocalidad());
            txtbarrioAct.setText(direccionConsulta.getDirBarrio());
        }else{
            //JOptionPane.showMessageDialog(null, "La dirección no se encuentra en el sistema.");
        }
    }
    
    private void actualizarDire() {
        
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
        btn_ordenes = new javax.swing.JButton();
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
        titulo13 = new javax.swing.JLabel();
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
        txtbarrio_agregar = new javax.swing.JTextField();
        txtdireccion_agregar = new javax.swing.JTextField();
        txtciudad_agregar = new javax.swing.JTextField();
        txtlocalidad_agregar = new javax.swing.JTextField();
        decorador1 = new javax.swing.JLabel();
        decorador2 = new javax.swing.JLabel();
        decorador3 = new javax.swing.JLabel();
        decorador4 = new javax.swing.JLabel();
        btn_enviar_agregar = new javax.swing.JButton();
        p_seccionLeer = new javax.swing.JPanel();
        subtitulo = new javax.swing.JLabel();
        txtbusqueda = new javax.swing.JTextField();
        p_scroll2 = new javax.swing.JPanel();
        scroll_tabla = new javax.swing.JScrollPane();
        tablaLeer = new javax.swing.JTable();
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
        txtdnbarrio_actu = new javax.swing.JTextField();
        txtdnlocalidad_actu = new javax.swing.JTextField();
        txtdnCiudad_actu = new javax.swing.JTextField();
        txtdnDireccion_actu = new javax.swing.JTextField();
        cb_direcciones = new javax.swing.JComboBox<>();
        subtitulo9 = new javax.swing.JLabel();
        txtciudadAct = new javax.swing.JTextField();
        subtitulo10 = new javax.swing.JLabel();
        txtlocalidadAct = new javax.swing.JTextField();
        subtitulo11 = new javax.swing.JLabel();
        txtbarrioAct = new javax.swing.JTextField();
        subtitulo12 = new javax.swing.JLabel();
        btn_act = new javax.swing.JButton();
        p_seccionEliminar = new javax.swing.JPanel();
        p_scroll3 = new javax.swing.JPanel();
        scroll_tabla1 = new javax.swing.JScrollPane();
        tablaEliminar = new javax.swing.JTable();
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
        titulo2.setText("Ventana Dirección");
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

        btn_direccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton_seleccionado.png"))); // NOI18N
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

        btn_ordenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgiVPV/boton ordenes.png"))); // NOI18N
        btn_ordenes.setBorder(null);

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

        titulo13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        titulo13.setForeground(new java.awt.Color(11, 43, 90));
        titulo13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo13.setToolTipText("");
        titulo13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titulo13.setPreferredSize(new java.awt.Dimension(679, 138));

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

        javax.swing.GroupLayout p_botonesLayout = new javax.swing.GroupLayout(p_botones);
        p_botones.setLayout(p_botonesLayout);
        p_botonesLayout.setHorizontalGroup(
            p_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, p_botonesLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(titulo4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(p_botonesLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(p_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_gerente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo20, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_catalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo18, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(btn_ordenes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_envios, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_directorio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
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
                .addComponent(btn_ordenes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titulo13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(117, Short.MAX_VALUE))
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
        titulo1.setBounds(-10, 30, 720, 80);

        subtitulo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo1.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo1.setText("Dirección:");
        p_agregar.add(subtitulo1);
        subtitulo1.setBounds(70, 140, 100, 40);

        subtitulo2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo2.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo2.setText("Ciudad:");
        p_agregar.add(subtitulo2);
        subtitulo2.setBounds(70, 220, 100, 40);

        subtitulo3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo3.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo3.setText("Localidad:");
        p_agregar.add(subtitulo3);
        subtitulo3.setBounds(70, 300, 100, 40);

        subtitulo4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo4.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo4.setText("Barrio:");
        p_agregar.add(subtitulo4);
        subtitulo4.setBounds(70, 380, 100, 40);
        p_agregar.add(txtbarrio_agregar);
        txtbarrio_agregar.setBounds(200, 380, 440, 40);
        p_agregar.add(txtdireccion_agregar);
        txtdireccion_agregar.setBounds(200, 140, 440, 40);
        p_agregar.add(txtciudad_agregar);
        txtciudad_agregar.setBounds(200, 220, 440, 40);
        p_agregar.add(txtlocalidad_agregar);
        txtlocalidad_agregar.setBounds(200, 300, 440, 40);

        decorador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        p_agregar.add(decorador1);
        decorador1.setBounds(30, 140, 30, 40);

        decorador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        p_agregar.add(decorador2);
        decorador2.setBounds(30, 220, 30, 40);

        decorador3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        p_agregar.add(decorador3);
        decorador3.setBounds(30, 300, 30, 40);

        decorador4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        p_agregar.add(decorador4);
        decorador4.setBounds(30, 380, 30, 40);

        btn_enviar_agregar.setBackground(new java.awt.Color(23, 60, 104));
        btn_enviar_agregar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_enviar_agregar.setForeground(new java.awt.Color(255, 255, 255));
        btn_enviar_agregar.setText("Agregar");
        btn_enviar_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviar_agregarActionPerformed(evt);
            }
        });
        p_agregar.add(btn_enviar_agregar);
        btn_enviar_agregar.setBounds(460, 450, 180, 40);

        p_seccionAgregar.add(p_agregar);
        p_agregar.setBounds(9, 11, 700, 510);

        p_ventana.add(p_seccionAgregar);
        p_seccionAgregar.setBounds(460, 210, 720, 530);

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
        txtbusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbusquedaActionPerformed(evt);
            }
        });
        p_seccionLeer.add(txtbusqueda);
        txtbusqueda.setBounds(210, 10, 440, 40);

        p_scroll2.setBackground(new java.awt.Color(255, 255, 255));

        tablaLeer.setAutoCreateRowSorter(true);
        tablaLeer.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        tablaLeer.setForeground(new java.awt.Color(11, 43, 90));
        tablaLeer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Dirección", "Ciudad", "Localidad", "Barrio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaLeer.setEnabled(false);
        tablaLeer.setGridColor(new java.awt.Color(0, 0, 0));
        tablaLeer.setOpaque(false);
        tablaLeer.setRequestFocusEnabled(false);
        tablaLeer.setRowHeight(30);
        tablaLeer.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tablaLeer.setSelectionForeground(new java.awt.Color(11, 43, 90));
        tablaLeer.setShowGrid(true);
        tablaLeer.getTableHeader().setResizingAllowed(false);
        tablaLeer.getTableHeader().setReorderingAllowed(false);
        scroll_tabla.setViewportView(tablaLeer);
        if (tablaLeer.getColumnModel().getColumnCount() > 0) {
            tablaLeer.getColumnModel().getColumn(0).setPreferredWidth(200);
            tablaLeer.getColumnModel().getColumn(1).setPreferredWidth(200);
            tablaLeer.getColumnModel().getColumn(2).setPreferredWidth(200);
            tablaLeer.getColumnModel().getColumn(3).setPreferredWidth(200);
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
        subtitulo5.setBounds(30, 340, 130, 30);

        decorador6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        p_actualizar.add(decorador6);
        decorador6.setBounds(30, 180, 30, 40);

        subtitulo6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo6.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo6.setText("Ciudad:");
        p_actualizar.add(subtitulo6);
        subtitulo6.setBounds(60, 180, 100, 40);

        decorador7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        p_actualizar.add(decorador7);
        decorador7.setBounds(30, 280, 30, 40);

        subtitulo7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo7.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo7.setText("Localidad:");
        p_actualizar.add(subtitulo7);
        subtitulo7.setBounds(60, 280, 100, 40);

        decorador8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo (1).png"))); // NOI18N
        p_actualizar.add(decorador8);
        decorador8.setBounds(30, 380, 30, 40);

        subtitulo8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo8.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo8.setText("Barrio:");
        p_actualizar.add(subtitulo8);
        subtitulo8.setBounds(70, 380, 100, 40);
        p_actualizar.add(txtdnbarrio_actu);
        txtdnbarrio_actu.setBounds(170, 440, 500, 30);
        p_actualizar.add(txtdnlocalidad_actu);
        txtdnlocalidad_actu.setBounds(170, 340, 500, 30);
        p_actualizar.add(txtdnCiudad_actu);
        txtdnCiudad_actu.setBounds(170, 240, 500, 30);
        p_actualizar.add(txtdnDireccion_actu);
        txtdnDireccion_actu.setBounds(170, 140, 500, 30);

        cb_direcciones.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cb_direcciones.setForeground(new java.awt.Color(11, 43, 90));
        cb_direcciones.setMaximumRowCount(200);
        cb_direcciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_direcciones.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_direccionesItemStateChanged(evt);
            }
        });
        cb_direcciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_direccionesActionPerformed(evt);
            }
        });
        p_actualizar.add(cb_direcciones);
        cb_direcciones.setBounds(30, 90, 640, 30);

        subtitulo9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo9.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo9.setText("Dirección que se actualizará:");
        p_actualizar.add(subtitulo9);
        subtitulo9.setBounds(60, 50, 270, 40);

        txtciudadAct.setEditable(false);
        p_actualizar.add(txtciudadAct);
        txtciudadAct.setBounds(170, 190, 500, 30);

        subtitulo10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo10.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo10.setText("Dato nuevo:");
        p_actualizar.add(subtitulo10);
        subtitulo10.setBounds(30, 440, 130, 30);

        txtlocalidadAct.setEditable(false);
        p_actualizar.add(txtlocalidadAct);
        txtlocalidadAct.setBounds(170, 290, 500, 30);

        subtitulo11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo11.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo11.setText("Dato nuevo:");
        p_actualizar.add(subtitulo11);
        subtitulo11.setBounds(30, 240, 130, 30);

        txtbarrioAct.setEditable(false);
        txtbarrioAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbarrioActActionPerformed(evt);
            }
        });
        p_actualizar.add(txtbarrioAct);
        txtbarrioAct.setBounds(170, 390, 500, 30);

        subtitulo12.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subtitulo12.setForeground(new java.awt.Color(11, 43, 90));
        subtitulo12.setText("Dato nuevo:");
        p_actualizar.add(subtitulo12);
        subtitulo12.setBounds(30, 140, 130, 30);

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

        p_seccionActualizar.add(p_actualizar);
        p_actualizar.setBounds(6, 6, 710, 540);

        p_ventana.add(p_seccionActualizar);
        p_seccionActualizar.setBounds(460, 190, 720, 550);

        p_seccionEliminar.setBackground(new java.awt.Color(23, 60, 104));
        p_seccionEliminar.setLayout(null);

        p_scroll3.setBackground(new java.awt.Color(255, 255, 255));

        tablaEliminar.setAutoCreateRowSorter(true);
        tablaEliminar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        tablaEliminar.setForeground(new java.awt.Color(11, 43, 90));
        tablaEliminar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Dirección", "Ciudad", "Localidad", "Barrio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaEliminar.setEnabled(false);
        tablaEliminar.setGridColor(new java.awt.Color(0, 0, 0));
        tablaEliminar.setOpaque(false);
        tablaEliminar.setRequestFocusEnabled(false);
        tablaEliminar.setRowHeight(30);
        tablaEliminar.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tablaEliminar.setSelectionForeground(new java.awt.Color(11, 43, 90));
        tablaEliminar.setShowGrid(true);
        tablaEliminar.getTableHeader().setResizingAllowed(false);
        tablaEliminar.getTableHeader().setReorderingAllowed(false);
        scroll_tabla1.setViewportView(tablaEliminar);
        if (tablaEliminar.getColumnModel().getColumnCount() > 0) {
            tablaEliminar.getColumnModel().getColumn(0).setPreferredWidth(200);
            tablaEliminar.getColumnModel().getColumn(1).setPreferredWidth(200);
            tablaEliminar.getColumnModel().getColumn(2).setPreferredWidth(200);
            tablaEliminar.getColumnModel().getColumn(3).setPreferredWidth(200);
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
        subtitulo15.setText("Dirección a ");
        p_eliminar.add(subtitulo15);
        subtitulo15.setBounds(40, 10, 120, 50);

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
        miCoordinador.abrirVentanaCorreo();
        miCoordinador.cerrarVentanaDireccion();
    }//GEN-LAST:event_btn_correoActionPerformed

    private void btn_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_telefonoActionPerformed
        miCoordinador.abrirVentanaTelefono();
        miCoordinador.cerrarVentanaDireccion();
    }//GEN-LAST:event_btn_telefonoActionPerformed

    private void btn_enviar_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviar_agregarActionPerformed
        registrarNuevaDire();
    }//GEN-LAST:event_btn_enviar_agregarActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        ocultaPanel();
        miCoordinador.abrirDireccionPanAgregar();
        colorBotones();
        
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_leerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_leerActionPerformed
        ocultaPanel();
        miCoordinador.abrirDireccionPanLeer();
        colorBotones();
        
    }//GEN-LAST:event_btn_leerActionPerformed

    private void btn_actActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actActionPerformed
        actualizarDire();
    }//GEN-LAST:event_btn_actActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        ocultaPanel();
        miCoordinador.abrirDireccionPanActualizar();
        colorBotones();
        
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_elimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_elimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_elimActionPerformed

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        miCoordinador.cerrarVentanaDireccion();
        miCoordinador.abrirVentanaPrincipal();
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
       ocultaPanel();
       miCoordinador.abrirDireccionPanEliminar();
       colorBotones();
       
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void txtbusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbusquedaActionPerformed

    private void cb_direccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_direccionesActionPerformed
        consultarDireccion();
    }//GEN-LAST:event_cb_direccionesActionPerformed

    private void cb_direccionesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_direccionesItemStateChanged
        
    }//GEN-LAST:event_cb_direccionesItemStateChanged

    private void txtbarrioActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbarrioActActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbarrioActActionPerformed



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
    private javax.swing.JButton btn_enviar_agregar;
    private javax.swing.JButton btn_envios;
    private javax.swing.JButton btn_gerente;
    private javax.swing.JButton btn_leer;
    private javax.swing.JButton btn_ordenes;
    private javax.swing.JButton btn_producto;
    private javax.swing.JButton btn_proveedor;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JButton btn_repartidor;
    private javax.swing.JButton btn_repreLegal;
    private javax.swing.JButton btn_solicitudes;
    private javax.swing.JButton btn_telefono;
    private javax.swing.JComboBox<String> cb_direcciones;
    private javax.swing.JComboBox<String> cb_direcciones2;
    private javax.swing.JLabel decorador1;
    private javax.swing.JLabel decorador2;
    private javax.swing.JLabel decorador3;
    private javax.swing.JLabel decorador4;
    private javax.swing.JLabel decorador5;
    private javax.swing.JLabel decorador6;
    private javax.swing.JLabel decorador7;
    private javax.swing.JLabel decorador8;
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
    private javax.swing.JLabel subtitulo14;
    private javax.swing.JLabel subtitulo15;
    private javax.swing.JLabel subtitulo2;
    private javax.swing.JLabel subtitulo3;
    private javax.swing.JLabel subtitulo4;
    private javax.swing.JLabel subtitulo5;
    private javax.swing.JLabel subtitulo6;
    private javax.swing.JLabel subtitulo7;
    private javax.swing.JLabel subtitulo8;
    private javax.swing.JLabel subtitulo9;
    private javax.swing.JTable tablaEliminar;
    private javax.swing.JTable tablaLeer;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo10;
    private javax.swing.JLabel titulo12;
    private javax.swing.JLabel titulo13;
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
    private javax.swing.JTextField txtbarrioAct;
    private javax.swing.JTextField txtbarrio_agregar;
    private javax.swing.JTextField txtbusqueda;
    private javax.swing.JTextField txtciudadAct;
    private javax.swing.JTextField txtciudad_agregar;
    private javax.swing.JTextField txtdireccion_agregar;
    private javax.swing.JTextField txtdnCiudad_actu;
    private javax.swing.JTextField txtdnDireccion_actu;
    private javax.swing.JTextField txtdnbarrio_actu;
    private javax.swing.JTextField txtdnlocalidad_actu;
    private javax.swing.JTextField txtlocalidadAct;
    private javax.swing.JTextField txtlocalidad_agregar;
    // End of variables declaration//GEN-END:variables

    

    

    
    
}
