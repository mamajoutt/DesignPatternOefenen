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
public class SUV extends Car {

    public SUV() {
        description = "SUV";
    }
    

    @Override
    public int getCost() {
        return 16000;
    }
    
}
