/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_domotico;

/**
 *
 * @author teller
 */
public class Aire {
    private boolean on = false;
    private int temperatura;
    public void setOn(){
        on = true;
    }
    public void setOff(){
        on = false;
    }
    
    public boolean getAire(){
        return on;
    }
    public int getTemperatura(){
        return temperatura;
    }
    public void setTemperatura(int t){
        temperatura = t;
    }
}
