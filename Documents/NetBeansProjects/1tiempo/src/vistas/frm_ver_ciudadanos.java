/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;
import javax.swing.table.DefaultTableModel;
import cl_clases.*;
import java.awt.Frame;
import java.sql.*;
import frms.frm_co;
public class frm_ver_ciudadanos extends javax.swing.JFrame {
DefaultTableModel modelo=new DefaultTableModel();
cl_ciudadano ciu=new cl_ciudadano();
Connection con;
ResultSet rs;
Statement stmt;
String nombre="NILSON";
String ape_pat="BACA";
String ape_mat="VARGAS";
int fila;
    public frm_ver_ciudadanos() {
        initComponents();
        t_ciudadano.setVisible(false);
        modelo.addColumn("codigo");
        modelo.addColumn("nombre");
        modelo.addColumn("ape_pat");
        modelo.addColumn("ape_pa");
        
        ciu.mostrar(modelo);
        t_ciudadano.setModel(modelo);
        
        jButton2.setText("<html> <font color=red>"+nombre+" </font><br> "+ape_pat+" <br> "+ape_mat+"</html>");
        
    }
public void buscar(String busca){
    con=cl_conectar.conexion();
    try {
        String query="select * from ciudadano where ape_pat like '%"+busca+"%'";
        stmt=con.createStatement();
        rs=stmt.executeQuery(query);
        while(rs.next()){
            
             String[] array = new String[4];
                array[0] = rs.getString(1);
                array[1] = rs.getString(2);
                array[2] = rs.getString(3);
                array[3] = rs.getString(4);
                modelo.addRow(array);
        }
    } catch (Exception e) {
    }
}
private void limpiar (){
      int t=modelo.getRowCount();
       for (int i = 0; i <t; i++) {
           modelo.removeRow(0);
           
       }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        t_ciudadano = new javax.swing.JTable();
        txt_busca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t_ciudadano.setModel(new javax.swing.table.DefaultTableModel(
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
        t_ciudadano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_ciudadanoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(t_ciudadano);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 168, 375, 275));

        txt_busca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscaKeyReleased(evt);
            }
        });
        getContentPane().add(txt_busca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 115, 354, -1));

        jLabel1.setText("BUSCAR POR NOMBRE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 58, 175, -1));

        jButton1.setText("limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 145, -1, -1));

        jToggleButton1.setText("modificar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 289, -1, -1));

        jButton2.setText("jButton2");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 74, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_buscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscaKeyReleased
        // TODO add your handling code here:
        limpiar ();
     ciu.buscar(modelo, txt_busca.getText());
     t_ciudadano.setModel(modelo);
      
    }//GEN-LAST:event_txt_buscaKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        frm_co.id=t_ciudadano.getValueAt(fila,0).toString();
        frm_co.accion="modificar";
        frm_co co=new frm_co();
        co.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void t_ciudadanoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_ciudadanoMouseClicked
        // TODO add your handling code here:
        fila=t_ciudadano.getSelectedRow();
       
    }//GEN-LAST:event_t_ciudadanoMouseClicked

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
            java.util.logging.Logger.getLogger(frm_ver_ciudadanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_ver_ciudadanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_ver_ciudadanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_ver_ciudadanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_ver_ciudadanos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable t_ciudadano;
    private javax.swing.JTextField txt_busca;
    // End of variables declaration//GEN-END:variables
}
