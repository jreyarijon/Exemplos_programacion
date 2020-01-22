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
public class Rectangulo extends Cuadrilatero {

   
    public Rectangulo(float base, float altura) {
        super(base, altura);
    }
    @Override
    public void calcularArea() {
        //Cuadrilatero rec = new Cuadrilatero(); Non podemos instanciar por ser Abstract
        //Cuadrilatero rec = new Rectangulo();
        //Manera de acceder referenciados
                                                //con obj        //super 
        //System.out.println("Area Rectangulo= "+(rec.getAltura()*super.getAltura()));
         
        System.out.println("Area Rectangulo =" + super.getAltura() * super.getBase());
    }
}
