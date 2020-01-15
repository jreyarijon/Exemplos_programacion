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
public class Libro extends Publicacion {

    private String autor;
    private String titulo;
    private String isbn;

    public Libro() {

    }

    public Libro(int paxinas, float prezo, String autor, String titulo, String isbn) {
        super(paxinas, prezo);
        this.autor = autor;
        this.titulo = titulo;
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return super.toString() + "autor=" + autor + ", titulo=" + titulo + ", isbn=" + isbn;
    }

    public void amosar() {
        System.out.println("son unha publicación");
    }

}
