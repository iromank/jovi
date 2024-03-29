/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import clases.cl_productos;
import clases.cl_und_medida;
import clases.cl_varios;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import models.m_und_medida;

/**
 *
 * @author CALIDAD
 */
public class frm_reg_producto extends javax.swing.JDialog {

    cl_varios c_varios = new cl_varios();

    public static cl_productos c_producto = new cl_productos();
    cl_und_medida c_unidad = new cl_und_medida();
    m_und_medida m_medida = new m_und_medida();

    /**
     * Creates new form frm_reg_producto
     */
    public frm_reg_producto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        m_medida.cbx_und_medida(cbx_und);

        if (c_producto.getId_producto()!= 0) {
            c_producto.ver_datos_producto();
            c_unidad.setId(c_producto.getId_unidad());
            c_unidad.obtener_datos();
            txt_des.setText(c_producto.getDescripcion().trim());
            txt_pcom.setText(c_varios.formato_numero(c_producto.getCosto()));
            txt_pven.setText(c_varios.formato_numero(c_producto.getPrecio()));
            txt_gan.setText(c_varios.formato_numero(c_producto.getPrecio() - c_producto.getCosto()));
            txt_mar.setEnabled(true);
            txt_pven.setEnabled(true);
            txt_pcom.setEnabled(true);
            cbx_cla.setEnabled(true);
            cbx_tipo_producto.setEnabled(true);
//            cbx_und.setEnabled(true);
//            System.out.println(cbx_und.getSelectedItem().toString() + " - " + c_unidad.getNombre());
//            System.out.println(cbx_und.toString());
            btn_registrar.setText("Modificar");
            btn_registrar.setEnabled(true);
        }
    }

    private void llenar() {
        c_producto.setDescripcion(txt_des.getText().trim().toUpperCase());
        c_producto.setCosto(Double.parseDouble(txt_pcom.getText()));
        c_producto.setPrecio(Double.parseDouble(txt_pven.getText()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbx_tipo_producto = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        txt_gan = new javax.swing.JTextField();
        txt_mar = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_des = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbx_cla = new javax.swing.JComboBox();
        txt_pven = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_registrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txt_pcom = new javax.swing.JTextField();
        cbx_und = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar Producto");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        cbx_tipo_producto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BIEN", "SERVICIO" }));
        cbx_tipo_producto.setEnabled(false);
        cbx_tipo_producto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbx_tipo_productoKeyPressed(evt);
            }
        });

        jLabel13.setText("Tipo Producto:");

        txt_gan.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_gan.setEnabled(false);

        txt_mar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_mar.setEnabled(false);
        txt_mar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_marKeyPressed(evt);
            }
        });

        jLabel12.setText("Ganancia:");

        txt_des.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_desKeyPressed(evt);
            }
        });

        jLabel9.setText("Unidad de Medida:");

        jLabel1.setText("Clasificacion:");

        jLabel8.setText("Precio de Venta:");

        jLabel7.setText("Costo de Compra:");

        cbx_cla.setEnabled(false);
        cbx_cla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_claActionPerformed(evt);
            }
        });
        cbx_cla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbx_claKeyPressed(evt);
            }
        });

        txt_pven.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_pven.setEnabled(false);
        txt_pven.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_pvenKeyPressed(evt);
            }
        });

        jLabel3.setText("Marca:");

        btn_registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/add.png"))); // NOI18N
        btn_registrar.setText("Registrar");
        btn_registrar.setEnabled(false);
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });
        btn_registrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_registrarKeyPressed(evt);
            }
        });

        jLabel2.setText("Descripcion");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cancel.png"))); // NOI18N
        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txt_pcom.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_pcom.setEnabled(false);
        txt_pcom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_pcomKeyPressed(evt);
            }
        });

        cbx_und.setEnabled(false);
        cbx_und.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_undActionPerformed(evt);
            }
        });
        cbx_und.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbx_undKeyPressed(evt);
            }
        });

        jLabel4.setText("Comision:");

        jTextField1.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel12)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_des, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_registrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_pcom, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(109, 109, 109)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(txt_gan, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbx_tipo_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_pven, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(cbx_und, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_mar, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_cla, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_des, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_mar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_cla, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cbx_und, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txt_pven, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pcom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cbx_tipo_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txt_gan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_marKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_marKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cbx_cla.setEnabled(true);
            cbx_cla.requestFocus();
        }
    }//GEN-LAST:event_txt_marKeyPressed

    private void txt_desKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_desKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txt_des.getText().isEmpty()) {
                txt_mar.setEnabled(true);
                txt_mar.requestFocus();
            }
        }
    }//GEN-LAST:event_txt_desKeyPressed

    private void cbx_claActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_claActionPerformed

    }//GEN-LAST:event_cbx_claActionPerformed

    private void txt_pvenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pvenKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (c_varios.esDecimal(txt_pven.getText())) {
                double precio_compra = Double.parseDouble(txt_pcom.getText());
                double precio_venta = Double.parseDouble(txt_pven.getText());
                double ganacia = precio_venta - precio_compra;
                txt_gan.setText(c_varios.formato_totales(ganacia));
                txt_pven.setText(c_varios.formato_numero(precio_venta));
                cbx_tipo_producto.setEnabled(true);
                cbx_tipo_producto.requestFocus();
            }
        }
    }//GEN-LAST:event_txt_pvenKeyPressed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        btn_registrar.setEnabled(false);
        int confirmado = JOptionPane.showConfirmDialog(null, "¿Esta Seguro de Guardar el Producto?");

        if (JOptionPane.OK_OPTION == confirmado) {
            boolean bhecho = false;
            llenar();
            if (c_producto.getId_producto() != 0) {
                if (c_producto.modificar()) {
                    bhecho = true;
                    JOptionPane.showMessageDialog(null, "SE MODIFICO CORRECTAMENTE EL PRODUCTO");
                } else {
                    bhecho = false;
                }
            }

            if (c_producto.getId_producto() == 0) {
                c_producto.setId_producto(c_producto.obtener_codigo());
                if (c_producto.insertar()) {
                    bhecho = true;
                    JOptionPane.showMessageDialog(null, "SE HA REGISRTRADO CORRECTAMENTE AL PRODUCTO");
                } else {
                    bhecho = false;
                }
            }

            if (bhecho) {
                this.dispose();
            }
        } else {
            btn_registrar.setEnabled(true);
        }
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_registrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_registrarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btn_registrar.doClick();
        }
    }//GEN-LAST:event_btn_registrarKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        c_producto.setId_producto(0);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_pcomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pcomKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (c_varios.esDecimal(txt_pcom.getText())) {
                double precio_compra = Double.parseDouble(txt_pcom.getText());
                txt_pcom.setText(c_varios.formato_numero(precio_compra));
                txt_pven.setEnabled(true);
                txt_pven.requestFocus();
            }
        }
    }//GEN-LAST:event_txt_pcomKeyPressed

    private void cbx_undActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_undActionPerformed

    }//GEN-LAST:event_cbx_undActionPerformed

    private void cbx_undKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbx_undKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            System.out.println(cbx_und.getSelectedItem().toString());
            txt_pcom.setEnabled(true);
            txt_pcom.requestFocus();
        }
    }//GEN-LAST:event_cbx_undKeyPressed

    private void cbx_tipo_productoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbx_tipo_productoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cbx_cla.setEnabled(true);
            cbx_cla.requestFocus();
        }
    }//GEN-LAST:event_cbx_tipo_productoKeyPressed

    private void cbx_claKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbx_claKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btn_registrar.setEnabled(true);
            cbx_und.setEnabled(true);
            cbx_und.requestFocus();
        }
    }//GEN-LAST:event_cbx_claKeyPressed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        c_producto.setId_producto(0);
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(frm_reg_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_reg_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_reg_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_reg_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frm_reg_producto dialog = new frm_reg_producto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btn_registrar;
    public static javax.swing.JComboBox cbx_cla;
    public static javax.swing.JComboBox cbx_tipo_producto;
    public static javax.swing.JComboBox cbx_und;
    public static javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    public static javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField txt_des;
    public static javax.swing.JTextField txt_gan;
    public static javax.swing.JTextField txt_mar;
    public static javax.swing.JTextField txt_pcom;
    public static javax.swing.JTextField txt_pven;
    // End of variables declaration//GEN-END:variables
}
