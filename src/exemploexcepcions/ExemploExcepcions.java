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
public class ExemploExcepcions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Metodos Obj1 = new Metodos();
        //Obj1.division(6, 0);

        //Obj1.DividirCapturaException(6, 0);
        /*try {
            Obj1.DividirNosaExcepcion(4, 0);
        } catch (NosaExcepcion e) {
            System.out.println("Erro " + e.getMessage());
        }
        System.out.println("O programa sigue");*/
        try {
            Obj1.DividirIntervaloExcepcion(1, 0);
        } catch (IntervaloExcepcion e) {
            System.out.println("Erro " + e.getMessage());
        } catch (NosaExcepcion e1) {
            System.out.println("Erro " + e1.getMessage());
        }
        System.out.println("O programa sigue");

    }

}
