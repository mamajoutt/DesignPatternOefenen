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
public abstract class AutoFabriek {
    public Motor maakMotor(){
        return new Motor(1999, 4, "DIESEL");
    }
    
    public abstract Carrosserie maakCarrosserie();
    
    public abstract Interieur maakInterieur();
    
}
