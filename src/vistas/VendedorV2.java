package vistas;

import java.awt.Color;
import java.awt.Component;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import modelo.EntidadVendedor;
import modelo.VendedorDAO;

public class VendedorV2 extends javax.swing.JPanel {

    VendedorDAO vdao = new VendedorDAO();
    EntidadVendedor ED = new EntidadVendedor();
    DefaultTableModel modelo = new DefaultTableModel();
    int id;

    //clase para setear valar no legible para la columna contraseña
    class ClaveRender extends JPasswordField implements TableCellRenderer {

        public Component getTableCellRendererComponent(JTable t, Object o, boolean sel, boolean focus,
                int row, int col) {
            setText((String) t.getValueAt(row, col));
            setBorder(null);
            return this;
        }
    }

    public VendedorV2() {
        initComponents();
        listar();

    }

    void listar() {
        List<EntidadVendedor> lista = vdao.listar();
        modelo = (DefaultTableModel) tablaUsers.getModel();
        Object[] ob = new Object[8];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getNom();
            ob[2] = lista.get(i).getUser();
            ob[3] = lista.get(i).getDni();
            ob[4] = lista.get(i).getTel();
            ob[5] = lista.get(i).getEstado();
            ob[6] = lista.get(i).getTU();

            modelo.addRow(ob);

        }
        tablaUsers.setModel(modelo);
        TableColumn tc = tablaUsers.getColumnModel().getColumn(3);//Paso 1
        tc.setCellEditor(new DefaultCellEditor(new JPasswordField()));//Paso 2
        ClaveRender cr = new ClaveRender();
        tc.setCellRenderer(cr);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Txt_Nom = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        Txt_User = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        Txt_NumT = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        Cbo_Estado = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Cbo_TU = new javax.swing.JComboBox<>();
        Btn_Registrar = new javax.swing.JButton();
        Txt_Dni = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsers = new javax.swing.JTable();
        Btn_Borrar = new javax.swing.JButton();
        Btn_Update = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1070, 570));
        setPreferredSize(new java.awt.Dimension(1070, 570));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtTitulo.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        txtTitulo.setText("USUARIOS");

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel1.setText("REGISTRAR NUEVO USUARIO");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel6.setText("NOMBRE");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 20));

        Txt_Nom.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Txt_Nom.setForeground(new java.awt.Color(204, 204, 204));
        Txt_Nom.setText("Nombre del usuario");
        Txt_Nom.setBorder(null);
        Txt_Nom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Txt_NomMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_NomMousePressed(evt);
            }
        });
        Txt_Nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_NomActionPerformed(evt);
            }
        });
        jPanel1.add(Txt_Nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 180, 40));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 180, 10));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel7.setText("USUARIO");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, 20));

        Txt_User.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Txt_User.setForeground(new java.awt.Color(204, 204, 204));
        Txt_User.setText("Ingrese el usuario");
        Txt_User.setBorder(null);
        Txt_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Txt_UserMouseClicked(evt);
            }
        });
        jPanel1.add(Txt_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 180, 40));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 180, 10));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel8.setText("NUMERO TELEFONICO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 20));

        Txt_NumT.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Txt_NumT.setForeground(new java.awt.Color(204, 204, 204));
        Txt_NumT.setText("NUMERO TELEFONICO");
        Txt_NumT.setBorder(null);
        Txt_NumT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Txt_NumTMouseClicked(evt);
            }
        });
        jPanel1.add(Txt_NumT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 180, 40));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 180, 10));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel9.setText("DNI");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, 20));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 180, 10));

        Cbo_Estado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Cbo_Estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "0", "1" }));
        Cbo_Estado.setBorder(null);
        Cbo_Estado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cbo_EstadoMouseClicked(evt);
            }
        });
        jPanel1.add(Cbo_Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 180, 30));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel10.setText("ESTADO");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel11.setText("TIPO DE USUARIO");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, -1, -1));

        Cbo_TU.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Cbo_TU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "ADMINISTRADOR", "INVITADO" }));
        Cbo_TU.setBorder(null);
        Cbo_TU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cbo_TUMouseClicked(evt);
            }
        });
        jPanel1.add(Cbo_TU, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 180, 30));

        Btn_Registrar.setBackground(new java.awt.Color(28, 113, 12));
        Btn_Registrar.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        Btn_Registrar.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Iconos/gestion-de-producto (1).png"))); // NOI18N
        Btn_Registrar.setText("REGISTRAR USUARIO");
        Btn_Registrar.setBorder(null);
        Btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 240, 50));

        Txt_Dni.setForeground(new java.awt.Color(204, 204, 204));
        Txt_Dni.setText("+++++++++");
        Txt_Dni.setBorder(null);
        Txt_Dni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Txt_DniMouseClicked(evt);
            }
        });
        jPanel1.add(Txt_Dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 180, 40));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tablaUsers.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        tablaUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "USUARIO", "DNI", "NUMERO TELEFONICO", "ESTADO", "TIPO DE USUARIO"
            }
        ));
        tablaUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaUsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaUsers);

        Btn_Borrar.setBackground(new java.awt.Color(147, 22, 66));
        Btn_Borrar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Btn_Borrar.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Iconos/cancelar (2).png"))); // NOI18N
        Btn_Borrar.setText("Borrar");
        Btn_Borrar.setBorder(null);
        Btn_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BorrarActionPerformed(evt);
            }
        });

        Btn_Update.setBackground(new java.awt.Color(219, 171, 3));
        Btn_Update.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Btn_Update.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Iconos/actualizado (1).png"))); // NOI18N
        Btn_Update.setText("Actualizar");
        Btn_Update.setBorder(null);
        Btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_UpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RegistrarActionPerformed

