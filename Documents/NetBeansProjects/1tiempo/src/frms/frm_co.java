/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frms;
import cl_clases.*;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JCheckBox;
public class frm_co extends javax.swing.JFrame {
 cl_ciudadano cl=new cl_ciudadano();
 JCheckBox com=new JCheckBox();
 public static String id;
 public static String accion;
    public frm_co() {
        initComponents();
        cl_conectar.conexion();
        
        if(accion.equals("modificar")){
          cl.traer_datos(id, txt_codigo, txt_nombre, txt_ape_pat, txt_ape_mat);
          cl.datos(btn_1, btn_2, btn_3, btn_4);
          cl.traer_codigo(txt_codigo);
         cl.llenar_lista(cob_nombre);
         cl.llenar(cbo_ape_pat);
         
         
        }
    }
private void llenar(){
   cl.setId_cidadano(txt_codigo.getText());
   cl.setNombre(txt_nombre.getText());
   cl.setApe_pat(txt_ape_pat.getText());
   cl.setApe_mat(txt_ape_pat.getText());
    
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_ape_pat = new javax.swing.JTextField();
        txt_ape_mat = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        cob_nombre = new javax.swing.JComboBox<>();
        cbo_ape_pat = new javax.swing.JComboBox<>();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("codigo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 35, -1, -1));

        jLabel2.setText("nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 89, -1, -1));

        jLabel3.setText("ape_pat");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 134, -1, -1));

        jLabel4.setText("ape_mat");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 177, -1, -1));
        getContentPane().add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 32, 129, -1));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 86, 119, -1));
        getContentPane().add(txt_ape_pat, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 131, 119, -1));

        txt_ape_mat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_ape_matKeyPressed(evt);
            }
        });
        getContentPane().add(txt_ape_mat, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 174, 119, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 260, -1, -1));

        getContentPane().add(cob_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 86, 110, -1));

        getContentPane().add(cbo_ape_pat, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 142, 94, -1));
        getContentPane().add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 318, 98, 38));
        getContentPane().add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 318, 88, 38));
        getContentPane().add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 318, 84, 38));
        getContentPane().add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 318, 80, 38));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 201, 112, -1));

        jToggleButton1.setText("jToggleButton1");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        llenar();
        cl.insertar();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void txt_ape_matKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ape_matKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_PAGE_UP){
             txt_ape_pat.requestFocus();
         }
    }//GEN-LAST:event_txt_ape_matKeyPressed

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
            java.util.logging.Logger.getLogger(frm_co.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_co.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_co.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_co.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_co().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JComboBox<String> cbo_ape_pat;
    public static javax.swing.JComboBox<String> cob_nombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField txt_ape_mat;
    private javax.swing.JTextField txt_ape_pat;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
