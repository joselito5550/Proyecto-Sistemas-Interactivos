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
public class Luz {
    public boolean on;
    Luz(){
        on = false;
    }
    
    public void setOn(){
        on = true;
    }
    public void setOff(){
        on = false;
    }
    
    public boolean getLuz(){
        return on;
    }
}
