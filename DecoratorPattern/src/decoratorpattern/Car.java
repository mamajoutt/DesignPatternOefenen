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
public abstract class Car {
    public String description = "Unknown car";
    
    public String getDescription() {
	return description;
    }

    public abstract int getCost();
    
}
