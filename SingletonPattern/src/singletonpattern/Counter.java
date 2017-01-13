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
public class Counter {
    private static Counter _instance;
    private int count;

    public Counter() {
    }
    
    public static Counter getInstance(){
        if(_instance == null){
            _instance = new Counter();
        }
        return _instance;
    }
    
    public void increment(int i){
        synchronized(this){
            count += i;
        }
    }
    
    public int count(){
        return count;
    }
}
