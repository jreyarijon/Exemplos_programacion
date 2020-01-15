/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exobxatributos;

/**
 *
 * @author jreyarijon
 */
public class Direccion {
   private String eMail;
   private String telefono;
   
   public Direccion(){
        
    }
    public Direccion(String eMail, String tlf){
    this.eMail = eMail;
    telefono = tlf;
    }
    //Métodos de acceso
    public void setEMail(String eMail){
        this.eMail = eMail;
    }
    public String getEMail(){
        return eMail;
    }
    public void setTelefono(String telf){
        telefono = telf;
    }
    public String getTelefono(){
        return telefono;
    }
}
