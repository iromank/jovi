
package clases;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
public class cl_reportes {
    
    
    
public void cadames(){
    
  Timer tiempo=new Timer();
  
   TimerTask tarea=new TimerTask() {
      @Override
      public void run() {
         
      }
  };
  
   tiempo.schedule(tarea, new Date(), 10000);
  
  
  
  
  
}
    
}
