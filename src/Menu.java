
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Menu extends javax.swing.JFrame {

    
    public Menu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_crearE = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jt_paisE_crearE = new javax.swing.JTextField();
        jt_nombreE_crearE = new javax.swing.JTextField();
        jt_ciudad_crearE = new javax.swing.JTextField();
        jt_estadio_crearE = new javax.swing.JTextField();
        bt_agregarE_crearE = new javax.swing.JButton();
        jd_crearJ = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        js_edad_crearJ = new javax.swing.JSpinner();
        tf_nombre_crearJ = new javax.swing.JTextField();
        cb_posicion_crearJ = new javax.swing.JComboBox<>();
        bt_agregar_crearJ = new javax.swing.JButton();
        jd_trans = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_jugadores_trans = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtr_equipos_trans = new javax.swing.JTree();
        pp_jugadores_trans = new javax.swing.JPopupMenu();
        Modificar = new javax.swing.JMenuItem();
        Remover = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        bt_crearE_menu = new javax.swing.JButton();
        bt_crearJ_menu = new javax.swing.JButton();
        bt_trans_menu = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_opciones_menu = new javax.swing.JMenu();
        mi_crearE_menu = new javax.swing.JMenuItem();
        mi_crearJ_menu = new javax.swing.JMenuItem();
        mi_trans_menu = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Crear Equipos");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Pais del Equipo");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre del Equipo");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Ciudad");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Estadio");

        bt_agregarE_crearE.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        bt_agregarE_crearE.setText("Agregar");
        bt_agregarE_crearE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarE_crearEMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(158, 158, 158)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jt_paisE_crearE)
                            .addComponent(jt_nombreE_crearE, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(jt_ciudad_crearE)
                            .addComponent(jt_estadio_crearE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(bt_agregarE_crearE, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel2)
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jt_paisE_crearE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jt_nombreE_crearE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jt_ciudad_crearE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jt_estadio_crearE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(bt_agregarE_crearE, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        javax.swing.GroupLayout jd_crearELayout = new javax.swing.GroupLayout(jd_crearE.getContentPane());
        jd_crearE.getContentPane().setLayout(jd_crearELayout);
        jd_crearELayout.setHorizontalGroup(
            jd_crearELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_crearELayout.setVerticalGroup(
            jd_crearELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Crear Jugador");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nombre");

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Posicion");

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Edad");

        js_edad_crearJ.setModel(new javax.swing.SpinnerNumberModel(15, 15, 45, 1));

        cb_posicion_crearJ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Portero", "Defensa", "Mediocampista", "Delantero" }));

        bt_agregar_crearJ.setText("Agregar");
        bt_agregar_crearJ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregar_crearJMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(js_edad_crearJ)
                            .addComponent(tf_nombre_crearJ)
                            .addComponent(cb_posicion_crearJ, 0, 151, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(bt_agregar_crearJ, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(268, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel7)
                .addGap(62, 62, 62)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(tf_nombre_crearJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(js_edad_crearJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cb_posicion_crearJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(bt_agregar_crearJ, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_crearJLayout = new javax.swing.GroupLayout(jd_crearJ.getContentPane());
        jd_crearJ.getContentPane().setLayout(jd_crearJLayout);
        jd_crearJLayout.setHorizontalGroup(
            jd_crearJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_crearJLayout.setVerticalGroup(
            jd_crearJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Transferencias");

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Equipos");

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Jugadores");

        jl_jugadores_trans.setModel(new DefaultListModel());
        jl_jugadores_trans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_jugadores_transMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jl_jugadores_trans);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Equipos");
        jtr_equipos_trans.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane2.setViewportView(jtr_equipos_trans);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(152, 152, 152))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel11)
                .addGap(56, 56, 56)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_transLayout = new javax.swing.GroupLayout(jd_trans.getContentPane());
        jd_trans.getContentPane().setLayout(jd_transLayout);
        jd_transLayout.setHorizontalGroup(
            jd_transLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_transLayout.setVerticalGroup(
            jd_transLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Modificar.setText("jMenuItem1");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        pp_jugadores_trans.add(Modificar);

        Remover.setText("jMenuItem2");
        pp_jugadores_trans.add(Remover);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel1.setText("Bienvenido a Boroa Legacy");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 170, 312, -1));

        jToolBar1.setRollover(true);

        bt_crearE_menu.setText("Crear Equipos");
        bt_crearE_menu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_crearE_menu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_crearE_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_crearE_menuMouseClicked(evt);
            }
        });
        jToolBar1.add(bt_crearE_menu);

        bt_crearJ_menu.setText("Crear Jugadores");
        bt_crearJ_menu.setFocusable(false);
        bt_crearJ_menu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_crearJ_menu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_crearJ_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_crearJ_menuMouseClicked(evt);
            }
        });
        jToolBar1.add(bt_crearJ_menu);

        bt_trans_menu.setText("Transferencias");
        bt_trans_menu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_trans_menu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_trans_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_trans_menuMouseClicked(evt);
            }
        });
        jToolBar1.add(bt_trans_menu);

        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, 25));

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 650, 500));

        jm_opciones_menu.setText("Opciones");

        mi_crearE_menu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mi_crearE_menu.setText("Crear Equipos");
        mi_crearE_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_crearE_menuActionPerformed(evt);
            }
        });
        jm_opciones_menu.add(mi_crearE_menu);

        mi_crearJ_menu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mi_crearJ_menu.setText("Crear Jugadores");
        mi_crearJ_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_crearJ_menuActionPerformed(evt);
            }
        });
        jm_opciones_menu.add(mi_crearJ_menu);

        mi_trans_menu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mi_trans_menu.setText("Transferencias");
        mi_trans_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_trans_menuActionPerformed(evt);
            }
        });
        jm_opciones_menu.add(mi_trans_menu);

        jMenuBar1.add(jm_opciones_menu);

        jMenu4.setText("Ayuda");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mi_crearE_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_crearE_menuActionPerformed
        openCE();
    }//GEN-LAST:event_mi_crearE_menuActionPerformed

    private void mi_crearJ_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_crearJ_menuActionPerformed
        openCJ();
    }//GEN-LAST:event_mi_crearJ_menuActionPerformed

    private void mi_trans_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_trans_menuActionPerformed
        trans();
    }//GEN-LAST:event_mi_trans_menuActionPerformed

    private void bt_crearE_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_crearE_menuMouseClicked
        openCE();
    }//GEN-LAST:event_bt_crearE_menuMouseClicked

    private void bt_crearJ_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_crearJ_menuMouseClicked
        openCJ();
    }//GEN-LAST:event_bt_crearJ_menuMouseClicked

    private void bt_trans_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_trans_menuMouseClicked
        trans();
    }//GEN-LAST:event_bt_trans_menuMouseClicked

    private void bt_agregar_crearJMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregar_crearJMouseClicked
        DefaultListModel model = new DefaultListModel();
        model.addElement(new Jugadores((Integer) js_edad_crearJ.getValue(),tf_nombre_crearJ.getText(), (String) cb_posicion_crearJ.getSelectedItem()));
        
        jl_jugadores_trans.setModel(model);
        
        js_edad_crearJ.setValue(15);
        tf_nombre_crearJ.setText("");
        cb_posicion_crearJ.setSelectedItem(0);
    }//GEN-LAST:event_bt_agregar_crearJMouseClicked

    private void bt_agregarE_crearEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarE_crearEMouseClicked
        DefaultTreeModel model = (DefaultTreeModel) jtr_equipos_trans.getModel();
        
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        
        DefaultMutableTreeNode equipo = new DefaultMutableTreeNode(new Equipo(jt_nombreE_crearE.getText(),jt_paisE_crearE.getText(),jt_ciudad_crearE.getText(),jt_estadio_crearE.getText()));
        
        String pais = jt_paisE_crearE.getText();
        
        int verif = 0;
        
        for (int cont = 0; cont < root.getChildCount(); cont++) {
            if(root.getChildAt(cont).toString().equals(pais)){
                DefaultMutableTreeNode n = new DefaultMutableTreeNode(new Equipo(jt_nombreE_crearE.getText(),jt_paisE_crearE.getText(),jt_ciudad_crearE.getText(),jt_estadio_crearE.getText()));
                ((DefaultMutableTreeNode) root.getChildAt(cont)).add(n);
                verif = 1;
            }
        }
        System.out.println(verif);
        if(verif == 0){
            DefaultMutableTreeNode n
                        = new DefaultMutableTreeNode(pais);
                DefaultMutableTreeNode p
                        = new DefaultMutableTreeNode(
                                new Equipo(jt_nombreE_crearE.getText(),jt_paisE_crearE.getText(),jt_ciudad_crearE.getText(),jt_estadio_crearE.getText())
                        );
                n.add(p);
                root.add(n);
        }        
        
        model.reload();  
        
        jt_nombreE_crearE.setText("");
        jt_ciudad_crearE.setText("");
        jt_paisE_crearE.setText("");
        jt_estadio_crearE.setText("");
        
        jtr_equipos_trans.setModel(model);
    }//GEN-LAST:event_bt_agregarE_crearEMouseClicked

    private void jl_jugadores_transMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_jugadores_transMouseClicked
        if(evt.getButton() == 3){
            pp_jugadores_trans.show(jl_jugadores_trans, evt.getX(), evt.getY());
            jugador = jl_jugadores_trans.getSelectedIndex();
        }
    }//GEN-LAST:event_jl_jugadores_transMouseClicked

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        String nombre = JOptionPane.showInputDialog(jd_trans, "Ingresar nuevo nombre");
        
        String edad = JOptionPane.showInputDialog(jd_trans, "Ingresar nueva edad");
    }//GEN-LAST:event_ModificarActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    public void openCE(){
        jd_crearE.pack();
        jd_crearE.setLocationRelativeTo(this);
        jd_crearE.setVisible(true);
        
    }
    
    public void openCJ(){
        jd_crearJ.pack();
        jd_crearJ.setLocationRelativeTo(this);
        jd_crearJ.setVisible(true);
        
    }
    
    public void trans(){
        jd_trans.pack();
        jd_trans.setLocationRelativeTo(this);
        jd_trans.setVisible(true);     
    }
    
    public boolean cadena(String palabra){
        Pattern pt = Pattern.compile("^.*\\d.*$");
        Matcher m = pt.matcher(palabra);
        if(m.find()){
            return true;
        }
        else{
            return false;
        }
    }
    
    int jugador = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Modificar;
    private javax.swing.JMenuItem Remover;
    private javax.swing.JButton bt_agregarE_crearE;
    private javax.swing.JButton bt_agregar_crearJ;
    private javax.swing.JButton bt_crearE_menu;
    private javax.swing.JButton bt_crearJ_menu;
    private javax.swing.JButton bt_trans_menu;
    private javax.swing.JComboBox<String> cb_posicion_crearJ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JDialog jd_crearE;
    private javax.swing.JDialog jd_crearJ;
    private javax.swing.JDialog jd_trans;
    private javax.swing.JList<String> jl_jugadores_trans;
    private javax.swing.JMenu jm_opciones_menu;
    private javax.swing.JSpinner js_edad_crearJ;
    private javax.swing.JTextField jt_ciudad_crearE;
    private javax.swing.JTextField jt_estadio_crearE;
    private javax.swing.JTextField jt_nombreE_crearE;
    private javax.swing.JTextField jt_paisE_crearE;
    private javax.swing.JTree jtr_equipos_trans;
    private javax.swing.JMenuItem mi_crearE_menu;
    private javax.swing.JMenuItem mi_crearJ_menu;
    private javax.swing.JMenuItem mi_trans_menu;
    private javax.swing.JPopupMenu pp_jugadores_trans;
    private javax.swing.JTextField tf_nombre_crearJ;
    // End of variables declaration//GEN-END:variables
}
