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
public class Ordenador {
    private Rato rato;
    private Pantalla pantalla;
    private Cpu cpu;
    
    public Ordenador(){
        
    }
    public Ordenador(Rato rat, Pantalla pant, Cpu c){
        rato = rat;
        pantalla = pant;
        cpu = c;
    } 
    public void setRato(Rato rat){
        rato = rat;
    }
    public Rato getRato(){
        return rato;
    }
    public void setPantalla(Pantalla pant){
        pantalla = pant;
    }
    public Pantalla getPantalla(){
        return pantalla;
    }
    public void setCpu(Cpu c){
        cpu = c;
    }
    public Cpu getCpu(){
        return cpu;
    }
}
