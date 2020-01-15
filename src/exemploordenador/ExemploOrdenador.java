/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploordenador;

import java.util.Scanner;

/**
 *
 * @author jreyarijon
 */
public class ExemploOrdenador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Teclee tipo de rato :");
        String tipo = sc.next();
        
        System.out.println("Teclee marca da pantalla :");
        String marca = sc.next();
        
        System.out.println("Teclee as pulgadas da pantalla :");
        float pulgadas = sc.nextFloat();
        
        System.out.println("Teclee a velocidade da CPU :");
        int velocidade = sc.nextInt();
        
        System.out.println("Teclee a cantidade de memoria da CPU :");
        int memoria = sc.nextInt();
        
        Rato rato = new Rato(tipo);
        Pantalla pant = new Pantalla(marca, pulgadas);
        Cpu c = new Cpu(velocidade, memoria);
        Ordenador pc = new Ordenador(rato, pant, c);
        System.out.println("DATOS DO ORDENADOR"+"\nTipo de rato:"+ pc.getRato().getTipo()+"\nMarca da pantalla :"+ pc.getPantalla().getMarca()+"\tTamaño pantalla :"+ pc.getPantalla().getPulgadas()+"\nVelocidade CPU :"+ pc.getCpu().getVelocidade()+"\tMemoria da CPU :"+ pc.getCpu().getMemoria());
    }
    
}
