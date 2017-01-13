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
public class BubbleSort implements SortMethod{

    @Override
    public void Sort(ArrayList<Integer> list) {
        for (int outer = 0; outer < list.size() - 1; outer++) {
			for (int inner = outer + 1; inner < list.size(); inner++) {
				if (list.get(outer) > list.get(inner)) {
					swap(list, outer, inner);
				}

			}
		}
    }
    
    private void swap(ArrayList<Integer> sortedList, int outer, int inner) {

          int temp = sortedList.get(inner);
          sortedList.set(inner, sortedList.get(outer));
          sortedList.set(outer, temp);
    }
    
}
