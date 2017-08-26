
package carlosvarela_lab6;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class principal extends javax.swing.JFrame {
    
    static Lugar LugarInicio, LugarFinal;
    static int posicion;
    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_agregar = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_nombrerestaurante = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_direccionrestaurante = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sp_seguridad = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        cbx_categoriarestaurante = new javax.swing.JComboBox<>();
        sp_calificacion = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        bt_agregarRestaurante = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        tf_nombrecasa = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_direccioncasa = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        sp_seguridadcasa = new javax.swing.JSpinner();
        bt_agregarcasa = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tf_nombrecanchas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_direccioncancha = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        sp_seguridadcancha = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        cbx_categoriacancha = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        rb_ocupado = new javax.swing.JRadioButton();
        rb_libre = new javax.swing.JRadioButton();
        bt_agregarCanchas = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cbx_lugarfinal = new javax.swing.JComboBox<>();
        bt_agregarCarretera = new javax.swing.JButton();
        sp_numero = new javax.swing.JSpinner();
        jLabel17 = new javax.swing.JLabel();
        sp_distancia = new javax.swing.JSpinner();
        cbx_lugarinicio = new javax.swing.JComboBox<>();
        estado_cancha = new javax.swing.ButtonGroup();
        jd_listar = new javax.swing.JDialog();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_lista = new javax.swing.JList<>();
        cbx_lugar = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        cbx_listar = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_tabla = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        cbx_jtree = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tree_cosas = new javax.swing.JTree();
        pop = new javax.swing.JPopupMenu();
        mi_eliminar = new javax.swing.JMenuItem();
        jLabel18 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        bt_listar = new javax.swing.JButton();
        bt_agregar = new javax.swing.JButton();

        jLabel1.setText("Nombre: ");

        jLabel2.setText("Direccion: ");

        jLabel3.setText("Nivel de seguridad: ");

        sp_seguridad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel12.setText("Categoria:");

        cbx_categoriarestaurante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chino", "Mexicano", "Italiana", "Comida rapida" }));

        sp_calificacion.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        jLabel4.setText("Calificación: ");

        bt_agregarRestaurante.setText("Agregar");
        bt_agregarRestaurante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarRestauranteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(sp_calificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sp_seguridad, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tf_direccionrestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_nombrerestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(cbx_categoriarestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_agregarRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_nombrerestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_direccionrestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sp_seguridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cbx_categoriarestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sp_calificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(bt_agregarRestaurante)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar Restaurante", jPanel1);

        jLabel9.setText("Nombre: ");

        jLabel10.setText("Direccion: ");

        jLabel11.setText("Nivel de seguridad: ");

        sp_seguridadcasa.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        bt_agregarcasa.setText("Agregar");
        bt_agregarcasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarcasaMouseClicked(evt);
            }
        });
        bt_agregarcasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_agregarcasaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(tf_direccioncasa, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_nombrecasa, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sp_seguridadcasa, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(bt_agregarcasa, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_nombrecasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tf_direccioncasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(sp_seguridadcasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(bt_agregarcasa, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar  Casa", jPanel3);

        jLabel6.setText("Nombre: ");

        jLabel7.setText("Direccion: ");

        jLabel8.setText("Nivel de seguridad: ");

        sp_seguridadcancha.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel5.setText("Categoria: ");

        cbx_categoriacancha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Football", "Volleyball", "Basquetball", "Tenis", " " }));

        jLabel13.setText("Estado: ");

        estado_cancha.add(rb_ocupado);
        rb_ocupado.setText("Ocupado");

        estado_cancha.add(rb_libre);
        rb_libre.setText("Libre");

        bt_agregarCanchas.setText("Agregar");
        bt_agregarCanchas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarCanchasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(tf_direccioncancha, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_nombrecanchas, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbx_categoriacancha, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(sp_seguridadcancha, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_ocupado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_libre)))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_agregarCanchas, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_nombrecanchas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_direccioncancha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(sp_seguridadcancha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbx_categoriacancha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(rb_ocupado)
                    .addComponent(rb_libre))
                .addGap(18, 18, 18)
                .addComponent(bt_agregarCanchas)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar Canchas", jPanel2);

        jLabel14.setText("Numero: ");

        jLabel15.setText("Lugar Inicio: ");

        jLabel16.setText("Lugar final: ");

        cbx_lugarfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_lugarfinalActionPerformed(evt);
            }
        });

        bt_agregarCarretera.setText("Agregar");
        bt_agregarCarretera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarCarreteraMouseClicked(evt);
            }
        });

        jLabel17.setText("Distancia: ");

        sp_distancia.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(sp_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sp_distancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbx_lugarinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbx_lugarfinal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addComponent(bt_agregarCarretera, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(sp_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(sp_distancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cbx_lugarinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cbx_lugarfinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(bt_agregarCarretera, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar Carretera", jPanel4);

        javax.swing.GroupLayout jd_agregarLayout = new javax.swing.GroupLayout(jd_agregar.getContentPane());
        jd_agregar.getContentPane().setLayout(jd_agregarLayout);
        jd_agregarLayout.setHorizontalGroup(
            jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_agregarLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jd_agregarLayout.setVerticalGroup(
            jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jLabel19.setText("Seleccione: ");

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jl_lista.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(jl_lista);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        cbx_lugar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_lugarItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbx_lugar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(cbx_lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Lista ", jPanel5);

        cbx_listar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Restaurantes", "Canchas", "Carreteras" }));
        cbx_listar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_listarItemStateChanged(evt);
            }
        });

        jLabel20.setText("Seleccione: ");

        jt_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jt_tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_tablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jt_tabla);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx_listar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_listar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Tabla", jPanel6);

        jLabel21.setText("Seleccione: ");

        cbx_jtree.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Restaurantes", "Canchas" }));
        cbx_jtree.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_jtreeItemStateChanged(evt);
            }
        });

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane3.setViewportView(tree_cosas);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbx_jtree, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(cbx_jtree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        jTabbedPane2.addTab("Tree", jPanel7);

        javax.swing.GroupLayout jd_listarLayout = new javax.swing.GroupLayout(jd_listar.getContentPane());
        jd_listar.getContentPane().setLayout(jd_listarLayout);
        jd_listarLayout.setHorizontalGroup(
            jd_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jd_listarLayout.setVerticalGroup(
            jd_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        mi_eliminar.setText("Eliminar");
        mi_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_eliminarActionPerformed(evt);
            }
        });
        pop.add(mi_eliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel18.setText("Laboratorio # 6");

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bt_listar.setText("Listar");
        bt_listar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_listarMouseClicked(evt);
            }
        });

        bt_agregar.setText("Agregar");
        bt_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bt_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_listar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(bt_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_listar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_agregarcasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_agregarcasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_agregarcasaActionPerformed

    private void bt_agregarRestauranteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarRestauranteMouseClicked
        String nombre, direccion, categoria = "";
        int nivel_seguridad, calificacion;
        restaurantes restaurante;
        try {
            nombre = tf_nombrerestaurante.getText();
            direccion = tf_direccionrestaurante.getText();
            if (cbx_categoriarestaurante.getSelectedItem().toString().equals("Chino")) {
                categoria = "Chino";
            }else if (cbx_categoriarestaurante.getSelectedItem().toString().equals("Mexicano")) {
                categoria = "Mexicano";
            }else if (cbx_categoriarestaurante.getSelectedItem().toString().equals("Italiana")) {
                categoria = "Italiana";
            }else if (cbx_categoriarestaurante.getSelectedItem().toString().equals("Comida rapida")) {
                categoria = "Comida rapida";
            }
            nivel_seguridad = (Integer)sp_seguridad.getValue();
            calificacion = (Integer)sp_calificacion.getValue();
            restaurante = new restaurantes(categoria, calificacion, nombre, direccion, nivel_seguridad, new carretera());
            lugares.add(restaurante);
            JOptionPane.showMessageDialog(null, "Nuevo restaurante Ingresado");
            
            DefaultComboBoxModel lugares = (DefaultComboBoxModel)cbx_lugarfinal.getModel();
            lugares.addElement(restaurante); 
            cbx_lugarfinal.setModel(lugares);
            cbx_lugarinicio.setModel(lugares);
            cbx_lugar.setModel(lugares);
            
            tf_nombrerestaurante.setText("");
            tf_direccionrestaurante.setText("");
            sp_calificacion.setValue(0);
            sp_seguridad.setValue(0);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese bien los datos");
        }
    }//GEN-LAST:event_bt_agregarRestauranteMouseClicked

    private void bt_agregarcasaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarcasaMouseClicked
        String nombre, direccion, categoria = "";
        int nivel_seguridad, calificacion;
        try {
            nombre = tf_nombrecasa.getText();
            direccion = tf_direccioncasa.getText();
            nivel_seguridad = (Integer)sp_seguridadcasa.getValue();
            casa casa = new casa(nombre, direccion, nivel_seguridad);
            lugares.add(casa);
            JOptionPane.showMessageDialog(null, "Nueva casa Ingresada");
            
            DefaultComboBoxModel lugares = (DefaultComboBoxModel)cbx_lugarfinal.getModel();
            lugares.addElement(casa); 
            cbx_lugarfinal.setModel(lugares);
            cbx_lugarinicio.setModel(lugares);
            cbx_lugar.setModel(lugares);
      
            tf_nombrecasa.setText("");
            tf_direccioncasa.setText("");
            sp_seguridadcasa.setValue(0);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese bien los datos");
        }
    }//GEN-LAST:event_bt_agregarcasaMouseClicked

    private void bt_agregarCanchasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarCanchasMouseClicked
        String nombre, direccion, categoria = "";
        int nivel_seguridad, calificacion;
        boolean estado=true;
        try {
            nombre = tf_nombrecanchas.getText();
            direccion = tf_direccioncancha.getText();
            if (cbx_categoriacancha.getSelectedItem().toString().equals("Football")) {
                categoria = "Football";
            }else if (cbx_categoriacancha.getSelectedItem().toString().equals("Volleyball")) {
                categoria = "Volleyball";
            }else if (cbx_categoriacancha.getSelectedItem().toString().equals("Basquetball")) {
                categoria = "Basquetball";
            }else if (cbx_categoriacancha.getSelectedItem().toString().equals("Tenis")) {
                categoria = "Tenis";
            }
            
            if (rb_libre.isSelected()) {
                estado = true;
            }else if (rb_ocupado.isSelected()) {
                estado = false;
            }
            nivel_seguridad = (Integer)sp_seguridadcancha.getValue();
            cancha cancha = new cancha(categoria, estado , nombre, direccion, nivel_seguridad, new carretera());
            lugares.add(cancha);
            JOptionPane.showMessageDialog(null, "Nueva cancha Ingresada");
            
            DefaultComboBoxModel lugares = (DefaultComboBoxModel)cbx_lugarfinal.getModel();
            lugares.addElement(cancha); 
            cbx_lugarfinal.setModel(lugares);
            cbx_lugarinicio.setModel(lugares);
            cbx_lugar.setModel(lugares);
            tf_nombrecanchas.setText("");
            tf_direccioncancha.setText("");
            sp_seguridadcancha.setValue(0);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ingrese bien los datos");
        }
    }//GEN-LAST:event_bt_agregarCanchasMouseClicked

    private void bt_agregarCarreteraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarCarreteraMouseClicked
        int distancia, numero;
        distancia = (Integer)sp_distancia.getValue();
        numero = (Integer)sp_numero.getValue();
        
        LugarFinal = (Lugar)cbx_lugarfinal.getSelectedItem();
        LugarInicio = (Lugar)cbx_lugarinicio.getSelectedItem();
        
        if (LugarFinal.equals(LugarInicio)) {
            JOptionPane.showMessageDialog(null, "Lugares iguales, seleccione lugares diferentes");
        }else{
            if (lugares.get(lugares.indexOf(LugarInicio)).getSalida()==null) {
                carretera camino = new carretera(numero, distancia, LugarInicio, LugarFinal);
                carreteras.add(camino);
                for (int i = 0; i < lugares.size(); i++) {
                    if (lugares.get(i).equals(LugarInicio)) {
                    lugares.get(i).setSalida(camino);
                    }
                    if (lugares.get(i).equals(LugarFinal)) {
                    lugares.get(i).setEntradas(camino);
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "Este lugar de inicio, ya tiene salida");
            }
        }
    }//GEN-LAST:event_bt_agregarCarreteraMouseClicked

    private void cbx_lugarfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_lugarfinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_lugarfinalActionPerformed

    private void cbx_listarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_listarItemStateChanged
        
        if (evt.getStateChange()==2) {
            DefaultTableModel modelo = (DefaultTableModel)jt_tabla.getModel();
            modelo.setColumnCount(0);
            modelo.setRowCount(0);
            if (cbx_listar.getSelectedItem().toString().equals("Restaurantes")) {
                modelo.addColumn("Nombre");
                modelo.addColumn("Categoria");
                modelo.addColumn("Calificación");
                modelo.addColumn("Dirección");
                for (int i = 0; i < lugares.size(); i++) {
                    if (lugares.get(i) instanceof restaurantes) {
                        Object[]row = {lugares.get(i).getNombre(), ((restaurantes)lugares.get(i)).getCategoria(), 
                        ((restaurantes)lugares.get(i)).getCalificacion(), lugares.get(i).getDireccion()};
                        modelo.addRow(row);
                    }
                }
            }else if (cbx_listar.getSelectedItem().toString().equals("Canchas")) {
                modelo.addColumn("Nombre");
                modelo.addColumn("Categoria");
                modelo.addColumn("Estado");
                modelo.addColumn("Dirección");
                for (int i = 0; i < lugares.size(); i++) {
                    if (lugares.get(i) instanceof cancha) {
                        Object[]row = {lugares.get(i).getNombre(), ((cancha)lugares.get(i)).getCategoria(), 
                        ((cancha)lugares.get(i)).isEstado(), lugares.get(i).getDireccion()};
                        modelo.addRow(row);
                    }
                }
            }else if (cbx_listar.getSelectedItem().toString().equals("Carreteras")) {
                modelo.addColumn("Nombre");
                modelo.addColumn("Distancia");
                modelo.addColumn("Lugar de Inicio");
                modelo.addColumn("Lugar final");
                for (int i = 0; i < carreteras.size(); i++) {
                    if (carreteras.get(i) instanceof carretera) {
                        Object[]row = {carreteras.get(i).getNumero_unico(),carreteras.get(i).getDistancia(),carreteras.get(i).getInicio(),
                        carreteras.get(i).getFin()};
                        modelo.addRow(row);
                    }
                }
            }
            jt_tabla.setModel(modelo);
        }
    }//GEN-LAST:event_cbx_listarItemStateChanged

    private void bt_listarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_listarMouseClicked
        if (lugares.size()>0) {
            jd_listar.setModal(true);
            jd_listar.pack();
            jd_listar.setLocationRelativeTo(null);
            jd_listar.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, "No hay lugares para listar");
        }
    }//GEN-LAST:event_bt_listarMouseClicked

    private void bt_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarMouseClicked
        jd_agregar.setModal(true);
        jd_agregar.pack();
        jd_agregar.setLocationRelativeTo(null);
        jd_agregar.setVisible(true);
    }//GEN-LAST:event_bt_agregarMouseClicked

    private void cbx_jtreeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_jtreeItemStateChanged
        if (evt.getStateChange()==2) {
            DefaultTreeModel modelo = (DefaultTreeModel)tree_cosas.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)modelo.getRoot();
            
        }
    }//GEN-LAST:event_cbx_jtreeItemStateChanged

    private void mi_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_eliminarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel)jt_tabla.getModel();
        modelo.removeRow(posicion);
        jt_tabla.setModel(modelo);
    }//GEN-LAST:event_mi_eliminarActionPerformed

    private void jt_tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_tablaMouseClicked
        if (evt.isMetaDown()) {
            posicion = jt_tabla.getSelectedRowCount();
            pop.show(jt_tabla, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jt_tablaMouseClicked

    private void cbx_lugarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_lugarItemStateChanged
        if (evt.getStateChange()==2) {
            DefaultListModel modelo = (DefaultListModel)jl_lista.getModel();
            Lugar c = (Lugar)cbx_lugar.getSelectedItem();
            for (int i = 0; i < lugares.size(); i++) {
                if (lugares.get(i).getSalida()!=null&&c.getSalida()!=null) {
                    if (lugares.get(i).getSalida().getDistancia()<=c.getSalida().getDistancia()) {
                       modelo.addElement(lugares);
                    }
                }
            }
            jl_lista.setModel(modelo);
        }
    }//GEN-LAST:event_cbx_lugarItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_agregar;
    private javax.swing.JButton bt_agregarCanchas;
    private javax.swing.JButton bt_agregarCarretera;
    private javax.swing.JButton bt_agregarRestaurante;
    private javax.swing.JButton bt_agregarcasa;
    private javax.swing.JButton bt_listar;
    private javax.swing.JComboBox<String> cbx_categoriacancha;
    private javax.swing.JComboBox<String> cbx_categoriarestaurante;
    private javax.swing.JComboBox<String> cbx_jtree;
    private javax.swing.JComboBox<String> cbx_listar;
    private javax.swing.JComboBox<String> cbx_lugar;
    private javax.swing.JComboBox<String> cbx_lugarfinal;
    private javax.swing.JComboBox<String> cbx_lugarinicio;
    private javax.swing.ButtonGroup estado_cancha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JDialog jd_agregar;
    private javax.swing.JDialog jd_listar;
    private javax.swing.JList<String> jl_lista;
    private javax.swing.JTable jt_tabla;
    private javax.swing.JMenuItem mi_eliminar;
    private javax.swing.JPopupMenu pop;
    private javax.swing.JRadioButton rb_libre;
    private javax.swing.JRadioButton rb_ocupado;
    private javax.swing.JSpinner sp_calificacion;
    private javax.swing.JSpinner sp_distancia;
    private javax.swing.JSpinner sp_numero;
    private javax.swing.JSpinner sp_seguridad;
    private javax.swing.JSpinner sp_seguridadcancha;
    private javax.swing.JSpinner sp_seguridadcasa;
    private javax.swing.JTextField tf_direccioncancha;
    private javax.swing.JTextField tf_direccioncasa;
    private javax.swing.JTextField tf_direccionrestaurante;
    private javax.swing.JTextField tf_nombrecanchas;
    private javax.swing.JTextField tf_nombrecasa;
    private javax.swing.JTextField tf_nombrerestaurante;
    private javax.swing.JTree tree_cosas;
    // End of variables declaration//GEN-END:variables
    static ArrayList<Lugar> lugares = new ArrayList();
    static ArrayList<carretera> carreteras = new ArrayList();
}
