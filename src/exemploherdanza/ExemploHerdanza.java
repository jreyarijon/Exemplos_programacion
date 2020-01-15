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
public class ExemploHerdanza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Revista moda = new Revista(50, 11.4f, "Forbes");
        Libro l = new Libro(600, 20.50f, "Jose Rey", "Título", "45B");
        System.out.println(l.toString());
        System.out.println(moda.toString());
        System.out.println(moda);

        //INTRODUCCIÓN POLIMORFISMO
        Publicacion lib = new Libro(200, 3.5f, "Paco", "título1", "1212");
        System.out.println(lib);
        Publicacion rev = new Revista(30, 5.5f, "HOLA!");
        System.out.println(rev);

        Publicacion libr = new Libro();
        Publicacion revs = new Revista();
        libr.amosar();
        revs.amosar();
    }

}
