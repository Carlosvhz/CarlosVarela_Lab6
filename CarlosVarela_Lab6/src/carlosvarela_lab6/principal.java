
package carlosvarela_lab6;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class principal extends javax.swing.JFrame {
    
    static Lugar LugarInicio, LugarFinal;

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
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
        bt_agregar = new javax.swing.JButton();
        bt_listar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();

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
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bt_agregarRestaurante)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(18, 18, 18)
                            .addComponent(cbx_categoriarestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_agregarcasa)
                            .addComponent(sp_seguridadcasa, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(49, 49, 49)
                .addComponent(bt_agregarcasa)
                .addContainerGap(87, Short.MAX_VALUE))
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rb_ocupado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_libre))
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
                                    .addComponent(sp_seguridadcancha, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(bt_agregarCanchas)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(26, 26, 26)
                .addComponent(bt_agregarCanchas)
                .addContainerGap(31, Short.MAX_VALUE))
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
                .addGap(0, 155, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(bt_agregarCarretera)
                .addGap(50, 50, 50))
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
                .addGap(16, 16, 16)
                .addComponent(bt_agregarCarretera)
                .addContainerGap(62, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jd_listarLayout = new javax.swing.GroupLayout(jd_listar.getContentPane());
        jd_listar.getContentPane().setLayout(jd_listarLayout);
        jd_listarLayout.setHorizontalGroup(
            jd_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_listarLayout.setVerticalGroup(
            jd_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_agregar.setText("Agregar");
        bt_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarMouseClicked(evt);
            }
        });
        getContentPane().add(bt_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 43, 199, 35));

        bt_listar.setText("Listar");
        getContentPane().add(bt_listar, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 109, 199, 40));
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 500, 210));

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
            
            tf_nombrerestaurante.setText("");
            tf_direccionrestaurante.setText("");
            sp_calificacion.setValue(0);
            sp_seguridad.setValue(0);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese bien los datos");
        }
    }//GEN-LAST:event_bt_agregarRestauranteMouseClicked

    private void bt_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarMouseClicked
        jd_agregar.setModal(true);
        jd_agregar.pack();
        jd_agregar.setLocationRelativeTo(null);
        jd_agregar.setVisible(true);
    }//GEN-LAST:event_bt_agregarMouseClicked

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
            carretera camino = new carretera(numero, distancia, LugarInicio, LugarFinal);
            for (int i = 0; i < lugares.size(); i++) {
                if (lugares.get(i).equals(LugarInicio)) {
                lugares.get(i).setSalida(camino);
                }
                if (lugares.get(i).equals(LugarFinal)) {
                lugares.get(i).setEntradas(camino);
                }
            }
        }
    }//GEN-LAST:event_bt_agregarCarreteraMouseClicked

    private void cbx_lugarfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_lugarfinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_lugarfinalActionPerformed

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JDialog jd_agregar;
    private javax.swing.JDialog jd_listar;
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
    // End of variables declaration//GEN-END:variables
    static ArrayList<Lugar> lugares = new ArrayList();
}
