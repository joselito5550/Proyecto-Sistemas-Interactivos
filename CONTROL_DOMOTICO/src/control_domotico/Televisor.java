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
public class Televisor {
    private boolean on;
    int canal;
    
    public void setOn(){
        on = true;
    }
    public void setOff(){
        on = false;
    }
    
    public boolean getTelevisor(){
        return on;
    }
    
    public void setCanal(int c){
        canal = c;
    }
    public int getCanal(){
        return canal;
    }
}
