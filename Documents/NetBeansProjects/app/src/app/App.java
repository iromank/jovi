
package app;

import javax.swing.JFrame;
import org.jvnet.substance.SubstanceLookAndFeel;

public class App {

    public static void main(String[] args) {
JFrame.setDefaultLookAndFeelDecorated(true);
SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.BusinessBlackSteelSkin");
    frm_logins login=new frm_logins();
    login.setVisible(true);
    }
    
}
