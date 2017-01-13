/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author HP
 */
public class StrategyPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayListSorter as = new ArrayListSorter();
        as.setSortMethod(new CollectionSort());
        as.performSortMethod(makeRandomList());
        
        as.setSortMethod(new BubbleSort());
        as.performSortMethod(makeRandomList());
        
    }
    
    public static ArrayList<Integer> makeRandomList() {
		ArrayList<Integer> aList = new ArrayList<Integer>();
		Random randomGenerator = new Random();
		int capacity = 1000;
		for(int i = 0; i < capacity; i++) {
			aList.add(randomGenerator.nextInt(capacity));
		}
		return aList;
	}
    
}
