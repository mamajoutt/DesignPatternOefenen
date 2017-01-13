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
public class BreakFabriek extends AutoFabriek{

    @Override
    public Carrosserie maakCarrosserie() {
        return new BreakCarrosserie();
    }

    @Override
    public Interieur maakInterieur() {
        return new BreakInterieur();
    }
    
}
