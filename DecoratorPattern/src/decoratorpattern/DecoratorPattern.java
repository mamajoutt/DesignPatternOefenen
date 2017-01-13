/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpattern;

/**
 *
 * @author HP
 */
public class DecoratorPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car c1 = new Coupe();
        c1 = new ClimateControl(c1);
        c1 = new LeatherSeats(c1);
        
        System.out.println(c1.getDescription() + " retailprice: " + c1.getCost());
    }
    
}
