/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploclasesabstractas;

/**
 *
 * @author Josemolamazo
 */
public abstract class Cuadrilatero extends Poligonos{
    private float base;
    private float altura;

    public Cuadrilatero(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public  float getBase() {
        return base;
    }

    public  float getAltura() {
        return altura;
    }
}
