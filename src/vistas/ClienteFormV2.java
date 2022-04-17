package vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.ClienteDAO;
import static vistas.Principalv2.content;

public class ClienteFormV2 extends javax.swing.JPanel {

    ClienteDAO dao = new ClienteDAO();
    Cliente cl = new Cliente();
    DefaultTableModel modelo = new DefaultTableModel();
    int id = 0;

    public ClienteFormV2() {
        initComponents();
        listar();
    }

    void listar() {
        List<Cliente> lista = dao.listar();
        modelo = (DefaultTableModel) tabla.getModel();
        Object[] ob = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getDni();
            ob[2] = lista.get(i).getNom();
            ob[3] = lista.get(i).getDir();
            ob[4] = lista.get(i).getEstado();
            modelo.addRow(ob);

        }
        tabla.setModel(modelo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtDir = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        cboEstado = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnEliminarCliente = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "NOMBRES", "DIRECCION", "ESTADO"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 480, 430));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 10, 470));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel6.setText("NOMBRE");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 20));

        txtNom.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNom.setForeground(new java.awt.Color(204, 204, 204));
        txtNom.setText("Ingrese el nombre del cliente");
        txtNom.setBorder(null);
        txtNom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNomMousePressed(evt);
            }
        });
        txtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomActionPerformed(evt);
            }
        });
        txtNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomKeyReleased(evt);
            }
        });
        jPanel7.add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 390, 40));
        jPanel7.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 398, 10));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setText("ESTADO");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        txtDir.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtDir.setForeground(new java.awt.Color(204, 204, 204));
        txtDir.setText("Ingrese la direccion del cliente");
        txtDir.setBorder(null);
        txtDir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDirMousePressed(evt);
            }
        });
        txtDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDirActionPerformed(evt);
            }
        });
        txtDir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDirKeyReleased(evt);
            }
        });
        jPanel7.add(txtDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 390, 40));
        jPanel7.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 390, 10));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setText("DNI ");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        txtDni.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtDni.setForeground(new java.awt.Color(204, 204, 204));
        txtDni.setText("Ingrese el Dni del cliente");
        txtDni.setBorder(null);
        txtDni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDniMousePressed(evt);
            }
        });
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDniKeyReleased(evt);
            }
        });
        jPanel7.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 390, 40));
        jPanel7.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 390, 10));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setText("DIRECCION");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        cboEstado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cboEstado.setForeground(new java.awt.Color(204, 204, 204));
        cboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "0", "1" }));
        cboEstado.setBorder(null);
        cboEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboEstadoMouseClicked(evt);
            }
        });
        cboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEstadoActionPerformed(evt);
            }
        });
        jPanel7.add(cboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 120, 30));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        jLabel2.setText("CLIENTES");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 140, 50));

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel1.setText("REGISTRAR NUEVO CLIENTE");
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 360, 50));

        btnEliminarCliente.setBackground(new java.awt.Color(147, 22, 66));
        btnEliminarCliente.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        btnEliminarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Iconos/cancelar (2).png"))); // NOI18N
        btnEliminarCliente.setText("Borrar");
        btnEliminarCliente.setBorder(null);
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });
        jPanel7.add(btnEliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 520, 120, 30));

        jButton1.setBackground(new java.awt.Color(219, 171, 3));
        jButton1.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Iconos/actualizado (1).png"))); // NOI18N
        jButton1.setText("Actualizar");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 520, 120, 30));

        jButton2.setBackground(new java.awt.Color(28, 113, 12));
        jButton2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Iconos/gestion-de-producto (1).png"))); // NOI18N
        jButton2.setText("REGISTRAR CLIENTE");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 250, 60));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 580));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 570));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int fila = tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "debe Seleccionar una fila");

        } else {
            id = Integer.parseInt(tabla.getValueAt(fila, 0).toString());
            String dni = tabla.getValueAt(fila, 1).toString();
            String nom = tabla.getValueAt(fila, 2).toString();
            String dir = tabla.getValueAt(fila, 3).toString();
            String es = tabla.getValueAt(fila, 4).toString();
            txtDni.setText(dni);
            txtNom.setText(nom);
            txtDir.setText(dir);
            cboEstado.setSelectedItem(es);
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void txtDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDirActionPerformed

    private void cboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEstadoActionPerformed

    private void txtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomActionPerformed

    private void txtNomMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomMousePressed
        if (txtNom.getText().equals("Ingrese el nombre del cliente")) {

            txtNom.setText("");
            txtNom.setForeground(Color.black);

        }
        if (txtDni.getText().equals("")) {

            txtDni.setText("Ingrese el Dni del cliente");
            txtDni.setForeground(Color.gray);

        }
        if (txtDir.getText().equals("")) {

            txtDir.setText("Ingrese la direccion del cliente");
            txtDir.setForeground(Color.gray);

        }
    }//GEN-LAST:event_txtNomMousePressed

    private void txtDniMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDniMousePressed
        if (txtDni.getText().equals("Ingrese el Dni del cliente")) {

            txtDni.setText("");
            txtDni.setForeground(Color.black);

        }
        if (txtNom.getText().equals("")) {

            txtNom.setText("Ingrese el nombre del cliente");
            txtNom.setForeground(Color.gray);

        }
        if (txtDir.getText().equals("")) {

            txtDir.setText("Ingrese la direccion del cliente");
            txtDir.setForeground(Color.gray);

        }


    }//GEN-LAST:event_txtDniMousePressed

    private void txtDirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDirMousePressed
        if (txtDir.getText().equals("Ingrese la direccion del cliente")) {

            txtDir.setText("");
            txtDir.setForeground(Color.black);

        }
        if (txtNom.getText().equals("")) {

            txtNom.setText("Ingrese el nombre del cliente");
            txtNom.setForeground(Color.gray);

        }
        if (txtDni.getText().equals("")) {

            txtDni.setText("Ingrese el Dni del cliente");
            txtDni.setForeground(Color.gray);

        }

    }//GEN-LAST:event_txtDirMousePressed

    private void txtNomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtDni.requestFocus();
            if (txtNom.getText().equals("")) {

                txtNom.setText("Ingrese el nombre del cliente");
                txtNom.setForeground(Color.gray);
            }
            txtDni.setText("");
            txtDni.setForeground(Color.BLACK);

        }
    }//GEN-LAST:event_txtNomKeyReleased

    private void txtDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtDir.requestFocus();
            if (txtDni.getText().equals("")) {

                txtDni.setText("Ingrese el Dni del cliente");
                txtDni.setForeground(Color.gray);
            }
            txtDir.setText("");
            txtDir.setForeground(Color.BLACK);

        }
    }//GEN-LAST:event_txtDniKeyReleased

    private void txtDirKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cboEstado.requestFocus();
            if (txtDir.getText().equals("")) {

                txtDir.setText("Ingrese la direccion del cliente");
                txtDir.setForeground(Color.gray);
            }

            cboEstado.setForeground(Color.BLACK);

        }
    }//GEN-LAST:event_txtDirKeyReleased

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed

        eliminar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        actualizar();
        limpiarTabla();
        listar();
        nuevo();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (txtNom.getText().equals("") || txtDni.getText().equals("") || txtDir.getText().equals("")
                || cboEstado.getSelectedItem().equals(0)) {

            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
        }
        if (txtNom.getText().equals("Ingrese el nombre del cliente") || txtDni.getText().equals("Ingrese el Dni del cliente") || txtDir.getText().equals("Ingrese la direccion del cliente")
                || cboEstado.getSelectedItem().equals(0)) {

            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
        } else {

            agregar();
            limpiarTabla();
            listar();
            nuevo();

        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void cboEstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboEstadoMouseClicked
        if (txtDir.getText().equals("")) {

            txtDir.setText("Ingrese la direccion del cliente");
            txtDir.setForeground(Color.gray);

        }
        if (txtNom.getText().equals("")) {

            txtNom.setText("Ingrese el nombre del cliente");
            txtNom.setForeground(Color.gray);

        }
        if (txtDni.getText().equals("")) {

            txtDni.setText("Ingrese el Dni del cliente");
            txtDni.setForeground(Color.gray);

        }
    }//GEN-LAST:event_cboEstadoMouseClicked

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed
    void agregar() {
        String dni = txtDni.getText();
        String nom = txtNom.getText();
        String dir = txtDir.getText();
        String es = cboEstado.getSelectedItem().toString();
        Object[] ob = new Object[4];
        ob[0] = dni;
        ob[1] = nom;
        ob[2] = dir;
        ob[3] = es;
        dao.add(ob);

    }

    void actualizar() {
        int fila = tabla.getSelectedRow();
        if (fila == -1) {

            JOptionPane.showMessageDialog(this, "debe seleccionar una Fila");

        } else {
            String dni = txtDni.getText();
            String nom = txtNom.getText();
            String dir = txtDir.getText();
            String es = cboEstado.getSelectedItem().toString();
            Object[] obj = new Object[5];
            obj[0] = dni;
            obj[1] = nom;
            obj[2] = dir;
            obj[3] = es;
            obj[4] = id;
            dao.actualizar(obj);
        }

    }

    void eliminar() {
        int fila = tabla.getSelectedRow();
        int ids = Integer.parseInt(tabla.getValueAt(fila, 0).toString());
        if (fila == -1) {

            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");

        } else {

            dao.eliminar(ids);

        }
    }

    void nuevo() {

        txtNom.setText("Ingrese el nombre del cliente");
        txtNom.setForeground(Color.gray);
        txtDni.setText("Ingrese el Dni del cliente");
        txtDni.setForeground(Color.gray);
        txtDir.setText("Ingrese la direccion del cliente");
        txtDir.setForeground(Color.gray);
        cboEstado.setSelectedItem(0);
        txtNom.requestFocus();

    }

    void limpiarTabla() {

        for (int i = 0; i < modelo.getRowCount(); i++) {

            modelo.removeRow(i);
            i = i - 1;

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarCliente;
    public static javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable tabla;
    public static javax.swing.JTextField txtDir;
    public static javax.swing.JTextField txtDni;
    public static javax.swing.JTextField txtNom;
    // End of variables declaration//GEN-END:variables
}
