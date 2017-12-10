/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Calendar;

/**
 *
 * @author DanVz
 */
public class NavigationBean {

    /**
     * Creates a new instance of NavigationBean
     */
    public NavigationBean() {
    }
    
    
    public int Saludar(){
        int mensaje = 0;
        
        int Hora = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        
        if(Hora < 12){
            mensaje = 1;
        }
        
        if(Hora < 19){
            mensaje =  2;
        }
        
        if(Hora <23){
            mensaje = 3;
        }
        
        return mensaje;
    }
}
