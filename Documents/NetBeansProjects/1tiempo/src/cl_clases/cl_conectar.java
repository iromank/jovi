/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl_clases;
import java.sql.*;
import javax.swing.JOptionPane;
public class cl_conectar {
    
  
    public static Connection conexion(){
           Connection con=null;
        try {
           String url="jdbc:sqlserver://localhost; databaseName=reniec;user=sa; password=123456;";
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           con=DriverManager.getConnection(url);
          
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"noooo conecto");
        }
    finally{
            return con;
        }
}
}

