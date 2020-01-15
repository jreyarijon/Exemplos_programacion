/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploherdanza;

/**
 *
 * @author Josemolamazo
 */
public class Revista extends Publicacion {

    private String nome;

    public Revista() {

    }

    public Revista(int paxinas, float prezo, String nome) {
        super(paxinas, prezo);
        this.nome = nome;
    }

    @Override
    public String toString() {
        return super.toString() + "nome=" + nome;
    }

    public void amosar() {
        System.out.println("son unha publicación");
    }

}
