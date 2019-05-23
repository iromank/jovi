/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import clases.cl_json_entidad;
import clases.cl_proveedor;
import clases.cl_varios;
import com.mxrck.autocompleter.AutoCompleterCallback;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author CALIDAD
 */
public class frm_reg_proveedor extends javax.swing.JDialog {

    cl_varios c_varios = new cl_varios();
    cl_proveedor c_proveedor = new cl_proveedor();

    boolean existe_ruc = false;

    /**
     * Creates new form frm_reg_proveedor
     */
    public frm_reg_proveedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        cargar_rucs();
    }

    private void cargar_rucs() {
        TextAutoCompleter tac_proveedor = new TextAutoCompleter(txt_ruc, new AutoCompleterCallback() {
            @Override
            public void callback(Object selectedItem) {
                System.out.println("El usuario seleccionó: " + selectedItem);
                existe_ruc = true;
            }
        });
        tac_proveedor.setMode(0);
        ArrayList lista = c_proveedor.cargar_rucs();
        Iterator<String> it = lista.iterator();
        while (it.hasNext()) {
            tac_proveedor.addItem(it.next().trim());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_razon_social = new javax.swing.JTextField();
        txt_telefonos = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_cerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_web = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_ruc = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_nombre_comercial = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar Proveedor");

        txt_razon_social.setEnabled(false);
        txt_razon_social.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_razon_socialKeyPressed(evt);
            }
        });

        txt_telefonos.setEnabled(false);
        txt_telefonos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_telefonosKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonosKeyTyped(evt);
            }
        });

        txt_direccion.setEnabled(false);
        txt_direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_direccionKeyPressed(evt);
            }
        });

        jLabel2.setText("Razon Social:");

        btn_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cancel.png"))); // NOI18N
        btn_cerrar.setText("Cerrar");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        jLabel1.setText("RUC:");

        txt_web.setEnabled(false);
        txt_web.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_webKeyPressed(evt);
            }
        });

        btn_registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/add.png"))); // NOI18N
        btn_registrar.setText("Registrar");
        btn_registrar.setEnabled(false);
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        jLabel6.setText("Email");

        txt_ruc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ruc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_rucKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_rucKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_rucKeyTyped(evt);
            }
        });

        txt_email.setEnabled(false);
        txt_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_emailKeyPressed(evt);
            }
        });

        jLabel5.setText("Pagina Web:");

        jLabel4.setText("Telefono:");

        jLabel3.setText("Direccion:");

        txt_nombre_comercial.setEnabled(false);
        txt_nombre_comercial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nombre_comercialKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_registrar)
                        .addGap(74, 74, 74)
                        .addComponent(btn_cerrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nombre_comercial, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_razon_social)
                            .addComponent(txt_direccion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_web, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                                    .addComponent(txt_ruc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_telefonos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 205, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ruc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_razon_social, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_nombre_comercial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_telefonos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_web, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_razon_socialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_razon_socialKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txt_razon_social.getText().length() > 5) {
                txt_nombre_comercial.setEnabled(true);
                txt_nombre_comercial.requestFocus();
            }
        }
    }//GEN-LAST:event_txt_razon_socialKeyPressed

    private void txt_telefonosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txt_email.setEnabled(true);
            txt_email.requestFocus();
        }
    }//GEN-LAST:event_txt_telefonosKeyPressed

    private void txt_telefonosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonosKeyTyped

    }//GEN-LAST:event_txt_telefonosKeyTyped

    private void txt_direccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_direccionKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txt_direccion.getText().length() > 5) {
                txt_telefonos.setEnabled(true);
                txt_telefonos.requestFocus();
            }
        }
    }//GEN-LAST:event_txt_direccionKeyPressed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void txt_webKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_webKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btn_registrar.setEnabled(true);
            btn_registrar.requestFocus();
        }
    }//GEN-LAST:event_txt_webKeyPressed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        btn_registrar.setEnabled(false);
        int confirmado = JOptionPane.showConfirmDialog(null, "¿Esta Seguro de Registrar el Proveedor?");

        if (JOptionPane.OK_OPTION == confirmado) {

            c_proveedor.setRuc(txt_ruc.getText());
            c_proveedor.setRazon_social(txt_razon_social.getText().toUpperCase().trim());
            c_proveedor.setNombre_comercial(txt_nombre_comercial.getText().toUpperCase().trim());
            c_proveedor.setDireccion(txt_direccion.getText().toUpperCase().trim());
            c_proveedor.setEmail(txt_email.getText().toLowerCase().trim());
            c_proveedor.setWeb(txt_web.getText().toLowerCase().trim());
            c_proveedor.setTelefono(txt_telefonos.getText().toLowerCase().trim());

            if (c_proveedor.insertar()) {
                this.dispose();
            }
        } else {
            btn_registrar.setEnabled(true);
        }
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void txt_rucKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rucKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txt_ruc.getText().length() == 11) {
                String documento = txt_ruc.getText();
                //ruc
                try {
                    String json = cl_json_entidad.getJSONRUC(documento);
                    //Lo mostramos
                    String[] datos = cl_json_entidad.showJSONRUC(json);
                    txt_razon_social.setText(datos[0].trim());
                    txt_direccion.setText(datos[1].trim());
                    txt_ruc.setEnabled(false);
                    txt_razon_social.setEnabled(false);
                    txt_direccion.setEnabled(false);
                    txt_nombre_comercial.setEnabled(true);
                    txt_nombre_comercial.requestFocus();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
                }
            }
            if (txt_ruc.getText().length() < 11) {
                JOptionPane.showMessageDialog(null, "FALTAN DIGITOS, RUC CONTIENE 11 DIGITOS");
            }
        }
    }//GEN-LAST:event_txt_rucKeyPressed

    private void txt_rucKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rucKeyTyped
        c_varios.limitar_caracteres(evt, txt_ruc, 11);
        c_varios.solo_numeros(evt);
    }//GEN-LAST:event_txt_rucKeyTyped

    private void txt_emailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_emailKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txt_web.setEnabled(true);
            txt_web.requestFocus();
        }
    }//GEN-LAST:event_txt_emailKeyPressed

    private void txt_rucKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rucKeyReleased
        if (txt_ruc.getText().length() == 11) {
            txt_razon_social.setEnabled(false);
        }
        if (txt_ruc.getText().length() < 11) {
            txt_razon_social.setEnabled(false);
        }
    }//GEN-LAST:event_txt_rucKeyReleased

    private void txt_nombre_comercialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombre_comercialKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txt_nombre_comercial.getText().length() > 5) {
                txt_direccion.setEnabled(true);
                txt_direccion.requestFocus();
            }
        }
    }//GEN-LAST:event_txt_nombre_comercialKeyPressed

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
            java.util.logging.Logger.getLogger(frm_reg_proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_reg_proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_reg_proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_reg_proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frm_reg_proveedor dialog = new frm_reg_proveedor(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_cerrar;
    public static javax.swing.JButton btn_registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JTextField txt_direccion;
    public static javax.swing.JTextField txt_email;
    public static javax.swing.JTextField txt_nombre_comercial;
    public static javax.swing.JTextField txt_razon_social;
    public static javax.swing.JTextField txt_ruc;
    public static javax.swing.JTextField txt_telefonos;
    public static javax.swing.JTextField txt_web;
    // End of variables declaration//GEN-END:variables
}