/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hv.user.administration;
import GUI.HV_DesktopLoginFrame;

/**
 *
 * @author asterix
 */
public class HVUserAdministration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HV_DesktopLoginFrame hvdesktopLoginframe=new HV_DesktopLoginFrame();
        hvdesktopLoginframe.setTitle("HV Schreibtisch-Anmeldung");
        hvdesktopLoginframe.setSize(336, 144);
        hvdesktopLoginframe.setResizable(true);
        hvdesktopLoginframe.setLocationRelativeTo(null);
        hvdesktopLoginframe.setVisible(true);
    }
    
}
