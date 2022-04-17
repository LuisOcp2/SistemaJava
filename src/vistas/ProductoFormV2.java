package vistas;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;
import modelo.ProductoDAO;
import static vistas.ClienteFormV2.txtDni;
import static vistas.ClienteFormV2.txtNom;

public class ProductoFormV2 extends javax.swing.JPanel {

    ProductoDAO pdao = new ProductoDAO();
    Producto p = new Producto();
    DefaultTableModel modelo = new DefaultTableModel();
    int id;

    public ProductoFormV2() {
        initComponents();
        listar();
    }

    void listar() {
        List<Producto> lista = pdao.listarProducto();
        modelo = (DefaultTableModel) tablaProducto.getModel();
        Object[] ob = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getNom();
            ob[2] = lista.get(i).getPre();
            ob[3] = lista.get(i).getStock();
            ob[4] = lista.get(i).getEstado();
            modelo.addRow(ob);

        }
        tablaProducto.setModel(modelo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProducto = new javax.swing.JTable();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        cboEstado = new javax.swing.JComboBox<>();
        txtTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRES", "PRECIO", "STOCK", "ESTADO"
            }
        ));
        tablaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProducto);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 490, 430));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 10, 470));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel6.setText("NOMBRE");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 20));

        txtNom.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtNom.setForeground(new java.awt.Color(204, 204, 204));
        txtNom.setText("Ingrese el nombre del producto");
        txtNom.setBorder(null);
        txtNom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNomMouseClicked(evt);
            }
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
        jPanel7.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 390, 10));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setText("ESTADO");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        txtStock.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtStock.setForeground(new java.awt.Color(204, 204, 204));
        txtStock.setText("Ingrese el stock del producto");
        txtStock.setBorder(null);
        txtStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtStockMousePressed(evt);
            }
        });
        txtStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtStockKeyReleased(evt);
            }
        });
        jPanel7.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 390, 40));
        jPanel7.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 390, 10));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setText("PRECIO");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        txtPrecio.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(204, 204, 204));
        txtPrecio.setText("Ingrese el precio del producto");
        txtPrecio.setBorder(null);
        txtPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPrecioMousePressed(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioKeyReleased(evt);
            }
        });
        jPanel7.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 390, 40));
        jPanel7.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 390, 10));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setText("STOCK");
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
        jPanel7.add(cboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 120, 30));

        txtTitulo.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        txtTitulo.setText("PRODUCTOS");
        jPanel7.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 50));

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel1.setText("REGISTRAR NUEVO PRODUCTO");
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 360, 50));

        jButton1.setBackground(new java.awt.Color(28, 113, 12));
        jButton1.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Iconos/gestion-de-producto (1).png"))); // NOI18N
        jButton1.setText("REGISTRAR PRODUCTO");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 250, 60));

        jButton2.setBackground(new java.awt.Color(219, 171, 3));
        jButton2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Iconos/actualizado (1).png"))); // NOI18N
        jButton2.setText("Actualizar");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 520, 120, 30));

        jButton3.setBackground(new java.awt.Color(147, 22, 66));
        jButton3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Iconos/cancelar (2).png"))); // NOI18N
        jButton3.setText("Borrar");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 520, 120, 30));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 570));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 570));

        jPanel6.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void tablaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductoMouseClicked
        int fila = tablaProducto.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "debe Seleccionar una fila");

        } else {
            id = Integer.parseInt(tablaProducto.getValueAt(fila, 0).toString());
            String nom = tablaProducto.getValueAt(fila, 1).toString();
            String precio = tablaProducto.getValueAt(fila, 2).toString();
            String stock = tablaProducto.getValueAt(fila, 3).toString();
            String es = tablaProducto.getValueAt(fila, 4).toString();

            txtNom.setText(nom);
            txtNom.setForeground(Color.black);
            txtPrecio.setText(precio);
            txtPrecio.setForeground(Color.BLACK);
            txtStock.setText(stock);
            txtStock.setForeground(Color.black);
            cboEstado.setSelectedItem(es);

        }
    }//GEN-LAST:event_tablaProductoMouseClicked

    private void txtNomMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomMousePressed
        if (txtNom.getText().equals("Ingrese el nombre del producto")) {

            txtNom.setText("");
            txtNom.setForeground(Color.black);

        }
        if (txtPrecio.getText().equals("")) {

            txtPrecio.setText("Ingrese el precio del producto");
            txtPrecio.setForeground(Color.gray);

        }
        if (txtStock.getText().equals("")) {

            txtStock.setText("Ingrese el stock del producto");
            txtStock.setForeground(Color.gray);

        }
    }//GEN-LAST:event_txtNomMousePressed

    private void txtPrecioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrecioMousePressed
        if (txtPrecio.getText().equals("Ingrese el precio del producto")) {

            txtPrecio.setText("");
            txtPrecio.setForeground(Color.black);

        }
        if (txtNom.getText().equals("")) {

            txtNom.setText("Ingrese el nombre del producto");
            txtNom.setForeground(Color.gray);

        }
        if (txtStock.getText().equals("")) {

            txtStock.setText("Ingrese el stock del producto");
            txtStock.setForeground(Color.gray);

        }
    }//GEN-LAST:event_txtPrecioMousePressed

    private void txtStockMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtStockMousePressed
        if (txtStock.getText().equals("Ingrese el stock del producto")) {

            txtStock.setText("");
            txtStock.setForeground(Color.black);

        }
        if (txtNom.getText().equals("")) {

            txtNom.setText("Ingrese el nombre del producto");
            txtNom.setForeground(Color.gray);

        }
        if (txtPrecio.getText().equals("")) {

            txtPrecio.setText("Ingrese el precio del producto");
            txtPrecio.setForeground(Color.gray);

        }
    }//GEN-LAST:event_txtStockMousePressed

    private void txtNomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtPrecio.requestFocus();
            if (txtNom.getText().equals("")) {

                txtNom.setText("Ingrese el nombre del producto");
                txtNom.setForeground(Color.gray);
            }
            txtPrecio.setText("");
            txtPrecio.setForeground(Color.BLACK);

        }
    }//GEN-LAST:event_txtNomKeyReleased

    private void txtStockKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cboEstado.requestFocus();
            if (txtStock.getText().equals("")) {

                txtStock.setText("Ingrese el precio del producto");
                txtStock.setForeground(Color.gray);
            }

        }
    }//GEN-LAST:event_txtStockKeyReleased

    private void txtPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtStock.requestFocus();
            if (txtPrecio.getText().equals("")) {

                txtPrecio.setText("Ingrese el precio del producto");
                txtPrecio.setForeground(Color.gray);
            }
            txtStock.setText("");
            txtStock.setForeground(Color.BLACK);

        }
    }//GEN-LAST:event_txtPrecioKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (txtNom.getText().equals("") || txtPrecio.getText().equals("") || txtPrecio.getText().equals("")
                || txtStock.equals("") || cboEstado.getSelectedItem().equals(0)) {

            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
        }
        if (txtNom.getText().equals("Ingrese el nombre del producto")
                || txtPrecio.getText().equals("Ingrese el precio del producto") || txtStock.equals("Ingrese el stock del producto")
                || cboEstado.getSelectedItem().equals(0)) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
        } else {

            agregar();
            limpiarTabla();
            listar();
            nuevo();
            JOptionPane.showMessageDialog(this, "Se realizo el registro correctamente");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        actualizar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        eliminar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomActionPerformed
        if (txtNom.getText().equals("Ingrese el nombre del producto")) {

            txtNom.setText("");
            txtNom.setForeground(Color.black);

        }
        if (txtPrecio.getText().equals("")) {

            txtPrecio.setText("Ingrese el precio del producto");
            txtPrecio.setForeground(Color.gray);

        }
        if (txtStock.getText().equals("")) {

            txtStock.setText("Ingrese el stock del producto");
            txtStock.setForeground(Color.gray);

        }
    }//GEN-LAST:event_txtNomActionPerformed

    private void txtNomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomMouseClicked
        if (txtNom.getText().equals("Ingrese el nombre del producto")) {

            txtNom.setText("");
            txtNom.setForeground(Color.black);

        }
        if (txtPrecio.getText().equals("")) {

            txtPrecio.setText("Ingrese el precio del producto");
            txtPrecio.setForeground(Color.gray);

        }
        if (txtStock.getText().equals("")) {

            txtStock.setText("Ingrese el stock del producto");
            txtStock.setForeground(Color.gray);

        }
    }//GEN-LAST:event_txtNomMouseClicked

    private void cboEstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboEstadoMouseClicked
         if (txtNom.getText().equals("")) {

            txtNom.setText("Ingrese el nombre del producto");
            txtNom.setForeground(Color.gray);

        }
        if (txtPrecio.getText().equals("")) {

            txtPrecio.setText("Ingrese el precio del producto");
            txtPrecio.setForeground(Color.gray);

        }
        if (txtStock.getText().equals("")) {

            txtStock.setText("Ingrese el stock del producto");
            txtStock.setForeground(Color.gray);

        }
    }//GEN-LAST:event_cboEstadoMouseClicked

    void agregar() {

        String nom = txtNom.getText();
        String Precio = txtPrecio.getText();
        String Stock = txtStock.getText();
        String es = cboEstado.getSelectedItem().toString();
        Object[] ob = new Object[4];
        ob[0] = nom;
        ob[1] = Precio;
        ob[2] = Stock;
        ob[3] = es;
        pdao.add(ob);

    }

    void limpiarTabla() {

        for (int i = 0; i < modelo.getRowCount(); i++) {

            modelo.removeRow(i);
            i = i - 1;

        }
    }

    void nuevo() {

        txtNom.setText("Ingrese el nombre del producto");
        txtNom.setForeground(Color.gray);
        txtPrecio.setText("Ingrese el precio del producto");
        txtPrecio.setForeground(Color.gray);
        txtStock.setText("Ingrese el stock del producto");
        txtStock.setForeground(Color.gray);
        cboEstado.setSelectedItem(0);

    }

    void actualizar() {
        int fila = tablaProducto.getSelectedRow();
        if (fila == -1) {

            JOptionPane.showMessageDialog(this, "debe seleccionar una Fila");

        } else {

            String nom = txtNom.getText();
            String precio = txtPrecio.getText();
            String stock = txtStock.getText();
            String es = cboEstado.getSelectedItem().toString();
            Object[] obj = new Object[5];
            obj[0] = nom;
            obj[1] = precio;
            obj[2] = stock;
            obj[3] = es;
            obj[4] = id;
            pdao.actualizar(obj);
        }

    }

    void eliminar() {

        int fila = tablaProducto.getSelectedRow();
        int ids = Integer.parseInt(tablaProducto.getValueAt(fila, 0).toString());
        if (fila == -1) {

            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");

        } else {

            pdao.eliminar(ids);

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable tablaProducto;
    public static javax.swing.JTextField txtNom;
    public static javax.swing.JTextField txtPrecio;
    public static javax.swing.JTextField txtStock;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
