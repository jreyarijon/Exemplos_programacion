/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploordenador;

/**
 *
 * @author jreyarijon
 */
public class Pantalla {
    private String marca;
    private float pulgadas;
    
    public Pantalla(){
        
    }
    public Pantalla(String marc, float pulg){
        marca = marc;
        pulgadas = pulg;
    }
    
    public void setMarca(String marc){
        marca = marc;
    }
    public String getMarca(){
        return marca;
    }
    public void setPulgadas(float pulg){
        pulgadas = pulg;
    }
    public float getPulgadas(){
        return pulgadas;
    }
    public void Amosar(){
        System.out.println("Marca :"+ marca+"\tTamaño :"+ pulgadas);
    }
}
