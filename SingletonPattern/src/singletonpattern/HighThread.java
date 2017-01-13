/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonpattern;

/**
 *
 * @author HP
 */
public class HighThread extends Thread {
    public HighThread() {
	this.setPriority(Thread.MAX_PRIORITY);
    }
    
    @Override
    public void run() {
        Counter.getInstance().increment(1);
    }

    
    
}
