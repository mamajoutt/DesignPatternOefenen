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
public class BreakAuto extends Auto {
    private AutoFabriek factory;

    public BreakAuto(AutoFabriek factory) {
        this.factory = factory;
    }
    
    @Override
    public void maakAuto() {
        this.setMotor(factory.maakMotor());
        this.setCarrosserie(factory.maakCarrosserie());
        this.setInterieur(factory.maakInterieur());
        System.out.println("Break gemaakt.");
    }
    
}
