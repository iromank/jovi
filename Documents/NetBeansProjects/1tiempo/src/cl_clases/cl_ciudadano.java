/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl_clases;

import frms.frm_co;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class cl_ciudadano {

    private String id_cidadano;
    private String nombre;
    private String ape_pat;
    private String ape_mat;
    private Connection con;
    private Statement stmt;
    private ResultSet rs;

    public String getId_cidadano() {
        return id_cidadano;
    }

    /**
     * @param id_cidadano the id_cidadano to set
     */
    public void setId_cidadano(String id_cidadano) {
        this.id_cidadano = id_cidadano;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the ape_pat
     */
    public String getApe_pat() {
        return ape_pat;
    }

    /**
     * @param ape_pat the ape_pat to set
     */
    public void setApe_pat(String ape_pat) {
        this.ape_pat = ape_pat;
    }

    /**
     * @return the ape_mat
     */
    public String getApe_mat() {
        return ape_mat;
    }

    /**
     * @param ape_mat the ape_mat to set
     */
    public void setApe_mat(String ape_mat) {
        this.ape_mat = ape_mat;
    }

    public boolean insertar() {
        boolean si = false;
        try {
            con = cl_conectar.conexion();
            String sql = "insert into ciudadano values('" + id_cidadano + "','" + nombre + "','" + ape_pat + "','" + ape_pat + "')";
            stmt = con.createStatement();
            stmt.executeQuery(sql);
            si = true;
        } catch (Exception e) {
        }
        return si;
    }

    public void mostrar(DefaultTableModel modelo) {

        try {
            con = cl_conectar.conexion();
            String sql = "select * from ciudadano order by ape_pat asc ";
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
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

    public void buscar(DefaultTableModel modelo, String usuario) {

        try {
            con = cl_conectar.conexion();
            String sql = "select * from ciudadano where ape_pat like '%" + usuario + "%'";
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
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

    public String traer_codigo(JTextField texto) {

        try {
            con = cl_conectar.conexion();
            String sql = "select max(id_ciu)+1 from ciudadano";
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                texto.setText(rs.getString(1));
            }
        } catch (Exception e) {
        }

        return "";
    }

    public String traer_datos(String busca, JTextField codigo, JTextField nombre, JTextField ape_pat, JTextField ape_mat) {

        try {
            con = cl_conectar.conexion();
            String sql = "select * from ciudadano where id_ciu='" + busca + "'";
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                codigo.setText(rs.getString(1));
                nombre.setText(rs.getString(2));
                ape_pat.setText(rs.getString(3));
                ape_mat.setText(rs.getString(4));
            }
        } catch (Exception e) {
        }

        return "";
    }

    public void llenar_lista(JComboBox lista) {

        try {
            con = cl_conectar.conexion();
            String sql = "select nombre from ciudadano";
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                lista.addItem(rs.getString(1));

            }
        } catch (Exception e) {
        }

    }

    public void llenar(JComboBox lista) {

        try {
            con = cl_conectar.conexion();
            String sql = "select ape_pat from ciudadano";
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                lista.addItem(rs.getString(1));

            }
        } catch (Exception e) {
        }

    }

    public boolean datos(JButton codigo, JButton nombre, JButton ape_pat, JButton ape_mat) {
        boolean si = false;
        try {
            con = cl_conectar.conexion();
            String sql = "select * from ciudadano ";
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                codigo.setText(rs.getString(1));
                nombre.setText(rs.getString(2));
                ape_pat.setText(rs.getString(3));
                ape_mat.setText(rs.getString(4));
                si=true;
            }
        } catch (Exception e) {
        }
      return si;
    }
}
