/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;

/**
 *
 * @author HP
 */
public class FactoryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BreakFabriek bf = new BreakFabriek();
        SedanFabriek sf = new SedanFabriek();
        
        BreakAuto ba = new BreakAuto(bf);
        SedanAuto sa = new SedanAuto(sf);
        
        ba.maakAuto();
        System.out.println("******************");
        sa.maakAuto();
        System.out.println("******************");
    }
    
}
