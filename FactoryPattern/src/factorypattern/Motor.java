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
public class Motor {

    public Motor(int cc, int kleppen, String brandstof) {
        System.out.println("Een nieuwe motor met " + cc + "cc, " + kleppen + " kleppen en aangedreven door " + brandstof);
    }
    
    
}
