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
public class LeatherSeats extends CarDecorator {
    private Car car;

    public LeatherSeats(Car car) {
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ",Leather seats";
    }

    @Override
    public int getCost() {
        return car.getCost() + 1000;
    }
    
    
}
