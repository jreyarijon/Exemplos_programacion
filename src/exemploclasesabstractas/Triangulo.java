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
public class Triangulo extends Poligonos {
    float base;
    float altura;

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    Triangulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    @Override
    public void calcularArea() {
        System.out.println("Area del triangulo = "+(base*altura)/2);
    }
}
