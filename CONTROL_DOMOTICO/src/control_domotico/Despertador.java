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
public class Despertador {
    private boolean on = false;
    private String hora = "1";
    private String minuto = "1";
    
    public void setOn(){
        on = true;
    }
    public void setOff(){
        on = false;
    }
    
    public boolean getDespertador(){
        return on;
    }
    
    public void setHora(String h){
        hora = h;
    }
    public void setMinuto(String m){
        minuto = m;
    }
    
    public String getHora(){
        return hora;
    }
    
    public String getMinuto(){
        return minuto;
    }
    
}