if (Txt_Nom.getText().equals("") ||Txt_User.getText().equals("") || Txt_Dni.getText().equals("") || Txt_NumT.getText().equals("")
                || Cbo_Estado.getSelectedItem().equals(0)|| Cbo_TU.getSelectedItem().equals(0)) {

            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
        }
if (Txt_Nom.getText().equals("Nombre del usuario") ||Txt_User.getText().equals("Ingrese el usuario") || Txt_Dni.getText().equals("+++++++++") || Txt_NumT.getText().equals("NUMERO TELEFONICO")
                || Cbo_Estado.getSelectedItem().equals(0)|| Cbo_TU.getSelectedItem().equals(0)) {

            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
        }
      


        else{


        agregar();
        limpiarTabla();
        listar();
        nuevo();
                } // aquiiiiiiii  Metodo Agregar y nuevo      
    }//GEN-LAST:event_Btn_RegistrarActionPerformed

    private void Btn_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BorrarActionPerformed
        eliminar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_Btn_BorrarActionPerformed

    private void Btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_UpdateActionPerformed
        actualizar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_Btn_UpdateActionPerformed

    private void tablaUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsersMouseClicked
        int fila = tablaUsers.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "debe Seleccionar una fila");

        } else {
            id = Integer.parseInt(tablaUsers.getValueAt(fila, 0).toString());
            String nom = tablaUsers.getValueAt(fila, 1).toString();
            String User = tablaUsers.getValueAt(fila, 2).toString();
            String Dni = tablaUsers.getValueAt(fila, 3).toString();
            String Tel = tablaUsers.getValueAt(fila, 4).toString();
            String Es = tablaUsers.getValueAt(fila, 5).toString();
            String Tu = tablaUsers.getValueAt(fila, 6).toString();

            /*
            
            int optionEs = 0 , optionTu = 0;
            
            if(Tu.equals("ADMINISTRADOR")){
                optionTu = 1;
                
                
            }else if(Es.equals("INVITADO")){
                optionTu = 2;
                
            }
            if(Es.equals("0")){
                optionEs = 1;
                
                
            }else if(Es.equals("1")){
                optionEs = 2;
                
            }
            Cbo_Estado.setSelectedIndex(optionEs);
            Cbo_TU.setSelectedIndex(optionTu);
             */
            Cbo_Estado.setSelectedItem(Es);
            Cbo_TU.setSelectedItem(Tu);
            Txt_Nom.setText(nom);
            Txt_User.setText(User);
            Txt_NumT.setText(Tel);
            Txt_Dni.setText(Dni);

        }
    }//GEN-LAST:event_tablaUsersMouseClicked

    private void Txt_NomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_NomActionPerformed
       
        
        
    }//GEN-LAST:event_Txt_NomActionPerformed

    private void Txt_NomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_NomMouseClicked
       if (Txt_Nom.getText().equals("Nombre del usuario")) {

            Txt_Nom.setText("");
            Txt_Nom.setForeground(Color.black);

        }
        if (Txt_User.getText().equals("")) {

            Txt_User.setText("Ingrese el usuario");
            Txt_User.setForeground(Color.gray);

        }
        if (Txt_NumT.getText().equals("")) {

           Txt_NumT.setText("NUMERO TELEFONICO");
            Txt_NumT.setForeground(Color.gray);

        }
        if (Txt_Dni.getText().equals("")) {

           Txt_Dni.setText("+++++++++");
            Txt_Dni.setForeground(Color.gray);

        }
       
        
    }//GEN-LAST:event_Txt_NomMouseClicked

    private void Txt_NomMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_NomMousePressed
       if (Txt_Nom.getText().equals("Nombre del usuario")) {

            Txt_Nom.setText("");
            Txt_Nom.setForeground(Color.black);

        }
        if (Txt_User.getText().equals("")) {

            Txt_User.setText("Ingrese el usuario");
            Txt_User.setForeground(Color.gray);

        }
        if (Txt_NumT.getText().equals("")) {

           Txt_NumT.setText("NUMERO TELEFONICO");
            Txt_NumT.setForeground(Color.gray);

        }
        if (Txt_Dni.getText().equals("")) {

           Txt_Dni.setText("+++++++++");
            Txt_Dni.setForeground(Color.gray);

        }
       
        
    }//GEN-LAST:event_Txt_NomMousePressed

    private void Txt_UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_UserMouseClicked
        if (Txt_Nom.getText().equals("")) {

            Txt_Nom.setText("Nombre del usuario");
            Txt_Nom.setForeground(Color.gray);

        }
        if (Txt_User.getText().equals("Ingrese el usuario")) {

            Txt_User.setText("");
            Txt_User.setForeground(Color.black);

        }
        if (Txt_NumT.getText().equals("")) {

           Txt_NumT.setText("NUMERO TELEFONICO");
            Txt_NumT.setForeground(Color.gray);

        }
        if (Txt_Dni.getText().equals("")) {

           Txt_Dni.setText("+++++++++");
            Txt_Dni.setForeground(Color.gray);

        }
       
        
    }//GEN-LAST:event_Txt_UserMouseClicked

    private void Txt_NumTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_NumTMouseClicked
         if (Txt_Nom.getText().equals("")) {

            Txt_Nom.setText("Nombre del usuario");
            Txt_Nom.setForeground(Color.gray);

        }
        if (Txt_User.getText().equals("")) {

            Txt_User.setText("Ingrese el usuario");
            Txt_User.setForeground(Color.gray);

        }
        if (Txt_NumT.getText().equals("NUMERO TELEFONICO")) {

           Txt_NumT.setText("");
            Txt_NumT.setForeground(Color.BLACK);

        }
        if (Txt_Dni.getText().equals("")) {

           Txt_Dni.setText("+++++++++");
            Txt_Dni.setForeground(Color.gray);

        }
       
        
    }//GEN-LAST:event_Txt_NumTMouseClicked

    private void Txt_DniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_DniMouseClicked
        if (Txt_Nom.getText().equals("")) {

            Txt_Nom.setText("Nombre del usuario");
            Txt_Nom.setForeground(Color.gray);

        }
        if (Txt_User.getText().equals("")) {

            Txt_User.setText("Ingrese el usuario");
            Txt_User.setForeground(Color.gray);

        }
        if (Txt_NumT.getText().equals("")) {

           Txt_NumT.setText("NUMERO TELEFONICO");
            Txt_NumT.setForeground(Color.gray);

        }
        if (Txt_Dni.getText().equals("+++++++++")) {

           Txt_Dni.setText("");
            Txt_Dni.setForeground(Color.BLACK);

        }
    }//GEN-LAST:event_Txt_DniMouseClicked

    private void Cbo_EstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cbo_EstadoMouseClicked
       if (Txt_Nom.getText().equals("")) {

            Txt_Nom.setText("Nombre del usuario");
            Txt_Nom.setForeground(Color.gray);

        }
        if (Txt_User.getText().equals("")) {

            Txt_User.setText("Ingrese el usuario");
            Txt_User.setForeground(Color.gray);

        }
        if (Txt_NumT.getText().equals("")) {

           Txt_NumT.setText("NUMERO TELEFONICO");
            Txt_NumT.setForeground(Color.gray);

        }
        if (Txt_Dni.getText().equals("")) {

           Txt_Dni.setText("+++++++++");
            Txt_Dni.setForeground(Color.GRAY);

        }
    }//GEN-LAST:event_Cbo_EstadoMouseClicked

    private void Cbo_TUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cbo_TUMouseClicked
      if (Txt_Nom.getText().equals("")) {

            Txt_Nom.setText("Nombre del usuario");
            Txt_Nom.setForeground(Color.gray);

        }
        if (Txt_User.getText().equals("")) {

            Txt_User.setText("Ingrese el usuario");
            Txt_User.setForeground(Color.gray);

        }
        if (Txt_NumT.getText().equals("")) {

           Txt_NumT.setText("NUMERO TELEFONICO");
            Txt_NumT.setForeground(Color.gray);

        }
        if (Txt_Dni.getText().equals("")) {

           Txt_Dni.setText("+++++++++");
            Txt_Dni.setForeground(Color.GRAY);

        }
    }//GEN-LAST:event_Cbo_TUMouseClicked

    //funciones principales
    void agregar() {

        String Nom = Txt_Nom.getText();
        String User = Txt_User.getText();
        String Tel = Txt_NumT.getText();
        String Dni = Txt_Dni.getText();
        String Es = Cbo_Estado.getSelectedItem().toString();
        String Tu = Cbo_TU.getSelectedItem().toString();

        Object[] ob = new Object[6];
        ob[0] = Dni;
        ob[1] = Nom;
        ob[2] = Tel;
        ob[3] = Es;
        ob[4] = User;
        ob[5] = Tu;
        vdao.add(ob);

    }

    void actualizar() {
        int fila = tablaUsers.getSelectedRow();
        if (fila == -1) {

            JOptionPane.showMessageDialog(this, "debe seleccionar una Fila");

        } else {
            String Nom = Txt_Nom.getText();
            String User = Txt_User.getText();
            String Tel = Txt_NumT.getText();
            String Dni = Txt_Dni.getText();
            String Es = Cbo_Estado.getSelectedItem().toString();
            String Tu = Cbo_TU.getSelectedItem().toString();
            id = Integer.parseInt(tablaUsers.getValueAt(fila, 0).toString());

            Object[] ob = new Object[7];
            ob[0] = Dni;
            ob[1] = Nom;
            ob[2] = Tel;
            ob[3] = Es;
            ob[4] = User;
            ob[5] = Tu;
            ob[6] = id;
            vdao.actualizar(ob);
        }

    }
     
    void eliminar(){
        
         int fila = tablaUsers.getSelectedRow();
        int ids = Integer.parseInt(tablaUsers.getValueAt(fila, 0).toString());
        if (fila == -1) {

            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");

        }
       
                else {

            vdao.eliminar(ids);

        }
        
        
        
    }
    
    //Funciones segundarias
    void limpiarTabla() {

        for (int i = 0; i < modelo.getRowCount(); i++) {

            modelo.removeRow(i);
            i = i - 1;

        }
    }

    void nuevo() {

        Txt_Nom.setText("");
        Txt_User.setText("");
        Txt_NumT.setText("");
        Txt_Dni.setText("");
        Cbo_Estado.setSelectedItem(0);
        Cbo_TU.setSelectedItem(0);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Borrar;
    private javax.swing.JButton Btn_Registrar;
    private javax.swing.JButton Btn_Update;
    public static javax.swing.JComboBox<String> Cbo_Estado;
    public static javax.swing.JComboBox<String> Cbo_TU;
    private javax.swing.JPasswordField Txt_Dni;
    public static javax.swing.JTextField Txt_Nom;
    public static javax.swing.JTextField Txt_NumT;
    public static javax.swing.JTextField Txt_User;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable tablaUsers;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
