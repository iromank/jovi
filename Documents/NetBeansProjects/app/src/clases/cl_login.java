
package clases;
import clases.cl_conectarrr;
import com.itextpdf.text.html.HtmlTags;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultListModel;
public class cl_login {
    cl_conectarrr cl_conectar=new cl_conectarrr();
    private String usuario;
    private String clave;
    public  String usu;
    private String pass;
    public static String codigo;
    private Statement stmt;
    private ResultSet rs;
    
    public String getUsuario() {
        return usuario;
    }

    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }
        public String getUsu() {
        return usu;
    }

    /**
     * @param usu the usu to set
     */
    public void setUsu(String usu) {
        this.usu = usu;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }
public  boolean validousuario(){
    
   boolean res=false;
   stmt=cl_conectar.conexion();
    try {
        String sql="SELECT idusuario,usuario,clave FROM usuario WHERE usuario='"+usuario+"' AND clave='"+clave+"'";
        
        rs=cl_conectar.consulta(stmt, sql);
        while (rs.next()) {
                codigo=rs.getString("idusuario");
                usu=(rs.getString("usuario"));
                pass=(rs.getString("clave"));
                System.out.println(usu);
            res=true;
        }
        
    } catch (Exception ex) {
    }
    
   
   
   
    return res;
}

public void todos_los_uausrios(DefaultListModel lista){
stmt=cl_conectar.conexion();
    try {
        String sql="SELECT usuario FROM usuario WHERE estado='1'";
        rs=cl_conectar.consulta(stmt, sql);
        
        while(rs.next()){
           lista.addElement(rs.getString(1)+"          "+".");
           
        }
    } catch (Exception e) {
    }
}

public void abrir_secion(){
    stmt=cl_conectar.conexion();
    try {
      
        String sql="UPDATE usuario set estado='1' WHERE idusuario='"+codigo+"'";
        int res=cl_conectar.actualiza(stmt,sql);
        System.out.println("siiiiiiiiii");
        
    } catch (Exception e) {
    }
}

public void cerrar_secion(){
    stmt=cl_conectar.conexion();
    try {
      
        String sql="UPDATE usuario set estado='0' WHERE idusuario='"+codigo+"'";
        int res=cl_conectar.actualiza(stmt,sql);
        System.out.println("siiiiiiiiii");
        
    } catch (Exception e) {
    }
}
}
