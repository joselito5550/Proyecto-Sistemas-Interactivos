/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_domotico;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 *
 * @author teller
 */
public class Baniera {
    private boolean on = false;
    private int temperatura;
    
    public void setTemperatura(int temp){
        temperatura = temp;
    }
    
    public int getTemperatura(){
        return temperatura;
    }
    
    public void setOn(){
        on = true;
    }
    
    public void setOff(){
        on = false;
    }
    
    public boolean getBaniera(){
        return on;
    }
}
