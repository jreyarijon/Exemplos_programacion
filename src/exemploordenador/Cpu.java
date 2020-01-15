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
public class Cpu {
    private int velocidade;
    private int memoria;
    
    public Cpu(){
        
    }
    public Cpu(int v, int mem){
        velocidade = v;
        memoria = mem;
    }
    public void setVelocidade(int v){
        velocidade = v; 
    }
    public int getVelocidade(){
        return velocidade;
    }
    public void setMemoria(int mem){
        memoria = mem;
    }
    public int getMemoria(){
        return memoria;
    }
    public void Amosar(){
        System.out.println("Velocidade ="+ velocidade+"\tMemoria ="+ memoria);
    }
    
    
}
