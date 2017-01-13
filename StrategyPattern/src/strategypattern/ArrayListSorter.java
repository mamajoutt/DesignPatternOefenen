/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class ArrayListSorter {
    private SortMethod s;

    public ArrayListSorter() {
        //default bubble sort gebruikt!
        s = new BubbleSort();
    }
    
    public void setSortMethod(SortMethod s){
        this.s = s;
    }
    
    public void performSortMethod(ArrayList<Integer> list){
        Long start = System.currentTimeMillis();
        s.Sort(list);
        Long end = System.currentTimeMillis();
        System.out.println("Sort tijd " + s.getClass().toString() + " : " + (end - start) + " millis.");
        //printList(list);
    }
    
    public void printList(ArrayList<Integer> aList) {
		for(int i : aList) {
			System.out.println("" + i);
		}
	}
    
    
    
    
    
}
