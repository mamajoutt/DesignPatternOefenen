/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author HP
 */
public class CollectionSort implements SortMethod{

    @Override
    public void Sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }
    
}
