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
public class Lavadora {
    
    public boolean on = false;
    public String programa = "";
    
    public void setOn(){
        on = true;
    }
    public void setOff(){
        on = false;
    }
    
    public String getPrograma(){
        return programa;
    }
    public void setPrograma(String p){
        programa = p;
    }
    
    public boolean getLavadora(){
        return on;
    }
    
}
