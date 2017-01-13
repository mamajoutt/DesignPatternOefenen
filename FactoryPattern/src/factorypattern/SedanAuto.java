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
public class SedanAuto extends Auto {
    private AutoFabriek factory;

    public SedanAuto(AutoFabriek factory) {
        this.factory = factory;
    }
    
    
    
    @Override
    public void maakAuto() {
        this.setMotor(factory.maakMotor());
        this.setInterieur(factory.maakInterieur());
        this.setCarrosserie(factory.maakCarrosserie());
        System.out.println("Sedan aangemaakt.");
        
    }
    
}
