
package timer;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
public  class timer_ver_activos {
   
    
    public void tareas(){
        
        Timer tiempo=new Timer();
        
        tarea tareas=new tarea();
        
        tiempo.schedule(tareas, new Date(),1000);
        
    }





}
