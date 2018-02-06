/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientwscalculator;

/**
 *
 * @author entrar
 */
public class ClientWSCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("La suma de 2 y 3 es: "+sum(2,3));
        System.out.println("La resta de 2 y 3 es: "+resta(2,3));
    }

    private static int sum(int n1, int n2) {
        pack.Calc_Service service = new pack.Calc_Service();
        pack.Calc port = service.getCalcPort();
        return port.sum(n1, n2);
    }

    private static int resta(int n1, int n2) {
        pack.Calc_Service service = new pack.Calc_Service();
        pack.Calc port = service.getCalcPort();
        return port.resta(n1, n2);
    }
    
}
