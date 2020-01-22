/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploclasesabstractas;

import circulo.Circulo;

/**
 *
 * @author Josemolamazo
 */
public class ExemploClasesAbstractas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Poligonos tri = new Triangulo(4f, 2f);
        tri.calcularArea();

        Poligonos rec = new Rectangulo(4f, 2f);

        rec.calcularArea();

        Circulo cir = new Circulo(4f);
    }

}
