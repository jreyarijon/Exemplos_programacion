/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo1;

import java.util.Scanner;

/**
 *
 * @author jreyarijon
 */
public class Exemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*calcula lonxitude circunferencia
        float radio = 2.5f, lonxitude;
        lonxitude = 2*3.14f*radio;
        System.out.println("lonxitude =" + lonxitude);*/
        
        /*float radio = 2.5f;
        System.out.println("lonxitude ="+ (2*3.14f*radio));*/
        
        /*float radio = 2.5f;
        float lonxitude = 2*3.14f*radio;
        System.out.println("lonxitude ="+ lonxitude);*/
        
        //utilizando a constante PI
        /*float radio = 2.5f;
        final float PI = 3.14f;
        System.out.println("lonxitude ="+ (2*PI*radio));*/
        
        //Utilizando a clase Math
        /*float radio = 2.5f; 
        float lonxitude = (float)(2*Math.PI*radio);
        System.out.println("lonxitude ="+ lonxitude);*/
        
        //pedir datos por teclado
        Scanner sc= new Scanner(System.in);
         System.out.println("teclea radio :");
        float radio = sc.nextFloat();
        System.out.println("lonxitude ="+ (2*Math.PI*radio));
        //
       
        
        
        //hola
        //dleslahesldih
                
        
                
            
        
    }
    
}
