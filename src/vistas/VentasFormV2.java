package vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.ClienteDAO;
import modelo.Conexion;
import modelo.DetalleVentas;
import modelo.Producto;
import modelo.ProductoDAO;
import modelo.Ventas;

import modelo.VentasDAO;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import static vistas.Principalv2.content;

public class VentasFormV2 extends javax.swing.JPanel {

    ClienteDAO cdao = new ClienteDAO();
    ProductoDAO pdao = new ProductoDAO();
    Producto p = new Producto();
    Ventas v = new Ventas();
    VentasDAO vdao = new VentasDAO();
    DetalleVentas dv = new DetalleVentas();
    Cliente cliente = new Cliente();
    DefaultTableModel modelo = new DefaultTableModel();
    Connection con;
    Conexion cn = new Conexion();
    int idp = 0;
    int cant;
    double pre;
    int item = 0;
    double tpagar;

    public VentasFormV2() {
        initComponents();
        fecha();
        generarSerie();

    }

    void fecha() {
      
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String fechaComoCadena = sdf.format(new Date());
        txtFecha.setText(fechaComoCadena);

    }

    void generarSerie() {

        String serie = vdao.NroSerieVentas();
        if (serie == null) {

            txtSerie.setText("0000001");
        } else {

            int increment = Integer.parseInt(serie);
            increment = increment + 1;
            txtSerie.setText("000000" + increment);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCodCliente = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtPrecio = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtCodProd = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JSpinner();
        btnBuscarCliente = new javax.swing.JButton();
        btnBuscarProducto = new javax.swing.JButton();
        btnAgregarProd = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDetalle = new javax.swing.JTable();
        txtCliente = new javax.swing.JTextField();
        txtProd = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        TxtVend = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtSerie = new javax.swing.JTextField();
        TotalPagar = new javax.swing.JTextField();
        txtFecha = new javax.swing.JLabel();

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitulo.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        txtTitulo.setText("GENERAR VENTA");
        jPanel7.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 50));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel6.setText("COD. CLIENTE");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 20));

        txtCodCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCodCliente.setForeground(new java.awt.Color(204, 204, 204));
        txtCodCliente.setText("Ingrese el codigo del cliente");
        txtCodCliente.setBorder(null);
        txtCodCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCodClienteMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCodClienteMousePressed(evt);
            }
        });
        txtCodCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodClienteKeyReleased(evt);
            }
        });
        jPanel7.add(txtCodCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 210, 40));
        jPanel7.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 210, 10));

        txtPrecio.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(204, 204, 204));
        txtPrecio.setText("Precio del producto");
        txtPrecio.setBorder(null);
        txtPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPrecioMouseClicked(evt);
            }
        });
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioKeyReleased(evt);
            }
        });
        jPanel7.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 210, 40));
        jPanel7.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 210, 10));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setText("COD. PRODUCTO");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        txtCodProd.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCodProd.setForeground(new java.awt.Color(204, 204, 204));
        txtCodProd.setText("Ingrese el codigo del producto");
        txtCodProd.setBorder(null);
        txtCodProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCodProdMouseClicked(evt);
            }
        });
        txtCodProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProdActionPerformed(evt);
            }
        });
        txtCodProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodProdKeyReleased(evt);
            }
        });
        jPanel7.add(txtCodProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 210, 40));
        jPanel7.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 210, 10));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setText("CANTIDAD");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, 30));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel10.setText("PRECIO");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantidadKeyReleased(evt);
            }
        });
        jPanel7.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 50, 30));

        btnBuscarCliente.setBackground(new java.awt.Color(28, 113, 12));
        btnBuscarCliente.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnBuscarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Iconos/lupa (2).png"))); // NOI18N
        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.setBorder(null);
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });
        jPanel7.add(btnBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 110, 40));

        btnBuscarProducto.setBackground(new java.awt.Color(28, 113, 12));
        btnBuscarProducto.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnBuscarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Iconos/lupa (2).png"))); // NOI18N
        btnBuscarProducto.setText("Buscar");
        btnBuscarProducto.setBorder(null);
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });
        jPanel7.add(btnBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 110, 40));

        btnAgregarProd.setBackground(new java.awt.Color(28, 113, 12));
        btnAgregarProd.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnAgregarProd.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Iconos/circulo-plus.png"))); // NOI18N
        btnAgregarProd.setText("Agregar");
        btnAgregarProd.setBorder(null);
        btnAgregarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProdActionPerformed(evt);
            }
        });
        jPanel7.add(btnAgregarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 110, 40));

        jButton1.setBackground(new java.awt.Color(28, 113, 12));
        jButton1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Iconos/factura (1).png"))); // NOI18N
        jButton1.setText("Generar Venta");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 160, 40));

        jButton2.setBackground(new java.awt.Color(147, 22, 66));
        jButton2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Iconos/cancelar (2).png"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 130, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaDetalle.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NRO", "COD", "PRODUCTO", "CANTIDAD", "PRE UNI", "TOTAL"
            }
        ));
        tablaDetalle.setGridColor(new java.awt.Color(255, 255, 255));
        tablaDetalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablaDetalleKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tablaDetalleKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tablaDetalle);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 610, 280));

        txtCliente.setEditable(false);
        txtCliente.setBackground(new java.awt.Color(171, 206, 255));
        txtCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre del cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12))); // NOI18N
        jPanel4.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 84, 210, 40));

        txtProd.setEditable(false);
        txtProd.setBackground(new java.awt.Color(171, 206, 255));
        txtProd.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtProd.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12))); // NOI18N
        jPanel4.add(txtProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 146, 210, 40));

        txtStock.setEditable(false);
        txtStock.setBackground(new java.awt.Color(171, 206, 255));
        txtStock.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtStock.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Stock", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12))); // NOI18N
        jPanel4.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 84, 210, 40));

        TxtVend.setEditable(false);
        TxtVend.setBackground(new java.awt.Color(171, 206, 255));
        TxtVend.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        TxtVend.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vendedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12))); // NOI18N
        jPanel4.add(TxtVend, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 146, 210, 40));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        jLabel1.setText("Punto de venta \"Repo\"");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 0, -1, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Venta de productos al por mayor");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 210, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("tel:3233841191");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("NRO SERIE:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

        txtSerie.setEditable(false);
        txtSerie.setBackground(new java.awt.Color(171, 206, 255));
        txtSerie.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSerie.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerieActionPerformed(evt);
            }
        });
        jPanel4.add(txtSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 110, 30));

        TotalPagar.setBackground(new java.awt.Color(171, 206, 255));
        TotalPagar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total a pagar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12))); // NOI18N
        jPanel4.add(TotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 180, 40));

        txtFecha.setBackground(new java.awt.Color(171, 206, 255));
        txtFecha.setFont(new java.awt.Font("Roboto Medium", 2, 18)); // NOI18N
        txtFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFecha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 14))); // NOI18N
        jPanel4.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 150, 40));

        jPanel7.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 620, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodProdActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed
    void limpiarTabla() {

        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;

        }

    }

    void nuevo() {
        limpiarTabla();
        txtCodCliente.setText("Ingrese el codigo del cliente");
        txtCodCliente.setForeground(Color.lightGray);
        txtCodProd.setText("Ingrese el codigo del producto");
        txtCodProd.setForeground(Color.lightGray);
        txtPrecio.setText("Precio del producto");
        txtPrecio.setForeground(Color.lightGray);
        txtCantidad.setValue(0);
        txtCliente.setText("");
        txtProd.setText("");
        txtStock.setText("");
        TotalPagar.setText("");
        txtCodCliente.requestFocus();

    }
    private void txtCodClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodClienteMousePressed
        if (txtCodCliente.getText().equals("Ingrese el codigo del cliente")) {

            txtCodCliente.setText("");
            txtCodCliente.setForeground(Color.black);

        }
        if (txtCodProd.getText().equals("")) {

            txtCodProd.setText("Ingrese el codigo del producto");
            txtCodProd.setForeground(Color.LIGHT_GRAY);

        }
        if (txtPrecio.getText().equals("")) {

            txtPrecio.setText("Precio del producto");
            txtPrecio.setForeground(Color.LIGHT_GRAY);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodClienteMousePressed

    private void txtCodProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodProdMouseClicked
        if (txtCodProd.getText().equals("Ingrese el codigo del producto")) {

            txtCodProd.setText("");
            txtCodProd.setForeground(Color.black);

        }
        if (txtCodCliente.getText().equals("")) {

            txtCodCliente.setText("Ingrese el codigo del cliente");
            txtCodCliente.setForeground(Color.LIGHT_GRAY);

        }
        if (txtPrecio.getText().equals("")) {

            txtPrecio.setText("Precio del producto");
            txtPrecio.setForeground(Color.LIGHT_GRAY);

        }


    }//GEN-LAST:event_txtCodProdMouseClicked

    private void txtPrecioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrecioMouseClicked
        if (txtPrecio.getText().equals("Precio del producto")) {

            txtPrecio.setText("");
            txtPrecio.setForeground(Color.black);

        }
        if (txtCodCliente.getText().equals("")) {

            txtCodCliente.setText("Ingrese el codigo del cliente");
            txtCodCliente.setForeground(Color.gray);

        }
        if (txtPrecio.getText().equals("")) {

            txtCodProd.setText("Ingrese el codigo del producto");
            txtCodProd.setForeground(Color.LIGHT_GRAY);

        }


    }//GEN-LAST:event_txtPrecioMouseClicked

    private void txtCodClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodClienteKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtCodCliente.getText().equals("")) {

                txtCodCliente.setText("Ingrese el codigo del cliente");
                txtCodCliente.setForeground(Color.gray);
            }
            txtCodProd.requestFocus();
            txtCodProd.setText("");
            btnBuscarCliente.doClick();
            txtCodProd.setForeground(Color.BLACK);

        }
    }//GEN-LAST:event_txtCodClienteKeyReleased

    private void txtCodProdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodProdKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (txtCodProd.getText().equals("")) {

                txtCodProd.setText("Ingrese el codigo del producto");
                txtCodProd.setForeground(Color.LIGHT_GRAY);
            }
            btnBuscarProducto.doClick();
            txtPrecio.requestFocus();

            txtPrecio.setForeground(Color.BLACK);

        }
    }//GEN-LAST:event_txtCodProdKeyReleased

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        buscarCliente();
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        buscarProducto();
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void txtPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (txtPrecio.getText().equals("")) {

                txtPrecio.setText("Precio del producto");
                txtPrecio.setForeground(Color.gray);
            }

            txtCantidad.requestFocus();
            txtCantidad.setForeground(Color.BLACK);

        }
    }//GEN-LAST:event_txtPrecioKeyReleased

    private void btnAgregarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProdActionPerformed
        agregarProducto();
    }//GEN-LAST:event_btnAgregarProdActionPerformed

    private void txtCantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            btnAgregarProd.doClick();

        }
    }//GEN-LAST:event_txtCantidadKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (TotalPagar.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar Datos");
        } else {
            guardarVenta();
            guardarDetalle();
            JOptionPane.showMessageDialog(this, "Se realizo con exito la venta");
            llamarInforme();
            actualizarStock();
            nuevo();
            generarSerie();
            
            
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        nuevo();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtCodClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodClienteMouseClicked
        if (txtCodCliente.getText().equals("Ingrese el codigo del cliente")) {

            txtCodCliente.setText("");
            txtCodCliente.setForeground(Color.black);

        }
        if (txtCodProd.getText().equals("")) {

            txtCodProd.setText("Ingrese el codigo del producto");
            txtCodProd.setForeground(Color.LIGHT_GRAY);

        }
        if (txtPrecio.getText().equals("")) {

            txtPrecio.setText("Precio del producto");
            txtPrecio.setForeground(Color.LIGHT_GRAY);

        }

    }//GEN-LAST:event_txtCodClienteMouseClicked

    private void txtSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerieActionPerformed

    private void tablaDetalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaDetalleKeyTyped
         
    }//GEN-LAST:event_tablaDetalleKeyTyped

    private void tablaDetalleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaDetalleKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
             
            if(tablaDetalle.getSelectedRow() != -1 ){
           
           DefaultTableModel md = (DefaultTableModel)tablaDetalle.getModel();
           JOptionPane.showMessageDialog(this,md.getDataVector().get(tablaDetalle.getSelectedRow()));
           md.removeRow(tablaDetalle.getSelectedRow());
           calculatTotal();
       }
            
            
        }
    }//GEN-LAST:event_tablaDetalleKeyReleased

    
    void llamarInforme(){
        
        
        
        
        try {
          con = cn.Conectar();
          HashMap parametros = new HashMap();
          parametros.put("NumeroSerie",txtSerie.getText());
          JasperPrint jp = JasperFillManager.fillReport("src\\informes\\Factura1.jasper",parametros,con);
            JasperViewer view = new JasperViewer(jp,false);
            view.setTitle("Factura");
            view.setExtendedState(Frame.MAXIMIZED_BOTH);
            view.setVisible(true);
            con.close();
          
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        
        
        
        
    }
    
    
    void actualizarStock() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            Producto pr = new Producto();
            idp = Integer.parseInt(tablaDetalle.getValueAt(i, 1).toString());
            cant = Integer.parseInt(tablaDetalle.getValueAt(i, 3).toString());
            pr = pdao.listarId(idp);
            int sa = pr.getStock() - cant;
            pdao.actualizarStock(sa, idp);
        }
    }

    void guardarVenta() {
        int idv = 1;
        int idc = cliente.getId();
        String serie = txtSerie.getText();
        String fecha = txtFecha.getText();
        double monto = tpagar;
        String estado = "1";
        v.setIdCliente(idc);
        v.setIdVendedor(idv);
        v.setSerie(serie);
        v.setFecha(fecha);
        v.setMonto(monto);
        v.setEstado(estado);

        vdao.GuardarVentas(v);

    }

    void guardarDetalle() {
        String idv = vdao.IdVentas();
        int idve = Integer.parseInt(idv);
        for (int i = 0; i < tablaDetalle.getRowCount(); i++) {

            int idp = Integer.parseInt(tablaDetalle.getValueAt(i, 1).toString());
            int cant = Integer.parseInt(tablaDetalle.getValueAt(i, 3).toString());
            double pre = Double.parseDouble(tablaDetalle.getValueAt(i, 4).toString());
            dv.setIdVentas(idve);
            dv.setIdProducto(idp);
            dv.setCantidad(cant);
            dv.setPreVenta(pre);
            vdao.GuardarDetalleVentas(dv);
        }

    }
    

    void buscarCliente() {
        int r;

        String cod = txtCodCliente.getText();
        if (txtCodCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar codigo cliente");

        } else {

            cliente = cdao.listarID(cod);
            if (cliente.getDni() != null) {
                txtCliente.setText(cliente.getNom());
                txtCodProd.requestFocus();

            } else {
                r = JOptionPane.showConfirmDialog(this, "Cliente no registrado, desea Registar?");

                if (r == 0) {

                    ClienteFormV2 p1 = new ClienteFormV2();
                    p1.setSize(1070, 570);
                    p1.setLocation(0, 0);

                    content.removeAll();
                    content.add(p1, BorderLayout.CENTER);
                    content.revalidate();
                    content.repaint();

                }
            }

        }

    }

    void buscarProducto() {
        int r;
        int id = Integer.parseInt(txtCodProd.getText());

        if (txtCodProd.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "debe ingresar el codigo del producto");

        } else {
            p = pdao.listarId(id);

            if (p.getId() != 0) {
                txtProd.setText(p.getNom());
                txtPrecio.setText("" + p.getPre());
                txtStock.setText("" + p.getStock());

            } else {
                r = JOptionPane.showConfirmDialog(this, "Producto no registrado, desea Registar?");

                if (r == 0) {

                    ProductoFormV2 p1 = new ProductoFormV2();
                    p1.setSize(1070, 570);
                    p1.setLocation(0, 0);

                    content.removeAll();
                    content.add(p1, BorderLayout.CENTER);
                    content.revalidate();
                    content.repaint();

                }

            }

        }

    }

    void agregarProducto() {
        double total;

        Producto p = new Producto();
        modelo = (DefaultTableModel) tablaDetalle.getModel();
        item = item + 1;
        idp = Integer.parseInt(txtCodProd.getText());
        String nomp = txtProd.getText();
        double pre = Double.parseDouble(txtPrecio.getText());
        int cant = Integer.parseInt(txtCantidad.getValue().toString());
        int stock = Integer.parseInt(txtStock.getText());

        total = cant * pre;
        ArrayList lista = new ArrayList();
        if (stock > 0) {

            lista.add(item);
            lista.add(idp);
            lista.add(nomp);
            lista.add(cant);
            lista.add(pre);
            lista.add(total);
            Object[] ob = new Object[6];
            ob[0] = lista.get(0);
            ob[1] = lista.get(1);
            ob[2] = lista.get(2);
            ob[3] = lista.get(3);
            ob[4] = lista.get(4);
            ob[5] = lista.get(5);
            txtCodProd.setText("Ingrese el codigo del producto");
            txtCodProd.setForeground(Color.LIGHT_GRAY);
            txtPrecio.setText("Precio del producto");
            txtPrecio.setForeground(Color.LIGHT_GRAY);
            txtCantidad.setValue(0);
            txtProd.setText("");
            txtStock.setText("");

            modelo.addRow(ob);
            tablaDetalle.setModel(modelo);
            calculatTotal();
        } else {

            JOptionPane.showMessageDialog(this, "Stock Producto no disponible");

        }

    }

    void calculatTotal() {
        tpagar = 0;
        for (int i = 0; i < tablaDetalle.getRowCount(); i++) {
            cant = Integer.parseInt(tablaDetalle.getValueAt(i, 3).toString());
            pre = Double.parseDouble(tablaDetalle.getValueAt(i, 4).toString());
            tpagar = tpagar + (cant * pre);

        }
        TotalPagar.setText("" + tpagar);

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TotalPagar;
    public static javax.swing.JTextField TxtVend;
    private javax.swing.JButton btnAgregarProd;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tablaDetalle;
    private javax.swing.JSpinner txtCantidad;
    public static javax.swing.JTextField txtCliente;
    public static javax.swing.JTextField txtCodCliente;
    public static javax.swing.JTextField txtCodProd;
    private javax.swing.JLabel txtFecha;
    public static javax.swing.JTextField txtPrecio;
    public static javax.swing.JTextField txtProd;
    private javax.swing.JTextField txtSerie;
    public static javax.swing.JTextField txtStock;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
