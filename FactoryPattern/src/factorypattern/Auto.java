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
public abstract class Auto {
    private Motor motor;
    private Carrosserie carrosserie;
    private Interieur interieur;
    
    public abstract void maakAuto();

    /**
     * @param motor the motor to set
     */
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    /**
     * @param carrosserie the carrosserie to set
     */
    public void setCarrosserie(Carrosserie carrosserie) {
        this.carrosserie = carrosserie;
    }

    /**
     * @param interieur the interieur to set
     */
    public void setInterieur(Interieur interieur) {
        this.interieur = interieur;
    }
    
    
    
    
}
