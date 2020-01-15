/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploexcepcions;

/**
 *
 * @author Josemolamazo
 */
public class Metodos {

    public void division(int numerador, int denominador) {
        System.out.println("Resultado: " + numerador / denominador);
    }

    /*public void division (float numerador, float denominador){
        System.out.println("Resultado: "+ numerador/denominador);
    }*/
    public void DividirCapturaException(float numerador, float denominador) {
        try {
            System.out.println("Resultado= " + numerador / denominador);
        } catch (ArithmeticException e1) {
            System.out.println("ERRO" + e1.toString()); //Tamén pódese e1.getMessage();
        } finally {
            System.out.println("executase sempre");
        }
        System.out.println("Rematamos o programa");
    }

    public void DividirCapturaVariasExcepcions(int num, int deno) {
        try {
            System.out.println("Resultado = " + num / deno);
            System.out.println("Rematamos o programa");
        } catch (ArithmeticException e2) {
            System.out.println("Erro: " + e2.toString());
        } catch (Exception e2) {
            System.out.println("Erro xeral: " + e2.getMessage());
        } finally {
            System.out.println("Executase sempre");
        }
    }

    public void DividirLanzandoExcepcion(int num, int deno) throws ArithmeticException {
        if (deno == 0) {
            throw new ArithmeticException("Non dividas entre 0");
        }
        System.out.println("Resultado: " + num / deno);
        System.out.println("Remata o programa");
    }

    public void DividirNosaExcepcion(int num, int deno) throws NosaExcepcion {
        if (deno == 0) {
            throw new NosaExcepcion("****Non podes dividir entre 0****");
        }
        System.out.println("Resultado: " + num / deno);
        System.out.println("Rematou o programa");
    }

    public void DividirIntervaloExcepcion(int num, int deno) throws IntervaloExcepcion, NosaExcepcion {
        if (deno == 0) {
            throw new NosaExcepcion("****Non podes dividir entre 0****");
        }
        if (num < 8 || num > 20) {
            throw new IntervaloExcepcion("***Non pode ser un numerador fora do intervalo [8,20]***");
        }
        System.out.println("Resultado: " + num / deno);
        System.out.println("Rematou o programa");
    }
}
