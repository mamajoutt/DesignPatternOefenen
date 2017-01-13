/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

/**
 *
 * @author HP
 */
public class ObserverPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JDBConnection conn = new JDBConnection();
        Observer1 o1 = new Observer1();
        Observer2 o2 = new Observer2();
        Observer3 o3 = new Observer3();
        
        conn.addObserver(o1);
        conn.addObserver(o2);
        conn.addObserver(o3);
        
        conn.executeUpdate("UPDATE NAAM IN TBL_NAMEN");
    }
    
}
