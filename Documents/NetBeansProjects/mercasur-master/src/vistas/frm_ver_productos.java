/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import clases.cl_productos;
import clases.cl_und_medida;
import clases.cl_varios;
import forms.frm_reg_producto;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
public class frm_ver_productos extends javax.swing.JInternalFrame {

    cl_productos c_productos = new cl_productos();
    cl_varios c_varios = new cl_varios();
    Integer i;
    DefaultTableModel mostrar;

    /**
     * Creates new form frm_ver_productos
     */
    public frm_ver_productos() {
        initComponents();
        String query = "select p.idproducto, p.descripcion, p.grado, p.marca, p.modelo, p.cant_actual, p.cant_min, u.nombre_corto, p.precio_venta, p.estado "
                + "from productos as p "
                + "inner join und_medida as u on p.unidad_medida = u.id "
                + "order by p.descripcion asc, p.marca, p.grado asc "
                + "limit 0";
        c_productos.ver_productos(t_productos, query);
        lbl_encontrados.setText(t_productos.getRowCount() + "");
    }

    private void activar_botones() {
        btn_eli.setEnabled(true);
        btn_kardex.setEnabled(true);
        btn_kardex_pdf.setEnabled(true);
        btn_mod.setEnabled(true);
    }

    private void desactivar_botones() {
        btn_eli.setEnabled(false);
        btn_kardex.setEnabled(false);
        btn_kardex_pdf.setEnabled(false);
        btn_mod.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_kardex = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        t_kardex = new javax.swing.JTable();
        txt_kardex_descripcion = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_bus = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_productos = new javax.swing.JTable();
        btn_mod = new javax.swing.JButton();
        btn_eli = new javax.swing.JButton();
        cbx_est = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        lbl_encontrados = new javax.swing.JLabel();
        btn_kardex = new javax.swing.JButton();
        btn_kardex_pdf = new javax.swing.JButton();

        t_kardex.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        t_kardex.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane2.setViewportView(t_kardex);

        txt_kardex_descripcion.setFocusable(false);

        javax.swing.GroupLayout jd_kardexLayout = new javax.swing.GroupLayout(jd_kardex.getContentPane());
        jd_kardex.getContentPane().setLayout(jd_kardexLayout);
        jd_kardexLayout.setHorizontalGroup(
            jd_kardexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_kardexLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_kardexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 928, Short.MAX_VALUE)
                    .addComponent(txt_kardex_descripcion))
                .addContainerGap())
        );
        jd_kardexLayout.setVerticalGroup(
            jd_kardexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_kardexLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(txt_kardex_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                .addContainerGap())
        );

        setTitle("Ver Productos");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cancel.png"))); // NOI18N
        jButton3.setText("Cerrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/find.png"))); // NOI18N
        jLabel1.setText("Buscar:");

        txt_bus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_busKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_busKeyReleased(evt);
            }
        });

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        t_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        t_productos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        t_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_productosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(t_productos);

        btn_mod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/application_edit.png"))); // NOI18N
        btn_mod.setText("Modifcar");
        btn_mod.setEnabled(false);
        btn_mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modActionPerformed(evt);
            }
        });

        btn_eli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bin_closed.png"))); // NOI18N
        btn_eli.setText("Eliminar");
        btn_eli.setEnabled(false);
        btn_eli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliActionPerformed(evt);
            }
        });

        cbx_est.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DISPONIBLE", "POR TERMINAR", "NO DISPONIBLE", "NO ACTIVO" }));
        cbx_est.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_estActionPerformed(evt);
            }
        });

        jLabel2.setText("Encontrados:");

        lbl_encontrados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_encontrados.setText("0");

        btn_kardex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/clipboard_text.png"))); // NOI18N
        btn_kardex.setText("Kardex");
        btn_kardex.setEnabled(false);
        btn_kardex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kardexActionPerformed(evt);
            }
        });

        btn_kardex_pdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/clipboard_text.png"))); // NOI18N
        btn_kardex_pdf.setText("Kardex en PDF");
        btn_kardex_pdf.setEnabled(false);
        btn_kardex_pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kardex_pdfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_bus, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_encontrados, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(86, 86, 86)
                        .addComponent(cbx_est, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btn_mod))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_eli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_kardex)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_kardex_pdf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_bus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_est, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(lbl_encontrados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_kardex, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_kardex_pdf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_busKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_busKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txt_bus.getText().length() == 0) {
                String query = "select p.idproducto, p.descripcion, p.grado, p.marca, p.modelo, p.cant_actual, p.cant_min, u.nombre_corto, p.precio_venta, p.estado "
                        + "from productos as p "
                        + "inner join und_medida as u on p.unidad_medida = u.id "
                        + "order by p.descripcion asc, p.marca, p.grado asc ";
                c_productos.ver_productos(t_productos, query);
                lbl_encontrados.setText(t_productos.getRowCount() + "");
            }
        }
    }//GEN-LAST:event_txt_busKeyPressed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked

    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void btn_modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modActionPerformed
        if (i > -1) {
            desactivar_botones();
            Frame f = JOptionPane.getRootFrame();
            frm_reg_producto.c_producto.setId_producto(Integer.parseInt(t_productos.getValueAt(i, 0).toString()));
            frm_reg_producto dialog = new frm_reg_producto(f, true);
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "NO HA SELECCIONADO UNA FILA");
        }
    }//GEN-LAST:event_btn_modActionPerformed

    private void btn_eliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliActionPerformed
        desactivar_botones();
    }//GEN-LAST:event_btn_eliActionPerformed

    private void cbx_estActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_estActionPerformed

    }//GEN-LAST:event_cbx_estActionPerformed

    private void t_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_productosMouseClicked
        if (evt.getClickCount() == 2) {
            i = t_productos.getSelectedRow();
            activar_botones();
        }
    }//GEN-LAST:event_t_productosMouseClicked

    private void txt_busKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_busKeyReleased
        String texto = txt_bus.getText();
        String query = "select p.idproducto, p.descripcion, p.grado, p.marca, p.modelo, p.cant_actual, p.cant_min, u.nombre_corto, p.precio_venta, p.estado "
                + "from productos as p "
                + "inner join und_medida as u on p.unidad_medida = u.id "
                + "where p.idproducto = '" + texto + "' or p.descripcion like '%" + texto + "%' or p.grado like '%" + texto + "%' or p.marca like '%" + texto + "%' "
                + "or p.modelo like '%" + texto + "%' or p.referencia like '%" + texto + "%' or p.caracteristicas like '%" + texto + "%'"
                + "order by p.descripcion asc, p.marca, p.grado asc";
        c_productos.ver_productos(t_productos, query);
        lbl_encontrados.setText(t_productos.getRowCount() + "");
    }//GEN-LAST:event_txt_busKeyReleased

    private void btn_kardexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kardexActionPerformed
        if (i > -1) {
            desactivar_botones();
            jd_kardex.setModal(true);
            jd_kardex.setSize(840, 380);
            jd_kardex.setLocationRelativeTo(null);
            c_productos.setId_producto(Integer.parseInt(t_productos.getValueAt(i, 0).toString()));
            txt_kardex_descripcion.setText(t_productos.getValueAt(i, 1).toString());
            c_productos.ver_kardex(t_kardex);
            jd_kardex.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "NO HA SELECCIONADO UNA FILA");
        }
    }//GEN-LAST:event_btn_kardexActionPerformed

    private void btn_kardex_pdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kardex_pdfActionPerformed
        desactivar_botones();
        if (i > -1) {
            c_productos.setId_producto(Integer.parseInt(t_productos.getValueAt(i, 0).toString()));
            File miDir = new File(".");
            try {
                System.out.println("Directorio actual: " + miDir.getCanonicalPath());
                Map<String, Object> parametros = new HashMap<>();
                String id_productos = c_productos.getId_producto() + "";
                String path = miDir.getCanonicalPath();
                String direccion = path + "//reports//subreports//";
                //String direccion = path + "\\reports\\subreports\\";
                System.out.println(direccion);
                //    parametros.put("SUBREPORT_DIR", direccion);
                parametros.put("input_producto", id_productos);
                c_varios.ver_reporte("rpt_kardex", parametros);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
            }
        } else {
            JOptionPane.showInternalMessageDialog(this, "no ha seleccionado un vehiculo");
        }
    }//GEN-LAST:event_btn_kardex_pdfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eli;
    private javax.swing.JButton btn_kardex;
    private javax.swing.JButton btn_kardex_pdf;
    private javax.swing.JButton btn_mod;
    private javax.swing.JComboBox cbx_est;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JDialog jd_kardex;
    private javax.swing.JLabel lbl_encontrados;
    private javax.swing.JTable t_kardex;
    private javax.swing.JTable t_productos;
    private javax.swing.JTextField txt_bus;
    private javax.swing.JTextField txt_kardex_descripcion;
    // End of variables declaration//GEN-END:variables
}
