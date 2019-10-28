/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SE.componentes;

import Principal.CargarSistema;
import Principal.FrmPrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author carlos
 */
public class Hilo extends Thread{
    private FrmPrincipal principal;
    
    Crud c = new Crud();
    
    public Hilo(FrmPrincipal principal){
        super();
        this.principal = principal;
    }

//    public Hilo() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    @Override
    public void run(){
        
        while(true){
            System.out.println("comida123");
            pausa(3600000);
        }
        
    }
    
    
    public void pausa(int mlsg){
        try {
            String fecha = c.HiloStatement();
            
            if ("A".equals(fecha)) {
                System.out.println("comida2: "+fecha);
            }
            if ("I".equals(fecha)) {
                System.out.println("comida2: "+fecha);
                JOptionPane.showMessageDialog(null,"TU SESION HA CADUCADO" );
                
                principal.dispose();
                CargarSistema l = new CargarSistema();
                l.setVisible(true);
                
            }
            
            Thread.sleep(mlsg);
            
        } catch (Exception e) {
        }
    }
    
    
}
