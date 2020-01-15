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
public class Alumno {
    private String nome;
    private int nota;
    private Direccion dire = new Direccion();
    
    public Alumno(){
        
    }
    public Alumno(String nome, int not, Direccion dire){
        this.nome = nome;
        nota = not;
        this.dire = dire;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setNota(int not){
        nota = not;
    }
    public int getNota(){
        return nota;
    }
    public void setDire(Direccion dire){
        this.dire = dire;
    }
    public Direccion getDire(){
        return dire;
    }
    public void Amosar(){
        System.out.println("Caractarísticas alumno/a :"+"\nNome: " + nome+"\tNota: "+ nota +"\nEmail: "+ dire.getEMail()+"\tTeléfono: "+ dire.getTelefono());
    }
}
