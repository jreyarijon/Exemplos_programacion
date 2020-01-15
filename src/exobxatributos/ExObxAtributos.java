/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exobxatributos;

import java.util.Scanner;

/**
 *
 * @author jreyarijon
 */
public class ExObxAtributos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Alumno al = new Alumno();
        al.Amosar(); */ 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Teclee nome: ");
        String nome = sc.nextLine();
        
        System.out.println("Teclee a nota: ");
        int nota =sc.nextInt();
        
        System.out.println("Teclee o email: ");
        String eMail =sc.next();
        
        System.out.println("Teléfono fixo: ");
        String telefono =sc.next();
        
        Direccion dire = new Direccion(eMail, telefono);
        Alumno al2 = new Alumno(nome, nota, dire);
        //Tamén se pode facer así deste xeito :)
        //Alumno al2 = new Alumno(nome, nota, new Direccion(eMail, telefono));
        //al2.Amosar();
        System.out.println("DATOS ALUMNO/A: "+"\nNome: "+al2.getNome()+"\tNote: "+al2.getNota()+"\nEmail: "+al2.getDire().getEMail()+"\tTelefono: "+al2.getDire().getTelefono());
       
    } 
    
}
