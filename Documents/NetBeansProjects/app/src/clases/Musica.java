
package clases;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import clases.cl_conectarrr;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

@Entity
@Table(name = "musica")
@NamedQueries({
    @NamedQuery(name = "Musica.findAll", query = "SELECT m FROM Musica m"),
    @NamedQuery(name = "Musica.findByIdmusica", query = "SELECT m FROM Musica m WHERE m.musicaPK.idmusica = :idmusica"),
    @NamedQuery(name = "Musica.findByMusica", query = "SELECT m FROM Musica m WHERE m.musicaPK.musica = :musica")})
public class Musica implements Serializable {
cl_conectarrr c_conectar=new cl_conectarrr();
Statement stmt;
ResultSet rs;
static  String actulisa;
static String ultimo;
static String ultimo_codigo;
    public Musica(Statement stmt, ResultSet rs, MusicaPK musicaPK, Usuario idusuario) {
        this.stmt = stmt;
        this.rs = rs;
        this.musicaPK = musicaPK;
        this.idusuario = idusuario;
    }

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MusicaPK musicaPK;
    @JoinColumn(name = "idusuario", referencedColumnName = "idusuario")
    @ManyToOne(optional = false)
    private Usuario idusuario;

    public Musica() {
    }

    public Musica(MusicaPK musicaPK) {
        this.musicaPK = musicaPK;
    }

    public Musica(int idmusica, String musica) {
        this.musicaPK = new MusicaPK(idmusica, musica);
    }

    public MusicaPK getMusicaPK() {
        return musicaPK;
    }

    public void setMusicaPK(MusicaPK musicaPK) {
        this.musicaPK = musicaPK;
    }

    public Usuario getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Usuario idusuario) {
        this.idusuario = idusuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (musicaPK != null ? musicaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Musica)) {
            return false;
        }
        Musica other = (Musica) object;
        if ((this.musicaPK == null && other.musicaPK != null) || (this.musicaPK != null && !this.musicaPK.equals(other.musicaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clases.Musica[ musicaPK=" + musicaPK + " ]";
    }
    
    public void cargamusica( DefaultTableModel modelo){
        stmt=c_conectar.conexion();
        try {
            String sql="SELECT idmusica,musica FROM `musica` WHERE idusuario='"+cl_login.codigo+"'";
            rs=c_conectar.consulta(stmt, sql);
            while(rs.next()){
               String [] array=new String[2];
                 array[0]=rs.getString(1);
                 array[1]=rs.getString(2);
                  modelo.addRow(array);
                 
            }
        } catch (Exception e) {
            System.err.println(""+e);
        }
    }
       public void cargatodasmusica(DefaultListModel  modelo){
        stmt=c_conectar.conexion();
        try {
            String sql="SELECT musica FROM `musica`";
            rs=c_conectar.consulta(stmt, sql);
            while(rs.next()){
               modelo.addElement(rs.getString(1));
                 
            }
        } catch (Exception e) {
        }
    }
   
   public boolean eliminarmusica(String id_musica){
   boolean respuesta=false;
         stmt=c_conectar.conexion();
        try {
            String sql="DELETE from musica WHERE idmusica='"+id_musica+"'";
          int res=c_conectar.actualiza(stmt, sql);
          if(res>-1){
              respuesta=true;
          }
        } catch (Exception e) {
        }
        return respuesta;
   }
   public void limpiar(DefaultTableModel modelo){
       for (int i = 0; i <modelo.getRowCount(); i++) {
           modelo.removeRow(i);
           
       }
   }
   public void conprobar(){
        Timer Timer=new Timer();
        TimerTask tarea=new TimerTask() {
            @Override
            public void run() {
             Statement  st=c_conectar.conexion();
             try {
            String sql="SELECT COUNT(idmusica) FROM musica";
           ResultSet r=c_conectar.consulta(st, sql);
            while(r.next()){
               actulisa=r.getString(1);
                if(actulisa.equals(ultimo)){
                    
                }
                else{
                    String music="";
                    ultimo=actulisa;
                    try {
                        Statement s=c_conectar.conexion();
                        String sq="SELECT max(idmusica) as idmusica from musica";
                       ResultSet resul=c_conectar.consulta(s, sq);
                       while(resul.next()){
                          ultimo_codigo=resul.getString("idmusica");
                       }
                    } catch (Exception e) {
                    }
                    try {
                        Statement stm=c_conectar.conexion();
                        String mysql="SELECT musica from musica WHERE idmusica='"+ultimo_codigo+"'";
                       ResultSet musica=c_conectar.consulta(stm, mysql);
                        while(musica.next()){
                            
                           music= musica.getString(1);
                        }
                    } catch (Exception e) {
                    }
                    
                    JOptionPane.showMessageDialog(null,"la ultima musica registrada "+music,"se registro "+new Date(),JOptionPane.INFORMATION_MESSAGE);
                }
                 
            }
        } catch (Exception e) {
                 System.err.println("errroor"+e);
        }
        
        

            }
        };
        
        Timer.schedule(tarea,new Date() ,10000);
    }
 public void ultimo(){
          Statement  st=c_conectar.conexion();
             try {
            String sql="SELECT COUNT(idmusica) FROM musica";
           ResultSet r=c_conectar.consulta(st, sql);
            while(r.next()){
               ultimo=r.getString(1);
                System.err.println(actulisa);
                 
            }
        } catch (Exception e) {
                 System.err.println("errroor"+e);
        }
        
     
 }
 
        
  
}
