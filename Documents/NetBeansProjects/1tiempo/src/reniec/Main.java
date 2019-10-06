/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reniec;
import com.sun.speech.freetts.VoiceManager;
import com.sun.speech.freetts.Voice;
//import java.util.Date;
//import java.util.Timer;
//import java.util.TimerTask;
//import vistas.frm_ver_ciudadanos;

/**
 *
 * @author BACA VARGAS
 */
public class Main {


    public static void main(String[] args) {
//        frm_ver_ciudadanos frm=new frm_ver_ciudadanos();
//        frm.setVisible(true);
        
//        Timer ti=new Timer();
//        
//        TimerTask tare=new TimerTask() {
//            @Override
//            public void run() {
//                System.out.println("hola "+new Date());
//            }
//        };
//       ti.schedule(tare, 0, 1000);
//    }
 VoiceManager manager=VoiceManager.getInstance();
        Voice voz= manager.getVoice("kevin16");
        voz.allocate();
            voz.speak("Hello World");
        voz.deallocate();
    
    }
}
