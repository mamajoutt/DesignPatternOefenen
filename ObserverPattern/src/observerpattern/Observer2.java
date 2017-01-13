/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author HP
 */
public class Observer2 implements Observer{

    @Override
    public void update(Observable o, Object o1) {
        try {
            JDBConnection conn = (JDBConnection)o;
            System.out.println("Observer2 / update statement: " + conn.getSQL());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
